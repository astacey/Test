
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchSearchRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchSearchRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchSpecification" type="{http://gateway.dnb.com/getProduct}MatchSpecificationRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchSearchRequestType", propOrder = {
    "matchSpecification"
})
public class MatchSearchRequestType {

    @XmlElement(name = "MatchSpecification", required = true)
    protected MatchSpecificationRequestType matchSpecification;

    /**
     * Gets the value of the matchSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSpecificationRequestType }
     *     
     */
    public MatchSpecificationRequestType getMatchSpecification() {
        return matchSpecification;
    }

    /**
     * Sets the value of the matchSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSpecificationRequestType }
     *     
     */
    public void setMatchSpecification(MatchSpecificationRequestType value) {
        this.matchSpecification = value;
    }

}
