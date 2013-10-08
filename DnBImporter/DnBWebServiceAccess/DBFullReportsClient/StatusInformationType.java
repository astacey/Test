
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://gateway.dnb.com/getProduct}GatewayStatusType"/>
 *         &lt;element name="ErrorSeverityCode" type="{http://gateway.dnb.com/getProduct}ErrorSeverityCodeType" minOccurs="0"/>
 *         &lt;element name="ErrorMessageCode" type="{http://gateway.dnb.com/getProduct}ErrorMessageCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://gateway.dnb.com/getProduct}DescriptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusInformationType", propOrder = {
    "status",
    "errorSeverityCode",
    "errorMessageCode",
    "description"
})
public class StatusInformationType {

    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ErrorSeverityCode")
    protected String errorSeverityCode;
    @XmlElement(name = "ErrorMessageCode")
    protected String errorMessageCode;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorSeverityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorSeverityCode() {
        return errorSeverityCode;
    }

    /**
     * Sets the value of the errorSeverityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorSeverityCode(String value) {
        this.errorSeverityCode = value;
    }

    /**
     * Gets the value of the errorMessageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessageCode() {
        return errorMessageCode;
    }

    /**
     * Sets the value of the errorMessageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessageCode(String value) {
        this.errorMessageCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
