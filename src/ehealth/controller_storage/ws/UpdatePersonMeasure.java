
package ehealth.controller_storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ehealth.controller_db.ws.HealthMeasureHistory;


/**
 * <p>Java class for updatePersonMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePersonMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="measure" type="{http://ws.controller_db.ehealth/}healthMeasureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePersonMeasure", propOrder = {
    "idPerson",
    "measure"
})
public class UpdatePersonMeasure {

    protected Long idPerson;
    protected HealthMeasureHistory measure;

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
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public HealthMeasureHistory getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public void setMeasure(HealthMeasureHistory value) {
        this.measure = value;
    }

}
