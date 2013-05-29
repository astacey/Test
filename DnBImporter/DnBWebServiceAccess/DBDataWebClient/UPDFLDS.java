
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UPD_FLDS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UPD_FLDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UPD_FLD" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}ArrayOfUPD_FLD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPD_FLDS", propOrder = {
    "updfld"
})
public class UPDFLDS {

    @XmlElementRef(name = "UPD_FLD", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUPDFLD> updfld;

    /**
     * Gets the value of the updfld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUPDFLD }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUPDFLD> getUPDFLD() {
        return updfld;
    }

    /**
     * Sets the value of the updfld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUPDFLD }{@code >}
     *     
     */
    public void setUPDFLD(JAXBElement<ArrayOfUPDFLD> value) {
        this.updfld = ((JAXBElement<ArrayOfUPDFLD> ) value);
    }

}
