
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchSearchResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchSearchResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MatchSpecification" type="{http://gateway.dnb.com/getProduct}MatchSpecificationResponseType"/>
 *         &lt;element name="MatchCandidateResult" type="{http://gateway.dnb.com/getProduct}MatchCandidateResultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchSearchResponseType", propOrder = {
    "matchSpecification",
    "matchCandidateResult"
})
public class MatchSearchResponseType {

    @XmlElement(name = "MatchSpecification", required = true)
    protected MatchSpecificationResponseType matchSpecification;
    @XmlElement(name = "MatchCandidateResult")
    protected List<MatchCandidateResultType> matchCandidateResult;

    /**
     * Gets the value of the matchSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSpecificationResponseType }
     *     
     */
    public MatchSpecificationResponseType getMatchSpecification() {
        return matchSpecification;
    }

    /**
     * Sets the value of the matchSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSpecificationResponseType }
     *     
     */
    public void setMatchSpecification(MatchSpecificationResponseType value) {
        this.matchSpecification = value;
    }

    /**
     * Gets the value of the matchCandidateResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchCandidateResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchCandidateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchCandidateResultType }
     * 
     * 
     */
    public List<MatchCandidateResultType> getMatchCandidateResult() {
        if (matchCandidateResult == null) {
            matchCandidateResult = new ArrayList<MatchCandidateResultType>();
        }
        return this.matchCandidateResult;
    }

}
