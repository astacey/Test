
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RcvrAppntData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RcvrAppntData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ReceiverLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RcvrAppntData", propOrder = {
    "receiverName",
    "firmName",
    "receiverType",
    "receiverDate",
    "receiverLocation"
})
public class RcvrAppntData {

    @XmlElement(name = "ReceiverName")
    protected String receiverName;
    @XmlElement(name = "FirmName")
    protected String firmName;
    @XmlElement(name = "ReceiverType")
    protected String receiverType;
    @XmlElement(name = "ReceiverDate")
    protected CCYYMMDD receiverDate;
    @XmlElement(name = "ReceiverLocation")
    protected LtdBusinessLocation receiverLocation;

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the firmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * Sets the value of the firmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmName(String value) {
        this.firmName = value;
    }

    /**
     * Gets the value of the receiverType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverType() {
        return receiverType;
    }

    /**
     * Sets the value of the receiverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverType(String value) {
        this.receiverType = value;
    }

    /**
     * Gets the value of the receiverDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getReceiverDate() {
        return receiverDate;
    }

    /**
     * Sets the value of the receiverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setReceiverDate(CCYYMMDD value) {
        this.receiverDate = value;
    }

    /**
     * Gets the value of the receiverLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getReceiverLocation() {
        return receiverLocation;
    }

    /**
     * Sets the value of the receiverLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setReceiverLocation(LtdBusinessLocation value) {
        this.receiverLocation = value;
    }

}
