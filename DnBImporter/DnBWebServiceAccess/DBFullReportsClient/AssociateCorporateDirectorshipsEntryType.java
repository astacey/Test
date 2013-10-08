
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociateCorporateDirectorshipsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociateCorporateDirectorshipsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
 *         &lt;element name="BusinessOperatingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalPositionAppointedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="SigningAuthorities" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SigningAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociateCorporateDirectorshipsEntryType", propOrder = {
    "companyName",
    "dunsNumber",
    "businessOperatingStatus",
    "dnbRating",
    "principalPosition",
    "principalPositionAppointedDate",
    "signingAuthorities"
})
@XmlSeeAlso({
    DBFullReportsClient.CorporateLinkages.PreviousLinkagesInformation.AssociateCorporateDirectorships.AssociateCorporateDirectorshipsEntry.class
})
public class AssociateCorporateDirectorshipsEntryType {

    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "BusinessOperatingStatus")
    protected String businessOperatingStatus;
    @XmlElement(name = "DNBRating")
    protected String dnbRating;
    @XmlElement(name = "PrincipalPosition")
    protected String principalPosition;
    @XmlElement(name = "PrincipalPositionAppointedDate")
    protected DNBDate principalPositionAppointedDate;
    @XmlElement(name = "SigningAuthorities")
    protected List<AssociateCorporateDirectorshipsEntryType.SigningAuthorities> signingAuthorities;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the businessOperatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOperatingStatus() {
        return businessOperatingStatus;
    }

    /**
     * Sets the value of the businessOperatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOperatingStatus(String value) {
        this.businessOperatingStatus = value;
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

    /**
     * Gets the value of the principalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalPosition() {
        return principalPosition;
    }

    /**
     * Sets the value of the principalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalPosition(String value) {
        this.principalPosition = value;
    }

    /**
     * Gets the value of the principalPositionAppointedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getPrincipalPositionAppointedDate() {
        return principalPositionAppointedDate;
    }

    /**
     * Sets the value of the principalPositionAppointedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setPrincipalPositionAppointedDate(DNBDate value) {
        this.principalPositionAppointedDate = value;
    }

    /**
     * Gets the value of the signingAuthorities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signingAuthorities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigningAuthorities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociateCorporateDirectorshipsEntryType.SigningAuthorities }
     * 
     * 
     */
    public List<AssociateCorporateDirectorshipsEntryType.SigningAuthorities> getSigningAuthorities() {
        if (signingAuthorities == null) {
            signingAuthorities = new ArrayList<AssociateCorporateDirectorshipsEntryType.SigningAuthorities>();
        }
        return this.signingAuthorities;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SigningAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "signingAuthority"
    })
    public static class SigningAuthorities {

        @XmlElement(name = "SigningAuthority")
        protected String signingAuthority;

        /**
         * Gets the value of the signingAuthority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSigningAuthority() {
            return signingAuthority;
        }

        /**
         * Sets the value of the signingAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSigningAuthority(String value) {
            this.signingAuthority = value;
        }

    }

}
