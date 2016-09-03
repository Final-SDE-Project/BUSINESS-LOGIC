
package ehealth.controller_storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readQuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readQuoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readQuoteResponse", propOrder = {
    "quote"
})
public class ReadQuoteResponse {

    protected String quote;

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuote(String value) {
        this.quote = value;
    }

}
