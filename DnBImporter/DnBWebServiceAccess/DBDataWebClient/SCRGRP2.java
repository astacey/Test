
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCR_GRP2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCR_GRP2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASMT_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_INDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDS_DEFU_INDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDS_NORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDS_PCTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NATL_PCTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALGM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_AGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CMTY_CD" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SCR_OVRD_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_SLOW_PMT_PCTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCR_GRP2", propOrder = {
    "asmtdt",
    "defuindn",
    "indsdefuindn",
    "indsnorm",
    "indspctl",
    "natlpctl",
    "algmid",
    "scr",
    "scrage",
    "scrclas",
    "scrcmtycd",
    "scrovrdcd",
    "scrslowpmtpctg"
})
public class SCRGRP2 {

    @XmlElementRef(name = "ASMT_DT", type = JAXBElement.class)
    protected JAXBElement<String> asmtdt;
    @XmlElementRef(name = "DEFU_INDN", type = JAXBElement.class)
    protected JAXBElement<String> defuindn;
    @XmlElementRef(name = "INDS_DEFU_INDN", type = JAXBElement.class)
    protected JAXBElement<String> indsdefuindn;
    @XmlElementRef(name = "INDS_NORM", type = JAXBElement.class)
    protected JAXBElement<String> indsnorm;
    @XmlElementRef(name = "INDS_PCTL", type = JAXBElement.class)
    protected JAXBElement<String> indspctl;
    @XmlElementRef(name = "NATL_PCTL", type = JAXBElement.class)
    protected JAXBElement<String> natlpctl;
    @XmlElementRef(name = "ALGM_ID", type = JAXBElement.class)
    protected JAXBElement<String> algmid;
    @XmlElementRef(name = "SCR", type = JAXBElement.class)
    protected JAXBElement<String> scr;
    @XmlElementRef(name = "SCR_AGE", type = JAXBElement.class)
    protected JAXBElement<String> scrage;
    @XmlElementRef(name = "SCR_CLAS", type = JAXBElement.class)
    protected JAXBElement<String> scrclas;
    @XmlElementRef(name = "SCR_CMTY_CD", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> scrcmtycd;
    @XmlElementRef(name = "SCR_OVRD_CD", type = JAXBElement.class)
    protected JAXBElement<String> scrovrdcd;
    @XmlElementRef(name = "SCR_SLOW_PMT_PCTG", type = JAXBElement.class)
    protected JAXBElement<String> scrslowpmtpctg;

    /**
     * Gets the value of the asmtdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getASMTDT() {
        return asmtdt;
    }

    /**
     * Sets the value of the asmtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setASMTDT(JAXBElement<String> value) {
        this.asmtdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the defuindn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEFUINDN() {
        return defuindn;
    }

    /**
     * Sets the value of the defuindn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEFUINDN(JAXBElement<String> value) {
        this.defuindn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indsdefuindn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDSDEFUINDN() {
        return indsdefuindn;
    }

    /**
     * Sets the value of the indsdefuindn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDSDEFUINDN(JAXBElement<String> value) {
        this.indsdefuindn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indsnorm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDSNORM() {
        return indsnorm;
    }

    /**
     * Sets the value of the indsnorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDSNORM(JAXBElement<String> value) {
        this.indsnorm = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indspctl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDSPCTL() {
        return indspctl;
    }

    /**
     * Sets the value of the indspctl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDSPCTL(JAXBElement<String> value) {
        this.indspctl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the natlpctl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNATLPCTL() {
        return natlpctl;
    }

    /**
     * Sets the value of the natlpctl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNATLPCTL(JAXBElement<String> value) {
        this.natlpctl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the algmid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALGMID() {
        return algmid;
    }

    /**
     * Sets the value of the algmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALGMID(JAXBElement<String> value) {
        this.algmid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCR() {
        return scr;
    }

    /**
     * Sets the value of the scr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCR(JAXBElement<String> value) {
        this.scr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRAGE() {
        return scrage;
    }

    /**
     * Sets the value of the scrage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRAGE(JAXBElement<String> value) {
        this.scrage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrclas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRCLAS() {
        return scrclas;
    }

    /**
     * Sets the value of the scrclas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRCLAS(JAXBElement<String> value) {
        this.scrclas = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrcmtycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSCRCMTYCD() {
        return scrcmtycd;
    }

    /**
     * Sets the value of the scrcmtycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSCRCMTYCD(JAXBElement<ArrayOfstring> value) {
        this.scrcmtycd = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the scrovrdcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCROVRDCD() {
        return scrovrdcd;
    }

    /**
     * Sets the value of the scrovrdcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCROVRDCD(JAXBElement<String> value) {
        this.scrovrdcd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrslowpmtpctg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRSLOWPMTPCTG() {
        return scrslowpmtpctg;
    }

    /**
     * Sets the value of the scrslowpmtpctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRSLOWPMTPCTG(JAXBElement<String> value) {
        this.scrslowpmtpctg = ((JAXBElement<String> ) value);
    }

}
