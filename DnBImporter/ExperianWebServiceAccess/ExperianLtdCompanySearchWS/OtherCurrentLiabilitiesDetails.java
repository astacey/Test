
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherCurrentLiabilitiesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherCurrentLiabilitiesDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetsHeldForResale" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Dividends" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCurrentLiabilitiesDetails", propOrder = {
    "otherCurrentLiabilities",
    "assetsHeldForResale",
    "other",
    "dividends"
})
public class OtherCurrentLiabilitiesDetails {

    @XmlElement(name = "OtherCurrentLiabilities")
    protected Long otherCurrentLiabilities;
    @XmlElement(name = "AssetsHeldForResale")
    protected Long assetsHeldForResale;
    @XmlElement(name = "Other")
    protected Long other;
    @XmlElement(name = "Dividends")
    protected Long dividends;

    /**
     * Gets the value of the otherCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherCurrentLiabilities() {
        return otherCurrentLiabilities;
    }

    /**
     * Sets the value of the otherCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherCurrentLiabilities(Long value) {
        this.otherCurrentLiabilities = value;
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

    /**
     * Gets the value of the dividends property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDividends(Long value) {
        this.dividends = value;
    }

}
