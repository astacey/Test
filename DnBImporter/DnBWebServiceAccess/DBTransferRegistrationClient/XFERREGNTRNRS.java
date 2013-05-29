
package DBTransferRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XFERREGNTRNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XFERREGNTRNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSLT_TKT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration}STATUS2" minOccurs="0"/>
 *         &lt;element name="XFERREGNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration}XFERREGNRS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XFERREGNTRNRS", propOrder = {
    "trnuid",
    "rslttkt",
    "status",
    "xferregnrs"
})
public class XFERREGNTRNRS {

    @XmlElementRef(name = "TRNUID", type = JAXBElement.class)
    protected JAXBElement<String> trnuid;
    @XmlElementRef(name = "RSLT_TKT", type = JAXBElement.class)
    protected JAXBElement<String> rslttkt;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class)
    protected JAXBElement<STATUS2> status;
    @XmlElement(name = "XFERREGNRS", required = true, nillable = true)
    protected XFERREGNRS xferregnrs;

    /**
     * Gets the value of the trnuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRNUID() {
        return trnuid;
    }

    /**
     * Sets the value of the trnuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRNUID(JAXBElement<String> value) {
        this.trnuid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rslttkt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRSLTTKT() {
        return rslttkt;
    }

    /**
     * Sets the value of the rslttkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRSLTTKT(JAXBElement<String> value) {
        this.rslttkt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}
     *     
     */
    public JAXBElement<STATUS2> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<STATUS2> value) {
        this.status = ((JAXBElement<STATUS2> ) value);
    }

    /**
     * Gets the value of the xferregnrs property.
     * 
     * @return
     *     possible object is
     *     {@link XFERREGNRS }
     *     
     */
    public XFERREGNRS getXFERREGNRS() {
        return xferregnrs;
    }

    /**
     * Sets the value of the xferregnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFERREGNRS }
     *     
     */
    public void setXFERREGNRS(XFERREGNRS value) {
        this.xferregnrs = value;
    }

}
