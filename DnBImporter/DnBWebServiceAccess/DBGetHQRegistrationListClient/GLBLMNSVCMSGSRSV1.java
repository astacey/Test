
package DBGetHQRegistrationListClient;

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
 *         &lt;element name="HQREGNLSTTRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}HQREGNLSTTRNRS" minOccurs="0"/>
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
    "hqregnlsttrnrs"
})
public class GLBLMNSVCMSGSRSV1 {

    @XmlElementRef(name = "HQREGNLSTTRNRS", type = JAXBElement.class)
    protected JAXBElement<HQREGNLSTTRNRS> hqregnlsttrnrs;

    /**
     * Gets the value of the hqregnlsttrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HQREGNLSTTRNRS }{@code >}
     *     
     */
    public JAXBElement<HQREGNLSTTRNRS> getHQREGNLSTTRNRS() {
        return hqregnlsttrnrs;
    }

    /**
     * Sets the value of the hqregnlsttrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HQREGNLSTTRNRS }{@code >}
     *     
     */
    public void setHQREGNLSTTRNRS(JAXBElement<HQREGNLSTTRNRS> value) {
        this.hqregnlsttrnrs = ((JAXBElement<HQREGNLSTTRNRS> ) value);
    }

}
