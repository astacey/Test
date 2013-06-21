
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dimissal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dimissal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="OriginalPetitionDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="HearingDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DismissalDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dimissal", propOrder = {
    "publicationDate",
    "originalPetitionDate",
    "hearingDate",
    "dismissalDate"
})
public class Dimissal {

    @XmlElement(name = "PublicationDate")
    protected CCYYMMDD publicationDate;
    @XmlElement(name = "OriginalPetitionDate")
    protected CCYYMMDD originalPetitionDate;
    @XmlElement(name = "HearingDate")
    protected CCYYMMDD hearingDate;
    @XmlElement(name = "DismissalDate")
    protected CCYYMMDD dismissalDate;

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
     * Gets the value of the originalPetitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getOriginalPetitionDate() {
        return originalPetitionDate;
    }

    /**
     * Sets the value of the originalPetitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setOriginalPetitionDate(CCYYMMDD value) {
        this.originalPetitionDate = value;
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
     * Gets the value of the dismissalDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDismissalDate() {
        return dismissalDate;
    }

    /**
     * Sets the value of the dismissalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDismissalDate(CCYYMMDD value) {
        this.dismissalDate = value;
    }

}
