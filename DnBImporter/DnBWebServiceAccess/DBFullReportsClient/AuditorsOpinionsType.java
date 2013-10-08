
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditorsOpinionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditorsOpinionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuditQualificationsEntry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AuditQualification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AuditorsNameEntry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AuditorsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AuditorsOpinionEntry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AuditorsOpinion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditorsOpinionsType", propOrder = {
    "auditQualificationsEntry",
    "auditorsNameEntry",
    "auditorsOpinionEntry"
})
public class AuditorsOpinionsType {

    @XmlElement(name = "AuditQualificationsEntry")
    protected List<AuditorsOpinionsType.AuditQualificationsEntry> auditQualificationsEntry;
    @XmlElement(name = "AuditorsNameEntry")
    protected List<AuditorsOpinionsType.AuditorsNameEntry> auditorsNameEntry;
    @XmlElement(name = "AuditorsOpinionEntry")
    protected List<AuditorsOpinionsType.AuditorsOpinionEntry> auditorsOpinionEntry;

    /**
     * Gets the value of the auditQualificationsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditQualificationsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditQualificationsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditorsOpinionsType.AuditQualificationsEntry }
     * 
     * 
     */
    public List<AuditorsOpinionsType.AuditQualificationsEntry> getAuditQualificationsEntry() {
        if (auditQualificationsEntry == null) {
            auditQualificationsEntry = new ArrayList<AuditorsOpinionsType.AuditQualificationsEntry>();
        }
        return this.auditQualificationsEntry;
    }

    /**
     * Gets the value of the auditorsNameEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditorsNameEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditorsNameEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditorsOpinionsType.AuditorsNameEntry }
     * 
     * 
     */
    public List<AuditorsOpinionsType.AuditorsNameEntry> getAuditorsNameEntry() {
        if (auditorsNameEntry == null) {
            auditorsNameEntry = new ArrayList<AuditorsOpinionsType.AuditorsNameEntry>();
        }
        return this.auditorsNameEntry;
    }

    /**
     * Gets the value of the auditorsOpinionEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditorsOpinionEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditorsOpinionEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditorsOpinionsType.AuditorsOpinionEntry }
     * 
     * 
     */
    public List<AuditorsOpinionsType.AuditorsOpinionEntry> getAuditorsOpinionEntry() {
        if (auditorsOpinionEntry == null) {
            auditorsOpinionEntry = new ArrayList<AuditorsOpinionsType.AuditorsOpinionEntry>();
        }
        return this.auditorsOpinionEntry;
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
     *         &lt;element name="AuditorsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "auditorsName"
    })
    public static class AuditorsNameEntry {

        @XmlElement(name = "AuditorsName", required = true)
        protected String auditorsName;

        /**
         * Gets the value of the auditorsName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuditorsName() {
            return auditorsName;
        }

        /**
         * Sets the value of the auditorsName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuditorsName(String value) {
            this.auditorsName = value;
        }

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
     *         &lt;element name="AuditorsOpinion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "auditorsOpinion"
    })
    public static class AuditorsOpinionEntry {

        @XmlElement(name = "AuditorsOpinion", required = true)
        protected String auditorsOpinion;

        /**
         * Gets the value of the auditorsOpinion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuditorsOpinion() {
            return auditorsOpinion;
        }

        /**
         * Sets the value of the auditorsOpinion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuditorsOpinion(String value) {
            this.auditorsOpinion = value;
        }

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
     *         &lt;element name="AuditQualification" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "auditQualification"
    })
    public static class AuditQualificationsEntry {

        @XmlElement(name = "AuditQualification", required = true)
        protected String auditQualification;

        /**
         * Gets the value of the auditQualification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuditQualification() {
            return auditQualification;
        }

        /**
         * Sets the value of the auditQualification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuditQualification(String value) {
            this.auditQualification = value;
        }

    }

}
