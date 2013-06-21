
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThomsonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThomsonData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="PremiseTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PremiseTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelocatedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumContacts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}Contacts" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThomsonData", propOrder = {
    "createdDate",
    "premiseTypeCode",
    "premiseTypeDesc",
    "url",
    "relocatedFlag",
    "numContacts",
    "contact"
})
public class ThomsonData {

    @XmlElement(name = "CreatedDate")
    protected CCYYMM createdDate;
    @XmlElement(name = "PremiseTypeCode")
    protected String premiseTypeCode;
    @XmlElement(name = "PremiseTypeDesc")
    protected String premiseTypeDesc;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "RelocatedFlag")
    protected String relocatedFlag;
    @XmlElement(name = "NumContacts")
    protected Integer numContacts;
    @XmlElement(name = "Contact")
    protected List<Contacts> contact;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setCreatedDate(CCYYMM value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the premiseTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseTypeCode() {
        return premiseTypeCode;
    }

    /**
     * Sets the value of the premiseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiseTypeCode(String value) {
        this.premiseTypeCode = value;
    }

    /**
     * Gets the value of the premiseTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseTypeDesc() {
        return premiseTypeDesc;
    }

    /**
     * Sets the value of the premiseTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiseTypeDesc(String value) {
        this.premiseTypeDesc = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the relocatedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelocatedFlag() {
        return relocatedFlag;
    }

    /**
     * Sets the value of the relocatedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelocatedFlag(String value) {
        this.relocatedFlag = value;
    }

    /**
     * Gets the value of the numContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumContacts() {
        return numContacts;
    }

    /**
     * Sets the value of the numContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumContacts(Integer value) {
        this.numContacts = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contacts }
     * 
     * 
     */
    public List<Contacts> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contacts>();
        }
        return this.contact;
    }

}
