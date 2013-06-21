
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialDelphiHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialDelphiHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyHistory" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CompanyHistory" minOccurs="0"/>
 *         &lt;element name="SectorScore" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}SectorScore" minOccurs="0"/>
 *         &lt;element name="SectorRanking" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}SectorRanking" minOccurs="0"/>
 *         &lt;element name="Sectors" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Sectors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialDelphiHistory", propOrder = {
    "companyHistory",
    "sectorScore",
    "sectorRanking",
    "sectors"
})
public class CommercialDelphiHistory {

    @XmlElement(name = "CompanyHistory")
    protected CompanyHistory companyHistory;
    @XmlElement(name = "SectorScore")
    protected SectorScore sectorScore;
    @XmlElement(name = "SectorRanking")
    protected SectorRanking sectorRanking;
    @XmlElement(name = "Sectors")
    protected Sectors sectors;

    /**
     * Gets the value of the companyHistory property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyHistory }
     *     
     */
    public CompanyHistory getCompanyHistory() {
        return companyHistory;
    }

    /**
     * Sets the value of the companyHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyHistory }
     *     
     */
    public void setCompanyHistory(CompanyHistory value) {
        this.companyHistory = value;
    }

    /**
     * Gets the value of the sectorScore property.
     * 
     * @return
     *     possible object is
     *     {@link SectorScore }
     *     
     */
    public SectorScore getSectorScore() {
        return sectorScore;
    }

    /**
     * Sets the value of the sectorScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorScore }
     *     
     */
    public void setSectorScore(SectorScore value) {
        this.sectorScore = value;
    }

    /**
     * Gets the value of the sectorRanking property.
     * 
     * @return
     *     possible object is
     *     {@link SectorRanking }
     *     
     */
    public SectorRanking getSectorRanking() {
        return sectorRanking;
    }

    /**
     * Sets the value of the sectorRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorRanking }
     *     
     */
    public void setSectorRanking(SectorRanking value) {
        this.sectorRanking = value;
    }

    /**
     * Gets the value of the sectors property.
     * 
     * @return
     *     possible object is
     *     {@link Sectors }
     *     
     */
    public Sectors getSectors() {
        return sectors;
    }

    /**
     * Sets the value of the sectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sectors }
     *     
     */
    public void setSectors(Sectors value) {
        this.sectors = value;
    }

}
