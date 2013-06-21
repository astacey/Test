
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecretaryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecretaryDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}NameDetls" minOccurs="0"/>
 *         &lt;element name="Qualifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}SecCommercialDetail" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecretaryDetails", propOrder = {
    "name",
    "qualifications",
    "title",
    "commercialDetail",
    "location"
})
public class SecretaryDetails {

    @XmlElement(name = "Name")
    protected NameDetls name;
    @XmlElement(name = "Qualifications")
    protected String qualifications;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "CommercialDetail")
    protected SecCommercialDetail commercialDetail;
    @XmlElement(name = "Location")
    protected Location location;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameDetls }
     *     
     */
    public NameDetls getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDetls }
     *     
     */
    public void setName(NameDetls value) {
        this.name = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifications(String value) {
        this.qualifications = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the commercialDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SecCommercialDetail }
     *     
     */
    public SecCommercialDetail getCommercialDetail() {
        return commercialDetail;
    }

    /**
     * Sets the value of the commercialDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecCommercialDetail }
     *     
     */
    public void setCommercialDetail(SecCommercialDetail value) {
        this.commercialDetail = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}
