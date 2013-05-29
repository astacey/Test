
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KEY_FLDS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KEY_FLDS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY_FLD" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}ArrayOfKEY_FLD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEY_FLDS", propOrder = {
    "keyfld"
})
public class KEYFLDS {

    @XmlElementRef(name = "KEY_FLD", type = JAXBElement.class)
    protected JAXBElement<ArrayOfKEYFLD> keyfld;

    /**
     * Gets the value of the keyfld property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKEYFLD }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKEYFLD> getKEYFLD() {
        return keyfld;
    }

    /**
     * Sets the value of the keyfld property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKEYFLD }{@code >}
     *     
     */
    public void setKEYFLD(JAXBElement<ArrayOfKEYFLD> value) {
        this.keyfld = ((JAXBElement<ArrayOfKEYFLD> ) value);
    }

}
