
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherNonCurrentLiabilitiesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherNonCurrentLiabilitiesDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherNonCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LongTermTrade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SubsidiaryAssociateJoint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DirectorLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetsHeldForResale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Accruals" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferenceShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherNonCurrentLiabilitiesDetails", propOrder = {
    "otherNonCurrentLiabilities",
    "longTermTrade",
    "subsidiaryAssociateJoint",
    "groupLoans",
    "directorLoans",
    "assetsHeldForResale",
    "accruals",
    "preferenceShares",
    "other"
})
public class OtherNonCurrentLiabilitiesDetails {

    @XmlElement(name = "OtherNonCurrentLiabilities")
    protected Long otherNonCurrentLiabilities;
    @XmlElement(name = "LongTermTrade")
    protected Long longTermTrade;
    @XmlElement(name = "SubsidiaryAssociateJoint")
    protected Long subsidiaryAssociateJoint;
    @XmlElement(name = "GroupLoans")
    protected Long groupLoans;
    @XmlElement(name = "DirectorLoans")
    protected Long directorLoans;
    @XmlElement(name = "AssetsHeldForResale")
    protected Long assetsHeldForResale;
    @XmlElement(name = "Accruals")
    protected Long accruals;
    @XmlElement(name = "PreferenceShares")
    protected Long preferenceShares;
    @XmlElement(name = "Other")
    protected Long other;

    /**
     * Gets the value of the otherNonCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherNonCurrentLiabilities() {
        return otherNonCurrentLiabilities;
    }

    /**
     * Sets the value of the otherNonCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherNonCurrentLiabilities(Long value) {
        this.otherNonCurrentLiabilities = value;
    }

    /**
     * Gets the value of the longTermTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongTermTrade() {
        return longTermTrade;
    }

    /**
     * Sets the value of the longTermTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongTermTrade(Long value) {
        this.longTermTrade = value;
    }

    /**
     * Gets the value of the subsidiaryAssociateJoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubsidiaryAssociateJoint() {
        return subsidiaryAssociateJoint;
    }

    /**
     * Sets the value of the subsidiaryAssociateJoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubsidiaryAssociateJoint(Long value) {
        this.subsidiaryAssociateJoint = value;
    }

    /**
     * Gets the value of the groupLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupLoans() {
        return groupLoans;
    }

    /**
     * Sets the value of the groupLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupLoans(Long value) {
        this.groupLoans = value;
    }

    /**
     * Gets the value of the directorLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectorLoans() {
        return directorLoans;
    }

    /**
     * Sets the value of the directorLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectorLoans(Long value) {
        this.directorLoans = value;
    }

    /**
     * Gets the value of the assetsHeldForResale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetsHeldForResale() {
        return assetsHeldForResale;
    }

    /**
     * Sets the value of the assetsHeldForResale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetsHeldForResale(Long value) {
        this.assetsHeldForResale = value;
    }

    /**
     * Gets the value of the accruals property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccruals() {
        return accruals;
    }

    /**
     * Sets the value of the accruals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccruals(Long value) {
        this.accruals = value;
    }

    /**
     * Gets the value of the preferenceShares property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreferenceShares() {
        return preferenceShares;
    }

    /**
     * Sets the value of the preferenceShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreferenceShares(Long value) {
        this.preferenceShares = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOther(Long value) {
        this.other = value;
    }

}
