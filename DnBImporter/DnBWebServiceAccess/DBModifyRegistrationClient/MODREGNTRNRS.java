
package DBModifyRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MODREGNTRNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MODREGNTRNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RSLT_TKT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}STATUS2" minOccurs="0"/>
 *         &lt;element name="MODREGNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}ArrayOfMODREGNRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODREGNTRNRS", propOrder = {
    "trnuid",
    "rslttkt",
    "status",
    "modregnrs"
})
public class MODREGNTRNRS {

    @XmlElement(name = "TRNUID", required = true, nillable = true)
    protected String trnuid;
    @XmlElementRef(name = "RSLT_TKT", type = JAXBElement.class)
    protected JAXBElement<String> rslttkt;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class)
    protected JAXBElement<STATUS2> status;
    @XmlElementRef(name = "MODREGNRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMODREGNRS> modregnrs;

    /**
     * Gets the value of the trnuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNUID() {
        return trnuid;
    }

    /**
     * Sets the value of the trnuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNUID(String value) {
        this.trnuid = value;
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
     * Gets the value of the modregnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMODREGNRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMODREGNRS> getMODREGNRS() {
        return modregnrs;
    }

    /**
     * Sets the value of the modregnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMODREGNRS }{@code >}
     *     
     */
    public void setMODREGNRS(JAXBElement<ArrayOfMODREGNRS> value) {
        this.modregnrs = ((JAXBElement<ArrayOfMODREGNRS> ) value);
    }

}
