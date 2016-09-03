
package ehealth.controller_storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readBmiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readBmiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readBmiResponse", propOrder = {
    "bmi"
})
public class ReadBmiResponse {

    protected String bmi;

    /**
     * Gets the value of the bmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmi() {
        return bmi;
    }

    /**
     * Sets the value of the bmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmi(String value) {
        this.bmi = value;
    }

}
