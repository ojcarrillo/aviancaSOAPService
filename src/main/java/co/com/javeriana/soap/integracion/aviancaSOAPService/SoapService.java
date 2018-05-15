package co.com.javeriana.soap.integracion.aviancaSOAPService;

import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.camel.Exchange;
import org.avianca.demo.CancelarReserva;
import org.avianca.demo.CancelarReservaResponse;
import org.avianca.demo.ObtenerReserva;
import org.avianca.demo.ObtenerReservaResponse;
import org.avianca.demo.Persona;
import org.avianca.demo.RealizarReserva;
import org.avianca.demo.RealizarReservaResponse;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.aviancademo.aviancademo.Reserva;
import co.com.aviancademo.aviancademo.Response;
import co.com.aviancademo.aviancademo.ServicioWebService;
import co.com.javeriana.soap.integracion.soap.SOAPInvoker;

@Component
public class SoapService {

	private static final String URL_SOAP_SERVICE = "http://localhost:7001/Avianca";
	
	public void cancelarReserva(final Exchange exchange) throws DatatypeConfigurationException, InterruptedException {
		CancelarReserva datos = exchange.getIn().getBody(CancelarReserva.class);
		ServicioWebService ws = new ServicioWebService();
		Response resp = ws.getAviancaPort().cancelarReserva(datos.getIdReserva());
		CancelarReservaResponse response = new CancelarReservaResponse();
		response.setCodigo(resp.getCodigo());
		response.setEstado(resp.getEstado());
		response.setMensaje(resp.getMensaje());
		exchange.getOut().setBody(response);
	}

	public void obtenerReserva(final Exchange exchange) throws DatatypeConfigurationException, InterruptedException, ParseException, IOException {
		ObtenerReserva datos = exchange.getIn().getBody(ObtenerReserva.class);
		ServicioWebService ws = new ServicioWebService();
		Reserva resp = ws.getAviancaPort().consultarReserva(datos.getIdReserva());
		ObtenerReservaResponse response = new ObtenerReservaResponse();
		response.setIdReserva(resp.getIdReserva());
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writeValueAsString(resp.getVuelo());	
		response.setVuelo(mapper.readValue(jsonInString, org.avianca.demo.Vuelo.class));
		jsonInString = mapper.writeValueAsString(resp.getPasajeros());
		response.getPasajeros().addAll((Collection<? extends Persona>) mapper.readValue(jsonInString, mapper.getTypeFactory().constructCollectionType(List.class, org.avianca.demo.Persona.class)));
		exchange.getOut().setBody(response);
	}

	public void realizarReserva(final Exchange exchange) throws DatatypeConfigurationException, InterruptedException, ParseException, IOException {
		RealizarReserva datos = exchange.getIn().getBody(RealizarReserva.class);
		ObjectMapper mapper = new ObjectMapper();
		ServicioWebService ws = new ServicioWebService();
		Reserva reserva = new Reserva();
		reserva.setIdReserva(datos.getIdReserva());
		String jsonInString = mapper.writeValueAsString(datos.getVuelo());
		reserva.setVuelo(mapper.readValue(jsonInString, co.com.aviancademo.aviancademo.Vuelo.class));
		jsonInString = mapper.writeValueAsString(datos.getPasajeros());
		reserva.getPasajeros().addAll((Collection<? extends co.com.aviancademo.aviancademo.Persona>) mapper.readValue(jsonInString, mapper.getTypeFactory().constructCollectionType(List.class, co.com.aviancademo.aviancademo.Persona.class)));
		Response resp = ws.getAviancaPort().realizarReserva(reserva);		
		RealizarReservaResponse response = new RealizarReservaResponse();
		response.setCodigo(resp.getCodigo());
		response.setEstado(resp.getEstado());
		response.setMensaje(resp.getMensaje());
		exchange.getOut().setBody(response);
	}

	
}
