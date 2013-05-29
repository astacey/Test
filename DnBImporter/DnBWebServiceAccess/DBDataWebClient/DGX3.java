
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DGX3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DGX3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIGNONMSGSRSV1" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}SIGNONMSGSRSV13"/>
 *         &lt;element name="CREDITMSGSRSV2" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}CREDITMSGSRSV23" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DGX3", propOrder = {
    "signonmsgsrsv1",
    "creditmsgsrsv2"
})
public class DGX3 {

    @XmlElement(name = "SIGNONMSGSRSV1", required = true, nillable = true)
    protected SIGNONMSGSRSV13 signonmsgsrsv1;
    @XmlElementRef(name = "CREDITMSGSRSV2", type = JAXBElement.class)
    protected JAXBElement<CREDITMSGSRSV23> creditmsgsrsv2;

    /**
     * Gets the value of the signonmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SIGNONMSGSRSV13 }
     *     
     */
    public SIGNONMSGSRSV13 getSIGNONMSGSRSV1() {
        return signonmsgsrsv1;
    }

    /**
     * Sets the value of the signonmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNONMSGSRSV13 }
     *     
     */
    public void setSIGNONMSGSRSV1(SIGNONMSGSRSV13 value) {
        this.signonmsgsrsv1 = value;
    }

    /**
     * Gets the value of the creditmsgsrsv2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CREDITMSGSRSV23 }{@code >}
     *     
     */
    public JAXBElement<CREDITMSGSRSV23> getCREDITMSGSRSV2() {
        return creditmsgsrsv2;
    }

    /**
     * Sets the value of the creditmsgsrsv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CREDITMSGSRSV23 }{@code >}
     *     
     */
    public void setCREDITMSGSRSV2(JAXBElement<CREDITMSGSRSV23> value) {
        this.creditmsgsrsv2 = ((JAXBElement<CREDITMSGSRSV23> ) value);
    }

}
