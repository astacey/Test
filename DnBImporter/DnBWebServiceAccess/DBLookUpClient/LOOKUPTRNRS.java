
package DBLookUpClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOOKUPTRNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOOKUPTRNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}STATUS2" minOccurs="0"/>
 *         &lt;element name="LOOKUPRS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LOOKUPRS" minOccurs="0"/>
 *         &lt;element name="FRD_RISK_SCR" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}FRD_RISK_SCR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOOKUPTRNRS", propOrder = {
    "trnuid",
    "status",
    "lookuprs",
    "frdriskscr"
})
public class LOOKUPTRNRS {

    @XmlElementRef(name = "TRNUID", type = JAXBElement.class)
    protected JAXBElement<String> trnuid;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class)
    protected JAXBElement<STATUS2> status;
    @XmlElementRef(name = "LOOKUPRS", type = JAXBElement.class)
    protected JAXBElement<LOOKUPRS> lookuprs;
    @XmlElementRef(name = "FRD_RISK_SCR", type = JAXBElement.class)
    protected JAXBElement<FRDRISKSCR> frdriskscr;

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
     * Gets the value of the lookuprs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOOKUPRS }{@code >}
     *     
     */
    public JAXBElement<LOOKUPRS> getLOOKUPRS() {
        return lookuprs;
    }

    /**
     * Sets the value of the lookuprs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOOKUPRS }{@code >}
     *     
     */
    public void setLOOKUPRS(JAXBElement<LOOKUPRS> value) {
        this.lookuprs = ((JAXBElement<LOOKUPRS> ) value);
    }

    /**
     * Gets the value of the frdriskscr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FRDRISKSCR }{@code >}
     *     
     */
    public JAXBElement<FRDRISKSCR> getFRDRISKSCR() {
        return frdriskscr;
    }

    /**
     * Sets the value of the frdriskscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FRDRISKSCR }{@code >}
     *     
     */
    public void setFRDRISKSCR(JAXBElement<FRDRISKSCR> value) {
        this.frdriskscr = ((JAXBElement<FRDRISKSCR> ) value);
    }

}
