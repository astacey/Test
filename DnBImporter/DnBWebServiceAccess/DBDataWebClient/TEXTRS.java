
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEXTRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEXTRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SECTION" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}SECTION" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEXTRS", propOrder = {
    "title",
    "section"
})
public class TEXTRS {

    @XmlElementRef(name = "TITLE", type = JAXBElement.class)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "SECTION", type = JAXBElement.class)
    protected JAXBElement<SECTION> section;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTITLE(JAXBElement<String> value) {
        this.title = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SECTION }{@code >}
     *     
     */
    public JAXBElement<SECTION> getSECTION() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SECTION }{@code >}
     *     
     */
    public void setSECTION(JAXBElement<SECTION> value) {
        this.section = ((JAXBElement<SECTION> ) value);
    }

}
