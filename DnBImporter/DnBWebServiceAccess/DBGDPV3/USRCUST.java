
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USR_CUST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USR_CUST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBR_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ULT_DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNT_DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_DB_USR_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_DB_PSWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_CO_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_ADR_LINE_1" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DELV_ADR_LINE_2" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DELV_ADR_LINE_3" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="DELV_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_RGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_POST_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_CTRY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_FAX_AREA_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_FAX_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_FAX_EXTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_REQG_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_CTAC_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_CTAC_PH_AREA_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_CTAC_PH_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELV_CTAC_PH_EXTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_DELV_EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERNAL_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPIRY_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "USR_CUST", propOrder = {
    "subrnbr",
    "dunsnbr",
    "ultdunsnbr",
    "pntdunsnbr",
    "defudbusrid",
    "defudbpswd",
    "delvconme",
    "delvadrline1",
    "delvadrline2",
    "delvadrline3",
    "delvcity",
    "delvrgn",
    "delvpostcd",
    "delvctryid",
    "delvfaxareacd",
    "delvfaxnbr",
    "delvfaxextn",
    "delvreqgnme",
    "delvctacnme",
    "delvctacphareacd",
    "delvctacphnbr",
    "delvctacphextn",
    "defudelvemail",
    "internalind",
    "expirydt",
    "lastctacdt"
})
public class USRCUST {

    @XmlElementRef(name = "SUBR_NBR", type = JAXBElement.class)
    protected JAXBElement<String> subrnbr;
    @XmlElementRef(name = "DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> dunsnbr;
    @XmlElementRef(name = "ULT_DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> ultdunsnbr;
    @XmlElementRef(name = "PNT_DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> pntdunsnbr;
    @XmlElementRef(name = "DEFU_DB_USR_ID", type = JAXBElement.class)
    protected JAXBElement<String> defudbusrid;
    @XmlElementRef(name = "DEFU_DB_PSWD", type = JAXBElement.class)
    protected JAXBElement<String> defudbpswd;
    @XmlElementRef(name = "DELV_CO_NME", type = JAXBElement.class)
    protected JAXBElement<String> delvconme;
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
    @XmlElementRef(name = "DELV_FAX_AREA_CD", type = JAXBElement.class)
    protected JAXBElement<String> delvfaxareacd;
    @XmlElementRef(name = "DELV_FAX_NBR", type = JAXBElement.class)
    protected JAXBElement<String> delvfaxnbr;
    @XmlElementRef(name = "DELV_FAX_EXTN", type = JAXBElement.class)
    protected JAXBElement<String> delvfaxextn;
    @XmlElementRef(name = "DELV_REQG_NME", type = JAXBElement.class)
    protected JAXBElement<String> delvreqgnme;
    @XmlElementRef(name = "DELV_CTAC_NME", type = JAXBElement.class)
    protected JAXBElement<String> delvctacnme;
    @XmlElementRef(name = "DELV_CTAC_PH_AREA_CD", type = JAXBElement.class)
    protected JAXBElement<String> delvctacphareacd;
    @XmlElementRef(name = "DELV_CTAC_PH_NBR", type = JAXBElement.class)
    protected JAXBElement<String> delvctacphnbr;
    @XmlElementRef(name = "DELV_CTAC_PH_EXTN", type = JAXBElement.class)
    protected JAXBElement<String> delvctacphextn;
    @XmlElementRef(name = "DEFU_DELV_EMAIL", type = JAXBElement.class)
    protected JAXBElement<String> defudelvemail;
    @XmlElementRef(name = "INTERNAL_IND", type = JAXBElement.class)
    protected JAXBElement<String> internalind;
    @XmlElementRef(name = "EXPIRY_DT", type = JAXBElement.class)
    protected JAXBElement<String> expirydt;
    @XmlElementRef(name = "LAST_CTAC_DT", type = JAXBElement.class)
    protected JAXBElement<String> lastctacdt;

    /**
     * Gets the value of the subrnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUBRNBR() {
        return subrnbr;
    }

    /**
     * Sets the value of the subrnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUBRNBR(JAXBElement<String> value) {
        this.subrnbr = ((JAXBElement<String> ) value);
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
     * Gets the value of the ultdunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getULTDUNSNBR() {
        return ultdunsnbr;
    }

    /**
     * Sets the value of the ultdunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setULTDUNSNBR(JAXBElement<String> value) {
        this.ultdunsnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pntdunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPNTDUNSNBR() {
        return pntdunsnbr;
    }

    /**
     * Sets the value of the pntdunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPNTDUNSNBR(JAXBElement<String> value) {
        this.pntdunsnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defudbusrid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEFUDBUSRID() {
        return defudbusrid;
    }

    /**
     * Sets the value of the defudbusrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEFUDBUSRID(JAXBElement<String> value) {
        this.defudbusrid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defudbpswd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEFUDBPSWD() {
        return defudbpswd;
    }

    /**
     * Sets the value of the defudbpswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEFUDBPSWD(JAXBElement<String> value) {
        this.defudbpswd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvconme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVCONME() {
        return delvconme;
    }

    /**
     * Sets the value of the delvconme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVCONME(JAXBElement<String> value) {
        this.delvconme = ((JAXBElement<String> ) value);
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
     * Gets the value of the delvreqgnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVREQGNME() {
        return delvreqgnme;
    }

    /**
     * Sets the value of the delvreqgnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVREQGNME(JAXBElement<String> value) {
        this.delvreqgnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvctacnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVCTACNME() {
        return delvctacnme;
    }

    /**
     * Sets the value of the delvctacnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVCTACNME(JAXBElement<String> value) {
        this.delvctacnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvctacphareacd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVCTACPHAREACD() {
        return delvctacphareacd;
    }

    /**
     * Sets the value of the delvctacphareacd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVCTACPHAREACD(JAXBElement<String> value) {
        this.delvctacphareacd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvctacphnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVCTACPHNBR() {
        return delvctacphnbr;
    }

    /**
     * Sets the value of the delvctacphnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVCTACPHNBR(JAXBElement<String> value) {
        this.delvctacphnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delvctacphextn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDELVCTACPHEXTN() {
        return delvctacphextn;
    }

    /**
     * Sets the value of the delvctacphextn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDELVCTACPHEXTN(JAXBElement<String> value) {
        this.delvctacphextn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defudelvemail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEFUDELVEMAIL() {
        return defudelvemail;
    }

    /**
     * Sets the value of the defudelvemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEFUDELVEMAIL(JAXBElement<String> value) {
        this.defudelvemail = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the internalind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINTERNALIND() {
        return internalind;
    }

    /**
     * Sets the value of the internalind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINTERNALIND(JAXBElement<String> value) {
        this.internalind = ((JAXBElement<String> ) value);
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
