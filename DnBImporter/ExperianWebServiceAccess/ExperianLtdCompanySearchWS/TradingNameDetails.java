
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingNameDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingNameDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingNameDetails", propOrder = {
    "tradingName",
    "tradingIndicator"
})
public class TradingNameDetails {

    @XmlElement(name = "TradingName")
    protected String tradingName;
    @XmlElement(name = "TradingIndicator")
    protected String tradingIndicator;

    /**
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the tradingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingIndicator() {
        return tradingIndicator;
    }

    /**
     * Sets the value of the tradingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingIndicator(String value) {
        this.tradingIndicator = value;
    }

}
