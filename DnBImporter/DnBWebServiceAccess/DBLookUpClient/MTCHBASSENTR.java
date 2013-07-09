
package DBLookUpClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MTCH_BASS_ENTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTCH_BASS_ENTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBJ_TYPE_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEO_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTCH_BASS_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="END_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTCH_BASS_ENTR", propOrder = {
    "subjtypecd",
    "ceoind",
    "mtchbasscd",
    "endind"
})
public class MTCHBASSENTR {

    @XmlElementRef(name = "SUBJ_TYPE_CD", type = JAXBElement.class)
    protected JAXBElement<String> subjtypecd;
    @XmlElementRef(name = "CEO_IND", type = JAXBElement.class)
    protected JAXBElement<String> ceoind;
    @XmlElementRef(name = "MTCH_BASS_CD", type = JAXBElement.class)
    protected JAXBElement<String> mtchbasscd;
    @XmlElementRef(name = "END_IND", type = JAXBElement.class)
    protected JAXBElement<String> endind;

    /**
     * Gets the value of the subjtypecd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUBJTYPECD() {
        return subjtypecd;
    }

    /**
     * Sets the value of the subjtypecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUBJTYPECD(JAXBElement<String> value) {
        this.subjtypecd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ceoind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEOIND() {
        return ceoind;
    }

    /**
     * Sets the value of the ceoind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEOIND(JAXBElement<String> value) {
        this.ceoind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mtchbasscd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTCHBASSCD() {
        return mtchbasscd;
    }

    /**
     * Sets the value of the mtchbasscd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTCHBASSCD(JAXBElement<String> value) {
        this.mtchbasscd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENDIND() {
        return endind;
    }

    /**
     * Sets the value of the endind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENDIND(JAXBElement<String> value) {
        this.endind = ((JAXBElement<String> ) value);
    }

}
