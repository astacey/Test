
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DELQ_SCR_ENTR2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DELQ_SCR_ENTR2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCR_GRP" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}SCR_GRP5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DELQ_SCR_ENTR2", propOrder = {
    "scrgrp"
})
public class DELQSCRENTR2 {

    @XmlElementRef(name = "SCR_GRP", type = JAXBElement.class)
    protected JAXBElement<SCRGRP5> scrgrp;

    /**
     * Gets the value of the scrgrp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCRGRP5 }{@code >}
     *     
     */
    public JAXBElement<SCRGRP5> getSCRGRP() {
        return scrgrp;
    }

    /**
     * Sets the value of the scrgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCRGRP5 }{@code >}
     *     
     */
    public void setSCRGRP(JAXBElement<SCRGRP5> value) {
        this.scrgrp = ((JAXBElement<SCRGRP5> ) value);
    }

}
