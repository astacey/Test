
package DBGetRegistrationActivityClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HISTRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HISTRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTV_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTV_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTV_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDL_DET_RS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity}ADDL_DET_RS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HISTRS", propOrder = {
    "actvdt",
    "actvcd",
    "actvdesc",
    "addldetrs"
})
public class HISTRS {

    @XmlElementRef(name = "ACTV_DT", type = JAXBElement.class)
    protected JAXBElement<String> actvdt;
    @XmlElementRef(name = "ACTV_CD", type = JAXBElement.class)
    protected JAXBElement<String> actvcd;
    @XmlElementRef(name = "ACTV_DESC", type = JAXBElement.class)
    protected JAXBElement<String> actvdesc;
    @XmlElementRef(name = "ADDL_DET_RS", type = JAXBElement.class)
    protected JAXBElement<ADDLDETRS> addldetrs;

    /**
     * Gets the value of the actvdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACTVDT() {
        return actvdt;
    }

    /**
     * Sets the value of the actvdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACTVDT(JAXBElement<String> value) {
        this.actvdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the actvcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACTVCD() {
        return actvcd;
    }

    /**
     * Sets the value of the actvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACTVCD(JAXBElement<String> value) {
        this.actvcd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the actvdesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACTVDESC() {
        return actvdesc;
    }

    /**
     * Sets the value of the actvdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACTVDESC(JAXBElement<String> value) {
        this.actvdesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addldetrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ADDLDETRS }{@code >}
     *     
     */
    public JAXBElement<ADDLDETRS> getADDLDETRS() {
        return addldetrs;
    }

    /**
     * Sets the value of the addldetrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ADDLDETRS }{@code >}
     *     
     */
    public void setADDLDETRS(JAXBElement<ADDLDETRS> value) {
        this.addldetrs = ((JAXBElement<ADDLDETRS> ) value);
    }

}
