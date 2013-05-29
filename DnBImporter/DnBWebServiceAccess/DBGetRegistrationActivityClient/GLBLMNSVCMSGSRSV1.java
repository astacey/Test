
package DBGetRegistrationActivityClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GLBLMNSVCMSGSRSV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLBLMNSVCMSGSRSV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GETREGNACTVTRNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity}GETREGNACTVTRNRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLBLMNSVCMSGSRSV1", propOrder = {
    "getregnactvtrnrs"
})
public class GLBLMNSVCMSGSRSV1 {

    @XmlElementRef(name = "GETREGNACTVTRNRS", type = JAXBElement.class)
    protected JAXBElement<GETREGNACTVTRNRS> getregnactvtrnrs;

    /**
     * Gets the value of the getregnactvtrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GETREGNACTVTRNRS }{@code >}
     *     
     */
    public JAXBElement<GETREGNACTVTRNRS> getGETREGNACTVTRNRS() {
        return getregnactvtrnrs;
    }

    /**
     * Sets the value of the getregnactvtrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GETREGNACTVTRNRS }{@code >}
     *     
     */
    public void setGETREGNACTVTRNRS(JAXBElement<GETREGNACTVTRNRS> value) {
        this.getregnactvtrnrs = ((JAXBElement<GETREGNACTVTRNRS> ) value);
    }

}
