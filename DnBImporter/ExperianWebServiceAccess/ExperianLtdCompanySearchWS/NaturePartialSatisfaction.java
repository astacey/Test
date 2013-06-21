
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaturePartialSatisfaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaturePartialSatisfaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartialSatisfactionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaturePartialSatisfaction", propOrder = {
    "partialSatisfactionDetails"
})
public class NaturePartialSatisfaction {

    @XmlElement(name = "PartialSatisfactionDetails")
    protected String partialSatisfactionDetails;

    /**
     * Gets the value of the partialSatisfactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialSatisfactionDetails() {
        return partialSatisfactionDetails;
    }

    /**
     * Sets the value of the partialSatisfactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialSatisfactionDetails(String value) {
        this.partialSatisfactionDetails = value;
    }

}
