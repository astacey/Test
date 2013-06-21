
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommonTermsDBT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommonTermsNumExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommonTermsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommonTermsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonTerms", propOrder = {
    "commonTermsDBT",
    "commonTermsNumExp",
    "commonTermsCode",
    "commonTermsText"
})
public class CommonTerms {

    @XmlElement(name = "CommonTermsDBT")
    protected Integer commonTermsDBT;
    @XmlElement(name = "CommonTermsNumExp")
    protected Integer commonTermsNumExp;
    @XmlElement(name = "CommonTermsCode")
    protected String commonTermsCode;
    @XmlElement(name = "CommonTermsText")
    protected String commonTermsText;

    /**
     * Gets the value of the commonTermsDBT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommonTermsDBT() {
        return commonTermsDBT;
    }

    /**
     * Sets the value of the commonTermsDBT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommonTermsDBT(Integer value) {
        this.commonTermsDBT = value;
    }

    /**
     * Gets the value of the commonTermsNumExp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommonTermsNumExp() {
        return commonTermsNumExp;
    }

    /**
     * Sets the value of the commonTermsNumExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommonTermsNumExp(Integer value) {
        this.commonTermsNumExp = value;
    }

    /**
     * Gets the value of the commonTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonTermsCode() {
        return commonTermsCode;
    }

    /**
     * Sets the value of the commonTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonTermsCode(String value) {
        this.commonTermsCode = value;
    }

    /**
     * Gets the value of the commonTermsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonTermsText() {
        return commonTermsText;
    }

    /**
     * Sets the value of the commonTermsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonTermsText(String value) {
        this.commonTermsText = value;
    }

}
