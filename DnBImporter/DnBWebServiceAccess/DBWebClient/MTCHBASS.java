
package DBWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MTCH_BASS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTCH_BASS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MTCH_BASS_ENTR" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}ArrayOfMTCH_BASS_ENTR" minOccurs="0"/>
 *         &lt;element name="MTCH_CNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTCH_BASS", propOrder = {
    "mtchbassentr",
    "mtchcnt"
})
public class MTCHBASS {

    @XmlElementRef(name = "MTCH_BASS_ENTR", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMTCHBASSENTR> mtchbassentr;
    @XmlElementRef(name = "MTCH_CNT", type = JAXBElement.class)
    protected JAXBElement<String> mtchcnt;

    /**
     * Gets the value of the mtchbassentr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMTCHBASSENTR }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMTCHBASSENTR> getMTCHBASSENTR() {
        return mtchbassentr;
    }

    /**
     * Sets the value of the mtchbassentr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMTCHBASSENTR }{@code >}
     *     
     */
    public void setMTCHBASSENTR(JAXBElement<ArrayOfMTCHBASSENTR> value) {
        this.mtchbassentr = ((JAXBElement<ArrayOfMTCHBASSENTR> ) value);
    }

    /**
     * Gets the value of the mtchcnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTCHCNT() {
        return mtchcnt;
    }

    /**
     * Sets the value of the mtchcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTCHCNT(JAXBElement<String> value) {
        this.mtchcnt = ((JAXBElement<String> ) value);
    }

}
