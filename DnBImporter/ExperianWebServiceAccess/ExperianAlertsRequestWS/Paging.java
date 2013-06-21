
package ExperianAlertsRequestWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Paging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Paging">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstTimeFlag" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="ItemsPerPage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;pattern value="([0-9]{1,3})*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EndOfDataFlag" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNoBlank"/>
 *         &lt;element name="RestartReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([0-9A-Za-z\ ])*"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paging", propOrder = {
    "firstTimeFlag",
    "itemsPerPage",
    "endOfDataFlag",
    "restartReference"
})
public class Paging {

    @XmlElement(name = "FirstTimeFlag", required = true)
    protected YesNo firstTimeFlag;
    @XmlElement(name = "ItemsPerPage")
    protected Integer itemsPerPage;
    @XmlElement(name = "EndOfDataFlag", required = true)
    protected YesNoBlank endOfDataFlag;
    @XmlElement(name = "RestartReference")
    protected String restartReference;

    /**
     * Gets the value of the firstTimeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getFirstTimeFlag() {
        return firstTimeFlag;
    }

    /**
     * Sets the value of the firstTimeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setFirstTimeFlag(YesNo value) {
        this.firstTimeFlag = value;
    }

    /**
     * Gets the value of the itemsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Sets the value of the itemsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsPerPage(Integer value) {
        this.itemsPerPage = value;
    }

    /**
     * Gets the value of the endOfDataFlag property.
     * 
     * @return
     *     possible object is
     *     {@link YesNoBlank }
     *     
     */
    public YesNoBlank getEndOfDataFlag() {
        return endOfDataFlag;
    }

    /**
     * Sets the value of the endOfDataFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoBlank }
     *     
     */
    public void setEndOfDataFlag(YesNoBlank value) {
        this.endOfDataFlag = value;
    }

    /**
     * Gets the value of the restartReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestartReference() {
        return restartReference;
    }

    /**
     * Sets the value of the restartReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestartReference(String value) {
        this.restartReference = value;
    }

}
