
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DATATRNRS4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DATATRNRS4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STATUS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}STATUS8" minOccurs="0"/>
 *         &lt;element name="DATARS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}DATARS4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DATATRNRS4", propOrder = {
    "status",
    "datars"
})
public class DATATRNRS4 {

    @XmlElementRef(name = "STATUS", type = JAXBElement.class)
    protected JAXBElement<STATUS8> status;
    @XmlElementRef(name = "DATARS", type = JAXBElement.class)
    protected JAXBElement<DATARS4> datars;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link STATUS8 }{@code >}
     *     
     */
    public JAXBElement<STATUS8> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link STATUS8 }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<STATUS8> value) {
        this.status = ((JAXBElement<STATUS8> ) value);
    }

    /**
     * Gets the value of the datars property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DATARS4 }{@code >}
     *     
     */
    public JAXBElement<DATARS4> getDATARS() {
        return datars;
    }

    /**
     * Sets the value of the datars property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DATARS4 }{@code >}
     *     
     */
    public void setDATARS(JAXBElement<DATARS4> value) {
        this.datars = ((JAXBElement<DATARS4> ) value);
    }

}
