
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FLD_ATTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLD_ATTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLD_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLD_VAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLD_ATTR", propOrder = {
    "fldnme",
    "flddesc",
    "fldval"
})
public class FLDATTR {

    @XmlElementRef(name = "FLD_NME", type = JAXBElement.class)
    protected JAXBElement<String> fldnme;
    @XmlElementRef(name = "FLD_DESC", type = JAXBElement.class)
    protected JAXBElement<String> flddesc;
    @XmlElementRef(name = "FLD_VAL", type = JAXBElement.class)
    protected JAXBElement<String> fldval;

    /**
     * Gets the value of the fldnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLDNME() {
        return fldnme;
    }

    /**
     * Sets the value of the fldnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLDNME(JAXBElement<String> value) {
        this.fldnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flddesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLDDESC() {
        return flddesc;
    }

    /**
     * Sets the value of the flddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLDDESC(JAXBElement<String> value) {
        this.flddesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fldval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLDVAL() {
        return fldval;
    }

    /**
     * Sets the value of the fldval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLDVAL(JAXBElement<String> value) {
        this.fldval = ((JAXBElement<String> ) value);
    }

}
