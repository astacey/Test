
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchSpecificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchSpecificationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateMaximumQuantity" type="{http://gateway.dnb.com/getProduct}CandidateMaximumQuantityType"/>
 *         &lt;element name="ExactMatchIndicator" type="{http://gateway.dnb.com/getProduct}ExactMatchIndicatorType"/>
 *         &lt;element name="SearchGeographicalScopeCode" type="{http://gateway.dnb.com/getProduct}SearchGeographicalScopeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchSpecificationRequestType", propOrder = {
    "candidateMaximumQuantity",
    "exactMatchIndicator",
    "searchGeographicalScopeCode"
})
public class MatchSpecificationRequestType {

    @XmlElement(name = "CandidateMaximumQuantity", required = true, defaultValue = "1")
    protected BigInteger candidateMaximumQuantity;
    @XmlElement(name = "ExactMatchIndicator", defaultValue = "false")
    protected boolean exactMatchIndicator;
    @XmlElement(name = "SearchGeographicalScopeCode", required = true, defaultValue = "3463")
    protected String searchGeographicalScopeCode;

    /**
     * Gets the value of the candidateMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCandidateMaximumQuantity() {
        return candidateMaximumQuantity;
    }

    /**
     * Sets the value of the candidateMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCandidateMaximumQuantity(BigInteger value) {
        this.candidateMaximumQuantity = value;
    }

    /**
     * Gets the value of the exactMatchIndicator property.
     * 
     */
    public boolean isExactMatchIndicator() {
        return exactMatchIndicator;
    }

    /**
     * Sets the value of the exactMatchIndicator property.
     * 
     */
    public void setExactMatchIndicator(boolean value) {
        this.exactMatchIndicator = value;
    }

    /**
     * Gets the value of the searchGeographicalScopeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchGeographicalScopeCode() {
        return searchGeographicalScopeCode;
    }

    /**
     * Sets the value of the searchGeographicalScopeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchGeographicalScopeCode(String value) {
        this.searchGeographicalScopeCode = value;
    }

}
