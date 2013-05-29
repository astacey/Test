
package DBModifyRegistrationClient;

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
 *         &lt;element name="STAT_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAT_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RNEW_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXP_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_UPD_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HISTRS" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}ArrayOfHISTRS" minOccurs="0"/>
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
    "statcd",
    "statdesc",
    "rnewdt",
    "expdt",
    "lastupddt",
    "histrs"
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
    @XmlElementRef(name = "STAT_CD", type = JAXBElement.class)
    protected JAXBElement<String> statcd;
    @XmlElementRef(name = "STAT_DESC", type = JAXBElement.class)
    protected JAXBElement<String> statdesc;
    @XmlElementRef(name = "RNEW_DT", type = JAXBElement.class)
    protected JAXBElement<String> rnewdt;
    @XmlElementRef(name = "EXP_DT", type = JAXBElement.class)
    protected JAXBElement<String> expdt;
    @XmlElementRef(name = "LAST_UPD_DT", type = JAXBElement.class)
    protected JAXBElement<String> lastupddt;
    @XmlElementRef(name = "HISTRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfHISTRS> histrs;

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
     * Gets the value of the statcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATCD() {
        return statcd;
    }

    /**
     * Sets the value of the statcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATCD(JAXBElement<String> value) {
        this.statcd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statdesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATDESC() {
        return statdesc;
    }

    /**
     * Sets the value of the statdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATDESC(JAXBElement<String> value) {
        this.statdesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rnewdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRNEWDT() {
        return rnewdt;
    }

    /**
     * Sets the value of the rnewdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRNEWDT(JAXBElement<String> value) {
        this.rnewdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXPDT() {
        return expdt;
    }

    /**
     * Sets the value of the expdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXPDT(JAXBElement<String> value) {
        this.expdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastupddt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTUPDDT() {
        return lastupddt;
    }

    /**
     * Sets the value of the lastupddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTUPDDT(JAXBElement<String> value) {
        this.lastupddt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the histrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHISTRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHISTRS> getHISTRS() {
        return histrs;
    }

    /**
     * Sets the value of the histrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHISTRS }{@code >}
     *     
     */
    public void setHISTRS(JAXBElement<ArrayOfHISTRS> value) {
        this.histrs = ((JAXBElement<ArrayOfHISTRS> ) value);
    }

}
