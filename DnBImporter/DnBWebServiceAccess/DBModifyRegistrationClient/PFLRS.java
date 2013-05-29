
package DBModifyRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFLRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFLRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PFL_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROD_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NTFC_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}ArrayOfREGNRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFLRS", propOrder = {
    "pflnme",
    "prodnme",
    "ntfclvl",
    "regnrs"
})
public class PFLRS {

    @XmlElementRef(name = "PFL_NME", type = JAXBElement.class)
    protected JAXBElement<String> pflnme;
    @XmlElementRef(name = "PROD_NME", type = JAXBElement.class)
    protected JAXBElement<String> prodnme;
    @XmlElementRef(name = "NTFC_LVL", type = JAXBElement.class)
    protected JAXBElement<String> ntfclvl;
    @XmlElementRef(name = "REGNRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfREGNRS> regnrs;

    /**
     * Gets the value of the pflnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPFLNME() {
        return pflnme;
    }

    /**
     * Sets the value of the pflnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPFLNME(JAXBElement<String> value) {
        this.pflnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prodnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRODNME() {
        return prodnme;
    }

    /**
     * Sets the value of the prodnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRODNME(JAXBElement<String> value) {
        this.prodnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ntfclvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNTFCLVL() {
        return ntfclvl;
    }

    /**
     * Sets the value of the ntfclvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNTFCLVL(JAXBElement<String> value) {
        this.ntfclvl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the regnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfREGNRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfREGNRS> getREGNRS() {
        return regnrs;
    }

    /**
     * Sets the value of the regnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfREGNRS }{@code >}
     *     
     */
    public void setREGNRS(JAXBElement<ArrayOfREGNRS> value) {
        this.regnrs = ((JAXBElement<ArrayOfREGNRS> ) value);
    }

}
