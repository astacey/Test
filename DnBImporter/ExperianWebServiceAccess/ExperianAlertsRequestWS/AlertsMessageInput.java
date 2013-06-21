
package ExperianAlertsRequestWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertsMessageInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertsMessageInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Paging" type="{http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes}Paging"/>
 *         &lt;element name="Messages" type="{http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes}Messages"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertsMessageInput", namespace = "http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest", propOrder = {
    "paging",
    "messages"
})
public class AlertsMessageInput {

    @XmlElement(name = "Paging", required = true)
    protected Paging paging;
    @XmlElement(name = "Messages", required = true)
    protected Messages messages;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

}
