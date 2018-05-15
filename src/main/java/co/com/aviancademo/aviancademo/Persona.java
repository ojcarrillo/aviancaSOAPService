
package co.com.aviancademo.aviancademo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para persona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="persona"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "apellido",
    "correoElectronico",
    "genero",
    "nombre",
    "numDoc",
    "tipoDoc"
})
public class Persona {

    protected String apellido;
    protected String correoElectronico;
    protected String genero;
    protected String nombre;
    protected String numDoc;
    protected String tipoDoc;

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Define el valor de la propiedad correoElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Define el valor de la propiedad numDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDoc(String value) {
        this.numDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Define el valor de la propiedad tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

}
