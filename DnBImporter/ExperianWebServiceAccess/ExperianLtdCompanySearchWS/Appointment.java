
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Appointment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LodgedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AdminOrderDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="PublicationTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberAdministrators" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Administrator" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Administrator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment", propOrder = {
    "lodgedDate",
    "adminOrderDate",
    "publicationTown",
    "numberAdministrators",
    "administrator"
})
public class Appointment {

    @XmlElement(name = "LodgedDate")
    protected CCYYMMDD lodgedDate;
    @XmlElement(name = "AdminOrderDate")
    protected CCYYMMDD adminOrderDate;
    @XmlElement(name = "PublicationTown")
    protected String publicationTown;
    @XmlElement(name = "NumberAdministrators")
    protected Integer numberAdministrators;
    @XmlElement(name = "Administrator")
    protected List<Administrator> administrator;

    /**
     * Gets the value of the lodgedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLodgedDate() {
        return lodgedDate;
    }

    /**
     * Sets the value of the lodgedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLodgedDate(CCYYMMDD value) {
        this.lodgedDate = value;
    }

    /**
     * Gets the value of the adminOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getAdminOrderDate() {
        return adminOrderDate;
    }

    /**
     * Sets the value of the adminOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setAdminOrderDate(CCYYMMDD value) {
        this.adminOrderDate = value;
    }

    /**
     * Gets the value of the publicationTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationTown() {
        return publicationTown;
    }

    /**
     * Sets the value of the publicationTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationTown(String value) {
        this.publicationTown = value;
    }

    /**
     * Gets the value of the numberAdministrators property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberAdministrators() {
        return numberAdministrators;
    }

    /**
     * Sets the value of the numberAdministrators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberAdministrators(Integer value) {
        this.numberAdministrators = value;
    }

    /**
     * Gets the value of the administrator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Administrator }
     * 
     * 
     */
    public List<Administrator> getAdministrator() {
        if (administrator == null) {
            administrator = new ArrayList<Administrator>();
        }
        return this.administrator;
    }

}
