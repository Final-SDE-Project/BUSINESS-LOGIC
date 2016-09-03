
package ehealth.controller_storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ehealth.controller_db.ws.MeasureDefinition;


/**
 * <p>Java class for readMeasureTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readMeasureTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measureType" type="{http://ws.controller_db.ehealth/}measureDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readMeasureTypeResponse", propOrder = {
    "measureType"
})
public class ReadMeasureTypeResponse {

    protected MeasureDefinition measureType;

    /**
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setMeasureType(MeasureDefinition value) {
        this.measureType = value;
    }

}
