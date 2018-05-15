
package co.com.aviancademo.aviancademo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RealizarReservaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RealizarReservaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{http://aviancaDemo.aviancademo.com.co/}response" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealizarReservaResponse", propOrder = {
    "response"
})
public class RealizarReservaResponse {

    @XmlElement(name = "Response")
    protected Response response;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

}
