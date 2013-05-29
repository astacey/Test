
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CREDITMSGSRSV24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CREDITMSGSRSV24">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATATRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}DATATRNRS4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CREDITMSGSRSV24", propOrder = {
    "datatrnrs"
})
public class CREDITMSGSRSV24 {

    @XmlElementRef(name = "DATATRNRS", type = JAXBElement.class)
    protected JAXBElement<DATATRNRS4> datatrnrs;

    /**
     * Gets the value of the datatrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DATATRNRS4 }{@code >}
     *     
     */
    public JAXBElement<DATATRNRS4> getDATATRNRS() {
        return datatrnrs;
    }

    /**
     * Sets the value of the datatrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DATATRNRS4 }{@code >}
     *     
     */
    public void setDATATRNRS(JAXBElement<DATATRNRS4> value) {
        this.datatrnrs = ((JAXBElement<DATATRNRS4> ) value);
    }

}
