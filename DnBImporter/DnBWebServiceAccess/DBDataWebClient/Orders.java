
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Orders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Orders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User_Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DnB_DUNS_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Country_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trade_Up_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Product_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBRI_Unmatched_AGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Char_Set_Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Orders", propOrder = {
    "userLanguage",
    "dnBDUNSNumber",
    "countryCode",
    "tradeUpIndicator",
    "product",
    "productType",
    "reasonCode",
    "fileId",
    "sbriUnmatchedAGN",
    "charSetOverride"
})
public class Orders {

    @XmlElementRef(name = "User_Language", type = JAXBElement.class)
    protected JAXBElement<String> userLanguage;
    @XmlElement(name = "DnB_DUNS_Number", required = true, nillable = true)
    protected String dnBDUNSNumber;
    @XmlElementRef(name = "Country_Code", type = JAXBElement.class)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "Trade_Up_Indicator", type = JAXBElement.class)
    protected JAXBElement<String> tradeUpIndicator;
    @XmlElement(name = "Product", required = true)
    protected String product;
    @XmlElement(name = "Product_Type", required = true)
    protected String productType;
    @XmlElementRef(name = "Reason_Code", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "FileId", type = JAXBElement.class)
    protected JAXBElement<String> fileId;
    @XmlElementRef(name = "SBRI_Unmatched_AGN", type = JAXBElement.class)
    protected JAXBElement<String> sbriUnmatchedAGN;
    @XmlElementRef(name = "Char_Set_Override", type = JAXBElement.class)
    protected JAXBElement<String> charSetOverride;

    /**
     * Gets the value of the userLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLanguage() {
        return userLanguage;
    }

    /**
     * Sets the value of the userLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLanguage(JAXBElement<String> value) {
        this.userLanguage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dnBDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnBDUNSNumber() {
        return dnBDUNSNumber;
    }

    /**
     * Sets the value of the dnBDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnBDUNSNumber(String value) {
        this.dnBDUNSNumber = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tradeUpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeUpIndicator() {
        return tradeUpIndicator;
    }

    /**
     * Sets the value of the tradeUpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeUpIndicator(JAXBElement<String> value) {
        this.tradeUpIndicator = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileId(JAXBElement<String> value) {
        this.fileId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbriUnmatchedAGN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSBRIUnmatchedAGN() {
        return sbriUnmatchedAGN;
    }

    /**
     * Sets the value of the sbriUnmatchedAGN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSBRIUnmatchedAGN(JAXBElement<String> value) {
        this.sbriUnmatchedAGN = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the charSetOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCharSetOverride() {
        return charSetOverride;
    }

    /**
     * Sets the value of the charSetOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCharSetOverride(JAXBElement<String> value) {
        this.charSetOverride = ((JAXBElement<String> ) value);
    }

}
