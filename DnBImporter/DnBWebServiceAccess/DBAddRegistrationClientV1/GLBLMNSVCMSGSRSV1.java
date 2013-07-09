
package DBAddRegistrationClientV1;

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
 *         &lt;element name="ADDREGNTRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/AddRegistration_V1/wsp_AddRegistration_V1}ADDREGNTRNRS" minOccurs="0"/>
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
    "addregntrnrs"
})
public class GLBLMNSVCMSGSRSV1 {

    @XmlElementRef(name = "ADDREGNTRNRS", type = JAXBElement.class)
    protected JAXBElement<ADDREGNTRNRS> addregntrnrs;

    /**
     * Gets the value of the addregntrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ADDREGNTRNRS }{@code >}
     *     
     */
    public JAXBElement<ADDREGNTRNRS> getADDREGNTRNRS() {
        return addregntrnrs;
    }

    /**
     * Sets the value of the addregntrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ADDREGNTRNRS }{@code >}
     *     
     */
    public void setADDREGNTRNRS(JAXBElement<ADDREGNTRNRS> value) {
        this.addregntrnrs = ((JAXBElement<ADDREGNTRNRS> ) value);
    }

}
