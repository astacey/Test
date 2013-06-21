
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAssetsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentAssetsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvestmentAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SubsidiaryAssociateJoint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherInvestments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAssetsDetails", propOrder = {
    "investmentAssets",
    "property",
    "subsidiaryAssociateJoint",
    "otherInvestments"
})
public class InvestmentAssetsDetails {

    @XmlElement(name = "InvestmentAssets")
    protected Long investmentAssets;
    @XmlElement(name = "Property")
    protected Long property;
    @XmlElement(name = "SubsidiaryAssociateJoint")
    protected Long subsidiaryAssociateJoint;
    @XmlElement(name = "OtherInvestments")
    protected Long otherInvestments;

    /**
     * Gets the value of the investmentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvestmentAssets() {
        return investmentAssets;
    }

    /**
     * Sets the value of the investmentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvestmentAssets(Long value) {
        this.investmentAssets = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProperty(Long value) {
        this.property = value;
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
     * Gets the value of the otherInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherInvestments() {
        return otherInvestments;
    }

    /**
     * Sets the value of the otherInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherInvestments(Long value) {
        this.otherInvestments = value;
    }

}
