
package DBGetNotificationCountClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DGX complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DGX">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIGNONMSGSRSV1" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount}SIGNONMSGSRSV1"/>
 *         &lt;element name="GLBLMNSVCMSGSRSV1" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount}GLBLMNSVCMSGSRSV1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DGX", propOrder = {
    "signonmsgsrsv1",
    "glblmnsvcmsgsrsv1"
})
public class DGX {

    @XmlElement(name = "SIGNONMSGSRSV1", required = true, nillable = true)
    protected SIGNONMSGSRSV1 signonmsgsrsv1;
    @XmlElementRef(name = "GLBLMNSVCMSGSRSV1", type = JAXBElement.class)
    protected JAXBElement<GLBLMNSVCMSGSRSV1> glblmnsvcmsgsrsv1;

    /**
     * Gets the value of the signonmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link SIGNONMSGSRSV1 }
     *     
     */
    public SIGNONMSGSRSV1 getSIGNONMSGSRSV1() {
        return signonmsgsrsv1;
    }

    /**
     * Sets the value of the signonmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNONMSGSRSV1 }
     *     
     */
    public void setSIGNONMSGSRSV1(SIGNONMSGSRSV1 value) {
        this.signonmsgsrsv1 = value;
    }

    /**
     * Gets the value of the glblmnsvcmsgsrsv1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLBLMNSVCMSGSRSV1 }{@code >}
     *     
     */
    public JAXBElement<GLBLMNSVCMSGSRSV1> getGLBLMNSVCMSGSRSV1() {
        return glblmnsvcmsgsrsv1;
    }

    /**
     * Sets the value of the glblmnsvcmsgsrsv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLBLMNSVCMSGSRSV1 }{@code >}
     *     
     */
    public void setGLBLMNSVCMSGSRSV1(JAXBElement<GLBLMNSVCMSGSRSV1> value) {
        this.glblmnsvcmsgsrsv1 = ((JAXBElement<GLBLMNSVCMSGSRSV1> ) value);
    }

}
