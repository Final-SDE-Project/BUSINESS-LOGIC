
package ehealth.controller_storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonMeasure", propOrder = {
    "idPerson",
    "measureType",
    "mid"
})
public class ReadPersonMeasure {

    protected Long idPerson;
    protected String measureType;
    protected Long mid;

    /**
     * Gets the value of the idPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPerson(Long value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMid(Long value) {
        this.mid = value;
    }

}
