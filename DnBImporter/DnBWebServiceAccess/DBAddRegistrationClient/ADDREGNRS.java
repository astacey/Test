
package DBAddRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADDREGNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDREGNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BKCY_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTV_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACTV_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAT_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RNEW_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXP_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDREGNRS", propOrder = {
    "bkcyind",
    "actvcd",
    "actvdesc",
    "statcd",
    "statdesc",
    "rnewdt",
    "expdt"
})
public class ADDREGNRS {

    @XmlElementRef(name = "BKCY_IND", type = JAXBElement.class)
    protected JAXBElement<String> bkcyind;
    @XmlElementRef(name = "ACTV_CD", type = JAXBElement.class)
    protected JAXBElement<String> actvcd;
    @XmlElementRef(name = "ACTV_DESC", type = JAXBElement.class)
    protected JAXBElement<String> actvdesc;
    @XmlElementRef(name = "STAT_CD", type = JAXBElement.class)
    protected JAXBElement<String> statcd;
    @XmlElementRef(name = "STAT_DESC", type = JAXBElement.class)
    protected JAXBElement<String> statdesc;
    @XmlElementRef(name = "RNEW_DT", type = JAXBElement.class)
    protected JAXBElement<String> rnewdt;
    @XmlElementRef(name = "EXP_DT", type = JAXBElement.class)
    protected JAXBElement<String> expdt;

    /**
     * Gets the value of the bkcyind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBKCYIND() {
        return bkcyind;
    }

    /**
     * Sets the value of the bkcyind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBKCYIND(JAXBElement<String> value) {
        this.bkcyind = ((JAXBElement<String> ) value);
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
     * Gets the value of the statcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATCD() {
        return statcd;
    }

    /**
     * Sets the value of the statcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATCD(JAXBElement<String> value) {
        this.statcd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statdesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATDESC() {
        return statdesc;
    }

    /**
     * Sets the value of the statdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATDESC(JAXBElement<String> value) {
        this.statdesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rnewdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRNEWDT() {
        return rnewdt;
    }

    /**
     * Sets the value of the rnewdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRNEWDT(JAXBElement<String> value) {
        this.rnewdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXPDT() {
        return expdt;
    }

    /**
     * Sets the value of the expdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXPDT(JAXBElement<String> value) {
        this.expdt = ((JAXBElement<String> ) value);
    }

}
