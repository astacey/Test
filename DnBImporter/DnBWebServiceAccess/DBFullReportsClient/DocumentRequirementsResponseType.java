
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentRequirementsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentRequirementsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentTypeCode" type="{http://gateway.dnb.com/getProduct}DocumentCodeType"/>
 *         &lt;element name="DocumentDateRange" type="{http://gateway.dnb.com/getProduct}DocumentDateRangeType" minOccurs="0"/>
 *         &lt;element name="MostRecentDocumentIndicator" type="{http://gateway.dnb.com/getProduct}MostRecentDocumentIndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRequirementsResponseType", propOrder = {
    "documentTypeCode",
    "documentDateRange",
    "mostRecentDocumentIndicator"
})
public class DocumentRequirementsResponseType {

    @XmlElement(name = "DocumentTypeCode", required = true)
    protected BigInteger documentTypeCode;
    @XmlElement(name = "DocumentDateRange")
    protected DocumentDateRangeType documentDateRange;
    @XmlElement(name = "MostRecentDocumentIndicator")
    protected BigInteger mostRecentDocumentIndicator;

    /**
     * Gets the value of the documentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentTypeCode(BigInteger value) {
        this.documentTypeCode = value;
    }

    /**
     * Gets the value of the documentDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDateRangeType }
     *     
     */
    public DocumentDateRangeType getDocumentDateRange() {
        return documentDateRange;
    }

    /**
     * Sets the value of the documentDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDateRangeType }
     *     
     */
    public void setDocumentDateRange(DocumentDateRangeType value) {
        this.documentDateRange = value;
    }

    /**
     * Gets the value of the mostRecentDocumentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMostRecentDocumentIndicator() {
        return mostRecentDocumentIndicator;
    }

    /**
     * Sets the value of the mostRecentDocumentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMostRecentDocumentIndicator(BigInteger value) {
        this.mostRecentDocumentIndicator = value;
    }

}
