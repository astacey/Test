
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Investigation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Investigation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvestigationDelivery" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}InvestigationDelivery" minOccurs="0"/>
 *         &lt;element name="NotificationDelivery" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}NotificationDelivery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Investigation", propOrder = {
    "investigationDelivery",
    "notificationDelivery"
})
public class Investigation {

    @XmlElementRef(name = "InvestigationDelivery", type = JAXBElement.class)
    protected JAXBElement<InvestigationDelivery> investigationDelivery;
    @XmlElementRef(name = "NotificationDelivery", type = JAXBElement.class)
    protected JAXBElement<NotificationDelivery> notificationDelivery;

    /**
     * Gets the value of the investigationDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvestigationDelivery }{@code >}
     *     
     */
    public JAXBElement<InvestigationDelivery> getInvestigationDelivery() {
        return investigationDelivery;
    }

    /**
     * Sets the value of the investigationDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvestigationDelivery }{@code >}
     *     
     */
    public void setInvestigationDelivery(JAXBElement<InvestigationDelivery> value) {
        this.investigationDelivery = ((JAXBElement<InvestigationDelivery> ) value);
    }

    /**
     * Gets the value of the notificationDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotificationDelivery }{@code >}
     *     
     */
    public JAXBElement<NotificationDelivery> getNotificationDelivery() {
        return notificationDelivery;
    }

    /**
     * Sets the value of the notificationDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotificationDelivery }{@code >}
     *     
     */
    public void setNotificationDelivery(JAXBElement<NotificationDelivery> value) {
        this.notificationDelivery = ((JAXBElement<NotificationDelivery> ) value);
    }

}
