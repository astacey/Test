
package DBTransferRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ADDL_DET_RS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADDL_DET_RS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FRMR_DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHRG_XMIT_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINL_EMBT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRADE_UP_DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQD_CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADDL_DET_RS", propOrder = {
    "frmrdunsnbr",
    "chrgxmitdt",
    "finlembtind",
    "tradeupdunsnbr",
    "reqdctrycd"
})
public class ADDLDETRS {

    @XmlElementRef(name = "FRMR_DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> frmrdunsnbr;
    @XmlElementRef(name = "CHRG_XMIT_DT", type = JAXBElement.class)
    protected JAXBElement<String> chrgxmitdt;
    @XmlElementRef(name = "FINL_EMBT_IND", type = JAXBElement.class)
    protected JAXBElement<String> finlembtind;
    @XmlElementRef(name = "TRADE_UP_DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> tradeupdunsnbr;
    @XmlElementRef(name = "REQD_CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> reqdctrycd;

    /**
     * Gets the value of the frmrdunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFRMRDUNSNBR() {
        return frmrdunsnbr;
    }

    /**
     * Sets the value of the frmrdunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFRMRDUNSNBR(JAXBElement<String> value) {
        this.frmrdunsnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the chrgxmitdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCHRGXMITDT() {
        return chrgxmitdt;
    }

    /**
     * Sets the value of the chrgxmitdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCHRGXMITDT(JAXBElement<String> value) {
        this.chrgxmitdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finlembtind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFINLEMBTIND() {
        return finlembtind;
    }

    /**
     * Sets the value of the finlembtind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFINLEMBTIND(JAXBElement<String> value) {
        this.finlembtind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tradeupdunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRADEUPDUNSNBR() {
        return tradeupdunsnbr;
    }

    /**
     * Sets the value of the tradeupdunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRADEUPDUNSNBR(JAXBElement<String> value) {
        this.tradeupdunsnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reqdctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREQDCTRYCD() {
        return reqdctrycd;
    }

    /**
     * Sets the value of the reqdctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREQDCTRYCD(JAXBElement<String> value) {
        this.reqdctrycd = ((JAXBElement<String> ) value);
    }

}
