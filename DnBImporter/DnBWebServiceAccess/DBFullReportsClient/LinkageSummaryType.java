
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type holds the summary of linkage information associated with the subject such as Parent, Branches, Subsidiaries.
 * 
 * <p>Java class for LinkageSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkageSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImmediateParent" type="{http://gateway.dnb.com/getProduct}ParentDetailsType" minOccurs="0"/>
 *         &lt;element name="GlobalLinkageQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ShareholdersIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinorityInterestsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberofMinorityInterests" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SubsidiariesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberofSubsidiaries" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BranchesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberofBranches" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkageSummaryType", propOrder = {
    "immediateParent",
    "globalLinkageQuantity",
    "shareholdersIndicator",
    "minorityInterestsIndicator",
    "numberofMinorityInterests",
    "subsidiariesIndicator",
    "numberofSubsidiaries",
    "branchesIndicator",
    "numberofBranches"
})
public class LinkageSummaryType {

    @XmlElement(name = "ImmediateParent")
    protected ParentDetailsType immediateParent;
    @XmlElement(name = "GlobalLinkageQuantity")
    protected BigInteger globalLinkageQuantity;
    @XmlElement(name = "ShareholdersIndicator", defaultValue = "false")
    protected Boolean shareholdersIndicator;
    @XmlElement(name = "MinorityInterestsIndicator", defaultValue = "false")
    protected Boolean minorityInterestsIndicator;
    @XmlElement(name = "NumberofMinorityInterests")
    protected BigInteger numberofMinorityInterests;
    @XmlElement(name = "SubsidiariesIndicator", defaultValue = "false")
    protected Boolean subsidiariesIndicator;
    @XmlElement(name = "NumberofSubsidiaries")
    protected BigInteger numberofSubsidiaries;
    @XmlElement(name = "BranchesIndicator", defaultValue = "false")
    protected Boolean branchesIndicator;
    @XmlElement(name = "NumberofBranches")
    protected BigInteger numberofBranches;

    /**
     * Gets the value of the immediateParent property.
     * 
     * @return
     *     possible object is
     *     {@link ParentDetailsType }
     *     
     */
    public ParentDetailsType getImmediateParent() {
        return immediateParent;
    }

    /**
     * Sets the value of the immediateParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDetailsType }
     *     
     */
    public void setImmediateParent(ParentDetailsType value) {
        this.immediateParent = value;
    }

    /**
     * Gets the value of the globalLinkageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGlobalLinkageQuantity() {
        return globalLinkageQuantity;
    }

    /**
     * Sets the value of the globalLinkageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGlobalLinkageQuantity(BigInteger value) {
        this.globalLinkageQuantity = value;
    }

    /**
     * Gets the value of the shareholdersIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareholdersIndicator() {
        return shareholdersIndicator;
    }

    /**
     * Sets the value of the shareholdersIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareholdersIndicator(Boolean value) {
        this.shareholdersIndicator = value;
    }

    /**
     * Gets the value of the minorityInterestsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityInterestsIndicator() {
        return minorityInterestsIndicator;
    }

    /**
     * Sets the value of the minorityInterestsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityInterestsIndicator(Boolean value) {
        this.minorityInterestsIndicator = value;
    }

    /**
     * Gets the value of the numberofMinorityInterests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofMinorityInterests() {
        return numberofMinorityInterests;
    }

    /**
     * Sets the value of the numberofMinorityInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofMinorityInterests(BigInteger value) {
        this.numberofMinorityInterests = value;
    }

    /**
     * Gets the value of the subsidiariesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubsidiariesIndicator() {
        return subsidiariesIndicator;
    }

    /**
     * Sets the value of the subsidiariesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsidiariesIndicator(Boolean value) {
        this.subsidiariesIndicator = value;
    }

    /**
     * Gets the value of the numberofSubsidiaries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofSubsidiaries() {
        return numberofSubsidiaries;
    }

    /**
     * Sets the value of the numberofSubsidiaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofSubsidiaries(BigInteger value) {
        this.numberofSubsidiaries = value;
    }

    /**
     * Gets the value of the branchesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBranchesIndicator() {
        return branchesIndicator;
    }

    /**
     * Sets the value of the branchesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBranchesIndicator(Boolean value) {
        this.branchesIndicator = value;
    }

    /**
     * Gets the value of the numberofBranches property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofBranches() {
        return numberofBranches;
    }

    /**
     * Sets the value of the numberofBranches property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofBranches(BigInteger value) {
        this.numberofBranches = value;
    }

}
