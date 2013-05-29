
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PROFILERS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PROFILERS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USR_CUST" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}USR_CUST" minOccurs="0"/>
 *         &lt;element name="USR" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}USR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PROFILERS", propOrder = {
    "usrid",
    "usrcust",
    "usr"
})
public class PROFILERS {

    @XmlElementRef(name = "USR_ID", type = JAXBElement.class)
    protected JAXBElement<String> usrid;
    @XmlElementRef(name = "USR_CUST", type = JAXBElement.class)
    protected JAXBElement<USRCUST> usrcust;
    @XmlElementRef(name = "USR", type = JAXBElement.class)
    protected JAXBElement<USR> usr;

    /**
     * Gets the value of the usrid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSRID() {
        return usrid;
    }

    /**
     * Sets the value of the usrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSRID(JAXBElement<String> value) {
        this.usrid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the usrcust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link USRCUST }{@code >}
     *     
     */
    public JAXBElement<USRCUST> getUSRCUST() {
        return usrcust;
    }

    /**
     * Sets the value of the usrcust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link USRCUST }{@code >}
     *     
     */
    public void setUSRCUST(JAXBElement<USRCUST> value) {
        this.usrcust = ((JAXBElement<USRCUST> ) value);
    }

    /**
     * Gets the value of the usr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link USR }{@code >}
     *     
     */
    public JAXBElement<USR> getUSR() {
        return usr;
    }

    /**
     * Sets the value of the usr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link USR }{@code >}
     *     
     */
    public void setUSR(JAXBElement<USR> value) {
        this.usr = ((JAXBElement<USR> ) value);
    }

}
