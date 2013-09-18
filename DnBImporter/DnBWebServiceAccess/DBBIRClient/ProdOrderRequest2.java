
package DBBIRClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prodOrderRequest_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prodOrderRequest_2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRVRTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socCode" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}socCode" minOccurs="0"/>
 *         &lt;element name="Orders" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}Orders"/>
 *         &lt;element name="Immediate_Delivery" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}Immediate_Delivery"/>
 *         &lt;element name="Investigation" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}Investigation" minOccurs="0"/>
 *         &lt;element name="AdditionalFields" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}ArrayOfAdditionalFields" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prodOrderRequest_2", propOrder = {
    "userId",
    "password",
    "trnuid",
    "srvrtid",
    "socCode",
    "orders",
    "immediateDelivery",
    "investigation",
    "additionalFields"
})
public class ProdOrderRequest2 {

    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElementRef(name = "TRNUID", type = JAXBElement.class)
    protected JAXBElement<String> trnuid;
    @XmlElementRef(name = "SRVRTID", type = JAXBElement.class)
    protected JAXBElement<String> srvrtid;
    @XmlElementRef(name = "socCode", type = JAXBElement.class)
    protected JAXBElement<SocCode> socCode;
    @XmlElement(name = "Orders", required = true, nillable = true)
    protected Orders orders;
    @XmlElement(name = "Immediate_Delivery", required = true, nillable = true)
    protected ImmediateDelivery immediateDelivery;
    @XmlElementRef(name = "Investigation", type = JAXBElement.class)
    protected JAXBElement<Investigation> investigation;
    @XmlElementRef(name = "AdditionalFields", type = JAXBElement.class)
    protected JAXBElement<ArrayOfAdditionalFields> additionalFields;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the trnuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRNUID() {
        return trnuid;
    }

    /**
     * Sets the value of the trnuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRNUID(JAXBElement<String> value) {
        this.trnuid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSRVRTID() {
        return srvrtid;
    }

    /**
     * Sets the value of the srvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSRVRTID(JAXBElement<String> value) {
        this.srvrtid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the socCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SocCode }{@code >}
     *     
     */
    public JAXBElement<SocCode> getSocCode() {
        return socCode;
    }

    /**
     * Sets the value of the socCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SocCode }{@code >}
     *     
     */
    public void setSocCode(JAXBElement<SocCode> value) {
        this.socCode = ((JAXBElement<SocCode> ) value);
    }

    /**
     * Gets the value of the orders property.
     * 
     * @return
     *     possible object is
     *     {@link Orders }
     *     
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * Sets the value of the orders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orders }
     *     
     */
    public void setOrders(Orders value) {
        this.orders = value;
    }

    /**
     * Gets the value of the immediateDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ImmediateDelivery }
     *     
     */
    public ImmediateDelivery getImmediateDelivery() {
        return immediateDelivery;
    }

    /**
     * Sets the value of the immediateDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmediateDelivery }
     *     
     */
    public void setImmediateDelivery(ImmediateDelivery value) {
        this.immediateDelivery = value;
    }

    /**
     * Gets the value of the investigation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Investigation }{@code >}
     *     
     */
    public JAXBElement<Investigation> getInvestigation() {
        return investigation;
    }

    /**
     * Sets the value of the investigation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Investigation }{@code >}
     *     
     */
    public void setInvestigation(JAXBElement<Investigation> value) {
        this.investigation = ((JAXBElement<Investigation> ) value);
    }

    /**
     * Gets the value of the additionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFields }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAdditionalFields> getAdditionalFields() {
        return additionalFields;
    }

    /**
     * Sets the value of the additionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFields }{@code >}
     *     
     */
    public void setAdditionalFields(JAXBElement<ArrayOfAdditionalFields> value) {
        this.additionalFields = ((JAXBElement<ArrayOfAdditionalFields> ) value);
    }

}
