
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalsInformationOverviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalsInformationOverviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CEOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPrincipalsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AppointmentsLastYearQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PreviousPrincipalsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ResignationsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalsInformationOverviewType", propOrder = {
    "ceoName",
    "currentPrincipalsQuantity",
    "appointmentsLastYearQuantity",
    "previousPrincipalsQuantity",
    "resignationsQuantity"
})
public class PrincipalsInformationOverviewType {

    @XmlElement(name = "CEOName")
    protected String ceoName;
    @XmlElement(name = "CurrentPrincipalsQuantity")
    protected BigInteger currentPrincipalsQuantity;
    @XmlElement(name = "AppointmentsLastYearQuantity")
    protected BigInteger appointmentsLastYearQuantity;
    @XmlElement(name = "PreviousPrincipalsQuantity")
    protected BigInteger previousPrincipalsQuantity;
    @XmlElement(name = "ResignationsQuantity")
    protected BigInteger resignationsQuantity;

    /**
     * Gets the value of the ceoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEOName() {
        return ceoName;
    }

    /**
     * Sets the value of the ceoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEOName(String value) {
        this.ceoName = value;
    }

    /**
     * Gets the value of the currentPrincipalsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentPrincipalsQuantity() {
        return currentPrincipalsQuantity;
    }

    /**
     * Sets the value of the currentPrincipalsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentPrincipalsQuantity(BigInteger value) {
        this.currentPrincipalsQuantity = value;
    }

    /**
     * Gets the value of the appointmentsLastYearQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppointmentsLastYearQuantity() {
        return appointmentsLastYearQuantity;
    }

    /**
     * Sets the value of the appointmentsLastYearQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppointmentsLastYearQuantity(BigInteger value) {
        this.appointmentsLastYearQuantity = value;
    }

    /**
     * Gets the value of the previousPrincipalsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreviousPrincipalsQuantity() {
        return previousPrincipalsQuantity;
    }

    /**
     * Sets the value of the previousPrincipalsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreviousPrincipalsQuantity(BigInteger value) {
        this.previousPrincipalsQuantity = value;
    }

    /**
     * Gets the value of the resignationsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResignationsQuantity() {
        return resignationsQuantity;
    }

    /**
     * Sets the value of the resignationsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResignationsQuantity(BigInteger value) {
        this.resignationsQuantity = value;
    }

}
