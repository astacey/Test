
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FAIL_SCR_ENTR3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FAIL_SCR_ENTR3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SCR_GRP" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}SCR_GRP7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FAIL_SCR_ENTR3", propOrder = {
    "scrgrp"
})
public class FAILSCRENTR3 {

    @XmlElementRef(name = "SCR_GRP", type = JAXBElement.class)
    protected JAXBElement<SCRGRP7> scrgrp;

    /**
     * Gets the value of the scrgrp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCRGRP7 }{@code >}
     *     
     */
    public JAXBElement<SCRGRP7> getSCRGRP() {
        return scrgrp;
    }

    /**
     * Sets the value of the scrgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCRGRP7 }{@code >}
     *     
     */
    public void setSCRGRP(JAXBElement<SCRGRP7> value) {
        this.scrgrp = ((JAXBElement<SCRGRP7> ) value);
    }

}
