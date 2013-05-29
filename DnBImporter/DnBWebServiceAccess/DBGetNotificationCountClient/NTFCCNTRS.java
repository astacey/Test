
package DBGetNotificationCountClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NTFCCNTRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NTFCCNTRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DETECT_FROM_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DETECT_TO_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NTFCCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBJCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NTFCCNTRS", propOrder = {
    "detectfromdt",
    "detecttodt",
    "ntfccount",
    "subjcount"
})
public class NTFCCNTRS {

    @XmlElementRef(name = "DETECT_FROM_DT", type = JAXBElement.class)
    protected JAXBElement<String> detectfromdt;
    @XmlElementRef(name = "DETECT_TO_DT", type = JAXBElement.class)
    protected JAXBElement<String> detecttodt;
    @XmlElementRef(name = "NTFCCOUNT", type = JAXBElement.class)
    protected JAXBElement<String> ntfccount;
    @XmlElementRef(name = "SUBJCOUNT", type = JAXBElement.class)
    protected JAXBElement<String> subjcount;

    /**
     * Gets the value of the detectfromdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDETECTFROMDT() {
        return detectfromdt;
    }

    /**
     * Sets the value of the detectfromdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDETECTFROMDT(JAXBElement<String> value) {
        this.detectfromdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the detecttodt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDETECTTODT() {
        return detecttodt;
    }

    /**
     * Sets the value of the detecttodt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDETECTTODT(JAXBElement<String> value) {
        this.detecttodt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ntfccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNTFCCOUNT() {
        return ntfccount;
    }

    /**
     * Sets the value of the ntfccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNTFCCOUNT(JAXBElement<String> value) {
        this.ntfccount = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the subjcount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUBJCOUNT() {
        return subjcount;
    }

    /**
     * Sets the value of the subjcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUBJCOUNT(JAXBElement<String> value) {
        this.subjcount = ((JAXBElement<String> ) value);
    }

}
