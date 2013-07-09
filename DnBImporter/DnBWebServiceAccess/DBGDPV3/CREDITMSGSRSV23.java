
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREDITMSGSRSV23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDITMSGSRSV23">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATATRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}DATATRNRS3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDITMSGSRSV23", propOrder = {
    "datatrnrs"
})
public class CREDITMSGSRSV23 {

    @XmlElementRef(name = "DATATRNRS", type = JAXBElement.class)
    protected JAXBElement<DATATRNRS3> datatrnrs;

    /**
     * Gets the value of the datatrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DATATRNRS3 }{@code >}
     *     
     */
    public JAXBElement<DATATRNRS3> getDATATRNRS() {
        return datatrnrs;
    }

    /**
     * Sets the value of the datatrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DATATRNRS3 }{@code >}
     *     
     */
    public void setDATATRNRS(JAXBElement<DATATRNRS3> value) {
        this.datatrnrs = ((JAXBElement<DATATRNRS3> ) value);
    }

}
