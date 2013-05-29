
package DBWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FRD_RISK_SCR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FRD_RISK_SCR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}STATUS3" minOccurs="0"/>
 *         &lt;element name="FDSLOOKUPRS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}FDSLOOKUPRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FRD_RISK_SCR", propOrder = {
    "trnuid",
    "status",
    "fdslookuprs"
})
public class FRDRISKSCR {

    @XmlElementRef(name = "TRNUID", type = JAXBElement.class)
    protected JAXBElement<String> trnuid;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class)
    protected JAXBElement<STATUS3> status;
    @XmlElementRef(name = "FDSLOOKUPRS", type = JAXBElement.class)
    protected JAXBElement<FDSLOOKUPRS> fdslookuprs;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link STATUS3 }{@code >}
     *     
     */
    public JAXBElement<STATUS3> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link STATUS3 }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<STATUS3> value) {
        this.status = ((JAXBElement<STATUS3> ) value);
    }

    /**
     * Gets the value of the fdslookuprs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FDSLOOKUPRS }{@code >}
     *     
     */
    public JAXBElement<FDSLOOKUPRS> getFDSLOOKUPRS() {
        return fdslookuprs;
    }

    /**
     * Sets the value of the fdslookuprs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FDSLOOKUPRS }{@code >}
     *     
     */
    public void setFDSLOOKUPRS(JAXBElement<FDSLOOKUPRS> value) {
        this.fdslookuprs = ((JAXBElement<FDSLOOKUPRS> ) value);
    }

}
