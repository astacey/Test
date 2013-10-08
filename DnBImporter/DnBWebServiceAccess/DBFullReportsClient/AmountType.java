
package DBFullReportsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="ISOCurrencyCode" type="{http://gateway.dnb.com/getProduct}ISOCurrencyCodeType" />
 *       &lt;attribute name="monetaryUnit" type="{http://gateway.dnb.com/getProduct}MonetaryUnitsType" />
 *       &lt;attribute name="NBBCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
    "value"
})
@XmlSeeAlso({
    DBFullReportsClient.SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry.PreviousCapitalAmount.class
})
public class AmountType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "ISOCurrencyCode")
    protected String isoCurrencyCode;
    @XmlAttribute
    protected BigInteger monetaryUnit;
    @XmlAttribute(name = "NBBCode")
    protected String nbbCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the isoCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrencyCode() {
        return isoCurrencyCode;
    }

    /**
     * Sets the value of the isoCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrencyCode(String value) {
        this.isoCurrencyCode = value;
    }

    /**
     * Gets the value of the monetaryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonetaryUnit() {
        return monetaryUnit;
    }

    /**
     * Sets the value of the monetaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonetaryUnit(BigInteger value) {
        this.monetaryUnit = value;
    }

    /**
     * Gets the value of the nbbCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBBCode() {
        return nbbCode;
    }

    /**
     * Sets the value of the nbbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBBCode(String value) {
        this.nbbCode = value;
    }

}
