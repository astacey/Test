
package DBGetNotificationCountClient;

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
 *         &lt;element name="GETNTFCCNTTRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount}GETNTFCCNTTRNRS" minOccurs="0"/>
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
    "getntfccnttrnrs"
})
public class GLBLMNSVCMSGSRSV1 {

    @XmlElementRef(name = "GETNTFCCNTTRNRS", type = JAXBElement.class)
    protected JAXBElement<GETNTFCCNTTRNRS> getntfccnttrnrs;

    /**
     * Gets the value of the getntfccnttrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GETNTFCCNTTRNRS }{@code >}
     *     
     */
    public JAXBElement<GETNTFCCNTTRNRS> getGETNTFCCNTTRNRS() {
        return getntfccnttrnrs;
    }

    /**
     * Sets the value of the getntfccnttrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GETNTFCCNTTRNRS }{@code >}
     *     
     */
    public void setGETNTFCCNTTRNRS(JAXBElement<GETNTFCCNTTRNRS> value) {
        this.getntfccnttrnrs = ((JAXBElement<GETNTFCCNTTRNRS> ) value);
    }

}
