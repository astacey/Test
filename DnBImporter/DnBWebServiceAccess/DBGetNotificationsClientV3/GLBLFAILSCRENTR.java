
package DBGetNotificationsClientV3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GLBL_FAIL_SCR_ENTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLBL_FAIL_SCR_ENTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCR_GRP" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}SCR_GRP3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLBL_FAIL_SCR_ENTR", propOrder = {
    "scrgrp"
})
public class GLBLFAILSCRENTR {

    @XmlElement(name = "SCR_GRP", required = true, nillable = true)
    protected SCRGRP3 scrgrp;

    /**
     * Gets the value of the scrgrp property.
     * 
     * @return
     *     possible object is
     *     {@link SCRGRP3 }
     *     
     */
    public SCRGRP3 getSCRGRP() {
        return scrgrp;
    }

    /**
     * Sets the value of the scrgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCRGRP3 }
     *     
     */
    public void setSCRGRP(SCRGRP3 value) {
        this.scrgrp = value;
    }

}
