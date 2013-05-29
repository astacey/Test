
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCR_GRP3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCR_GRP3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASMT_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RAW_SCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_AGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CMTY_CD" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCR_GRP3", propOrder = {
    "asmtdt",
    "rawscr",
    "scrage",
    "scrclas",
    "scrcmtycd"
})
public class SCRGRP3 {

    @XmlElementRef(name = "ASMT_DT", type = JAXBElement.class)
    protected JAXBElement<String> asmtdt;
    @XmlElementRef(name = "RAW_SCR", type = JAXBElement.class)
    protected JAXBElement<String> rawscr;
    @XmlElementRef(name = "SCR_AGE", type = JAXBElement.class)
    protected JAXBElement<String> scrage;
    @XmlElementRef(name = "SCR_CLAS", type = JAXBElement.class)
    protected JAXBElement<String> scrclas;
    @XmlElementRef(name = "SCR_CMTY_CD", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> scrcmtycd;

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
     * Gets the value of the rawscr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRAWSCR() {
        return rawscr;
    }

    /**
     * Sets the value of the rawscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRAWSCR(JAXBElement<String> value) {
        this.rawscr = ((JAXBElement<String> ) value);
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

}
