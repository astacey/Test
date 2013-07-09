
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DB_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DB_PSWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_ENDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_BILG_REF_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_BILG_REF_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USR_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_ADR_LINE_1" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DELV_ADR_LINE_2" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DELV_ADR_LINE_3" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DELV_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_RGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_POST_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_CTRY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_FAX_AREA_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_FAX_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_FAX_EXTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTAC_PH_AREA_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTAC_PH_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTAC_PH_EXTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USR_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USR_LVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPIRY_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEST_USER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_CTAC_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USR", propOrder = {
    "dbusrid",
    "dbpswd",
    "defuendr",
    "defubilgref1",
    "defubilgref2",
    "usrnme",
    "delvnme",
    "delvadrline1",
    "delvadrline2",
    "delvadrline3",
    "delvcity",
    "delvrgn",
    "delvpostcd",
    "delvctryid",
    "delvemail",
    "delvfaxareacd",
    "delvfaxnbr",
    "delvfaxextn",
    "ctacphareacd",
    "ctacphnbr",
    "ctacphextn",
    "usrstat",
    "usrlvl",
    "expirydt",
    "testuser",
    "lastctacdt"
})
public class USR {

    @XmlElementRef(name = "DB_USR_ID", type = JAXBElement.class)
    protected JAXBElement<String> dbusrid;
    @XmlElementRef(name = "DB_PSWD", type = JAXBElement.class)
    protected JAXBElement<String> dbpswd;
    @XmlElementRef(name = "DEFU_ENDR", type = JAXBElement.class)
    protected JAXBElement<String> defuendr;
    @XmlElementRef(name = "DEFU_BILG_REF_1", type = JAXBElement.class)
    protected JAXBElement<String> defubilgref1;
    @XmlElementRef(name = "DEFU_BILG_REF_2", type = JAXBElement.class)
    protected JAXBElement<String> defubilgref2;
    @XmlElementRef(name = "USR_NME", type = JAXBElement.class)
    protected JAXBElement<String> usrnme;
    @XmlElementRef(name = "DELV_NME", type = JAXBElement.class)
    protected JAXBElement<String> delvnme;
    @XmlElementRef(name = "DELV_ADR_LINE_1", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> delvadrline1;
    @XmlElementRef(name = "DELV_ADR_LINE_2", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> delvadrline2;
    @XmlElementRef(name = "DELV_ADR_LINE_3", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> delvadrline3;
    @XmlElementRef(name = "DELV_CITY", type = JAXBElement.class)
    protected JAXBElement<String> delvcity;
    @XmlElementRef(name = "DELV_RGN", type = JAXBElement.class)
    protected JAXBElement<String> delvrgn;
    @XmlElementRef(name = "DELV_POST_CD", type = JAXBElement.class)
    protected JAXBElement<String> delvpostcd;
    @XmlElementRef(name = "DELV_CTRY_ID", type = JAXBElement.class)
    protected JAXBElement<String> delvctryid;
    @XmlElementRef(name = "DELV_EMAIL", type = JAXBElement.class)
    protected JAXBElement<String> delvemail;
    @XmlElementRef(name = "DELV_FAX_AREA_CD", type = JAXBElement.class)
    protected JAXBElement<String> delvfaxareacd;
    @XmlElementRef(name = "DELV_FAX_NBR", type = JAXBElement.class)
    protected JAXBElement<String> delvfaxnbr;
    @XmlElementRef(name = "DELV_FAX_EXTN", type = JAXBElement.class)
    protected JAXBElement<String> delvfaxextn;
    @XmlElementRef(name = "CTAC_PH_AREA_CD", type = JAXBElement.class)
    protected JAXBElement<String> ctacphareacd;
    @XmlElementRef(name = "CTAC_PH_NBR", type = JAXBElement.class)
    protected JAXBElement<String> ctacphnbr;
    @XmlElementRef(name = "CTAC_PH_EXTN", type = JAXBElement.class)
    protected JAXBElement<String> ctacphextn;
    @XmlElementRef(name = "USR_STAT", type = JAXBElement.class)
    protected JAXBElement<String> usrstat;
    @XmlElementRef(name = "USR_LVL", type = JAXBElement.class)
    protected JAXBElement<String> usrlvl;
    @XmlElementRef(name = "EXPIRY_DT", type = JAXBElement.class)
    protected JAXBElement<String> expirydt;
    @XmlElementRef(name = "TEST_USER", type = JAXBElement.class)
    protected JAXBElement<String> testuser;
    @XmlElementRef(name = "LAST_CTAC_DT", type = JAXBElement.class)
    protected JAXBElement<String> lastctacdt;

    /**
     * Gets the value of the dbusrid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDBUSRID() {
        return dbusrid;
    }

    /**
     * Sets the value of the dbusrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDBUSRID(JAXBElement<String> value) {
        this.dbusrid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dbpswd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDBPSWD() {
        return dbpswd;
    }

    /**
     * Sets the value of the dbpswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDBPSWD(JAXBElement<String> value) {
        this.dbpswd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defuendr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEFUENDR() {
        return defuendr;
    }

    /**
     * Sets the value of the defuendr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEFUENDR(JAXBElement<String> value) {
        this.defuendr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defubilgref1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEFUBILGREF1() {
        return defubilgref1;
    }

    /**
     * Sets the value of the defubilgref1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEFUBILGREF1(JAXBElement<String> value) {
        this.defubilgref1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defubilgref2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEFUBILGREF2() {
        return defubilgref2;
    }

    /**
     * Sets the value of the defubilgref2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEFUBILGREF2(JAXBElement<String> value) {
        this.defubilgref2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the usrnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSRNME() {
        return usrnme;
    }

    /**
     * Sets the value of the usrnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSRNME(JAXBElement<String> value) {
        this.usrnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVNME() {
        return delvnme;
    }

    /**
     * Sets the value of the delvnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVNME(JAXBElement<String> value) {
        this.delvnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvadrline1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDELVADRLINE1() {
        return delvadrline1;
    }

    /**
     * Sets the value of the delvadrline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDELVADRLINE1(JAXBElement<ArrayOfstring> value) {
        this.delvadrline1 = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the delvadrline2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDELVADRLINE2() {
        return delvadrline2;
    }

    /**
     * Sets the value of the delvadrline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDELVADRLINE2(JAXBElement<ArrayOfstring> value) {
        this.delvadrline2 = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the delvadrline3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDELVADRLINE3() {
        return delvadrline3;
    }

    /**
     * Sets the value of the delvadrline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDELVADRLINE3(JAXBElement<ArrayOfstring> value) {
        this.delvadrline3 = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the delvcity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVCITY() {
        return delvcity;
    }

    /**
     * Sets the value of the delvcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVCITY(JAXBElement<String> value) {
        this.delvcity = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvrgn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVRGN() {
        return delvrgn;
    }

    /**
     * Sets the value of the delvrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVRGN(JAXBElement<String> value) {
        this.delvrgn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvpostcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVPOSTCD() {
        return delvpostcd;
    }

    /**
     * Sets the value of the delvpostcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVPOSTCD(JAXBElement<String> value) {
        this.delvpostcd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvctryid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVCTRYID() {
        return delvctryid;
    }

    /**
     * Sets the value of the delvctryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVCTRYID(JAXBElement<String> value) {
        this.delvctryid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvemail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVEMAIL() {
        return delvemail;
    }

    /**
     * Sets the value of the delvemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVEMAIL(JAXBElement<String> value) {
        this.delvemail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvfaxareacd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVFAXAREACD() {
        return delvfaxareacd;
    }

    /**
     * Sets the value of the delvfaxareacd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVFAXAREACD(JAXBElement<String> value) {
        this.delvfaxareacd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvfaxnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVFAXNBR() {
        return delvfaxnbr;
    }

    /**
     * Sets the value of the delvfaxnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVFAXNBR(JAXBElement<String> value) {
        this.delvfaxnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvfaxextn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVFAXEXTN() {
        return delvfaxextn;
    }

    /**
     * Sets the value of the delvfaxextn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVFAXEXTN(JAXBElement<String> value) {
        this.delvfaxextn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctacphareacd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTACPHAREACD() {
        return ctacphareacd;
    }

    /**
     * Sets the value of the ctacphareacd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTACPHAREACD(JAXBElement<String> value) {
        this.ctacphareacd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctacphnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTACPHNBR() {
        return ctacphnbr;
    }

    /**
     * Sets the value of the ctacphnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTACPHNBR(JAXBElement<String> value) {
        this.ctacphnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctacphextn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTACPHEXTN() {
        return ctacphextn;
    }

    /**
     * Sets the value of the ctacphextn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTACPHEXTN(JAXBElement<String> value) {
        this.ctacphextn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the usrstat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSRSTAT() {
        return usrstat;
    }

    /**
     * Sets the value of the usrstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSRSTAT(JAXBElement<String> value) {
        this.usrstat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the usrlvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSRLVL() {
        return usrlvl;
    }

    /**
     * Sets the value of the usrlvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSRLVL(JAXBElement<String> value) {
        this.usrlvl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expirydt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXPIRYDT() {
        return expirydt;
    }

    /**
     * Sets the value of the expirydt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXPIRYDT(JAXBElement<String> value) {
        this.expirydt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the testuser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTESTUSER() {
        return testuser;
    }

    /**
     * Sets the value of the testuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTESTUSER(JAXBElement<String> value) {
        this.testuser = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastctacdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTCTACDT() {
        return lastctacdt;
    }

    /**
     * Sets the value of the lastctacdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTCTACDT(JAXBElement<String> value) {
        this.lastctacdt = ((JAXBElement<String> ) value);
    }

}
