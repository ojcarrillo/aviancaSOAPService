
package co.com.aviancademo.aviancademo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.aviancademo.aviancademo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CancelarReserva_QNAME = new QName("http://aviancaDemo.aviancademo.com.co/", "CancelarReserva");
    private final static QName _CancelarReservaResponse_QNAME = new QName("http://aviancaDemo.aviancademo.com.co/", "CancelarReservaResponse");
    private final static QName _ConsultarReserva_QNAME = new QName("http://aviancaDemo.aviancademo.com.co/", "ConsultarReserva");
    private final static QName _ConsultarReservaResponse_QNAME = new QName("http://aviancaDemo.aviancademo.com.co/", "ConsultarReservaResponse");
    private final static QName _RealizarReserva_QNAME = new QName("http://aviancaDemo.aviancademo.com.co/", "RealizarReserva");
    private final static QName _RealizarReservaResponse_QNAME = new QName("http://aviancaDemo.aviancademo.com.co/", "RealizarReservaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.aviancademo.aviancademo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelarReserva }
     * 
     */
    public CancelarReserva createCancelarReserva() {
        return new CancelarReserva();
    }

    /**
     * Create an instance of {@link CancelarReservaResponse }
     * 
     */
    public CancelarReservaResponse createCancelarReservaResponse() {
        return new CancelarReservaResponse();
    }

    /**
     * Create an instance of {@link ConsultarReserva }
     * 
     */
    public ConsultarReserva createConsultarReserva() {
        return new ConsultarReserva();
    }

    /**
     * Create an instance of {@link ConsultarReservaResponse }
     * 
     */
    public ConsultarReservaResponse createConsultarReservaResponse() {
        return new ConsultarReservaResponse();
    }

    /**
     * Create an instance of {@link RealizarReserva }
     * 
     */
    public RealizarReserva createRealizarReserva() {
        return new RealizarReserva();
    }

    /**
     * Create an instance of {@link RealizarReservaResponse }
     * 
     */
    public RealizarReservaResponse createRealizarReservaResponse() {
        return new RealizarReservaResponse();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Vuelo }
     * 
     */
    public Vuelo createVuelo() {
        return new Vuelo();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviancaDemo.aviancademo.com.co/", name = "CancelarReserva")
    public JAXBElement<CancelarReserva> createCancelarReserva(CancelarReserva value) {
        return new JAXBElement<CancelarReserva>(_CancelarReserva_QNAME, CancelarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviancaDemo.aviancademo.com.co/", name = "CancelarReservaResponse")
    public JAXBElement<CancelarReservaResponse> createCancelarReservaResponse(CancelarReservaResponse value) {
        return new JAXBElement<CancelarReservaResponse>(_CancelarReservaResponse_QNAME, CancelarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviancaDemo.aviancademo.com.co/", name = "ConsultarReserva")
    public JAXBElement<ConsultarReserva> createConsultarReserva(ConsultarReserva value) {
        return new JAXBElement<ConsultarReserva>(_ConsultarReserva_QNAME, ConsultarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviancaDemo.aviancademo.com.co/", name = "ConsultarReservaResponse")
    public JAXBElement<ConsultarReservaResponse> createConsultarReservaResponse(ConsultarReservaResponse value) {
        return new JAXBElement<ConsultarReservaResponse>(_ConsultarReservaResponse_QNAME, ConsultarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviancaDemo.aviancademo.com.co/", name = "RealizarReserva")
    public JAXBElement<RealizarReserva> createRealizarReserva(RealizarReserva value) {
        return new JAXBElement<RealizarReserva>(_RealizarReserva_QNAME, RealizarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aviancaDemo.aviancademo.com.co/", name = "RealizarReservaResponse")
    public JAXBElement<RealizarReservaResponse> createRealizarReservaResponse(RealizarReservaResponse value) {
        return new JAXBElement<RealizarReservaResponse>(_RealizarReservaResponse_QNAME, RealizarReservaResponse.class, null, value);
    }

}
