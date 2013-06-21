
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JudgmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JudgmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JudgmentAgainst" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="TradingNameDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}TradeNameDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradingLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}NonLtdBusinessLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JudgmentDetails", propOrder = {
    "judgmentAgainst",
    "tradingNameDetails",
    "tradingLocation"
})
public class JudgmentDetails {

    @XmlElement(name = "JudgmentAgainst")
    protected ArrayOfString judgmentAgainst;
    @XmlElement(name = "TradingNameDetails")
    protected List<TradeNameDetail> tradingNameDetails;
    @XmlElement(name = "TradingLocation")
    protected NonLtdBusinessLocation tradingLocation;

    /**
     * Gets the value of the judgmentAgainst property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getJudgmentAgainst() {
        return judgmentAgainst;
    }

    /**
     * Sets the value of the judgmentAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setJudgmentAgainst(ArrayOfString value) {
        this.judgmentAgainst = value;
    }

    /**
     * Gets the value of the tradingNameDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingNameDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingNameDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeNameDetail }
     * 
     * 
     */
    public List<TradeNameDetail> getTradingNameDetails() {
        if (tradingNameDetails == null) {
            tradingNameDetails = new ArrayList<TradeNameDetail>();
        }
        return this.tradingNameDetails;
    }

    /**
     * Gets the value of the tradingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public NonLtdBusinessLocation getTradingLocation() {
        return tradingLocation;
    }

    /**
     * Sets the value of the tradingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public void setTradingLocation(NonLtdBusinessLocation value) {
        this.tradingLocation = value;
    }

}
