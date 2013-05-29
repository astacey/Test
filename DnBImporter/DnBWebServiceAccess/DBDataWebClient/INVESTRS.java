
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INVESTRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INVESTRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SRVTID_INV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GDA_ID_INV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INVESTRS", propOrder = {
    "srvtidinv",
    "gdaidinv"
})
public class INVESTRS {

    @XmlElementRef(name = "SRVTID_INV", type = JAXBElement.class)
    protected JAXBElement<String> srvtidinv;
    @XmlElementRef(name = "GDA_ID_INV", type = JAXBElement.class)
    protected JAXBElement<String> gdaidinv;

    /**
     * Gets the value of the srvtidinv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSRVTIDINV() {
        return srvtidinv;
    }

    /**
     * Sets the value of the srvtidinv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSRVTIDINV(JAXBElement<String> value) {
        this.srvtidinv = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gdaidinv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGDAIDINV() {
        return gdaidinv;
    }

    /**
     * Sets the value of the gdaidinv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGDAIDINV(JAXBElement<String> value) {
        this.gdaidinv = ((JAXBElement<String> ) value);
    }

}
