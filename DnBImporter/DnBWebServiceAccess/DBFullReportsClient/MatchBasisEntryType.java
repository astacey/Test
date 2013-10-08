
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchBasisEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchBasisEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectTypeCode" type="{http://gateway.dnb.com/getProduct}SubjectTypeCodeType"/>
 *         &lt;element name="CEOIndicator" type="{http://gateway.dnb.com/getProduct}CEOIndicatorType"/>
 *         &lt;element name="MatchBasisCode" type="{http://gateway.dnb.com/getProduct}MatchBasisCodeType"/>
 *         &lt;element name="EndIndictor" type="{http://gateway.dnb.com/getProduct}EndIndictorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchBasisEntryType", propOrder = {
    "subjectTypeCode",
    "ceoIndicator",
    "matchBasisCode",
    "endIndictor"
})
public class MatchBasisEntryType {

    @XmlElement(name = "SubjectTypeCode", required = true)
    protected String subjectTypeCode;
    @XmlElement(name = "CEOIndicator", required = true)
    protected String ceoIndicator;
    @XmlElement(name = "MatchBasisCode", required = true)
    protected BigInteger matchBasisCode;
    @XmlElement(name = "EndIndictor", required = true)
    protected String endIndictor;

    /**
     * Gets the value of the subjectTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectTypeCode() {
        return subjectTypeCode;
    }

    /**
     * Sets the value of the subjectTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectTypeCode(String value) {
        this.subjectTypeCode = value;
    }

    /**
     * Gets the value of the ceoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEOIndicator() {
        return ceoIndicator;
    }

    /**
     * Sets the value of the ceoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEOIndicator(String value) {
        this.ceoIndicator = value;
    }

    /**
     * Gets the value of the matchBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchBasisCode() {
        return matchBasisCode;
    }

    /**
     * Sets the value of the matchBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchBasisCode(BigInteger value) {
        this.matchBasisCode = value;
    }

    /**
     * Gets the value of the endIndictor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIndictor() {
        return endIndictor;
    }

    /**
     * Sets the value of the endIndictor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIndictor(String value) {
        this.endIndictor = value;
    }

}
