
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Petition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Petition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="PresentationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="HearingDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="NumberPetitioners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Petitioners" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Petitioners" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Solicitors" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Solicitors" minOccurs="0"/>
 *         &lt;element name="CourtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Petition", propOrder = {
    "publicationDate",
    "presentationDate",
    "hearingDate",
    "numberPetitioners",
    "petitioners",
    "solicitors",
    "courtName"
})
public class Petition {

    @XmlElement(name = "PublicationDate")
    protected CCYYMMDD publicationDate;
    @XmlElement(name = "PresentationDate")
    protected CCYYMMDD presentationDate;
    @XmlElement(name = "HearingDate")
    protected CCYYMMDD hearingDate;
    @XmlElement(name = "NumberPetitioners")
    protected Integer numberPetitioners;
    @XmlElement(name = "Petitioners")
    protected List<Petitioners> petitioners;
    @XmlElement(name = "Solicitors")
    protected Solicitors solicitors;
    @XmlElement(name = "CourtName")
    protected String courtName;

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setPublicationDate(CCYYMMDD value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the presentationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getPresentationDate() {
        return presentationDate;
    }

    /**
     * Sets the value of the presentationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setPresentationDate(CCYYMMDD value) {
        this.presentationDate = value;
    }

    /**
     * Gets the value of the hearingDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getHearingDate() {
        return hearingDate;
    }

    /**
     * Sets the value of the hearingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setHearingDate(CCYYMMDD value) {
        this.hearingDate = value;
    }

    /**
     * Gets the value of the numberPetitioners property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberPetitioners() {
        return numberPetitioners;
    }

    /**
     * Sets the value of the numberPetitioners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberPetitioners(Integer value) {
        this.numberPetitioners = value;
    }

    /**
     * Gets the value of the petitioners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petitioners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetitioners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Petitioners }
     * 
     * 
     */
    public List<Petitioners> getPetitioners() {
        if (petitioners == null) {
            petitioners = new ArrayList<Petitioners>();
        }
        return this.petitioners;
    }

    /**
     * Gets the value of the solicitors property.
     * 
     * @return
     *     possible object is
     *     {@link Solicitors }
     *     
     */
    public Solicitors getSolicitors() {
        return solicitors;
    }

    /**
     * Sets the value of the solicitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Solicitors }
     *     
     */
    public void setSolicitors(Solicitors value) {
        this.solicitors = value;
    }

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

}
