
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterofAgreementInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterofAgreementInformationEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountYear" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="LetterofAgreementDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterofAgreementInformationEntryType", propOrder = {
    "accountYear",
    "letterofAgreementDate"
})
public class LetterofAgreementInformationEntryType {

    @XmlElement(name = "AccountYear")
    protected DNBDate accountYear;
    @XmlElement(name = "LetterofAgreementDate")
    protected DNBDate letterofAgreementDate;

    /**
     * Gets the value of the accountYear property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAccountYear() {
        return accountYear;
    }

    /**
     * Sets the value of the accountYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAccountYear(DNBDate value) {
        this.accountYear = value;
    }

    /**
     * Gets the value of the letterofAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getLetterofAgreementDate() {
        return letterofAgreementDate;
    }

    /**
     * Sets the value of the letterofAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setLetterofAgreementDate(DNBDate value) {
        this.letterofAgreementDate = value;
    }

}
