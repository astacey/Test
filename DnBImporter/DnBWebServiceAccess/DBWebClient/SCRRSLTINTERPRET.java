
package DBWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCR_RSLT_INTERPRET complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCR_RSLT_INTERPRET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REQS_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQS_TIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FR_SCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FR_SCR_CLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CLAS_LBL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CLAS_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CLAS_PCTG_POPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CLAS_PCTG_FRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_MULT_FRD_RSK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_1_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_1_CD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_2_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_2_CD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_3_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_3_CD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_4_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REAS_4_CD_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SCR_RSLT_INTERPRET", propOrder = {
    "reqsdate",
    "reqstime",
    "frscr",
    "frscrclas",
    "scrclaslbl",
    "scrclasdesc",
    "scrclaspctgpopn",
    "scrclaspctgfrd",
    "scrmultfrdrsk",
    "reas1CD",
    "reas1CDDESC",
    "reas2CD",
    "reas2CDDESC",
    "reas3CD",
    "reas3CDDESC",
    "reas4CD",
    "reas4CDDESC",
    "mtchcnt"
})
public class SCRRSLTINTERPRET {

    @XmlElementRef(name = "REQS_DATE", type = JAXBElement.class)
    protected JAXBElement<String> reqsdate;
    @XmlElementRef(name = "REQS_TIME", type = JAXBElement.class)
    protected JAXBElement<String> reqstime;
    @XmlElementRef(name = "FR_SCR", type = JAXBElement.class)
    protected JAXBElement<String> frscr;
    @XmlElementRef(name = "FR_SCR_CLAS", type = JAXBElement.class)
    protected JAXBElement<String> frscrclas;
    @XmlElementRef(name = "SCR_CLAS_LBL", type = JAXBElement.class)
    protected JAXBElement<String> scrclaslbl;
    @XmlElementRef(name = "SCR_CLAS_DESC", type = JAXBElement.class)
    protected JAXBElement<String> scrclasdesc;
    @XmlElementRef(name = "SCR_CLAS_PCTG_POPN", type = JAXBElement.class)
    protected JAXBElement<String> scrclaspctgpopn;
    @XmlElementRef(name = "SCR_CLAS_PCTG_FRD", type = JAXBElement.class)
    protected JAXBElement<String> scrclaspctgfrd;
    @XmlElementRef(name = "SCR_MULT_FRD_RSK", type = JAXBElement.class)
    protected JAXBElement<String> scrmultfrdrsk;
    @XmlElementRef(name = "REAS_1_CD", type = JAXBElement.class)
    protected JAXBElement<String> reas1CD;
    @XmlElementRef(name = "REAS_1_CD_DESC", type = JAXBElement.class)
    protected JAXBElement<String> reas1CDDESC;
    @XmlElementRef(name = "REAS_2_CD", type = JAXBElement.class)
    protected JAXBElement<String> reas2CD;
    @XmlElementRef(name = "REAS_2_CD_DESC", type = JAXBElement.class)
    protected JAXBElement<String> reas2CDDESC;
    @XmlElementRef(name = "REAS_3_CD", type = JAXBElement.class)
    protected JAXBElement<String> reas3CD;
    @XmlElementRef(name = "REAS_3_CD_DESC", type = JAXBElement.class)
    protected JAXBElement<String> reas3CDDESC;
    @XmlElementRef(name = "REAS_4_CD", type = JAXBElement.class)
    protected JAXBElement<String> reas4CD;
    @XmlElementRef(name = "REAS_4_CD_DESC", type = JAXBElement.class)
    protected JAXBElement<String> reas4CDDESC;
    @XmlElementRef(name = "MTCH_CNT", type = JAXBElement.class)
    protected JAXBElement<String> mtchcnt;

    /**
     * Gets the value of the reqsdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREQSDATE() {
        return reqsdate;
    }

    /**
     * Sets the value of the reqsdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREQSDATE(JAXBElement<String> value) {
        this.reqsdate = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reqstime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREQSTIME() {
        return reqstime;
    }

    /**
     * Sets the value of the reqstime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREQSTIME(JAXBElement<String> value) {
        this.reqstime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frscr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFRSCR() {
        return frscr;
    }

    /**
     * Sets the value of the frscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFRSCR(JAXBElement<String> value) {
        this.frscr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the frscrclas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFRSCRCLAS() {
        return frscrclas;
    }

    /**
     * Sets the value of the frscrclas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFRSCRCLAS(JAXBElement<String> value) {
        this.frscrclas = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrclaslbl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRCLASLBL() {
        return scrclaslbl;
    }

    /**
     * Sets the value of the scrclaslbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRCLASLBL(JAXBElement<String> value) {
        this.scrclaslbl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrclasdesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRCLASDESC() {
        return scrclasdesc;
    }

    /**
     * Sets the value of the scrclasdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRCLASDESC(JAXBElement<String> value) {
        this.scrclasdesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrclaspctgpopn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRCLASPCTGPOPN() {
        return scrclaspctgpopn;
    }

    /**
     * Sets the value of the scrclaspctgpopn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRCLASPCTGPOPN(JAXBElement<String> value) {
        this.scrclaspctgpopn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrclaspctgfrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRCLASPCTGFRD() {
        return scrclaspctgfrd;
    }

    /**
     * Sets the value of the scrclaspctgfrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRCLASPCTGFRD(JAXBElement<String> value) {
        this.scrclaspctgfrd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrmultfrdrsk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRMULTFRDRSK() {
        return scrmultfrdrsk;
    }

    /**
     * Sets the value of the scrmultfrdrsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRMULTFRDRSK(JAXBElement<String> value) {
        this.scrmultfrdrsk = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas1CD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS1CD() {
        return reas1CD;
    }

    /**
     * Sets the value of the reas1CD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS1CD(JAXBElement<String> value) {
        this.reas1CD = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas1CDDESC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS1CDDESC() {
        return reas1CDDESC;
    }

    /**
     * Sets the value of the reas1CDDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS1CDDESC(JAXBElement<String> value) {
        this.reas1CDDESC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas2CD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS2CD() {
        return reas2CD;
    }

    /**
     * Sets the value of the reas2CD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS2CD(JAXBElement<String> value) {
        this.reas2CD = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas2CDDESC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS2CDDESC() {
        return reas2CDDESC;
    }

    /**
     * Sets the value of the reas2CDDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS2CDDESC(JAXBElement<String> value) {
        this.reas2CDDESC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas3CD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS3CD() {
        return reas3CD;
    }

    /**
     * Sets the value of the reas3CD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS3CD(JAXBElement<String> value) {
        this.reas3CD = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas3CDDESC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS3CDDESC() {
        return reas3CDDESC;
    }

    /**
     * Sets the value of the reas3CDDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS3CDDESC(JAXBElement<String> value) {
        this.reas3CDDESC = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas4CD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS4CD() {
        return reas4CD;
    }

    /**
     * Sets the value of the reas4CD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS4CD(JAXBElement<String> value) {
        this.reas4CD = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reas4CDDESC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREAS4CDDESC() {
        return reas4CDDESC;
    }

    /**
     * Sets the value of the reas4CDDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREAS4CDDESC(JAXBElement<String> value) {
        this.reas4CDDESC = ((JAXBElement<String> ) value);
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
