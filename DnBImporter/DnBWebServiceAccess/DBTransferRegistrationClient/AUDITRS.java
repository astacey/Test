
package DBTransferRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUDITRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUDITRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUDITRS", propOrder = {
    "nme",
    "cnt"
})
public class AUDITRS {

    @XmlElementRef(name = "NME", type = JAXBElement.class)
    protected JAXBElement<String> nme;
    @XmlElementRef(name = "CNT", type = JAXBElement.class)
    protected JAXBElement<String> cnt;

    /**
     * Gets the value of the nme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNME() {
        return nme;
    }

    /**
     * Sets the value of the nme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNME(JAXBElement<String> value) {
        this.nme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNT() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNT(JAXBElement<String> value) {
        this.cnt = ((JAXBElement<String> ) value);
    }

}
