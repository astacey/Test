
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterofLiabilityRolePlayerInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterofLiabilityRolePlayerInformationEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
 *         &lt;element name="LetterSubmittedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterofLiabilityRolePlayerInformationEntryType", propOrder = {
    "name",
    "dunsNumber",
    "address",
    "letterSubmittedDate",
    "dnbRating"
})
@XmlSeeAlso({
    DBFullReportsClient.CorporateLinkages.CurrentLinkagesInformation.LetterofLiabilityInformation.LetterofLiabilitySubscriberInformation.CurrentLetterofLiabilitySubscriberInformation.class,
    DBFullReportsClient.CorporateLinkages.CurrentLinkagesInformation.LetterofLiabilityInformation.LetterofLiabilitySubscriberInformation.PreviousLetterofLiabilitySubscriberInformation.class,
    DBFullReportsClient.CorporateLinkages.CurrentLinkagesInformation.LetterofLiabilityInformation.LetterofLiabilityIssuerInformation.LetterofLiabilityIssuerInformationEntry.class
})
public class LetterofLiabilityRolePlayerInformationEntryType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "LetterSubmittedDate")
    protected DNBDate letterSubmittedDate;
    @XmlElement(name = "DNBRating")
    protected String dnbRating;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDUNSNumber(BigInteger value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the letterSubmittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getLetterSubmittedDate() {
        return letterSubmittedDate;
    }

    /**
     * Sets the value of the letterSubmittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setLetterSubmittedDate(DNBDate value) {
        this.letterSubmittedDate = value;
    }

    /**
     * Gets the value of the dnbRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBRating() {
        return dnbRating;
    }

    /**
     * Sets the value of the dnbRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBRating(String value) {
        this.dnbRating = value;
    }

}
