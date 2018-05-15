
package co.com.aviancademo.aviancademo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelarReserva complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelarReserva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelarReserva", propOrder = {
    "idReserva"
})
public class CancelarReserva {

    @XmlElement(name = "IdReserva")
    protected String idReserva;

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

}
