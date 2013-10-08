
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This type holds the header details pertaining to the financial statement of the subject.
 * 
 * <p>Java class for FinancialStatementHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialStatementHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="StatementConsolidatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StatementInterimIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StatementSourceReliability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementCurrency" type="{http://gateway.dnb.com/getProduct}ISOCurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="StatementMonetaryUnits" type="{http://gateway.dnb.com/getProduct}MonetaryUnitsType" minOccurs="0"/>
 *         &lt;element name="LatestAccountsFiledDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="LatestAccountsPublishedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="ObligatedFileAccountsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AuditQualificationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StatementTemplate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MonthsCovered" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ExemptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialStatementHeaderType", propOrder = {
    "statementDate",
    "statementConsolidatedIndicator",
    "statementInterimIndicator",
    "statementSourceReliability",
    "statementCurrency",
    "statementMonetaryUnits",
    "latestAccountsFiledDate",
    "latestAccountsPublishedDate",
    "obligatedFileAccountsIndicator",
    "auditQualificationIndicator",
    "statementTemplate",
    "monthsCovered",
    "exemptionCode",
    "approvalDate"
})
public class FinancialStatementHeaderType {

    @XmlElement(name = "StatementDate")
    protected DNBDate statementDate;
    @XmlElement(name = "StatementConsolidatedIndicator", defaultValue = "false")
    protected Boolean statementConsolidatedIndicator;
    @XmlElement(name = "StatementInterimIndicator")
    protected Boolean statementInterimIndicator;
    @XmlElement(name = "StatementSourceReliability")
    protected String statementSourceReliability;
    @XmlElement(name = "StatementCurrency")
    protected String statementCurrency;
    @XmlElement(name = "StatementMonetaryUnits")
    protected BigInteger statementMonetaryUnits;
    @XmlElement(name = "LatestAccountsFiledDate")
    protected DNBDate latestAccountsFiledDate;
    @XmlElement(name = "LatestAccountsPublishedDate")
    protected DNBDate latestAccountsPublishedDate;
    @XmlElement(name = "ObligatedFileAccountsIndicator", defaultValue = "false")
    protected Boolean obligatedFileAccountsIndicator;
    @XmlElement(name = "AuditQualificationIndicator")
    protected Boolean auditQualificationIndicator;
    @XmlElement(name = "StatementTemplate")
    protected FinancialStatementHeaderType.StatementTemplate statementTemplate;
    @XmlElement(name = "MonthsCovered")
    protected BigInteger monthsCovered;
    @XmlElement(name = "ExemptionCode")
    protected String exemptionCode;
    @XmlElement(name = "ApprovalDate")
    protected DNBDate approvalDate;

    /**
     * Gets the value of the statementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getStatementDate() {
        return statementDate;
    }

    /**
     * Sets the value of the statementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setStatementDate(DNBDate value) {
        this.statementDate = value;
    }

    /**
     * Gets the value of the statementConsolidatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatementConsolidatedIndicator() {
        return statementConsolidatedIndicator;
    }

    /**
     * Sets the value of the statementConsolidatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatementConsolidatedIndicator(Boolean value) {
        this.statementConsolidatedIndicator = value;
    }

    /**
     * Gets the value of the statementInterimIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatementInterimIndicator() {
        return statementInterimIndicator;
    }

    /**
     * Sets the value of the statementInterimIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatementInterimIndicator(Boolean value) {
        this.statementInterimIndicator = value;
    }

    /**
     * Gets the value of the statementSourceReliability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementSourceReliability() {
        return statementSourceReliability;
    }

    /**
     * Sets the value of the statementSourceReliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementSourceReliability(String value) {
        this.statementSourceReliability = value;
    }

    /**
     * Gets the value of the statementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementCurrency() {
        return statementCurrency;
    }

    /**
     * Sets the value of the statementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementCurrency(String value) {
        this.statementCurrency = value;
    }

    /**
     * Gets the value of the statementMonetaryUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatementMonetaryUnits() {
        return statementMonetaryUnits;
    }

    /**
     * Sets the value of the statementMonetaryUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatementMonetaryUnits(BigInteger value) {
        this.statementMonetaryUnits = value;
    }

    /**
     * Gets the value of the latestAccountsFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getLatestAccountsFiledDate() {
        return latestAccountsFiledDate;
    }

    /**
     * Sets the value of the latestAccountsFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setLatestAccountsFiledDate(DNBDate value) {
        this.latestAccountsFiledDate = value;
    }

    /**
     * Gets the value of the latestAccountsPublishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getLatestAccountsPublishedDate() {
        return latestAccountsPublishedDate;
    }

    /**
     * Sets the value of the latestAccountsPublishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setLatestAccountsPublishedDate(DNBDate value) {
        this.latestAccountsPublishedDate = value;
    }

    /**
     * Gets the value of the obligatedFileAccountsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligatedFileAccountsIndicator() {
        return obligatedFileAccountsIndicator;
    }

    /**
     * Sets the value of the obligatedFileAccountsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligatedFileAccountsIndicator(Boolean value) {
        this.obligatedFileAccountsIndicator = value;
    }

    /**
     * Gets the value of the auditQualificationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuditQualificationIndicator() {
        return auditQualificationIndicator;
    }

    /**
     * Sets the value of the auditQualificationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuditQualificationIndicator(Boolean value) {
        this.auditQualificationIndicator = value;
    }

    /**
     * Gets the value of the statementTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialStatementHeaderType.StatementTemplate }
     *     
     */
    public FinancialStatementHeaderType.StatementTemplate getStatementTemplate() {
        return statementTemplate;
    }

    /**
     * Sets the value of the statementTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialStatementHeaderType.StatementTemplate }
     *     
     */
    public void setStatementTemplate(FinancialStatementHeaderType.StatementTemplate value) {
        this.statementTemplate = value;
    }

    /**
     * Gets the value of the monthsCovered property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthsCovered() {
        return monthsCovered;
    }

    /**
     * Sets the value of the monthsCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthsCovered(BigInteger value) {
        this.monthsCovered = value;
    }

    /**
     * Gets the value of the exemptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionCode() {
        return exemptionCode;
    }

    /**
     * Sets the value of the exemptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionCode(String value) {
        this.exemptionCode = value;
    }

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setApprovalDate(DNBDate value) {
        this.approvalDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class StatementTemplate {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected BigInteger referenceCode;
        @XmlAttribute
        protected String referenceCodeTable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the referenceCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReferenceCode() {
            return referenceCode;
        }

        /**
         * Sets the value of the referenceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReferenceCode(BigInteger value) {
            this.referenceCode = value;
        }

        /**
         * Gets the value of the referenceCodeTable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceCodeTable() {
            return referenceCodeTable;
        }

        /**
         * Sets the value of the referenceCodeTable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceCodeTable(String value) {
            this.referenceCodeTable = value;
        }

    }

}
