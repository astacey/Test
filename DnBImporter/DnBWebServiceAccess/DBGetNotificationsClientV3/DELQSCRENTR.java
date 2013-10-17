
package DBGetNotificationsClientV3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DELQ_SCR_ENTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DELQ_SCR_ENTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCR_GRP" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}SCR_GRP2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELQ_SCR_ENTR", propOrder = {
    "scrgrp"
})
public class DELQSCRENTR {

    @XmlElement(name = "SCR_GRP", required = true, nillable = true)
    protected SCRGRP2 scrgrp;

    /**
     * Gets the value of the scrgrp property.
     * 
     * @return
     *     possible object is
     *     {@link SCRGRP2 }
     *     
     */
    public SCRGRP2 getSCRGRP() {
        return scrgrp;
    }

    /**
     * Sets the value of the scrgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCRGRP2 }
     *     
     */
    public void setSCRGRP(SCRGRP2 value) {
        this.scrgrp = value;
    }

}
