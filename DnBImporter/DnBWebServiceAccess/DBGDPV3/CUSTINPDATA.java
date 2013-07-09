
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CUST_INP_DATA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CUST_INP_DATA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLD_LST" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfFLD_LST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CUST_INP_DATA", propOrder = {
    "fldlst"
})
public class CUSTINPDATA {

    @XmlElementRef(name = "FLD_LST", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFLDLST> fldlst;

    /**
     * Gets the value of the fldlst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFLDLST }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFLDLST> getFLDLST() {
        return fldlst;
    }

    /**
     * Sets the value of the fldlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFLDLST }{@code >}
     *     
     */
    public void setFLDLST(JAXBElement<ArrayOfFLDLST> value) {
        this.fldlst = ((JAXBElement<ArrayOfFLDLST> ) value);
    }

}
