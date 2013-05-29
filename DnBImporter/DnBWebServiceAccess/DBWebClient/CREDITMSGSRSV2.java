
package DBWebClient;

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
 *         &lt;element name="LOOKUPTRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LOOKUPTRNRS" minOccurs="0"/>
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
    "lookuptrnrs"
})
public class CREDITMSGSRSV2 {

    @XmlElementRef(name = "LOOKUPTRNRS", type = JAXBElement.class)
    protected JAXBElement<LOOKUPTRNRS> lookuptrnrs;

    /**
     * Gets the value of the lookuptrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOOKUPTRNRS }{@code >}
     *     
     */
    public JAXBElement<LOOKUPTRNRS> getLOOKUPTRNRS() {
        return lookuptrnrs;
    }

    /**
     * Sets the value of the lookuptrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOOKUPTRNRS }{@code >}
     *     
     */
    public void setLOOKUPTRNRS(JAXBElement<LOOKUPTRNRS> value) {
        this.lookuptrnrs = ((JAXBElement<LOOKUPTRNRS> ) value);
    }

}
