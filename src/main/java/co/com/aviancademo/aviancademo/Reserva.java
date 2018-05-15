
package co.com.aviancademo.aviancademo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pasajeros" type="{http://aviancaDemo.aviancademo.com.co/}persona" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vuelo" type="{http://aviancaDemo.aviancademo.com.co/}vuelo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "idReserva",
    "pasajeros",
    "vuelo"
})
public class Reserva {

    protected String idReserva;
    @XmlElement(nillable = true)
    protected List<Persona> pasajeros;
    protected Vuelo vuelo;

    /**
     * Obtiene el valor de la propiedad idReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReserva() {
        return idReserva;
    }

    /**
     * Define el valor de la propiedad idReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReserva(String value) {
        this.idReserva = value;
    }

    /**
     * Gets the value of the pasajeros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pasajeros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasajeros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Persona }
     * 
     * 
     */
    public List<Persona> getPasajeros() {
        if (pasajeros == null) {
            pasajeros = new ArrayList<Persona>();
        }
        return this.pasajeros;
    }

    /**
     * Obtiene el valor de la propiedad vuelo.
     * 
     * @return
     *     possible object is
     *     {@link Vuelo }
     *     
     */
    public Vuelo getVuelo() {
        return vuelo;
    }

    /**
     * Define el valor de la propiedad vuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link Vuelo }
     *     
     */
    public void setVuelo(Vuelo value) {
        this.vuelo = value;
    }

}
