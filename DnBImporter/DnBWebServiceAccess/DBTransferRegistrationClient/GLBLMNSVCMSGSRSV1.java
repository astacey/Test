
package DBTransferRegistrationClient;

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
 *         &lt;element name="XFERREGNTRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration}XFERREGNTRNRS" minOccurs="0"/>
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
    "xferregntrnrs"
})
public class GLBLMNSVCMSGSRSV1 {

    @XmlElementRef(name = "XFERREGNTRNRS", type = JAXBElement.class)
    protected JAXBElement<XFERREGNTRNRS> xferregntrnrs;

    /**
     * Gets the value of the xferregntrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFERREGNTRNRS }{@code >}
     *     
     */
    public JAXBElement<XFERREGNTRNRS> getXFERREGNTRNRS() {
        return xferregntrnrs;
    }

    /**
     * Sets the value of the xferregntrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFERREGNTRNRS }{@code >}
     *     
     */
    public void setXFERREGNTRNRS(JAXBElement<XFERREGNTRNRS> value) {
        this.xferregntrnrs = ((JAXBElement<XFERREGNTRNRS> ) value);
    }

}
