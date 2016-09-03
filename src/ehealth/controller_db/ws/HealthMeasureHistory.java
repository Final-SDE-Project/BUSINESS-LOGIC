
package ehealth.controller_db.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for healthMeasureHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="healthMeasureHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dateRegistered" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthMeasureHistory", propOrder = {
    "mid",
    "dateRegistered",
    "measureType",
    "measureValue",
    "measureValueType"
})
public class HealthMeasureHistory {

    protected Long mid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRegistered;
    protected String measureType;
    protected String measureValue;
    protected String measureValueType;

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

    /**
     * Gets the value of the dateRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRegistered() {
        return dateRegistered;
    }

    /**
     * Sets the value of the dateRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRegistered(XMLGregorianCalendar value) {
        this.dateRegistered = value;
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
     * Gets the value of the measureValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureValue() {
        return measureValue;
    }

    /**
     * Sets the value of the measureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureValue(String value) {
        this.measureValue = value;
    }

    /**
     * Gets the value of the measureValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureValueType() {
        return measureValueType;
    }

    /**
     * Sets the value of the measureValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureValueType(String value) {
        this.measureValueType = value;
    }

}
