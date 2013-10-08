
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FilingRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingRequirementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentCode" type="{http://gateway.dnb.com/getProduct}DocumentCodeType"/>
 *         &lt;element name="DocumentFormName" type="{http://gateway.dnb.com/getProduct}DocumentFormName" minOccurs="0"/>
 *         &lt;element name="DocumentPackageName" type="{http://gateway.dnb.com/getProduct}DocumentPackageType" minOccurs="0"/>
 *         &lt;element name="DocumentDate" type="{http://gateway.dnb.com/getProduct}DocumentDate" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" type="{http://gateway.dnb.com/getProduct}FilingReferenceNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingRequirementsType", propOrder = {
    "documentCode",
    "documentFormName",
    "documentPackageName",
    "documentDate",
    "filingReferenceNumber"
})
public class FilingRequirementsType {

    @XmlElement(name = "DocumentCode", required = true)
    protected BigInteger documentCode;
    @XmlElement(name = "DocumentFormName")
    protected String documentFormName;
    @XmlElement(name = "DocumentPackageName")
    protected DocumentPackageType documentPackageName;
    @XmlElement(name = "DocumentDate")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;

    /**
     * Gets the value of the documentCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentCode() {
        return documentCode;
    }

    /**
     * Sets the value of the documentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentCode(BigInteger value) {
        this.documentCode = value;
    }

    /**
     * Gets the value of the documentFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentFormName() {
        return documentFormName;
    }

    /**
     * Sets the value of the documentFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentFormName(String value) {
        this.documentFormName = value;
    }

    /**
     * Gets the value of the documentPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPackageType }
     *     
     */
    public DocumentPackageType getDocumentPackageName() {
        return documentPackageName;
    }

    /**
     * Sets the value of the documentPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPackageType }
     *     
     */
    public void setDocumentPackageName(DocumentPackageType value) {
        this.documentPackageName = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the filingReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingReferenceNumber() {
        return filingReferenceNumber;
    }

    /**
     * Sets the value of the filingReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingReferenceNumber(String value) {
        this.filingReferenceNumber = value;
    }

}
