
package co.com.aviancademo.aviancademo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para vuelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="vuelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroVuelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="puertaEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="silla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vuelo", propOrder = {
    "destino",
    "fechaFin",
    "fechaInicio",
    "grupo",
    "nroVuelo",
    "origen",
    "puertaEmbarque",
    "silla"
})
public class Vuelo {

    protected String destino;
    protected String fechaFin;
    protected String fechaInicio;
    protected String grupo;
    protected String nroVuelo;
    protected String origen;
    protected String puertaEmbarque;
    protected String silla;

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * Define el valor de la propiedad fechaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFin(String value) {
        this.fechaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad grupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Define el valor de la propiedad grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Obtiene el valor de la propiedad nroVuelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroVuelo() {
        return nroVuelo;
    }

    /**
     * Define el valor de la propiedad nroVuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroVuelo(String value) {
        this.nroVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad puertaEmbarque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuertaEmbarque() {
        return puertaEmbarque;
    }

    /**
     * Define el valor de la propiedad puertaEmbarque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuertaEmbarque(String value) {
        this.puertaEmbarque = value;
    }

    /**
     * Obtiene el valor de la propiedad silla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilla() {
        return silla;
    }

    /**
     * Define el valor de la propiedad silla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilla(String value) {
        this.silla = value;
    }

}
