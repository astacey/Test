
package DBGetHQRegistrationListClient;

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
 *         &lt;element name="CUST_ACCT_ID" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ENQ_DUNS_NBR" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="HQ_DUNS_NBR" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="CTRY_CD" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="PRIM_NME" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="CUST_ENDR" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="STAT_CD" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="STAT_DESC" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="RNEW_DT" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="EXP_DT" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="LAST_UPD_DT" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="HISTRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfHISTRS" minOccurs="0"/>
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
    "enqdunsnbr",
    "hqdunsnbr",
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
    protected JAXBElement<ArrayOfstring> custacctid;
    @XmlElementRef(name = "ENQ_DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> enqdunsnbr;
    @XmlElementRef(name = "HQ_DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> hqdunsnbr;
    @XmlElementRef(name = "CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> ctrycd;
    @XmlElementRef(name = "PRIM_NME", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> primnme;
    @XmlElementRef(name = "CUST_ENDR", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> custendr;
    @XmlElementRef(name = "STAT_CD", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> statcd;
    @XmlElementRef(name = "STAT_DESC", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> statdesc;
    @XmlElementRef(name = "RNEW_DT", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> rnewdt;
    @XmlElementRef(name = "EXP_DT", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> expdt;
    @XmlElementRef(name = "LAST_UPD_DT", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> lastupddt;
    @XmlElementRef(name = "HISTRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfHISTRS> histrs;

    /**
     * Gets the value of the custacctid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getCUSTACCTID() {
        return custacctid;
    }

    /**
     * Sets the value of the custacctid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setCUSTACCTID(JAXBElement<ArrayOfstring> value) {
        this.custacctid = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the enqdunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getENQDUNSNBR() {
        return enqdunsnbr;
    }

    /**
     * Sets the value of the enqdunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setENQDUNSNBR(JAXBElement<ArrayOfstring> value) {
        this.enqdunsnbr = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the hqdunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getHQDUNSNBR() {
        return hqdunsnbr;
    }

    /**
     * Sets the value of the hqdunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setHQDUNSNBR(JAXBElement<ArrayOfstring> value) {
        this.hqdunsnbr = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the ctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getCTRYCD() {
        return ctrycd;
    }

    /**
     * Sets the value of the ctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setCTRYCD(JAXBElement<ArrayOfstring> value) {
        this.ctrycd = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the primnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getPRIMNME() {
        return primnme;
    }

    /**
     * Sets the value of the primnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setPRIMNME(JAXBElement<ArrayOfstring> value) {
        this.primnme = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the custendr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getCUSTENDR() {
        return custendr;
    }

    /**
     * Sets the value of the custendr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setCUSTENDR(JAXBElement<ArrayOfstring> value) {
        this.custendr = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the statcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSTATCD() {
        return statcd;
    }

    /**
     * Sets the value of the statcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSTATCD(JAXBElement<ArrayOfstring> value) {
        this.statcd = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the statdesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSTATDESC() {
        return statdesc;
    }

    /**
     * Sets the value of the statdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSTATDESC(JAXBElement<ArrayOfstring> value) {
        this.statdesc = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the rnewdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getRNEWDT() {
        return rnewdt;
    }

    /**
     * Sets the value of the rnewdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setRNEWDT(JAXBElement<ArrayOfstring> value) {
        this.rnewdt = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the expdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getEXPDT() {
        return expdt;
    }

    /**
     * Sets the value of the expdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setEXPDT(JAXBElement<ArrayOfstring> value) {
        this.expdt = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the lastupddt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getLASTUPDDT() {
        return lastupddt;
    }

    /**
     * Sets the value of the lastupddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setLASTUPDDT(JAXBElement<ArrayOfstring> value) {
        this.lastupddt = ((JAXBElement<ArrayOfstring> ) value);
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
