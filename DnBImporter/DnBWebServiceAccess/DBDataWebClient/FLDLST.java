
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FLD_LST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLD_LST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLD_ATTR" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}FLD_ATTR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLD_LST", propOrder = {
    "fldattr"
})
public class FLDLST {

    @XmlElementRef(name = "FLD_ATTR", type = JAXBElement.class)
    protected JAXBElement<FLDATTR> fldattr;

    /**
     * Gets the value of the fldattr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FLDATTR }{@code >}
     *     
     */
    public JAXBElement<FLDATTR> getFLDATTR() {
        return fldattr;
    }

    /**
     * Sets the value of the fldattr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FLDATTR }{@code >}
     *     
     */
    public void setFLDATTR(JAXBElement<FLDATTR> value) {
        this.fldattr = ((JAXBElement<FLDATTR> ) value);
    }

}
