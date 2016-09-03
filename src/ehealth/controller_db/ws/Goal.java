
package ehealth.controller_db.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dateRegistered" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="goalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureDefinition" type="{http://ws.controller_db.ehealth/}measureDefinition" minOccurs="0"/>
 *         &lt;element name="person" type="{http://ws.controller_db.ehealth/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "gid",
    "dateRegistered",
    "goalValue",
    "measureDefinition",
    "person"
})
public class Goal {

    protected Long gid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRegistered;
    protected String goalValue;
    protected MeasureDefinition measureDefinition;
    protected Person person;

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGid(Long value) {
        this.gid = value;
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
     * Gets the value of the goalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalValue() {
        return goalValue;
    }

    /**
     * Sets the value of the goalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalValue(String value) {
        this.goalValue = value;
    }

    /**
     * Gets the value of the measureDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getMeasureDefinition() {
        return measureDefinition;
    }

    /**
     * Sets the value of the measureDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setMeasureDefinition(MeasureDefinition value) {
        this.measureDefinition = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
