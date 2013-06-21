
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherNonCurrentAssetsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherNonCurrentAssetsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherNonCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LongTermTrade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SubsidiaryAssociateJoint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetsHeldForResale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "OtherNonCurrentAssetsDetails", propOrder = {
    "otherNonCurrentAssets",
    "longTermTrade",
    "subsidiaryAssociateJoint",
    "assetsHeldForResale",
    "other"
})
public class OtherNonCurrentAssetsDetails {

    @XmlElement(name = "OtherNonCurrentAssets")
    protected Long otherNonCurrentAssets;
    @XmlElement(name = "LongTermTrade")
    protected Long longTermTrade;
    @XmlElement(name = "SubsidiaryAssociateJoint")
    protected Long subsidiaryAssociateJoint;
    @XmlElement(name = "AssetsHeldForResale")
    protected Long assetsHeldForResale;
    @XmlElement(name = "Other")
    protected Long other;

    /**
     * Gets the value of the otherNonCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherNonCurrentAssets() {
        return otherNonCurrentAssets;
    }

    /**
     * Sets the value of the otherNonCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherNonCurrentAssets(Long value) {
        this.otherNonCurrentAssets = value;
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
