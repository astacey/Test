
package DBModifyRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GLBLMNSVCMSGSRSV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLBLMNSVCMSGSRSV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MODREGNTRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}MODREGNTRNRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLBLMNSVCMSGSRSV1", propOrder = {
    "modregntrnrs"
})
public class GLBLMNSVCMSGSRSV1 {

    @XmlElementRef(name = "MODREGNTRNRS", type = JAXBElement.class)
    protected JAXBElement<MODREGNTRNRS> modregntrnrs;

    /**
     * Gets the value of the modregntrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MODREGNTRNRS }{@code >}
     *     
     */
    public JAXBElement<MODREGNTRNRS> getMODREGNTRNRS() {
        return modregntrnrs;
    }

    /**
     * Sets the value of the modregntrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MODREGNTRNRS }{@code >}
     *     
     */
    public void setMODREGNTRNRS(JAXBElement<MODREGNTRNRS> value) {
        this.modregntrnrs = ((JAXBElement<MODREGNTRNRS> ) value);
    }

}
