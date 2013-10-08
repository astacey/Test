
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type holds the summary of latest financial information for the subject such as Profit, Loss, Turnover, Total Employees etc.
 * 
 * <p>Java class for FinancialsSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialStatementHeader" type="{http://gateway.dnb.com/getProduct}FinancialStatementHeaderType" minOccurs="0"/>
 *         &lt;element name="KeyFinancialInformation" type="{http://gateway.dnb.com/getProduct}KeyFinancialInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialsSummaryType", propOrder = {
    "financialStatementHeader",
    "keyFinancialInformation"
})
public class FinancialsSummaryType {

    @XmlElement(name = "FinancialStatementHeader")
    protected FinancialStatementHeaderType financialStatementHeader;
    @XmlElement(name = "KeyFinancialInformation")
    protected KeyFinancialInformationType keyFinancialInformation;

    /**
     * Gets the value of the financialStatementHeader property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialStatementHeaderType }
     *     
     */
    public FinancialStatementHeaderType getFinancialStatementHeader() {
        return financialStatementHeader;
    }

    /**
     * Sets the value of the financialStatementHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialStatementHeaderType }
     *     
     */
    public void setFinancialStatementHeader(FinancialStatementHeaderType value) {
        this.financialStatementHeader = value;
    }

    /**
     * Gets the value of the keyFinancialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType }
     *     
     */
    public KeyFinancialInformationType getKeyFinancialInformation() {
        return keyFinancialInformation;
    }

    /**
     * Sets the value of the keyFinancialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType }
     *     
     */
    public void setKeyFinancialInformation(KeyFinancialInformationType value) {
        this.keyFinancialInformation = value;
    }

}
