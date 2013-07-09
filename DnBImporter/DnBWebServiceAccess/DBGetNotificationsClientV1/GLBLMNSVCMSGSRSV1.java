
package DBGetNotificationsClientV1;

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
 *         &lt;element name="GETNTFCTRNRS" type="{https://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V1/wsp_GetNotifications_V1}GETNTFCTRNRS" minOccurs="0"/>
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
    "getntfctrnrs"
})
public class GLBLMNSVCMSGSRSV1 {

    @XmlElementRef(name = "GETNTFCTRNRS", type = JAXBElement.class)
    protected JAXBElement<GETNTFCTRNRS> getntfctrnrs;

    /**
     * Gets the value of the getntfctrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GETNTFCTRNRS }{@code >}
     *     
     */
    public JAXBElement<GETNTFCTRNRS> getGETNTFCTRNRS() {
        return getntfctrnrs;
    }

    /**
     * Sets the value of the getntfctrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GETNTFCTRNRS }{@code >}
     *     
     */
    public void setGETNTFCTRNRS(JAXBElement<GETNTFCTRNRS> value) {
        this.getntfctrnrs = ((JAXBElement<GETNTFCTRNRS> ) value);
    }

}
