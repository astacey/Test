
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREDITMSGSRSV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDITMSGSRSV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROFILERS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}PROFILERS" minOccurs="0"/>
 *         &lt;element name="DATATRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}DATATRNRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDITMSGSRSV2", propOrder = {
    "profilers",
    "datatrnrs"
})
public class CREDITMSGSRSV2 {

    @XmlElementRef(name = "PROFILERS", type = JAXBElement.class)
    protected JAXBElement<PROFILERS> profilers;
    @XmlElementRef(name = "DATATRNRS", type = JAXBElement.class)
    protected JAXBElement<DATATRNRS> datatrnrs;

    /**
     * Gets the value of the profilers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PROFILERS }{@code >}
     *     
     */
    public JAXBElement<PROFILERS> getPROFILERS() {
        return profilers;
    }

    /**
     * Sets the value of the profilers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PROFILERS }{@code >}
     *     
     */
    public void setPROFILERS(JAXBElement<PROFILERS> value) {
        this.profilers = ((JAXBElement<PROFILERS> ) value);
    }

    /**
     * Gets the value of the datatrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DATATRNRS }{@code >}
     *     
     */
    public JAXBElement<DATATRNRS> getDATATRNRS() {
        return datatrnrs;
    }

    /**
     * Sets the value of the datatrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DATATRNRS }{@code >}
     *     
     */
    public void setDATATRNRS(JAXBElement<DATATRNRS> value) {
        this.datatrnrs = ((JAXBElement<DATATRNRS> ) value);
    }

}
