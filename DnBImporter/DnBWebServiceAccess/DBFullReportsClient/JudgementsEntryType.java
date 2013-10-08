
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JudgementsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JudgementsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisteredDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="NameQuoted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiledPartiesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FiledPartiesInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CourtInformation" type="{http://gateway.dnb.com/getProduct}CourtInformationType" minOccurs="0"/>
 *         &lt;element name="PlaintNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgmentAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SatisfiedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SatisfiedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JudgementsEntryType", propOrder = {
    "registeredDate",
    "nameQuoted",
    "filedPartiesInformation",
    "courtInformation",
    "plaintNumber",
    "judgmentType",
    "judgmentAmount",
    "satisfiedIndicator",
    "satisfiedDate"
})
public class JudgementsEntryType {

    @XmlElement(name = "RegisteredDate")
    protected DNBDate registeredDate;
    @XmlElement(name = "NameQuoted")
    protected String nameQuoted;
    @XmlElement(name = "FiledPartiesInformation")
    protected JudgementsEntryType.FiledPartiesInformation filedPartiesInformation;
    @XmlElement(name = "CourtInformation")
    protected CourtInformationType courtInformation;
    @XmlElement(name = "PlaintNumber")
    protected String plaintNumber;
    @XmlElement(name = "JudgmentType")
    protected String judgmentType;
    @XmlElement(name = "JudgmentAmount")
    protected AmountType judgmentAmount;
    @XmlElement(name = "SatisfiedIndicator")
    protected Boolean satisfiedIndicator;
    @XmlElement(name = "SatisfiedDate")
    protected DNBDate satisfiedDate;

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setRegisteredDate(DNBDate value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the nameQuoted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameQuoted() {
        return nameQuoted;
    }

    /**
     * Sets the value of the nameQuoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameQuoted(String value) {
        this.nameQuoted = value;
    }

    /**
     * Gets the value of the filedPartiesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JudgementsEntryType.FiledPartiesInformation }
     *     
     */
    public JudgementsEntryType.FiledPartiesInformation getFiledPartiesInformation() {
        return filedPartiesInformation;
    }

    /**
     * Sets the value of the filedPartiesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgementsEntryType.FiledPartiesInformation }
     *     
     */
    public void setFiledPartiesInformation(JudgementsEntryType.FiledPartiesInformation value) {
        this.filedPartiesInformation = value;
    }

    /**
     * Gets the value of the courtInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CourtInformationType }
     *     
     */
    public CourtInformationType getCourtInformation() {
        return courtInformation;
    }

    /**
     * Sets the value of the courtInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtInformationType }
     *     
     */
    public void setCourtInformation(CourtInformationType value) {
        this.courtInformation = value;
    }

    /**
     * Gets the value of the plaintNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaintNumber() {
        return plaintNumber;
    }

    /**
     * Sets the value of the plaintNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaintNumber(String value) {
        this.plaintNumber = value;
    }

    /**
     * Gets the value of the judgmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudgmentType() {
        return judgmentType;
    }

    /**
     * Sets the value of the judgmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudgmentType(String value) {
        this.judgmentType = value;
    }

    /**
     * Gets the value of the judgmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getJudgmentAmount() {
        return judgmentAmount;
    }

    /**
     * Sets the value of the judgmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setJudgmentAmount(AmountType value) {
        this.judgmentAmount = value;
    }

    /**
     * Gets the value of the satisfiedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatisfiedIndicator() {
        return satisfiedIndicator;
    }

    /**
     * Sets the value of the satisfiedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatisfiedIndicator(Boolean value) {
        this.satisfiedIndicator = value;
    }

    /**
     * Gets the value of the satisfiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getSatisfiedDate() {
        return satisfiedDate;
    }

    /**
     * Sets the value of the satisfiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setSatisfiedDate(DNBDate value) {
        this.satisfiedDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FiledPartiesInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "filedPartiesInformationEntry"
    })
    public static class FiledPartiesInformation {

        @XmlElement(name = "FiledPartiesInformationEntry", required = true)
        protected List<RolePlayerInformationType> filedPartiesInformationEntry;

        /**
         * Gets the value of the filedPartiesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filedPartiesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFiledPartiesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RolePlayerInformationType }
         * 
         * 
         */
        public List<RolePlayerInformationType> getFiledPartiesInformationEntry() {
            if (filedPartiesInformationEntry == null) {
                filedPartiesInformationEntry = new ArrayList<RolePlayerInformationType>();
            }
            return this.filedPartiesInformationEntry;
        }

    }

}
