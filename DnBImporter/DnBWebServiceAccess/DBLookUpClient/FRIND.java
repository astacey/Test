
package DBLookUpClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FR_IND complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FR_IND">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HR_MISREP_DT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HR_MISREP_NME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HR_MISREP_ADR_LINE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HR_MISREP_POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HR_MISREP_PRIM_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HR_MISREP_POST_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FRD_INCDE-RANK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HR_MISREP_TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZIP_STD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADR_QLTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADR_RSK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNT_TLCM_ADR_RSK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FR_IND", propOrder = {
    "hrmisrepdt",
    "hrmisrepnme",
    "hrmisrepadrline",
    "hrmisrepposttown",
    "hrmisrepprimgeoarea",
    "hrmisreppostcode",
    "frdincderank",
    "hrmisreptlcmnbr",
    "zipstd",
    "adrqlty",
    "adrrsk",
    "cnttlcmadrrsk"
})
public class FRIND {

    @XmlElement(name = "HR_MISREP_DT", required = true, nillable = true)
    protected String hrmisrepdt;
    @XmlElement(name = "HR_MISREP_NME", required = true, nillable = true)
    protected String hrmisrepnme;
    @XmlElement(name = "HR_MISREP_ADR_LINE", required = true, nillable = true)
    protected String hrmisrepadrline;
    @XmlElement(name = "HR_MISREP_POST_TOWN", required = true, nillable = true)
    protected String hrmisrepposttown;
    @XmlElement(name = "HR_MISREP_PRIM_GEO_AREA", required = true, nillable = true)
    protected String hrmisrepprimgeoarea;
    @XmlElement(name = "HR_MISREP_POST_CODE", required = true, nillable = true)
    protected String hrmisreppostcode;
    @XmlElement(name = "FRD_INCDE-RANK", required = true, nillable = true)
    protected String frdincderank;
    @XmlElement(name = "HR_MISREP_TLCM_NBR", required = true, nillable = true)
    protected String hrmisreptlcmnbr;
    @XmlElement(name = "ZIP_STD", required = true, nillable = true)
    protected String zipstd;
    @XmlElement(name = "ADR_QLTY", required = true, nillable = true)
    protected String adrqlty;
    @XmlElement(name = "ADR_RSK", required = true, nillable = true)
    protected String adrrsk;
    @XmlElement(name = "CNT_TLCM_ADR_RSK", required = true, nillable = true)
    protected String cnttlcmadrrsk;

    /**
     * Gets the value of the hrmisrepdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRMISREPDT() {
        return hrmisrepdt;
    }

    /**
     * Sets the value of the hrmisrepdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRMISREPDT(String value) {
        this.hrmisrepdt = value;
    }

    /**
     * Gets the value of the hrmisrepnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRMISREPNME() {
        return hrmisrepnme;
    }

    /**
     * Sets the value of the hrmisrepnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRMISREPNME(String value) {
        this.hrmisrepnme = value;
    }

    /**
     * Gets the value of the hrmisrepadrline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRMISREPADRLINE() {
        return hrmisrepadrline;
    }

    /**
     * Sets the value of the hrmisrepadrline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRMISREPADRLINE(String value) {
        this.hrmisrepadrline = value;
    }

    /**
     * Gets the value of the hrmisrepposttown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRMISREPPOSTTOWN() {
        return hrmisrepposttown;
    }

    /**
     * Sets the value of the hrmisrepposttown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRMISREPPOSTTOWN(String value) {
        this.hrmisrepposttown = value;
    }

    /**
     * Gets the value of the hrmisrepprimgeoarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRMISREPPRIMGEOAREA() {
        return hrmisrepprimgeoarea;
    }

    /**
     * Sets the value of the hrmisrepprimgeoarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRMISREPPRIMGEOAREA(String value) {
        this.hrmisrepprimgeoarea = value;
    }

    /**
     * Gets the value of the hrmisreppostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRMISREPPOSTCODE() {
        return hrmisreppostcode;
    }

    /**
     * Sets the value of the hrmisreppostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRMISREPPOSTCODE(String value) {
        this.hrmisreppostcode = value;
    }

    /**
     * Gets the value of the frdincderank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRDINCDERANK() {
        return frdincderank;
    }

    /**
     * Sets the value of the frdincderank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRDINCDERANK(String value) {
        this.frdincderank = value;
    }

    /**
     * Gets the value of the hrmisreptlcmnbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRMISREPTLCMNBR() {
        return hrmisreptlcmnbr;
    }

    /**
     * Sets the value of the hrmisreptlcmnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRMISREPTLCMNBR(String value) {
        this.hrmisreptlcmnbr = value;
    }

    /**
     * Gets the value of the zipstd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPSTD() {
        return zipstd;
    }

    /**
     * Sets the value of the zipstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPSTD(String value) {
        this.zipstd = value;
    }

    /**
     * Gets the value of the adrqlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRQLTY() {
        return adrqlty;
    }

    /**
     * Sets the value of the adrqlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRQLTY(String value) {
        this.adrqlty = value;
    }

    /**
     * Gets the value of the adrrsk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRRSK() {
        return adrrsk;
    }

    /**
     * Sets the value of the adrrsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRRSK(String value) {
        this.adrrsk = value;
    }

    /**
     * Gets the value of the cnttlcmadrrsk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTTLCMADRRSK() {
        return cnttlcmadrrsk;
    }

    /**
     * Sets the value of the cnttlcmadrrsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTTLCMADRRSK(String value) {
        this.cnttlcmadrrsk = value;
    }

}
