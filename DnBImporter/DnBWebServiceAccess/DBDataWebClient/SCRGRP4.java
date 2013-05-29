
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCR_GRP4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCR_GRP4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NATL_PCTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_OVRD_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDS_PCTL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_CMTY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEFU_INDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDS_DEFU_INDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCR_GRP4", propOrder = {
    "natlpctl",
    "scrovrdcd",
    "indspctl",
    "scrcmtycd",
    "defuindn",
    "indsdefuindn"
})
public class SCRGRP4 {

    @XmlElementRef(name = "NATL_PCTL", type = JAXBElement.class)
    protected JAXBElement<String> natlpctl;
    @XmlElementRef(name = "SCR_OVRD_CD", type = JAXBElement.class)
    protected JAXBElement<String> scrovrdcd;
    @XmlElementRef(name = "INDS_PCTL", type = JAXBElement.class)
    protected JAXBElement<String> indspctl;
    @XmlElementRef(name = "SCR_CMTY_CD", type = JAXBElement.class)
    protected JAXBElement<String> scrcmtycd;
    @XmlElementRef(name = "DEFU_INDN", type = JAXBElement.class)
    protected JAXBElement<String> defuindn;
    @XmlElementRef(name = "INDS_DEFU_INDN", type = JAXBElement.class)
    protected JAXBElement<String> indsdefuindn;

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
     * Gets the value of the scrcmtycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRCMTYCD() {
        return scrcmtycd;
    }

    /**
     * Sets the value of the scrcmtycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRCMTYCD(JAXBElement<String> value) {
        this.scrcmtycd = ((JAXBElement<String> ) value);
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

}
