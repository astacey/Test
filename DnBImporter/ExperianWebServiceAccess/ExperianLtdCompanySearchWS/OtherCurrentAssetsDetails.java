
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherCurrentAssetsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherCurrentAssetsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "OtherCurrentAssetsDetails", propOrder = {
    "otherCurrentAssets",
    "assetsHeldForResale",
    "other"
})
public class OtherCurrentAssetsDetails {

    @XmlElement(name = "OtherCurrentAssets")
    protected Long otherCurrentAssets;
    @XmlElement(name = "AssetsHeldForResale")
    protected Long assetsHeldForResale;
    @XmlElement(name = "Other")
    protected Long other;

    /**
     * Gets the value of the otherCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    /**
     * Sets the value of the otherCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherCurrentAssets(Long value) {
        this.otherCurrentAssets = value;
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
