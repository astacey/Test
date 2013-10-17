
package DBGetNotificationsClientV3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FAIL_SCR_ENTR2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAIL_SCR_ENTR2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCR_GRP" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}SCR_GRP4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAIL_SCR_ENTR2", propOrder = {
    "scrgrp"
})
public class FAILSCRENTR2 {

    @XmlElement(name = "SCR_GRP", required = true, nillable = true)
    protected SCRGRP4 scrgrp;

    /**
     * Gets the value of the scrgrp property.
     * 
     * @return
     *     possible object is
     *     {@link SCRGRP4 }
     *     
     */
    public SCRGRP4 getSCRGRP() {
        return scrgrp;
    }

    /**
     * Sets the value of the scrgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCRGRP4 }
     *     
     */
    public void setSCRGRP(SCRGRP4 value) {
        this.scrgrp = value;
    }

}
