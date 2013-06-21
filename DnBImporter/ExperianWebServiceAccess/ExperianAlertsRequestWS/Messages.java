
package ExperianAlertsRequestWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Messages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Messages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageType" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}MsgType"/>
 *         &lt;element name="AdverseLegalMessages" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="AccountsMessages" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="GeneralMessages" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="CCJMessages" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="PaymentMessages" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="CommercialDelphiMessages" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="ExpiryMessages" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="BusinessRef" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LegalStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClientReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([0-9a-zA-Z/\\&amp;()\-+,.'\ ])*"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LoadedSince" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LoadedBefore" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="FirstSeen" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Messages", propOrder = {
    "messageType",
    "adverseLegalMessages",
    "accountsMessages",
    "generalMessages",
    "ccjMessages",
    "paymentMessages",
    "commercialDelphiMessages",
    "expiryMessages",
    "businessRef",
    "legalStatus",
    "clientReference",
    "loadedSince",
    "loadedBefore",
    "firstSeen"
})
public class Messages {

    @XmlElement(name = "MessageType", required = true)
    protected MsgType messageType;
    @XmlElement(name = "AdverseLegalMessages", required = true)
    protected YesNo adverseLegalMessages;
    @XmlElement(name = "AccountsMessages", required = true)
    protected YesNo accountsMessages;
    @XmlElement(name = "GeneralMessages", required = true)
    protected YesNo generalMessages;
    @XmlElement(name = "CCJMessages", required = true)
    protected YesNo ccjMessages;
    @XmlElement(name = "PaymentMessages", required = true)
    protected YesNo paymentMessages;
    @XmlElement(name = "CommercialDelphiMessages", required = true)
    protected YesNo commercialDelphiMessages;
    @XmlElement(name = "ExpiryMessages", required = true)
    protected YesNo expiryMessages;
    @XmlElement(name = "BusinessRef")
    protected String businessRef;
    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "ClientReference")
    protected String clientReference;
    @XmlElement(name = "LoadedSince")
    protected CCYYMMDD loadedSince;
    @XmlElement(name = "LoadedBefore")
    protected CCYYMMDD loadedBefore;
    @XmlElement(name = "FirstSeen")
    protected CCYYMMDD firstSeen;

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MsgType }
     *     
     */
    public MsgType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgType }
     *     
     */
    public void setMessageType(MsgType value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the adverseLegalMessages property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAdverseLegalMessages() {
        return adverseLegalMessages;
    }

    /**
     * Sets the value of the adverseLegalMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAdverseLegalMessages(YesNo value) {
        this.adverseLegalMessages = value;
    }

    /**
     * Gets the value of the accountsMessages property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAccountsMessages() {
        return accountsMessages;
    }

    /**
     * Sets the value of the accountsMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAccountsMessages(YesNo value) {
        this.accountsMessages = value;
    }

    /**
     * Gets the value of the generalMessages property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getGeneralMessages() {
        return generalMessages;
    }

    /**
     * Sets the value of the generalMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setGeneralMessages(YesNo value) {
        this.generalMessages = value;
    }

    /**
     * Gets the value of the ccjMessages property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCCJMessages() {
        return ccjMessages;
    }

    /**
     * Sets the value of the ccjMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCCJMessages(YesNo value) {
        this.ccjMessages = value;
    }

    /**
     * Gets the value of the paymentMessages property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPaymentMessages() {
        return paymentMessages;
    }

    /**
     * Sets the value of the paymentMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPaymentMessages(YesNo value) {
        this.paymentMessages = value;
    }

    /**
     * Gets the value of the commercialDelphiMessages property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getCommercialDelphiMessages() {
        return commercialDelphiMessages;
    }

    /**
     * Sets the value of the commercialDelphiMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setCommercialDelphiMessages(YesNo value) {
        this.commercialDelphiMessages = value;
    }

    /**
     * Gets the value of the expiryMessages property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getExpiryMessages() {
        return expiryMessages;
    }

    /**
     * Sets the value of the expiryMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setExpiryMessages(YesNo value) {
        this.expiryMessages = value;
    }

    /**
     * Gets the value of the businessRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRef() {
        return businessRef;
    }

    /**
     * Sets the value of the businessRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRef(String value) {
        this.businessRef = value;
    }

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus(String value) {
        this.legalStatus = value;
    }

    /**
     * Gets the value of the clientReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Sets the value of the clientReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

    /**
     * Gets the value of the loadedSince property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLoadedSince() {
        return loadedSince;
    }

    /**
     * Sets the value of the loadedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLoadedSince(CCYYMMDD value) {
        this.loadedSince = value;
    }

    /**
     * Gets the value of the loadedBefore property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLoadedBefore() {
        return loadedBefore;
    }

    /**
     * Sets the value of the loadedBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLoadedBefore(CCYYMMDD value) {
        this.loadedBefore = value;
    }

    /**
     * Gets the value of the firstSeen property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getFirstSeen() {
        return firstSeen;
    }

    /**
     * Sets the value of the firstSeen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setFirstSeen(CCYYMMDD value) {
        this.firstSeen = value;
    }

}
