
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RcvrCsstnData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RcvrCsstnData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CessationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ReceiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RcvrCsstnData", propOrder = {
    "cessationDate",
    "receiverName",
    "receiverLocation"
})
public class RcvrCsstnData {

    @XmlElement(name = "CessationDate")
    protected CCYYMMDD cessationDate;
    @XmlElement(name = "ReceiverName")
    protected String receiverName;
    @XmlElement(name = "ReceiverLocation")
    protected LtdBusinessLocation receiverLocation;

    /**
     * Gets the value of the cessationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getCessationDate() {
        return cessationDate;
    }

    /**
     * Sets the value of the cessationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setCessationDate(CCYYMMDD value) {
        this.cessationDate = value;
    }

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
