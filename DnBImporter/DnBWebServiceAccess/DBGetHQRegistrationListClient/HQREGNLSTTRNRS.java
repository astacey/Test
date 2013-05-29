
package DBGetHQRegistrationListClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HQREGNLSTTRNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HQREGNLSTTRNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RSLT_TKT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}STATUS2" minOccurs="0"/>
 *         &lt;element name="HQREGNLSTRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}HQREGNLSTRS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HQREGNLSTTRNRS", propOrder = {
    "trnuid",
    "rslttkt",
    "status",
    "hqregnlstrs"
})
public class HQREGNLSTTRNRS {

    @XmlElementRef(name = "TRNUID", type = JAXBElement.class)
    protected JAXBElement<String> trnuid;
    @XmlElementRef(name = "RSLT_TKT", type = JAXBElement.class)
    protected JAXBElement<String> rslttkt;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class)
    protected JAXBElement<STATUS2> status;
    @XmlElement(name = "HQREGNLSTRS", required = true, nillable = true)
    protected HQREGNLSTRS hqregnlstrs;

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
     * Gets the value of the hqregnlstrs property.
     * 
     * @return
     *     possible object is
     *     {@link HQREGNLSTRS }
     *     
     */
    public HQREGNLSTRS getHQREGNLSTRS() {
        return hqregnlstrs;
    }

    /**
     * Sets the value of the hqregnlstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HQREGNLSTRS }
     *     
     */
    public void setHQREGNLSTRS(HQREGNLSTRS value) {
        this.hqregnlstrs = value;
    }

}
