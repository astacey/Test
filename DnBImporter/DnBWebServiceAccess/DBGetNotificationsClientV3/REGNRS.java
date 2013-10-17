
package DBGetNotificationsClientV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REGNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REGNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUST_ACCT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_ENDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NTFCRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}ArrayOfNTFCRS" minOccurs="0"/>
 *         &lt;element name="MON_PROD_RS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}ArrayOfMON_PROD_RS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REGNRS", propOrder = {
    "custacctid",
    "dunsnbr",
    "ctrycd",
    "primnme",
    "custendr",
    "ntfcrs",
    "monprodrs"
})
public class REGNRS {

    @XmlElementRef(name = "CUST_ACCT_ID", type = JAXBElement.class)
    protected JAXBElement<String> custacctid;
    @XmlElementRef(name = "DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> dunsnbr;
    @XmlElementRef(name = "CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> ctrycd;
    @XmlElementRef(name = "PRIM_NME", type = JAXBElement.class)
    protected JAXBElement<String> primnme;
    @XmlElementRef(name = "CUST_ENDR", type = JAXBElement.class)
    protected JAXBElement<String> custendr;
    @XmlElementRef(name = "NTFCRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfNTFCRS> ntfcrs;
    @XmlElementRef(name = "MON_PROD_RS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfMONPRODRS> monprodrs;

    /**
     * Gets the value of the custacctid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCUSTACCTID() {
        return custacctid;
    }

    /**
     * Sets the value of the custacctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCUSTACCTID(JAXBElement<String> value) {
        this.custacctid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNBR() {
        return dunsnbr;
    }

    /**
     * Sets the value of the dunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNBR(JAXBElement<String> value) {
        this.dunsnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRYCD() {
        return ctrycd;
    }

    /**
     * Sets the value of the ctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRYCD(JAXBElement<String> value) {
        this.ctrycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRIMNME() {
        return primnme;
    }

    /**
     * Sets the value of the primnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRIMNME(JAXBElement<String> value) {
        this.primnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the custendr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCUSTENDR() {
        return custendr;
    }

    /**
     * Sets the value of the custendr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCUSTENDR(JAXBElement<String> value) {
        this.custendr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ntfcrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNTFCRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNTFCRS> getNTFCRS() {
        return ntfcrs;
    }

    /**
     * Sets the value of the ntfcrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNTFCRS }{@code >}
     *     
     */
    public void setNTFCRS(JAXBElement<ArrayOfNTFCRS> value) {
        this.ntfcrs = ((JAXBElement<ArrayOfNTFCRS> ) value);
    }

    /**
     * Gets the value of the monprodrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMONPRODRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMONPRODRS> getMONPRODRS() {
        return monprodrs;
    }

    /**
     * Sets the value of the monprodrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMONPRODRS }{@code >}
     *     
     */
    public void setMONPRODRS(JAXBElement<ArrayOfMONPRODRS> value) {
        this.monprodrs = ((JAXBElement<ArrayOfMONPRODRS> ) value);
    }

}
