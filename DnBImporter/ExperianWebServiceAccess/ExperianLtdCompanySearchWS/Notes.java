
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Notes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notes", propOrder = {
    "alertCode",
    "alertHeader",
    "alertNote"
})
public class Notes {

    @XmlElement(name = "AlertCode")
    protected String alertCode;
    @XmlElement(name = "AlertHeader")
    protected String alertHeader;
    @XmlElement(name = "AlertNote")
    protected String alertNote;

    /**
     * Gets the value of the alertCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCode() {
        return alertCode;
    }

    /**
     * Sets the value of the alertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCode(String value) {
        this.alertCode = value;
    }

    /**
     * Gets the value of the alertHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertHeader() {
        return alertHeader;
    }

    /**
     * Sets the value of the alertHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertHeader(String value) {
        this.alertHeader = value;
    }

    /**
     * Gets the value of the alertNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertNote() {
        return alertNote;
    }

    /**
     * Sets the value of the alertNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertNote(String value) {
        this.alertNote = value;
    }

}
