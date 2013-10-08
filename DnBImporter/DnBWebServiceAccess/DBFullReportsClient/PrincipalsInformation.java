
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PrincipalsInformationOverview" type="{http://gateway.dnb.com/getProduct}PrincipalsInformationOverviewType" minOccurs="0"/>
 *         &lt;element name="CurrentPrincipalsInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrentPrincipalsInformationEntry" type="{http://gateway.dnb.com/getProduct}PrincipalsInformationEntryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreviousPrincipalsInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreviousPrincipalsInformationEntry" type="{http://gateway.dnb.com/getProduct}PrincipalsInformationEntryType" maxOccurs="unbounded"/>
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
@XmlType(name = "", propOrder = {
    "principalsInformationOverview",
    "currentPrincipalsInformation",
    "previousPrincipalsInformation"
})
@XmlRootElement(name = "PrincipalsInformation")
public class PrincipalsInformation {

    @XmlElement(name = "PrincipalsInformationOverview")
    protected PrincipalsInformationOverviewType principalsInformationOverview;
    @XmlElement(name = "CurrentPrincipalsInformation")
    protected PrincipalsInformation.CurrentPrincipalsInformation currentPrincipalsInformation;
    @XmlElement(name = "PreviousPrincipalsInformation")
    protected PrincipalsInformation.PreviousPrincipalsInformation previousPrincipalsInformation;

    /**
     * Gets the value of the principalsInformationOverview property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformationOverviewType }
     *     
     */
    public PrincipalsInformationOverviewType getPrincipalsInformationOverview() {
        return principalsInformationOverview;
    }

    /**
     * Sets the value of the principalsInformationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformationOverviewType }
     *     
     */
    public void setPrincipalsInformationOverview(PrincipalsInformationOverviewType value) {
        this.principalsInformationOverview = value;
    }

    /**
     * Gets the value of the currentPrincipalsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformation.CurrentPrincipalsInformation }
     *     
     */
    public PrincipalsInformation.CurrentPrincipalsInformation getCurrentPrincipalsInformation() {
        return currentPrincipalsInformation;
    }

    /**
     * Sets the value of the currentPrincipalsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformation.CurrentPrincipalsInformation }
     *     
     */
    public void setCurrentPrincipalsInformation(PrincipalsInformation.CurrentPrincipalsInformation value) {
        this.currentPrincipalsInformation = value;
    }

    /**
     * Gets the value of the previousPrincipalsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformation.PreviousPrincipalsInformation }
     *     
     */
    public PrincipalsInformation.PreviousPrincipalsInformation getPreviousPrincipalsInformation() {
        return previousPrincipalsInformation;
    }

    /**
     * Sets the value of the previousPrincipalsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformation.PreviousPrincipalsInformation }
     *     
     */
    public void setPreviousPrincipalsInformation(PrincipalsInformation.PreviousPrincipalsInformation value) {
        this.previousPrincipalsInformation = value;
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
     *         &lt;element name="CurrentPrincipalsInformationEntry" type="{http://gateway.dnb.com/getProduct}PrincipalsInformationEntryType" maxOccurs="unbounded"/>
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
        "currentPrincipalsInformationEntry"
    })
    public static class CurrentPrincipalsInformation {

        @XmlElement(name = "CurrentPrincipalsInformationEntry", required = true)
        protected List<PrincipalsInformationEntryType> currentPrincipalsInformationEntry;

        /**
         * Gets the value of the currentPrincipalsInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currentPrincipalsInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrentPrincipalsInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrincipalsInformationEntryType }
         * 
         * 
         */
        public List<PrincipalsInformationEntryType> getCurrentPrincipalsInformationEntry() {
            if (currentPrincipalsInformationEntry == null) {
                currentPrincipalsInformationEntry = new ArrayList<PrincipalsInformationEntryType>();
            }
            return this.currentPrincipalsInformationEntry;
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
     *         &lt;element name="PreviousPrincipalsInformationEntry" type="{http://gateway.dnb.com/getProduct}PrincipalsInformationEntryType" maxOccurs="unbounded"/>
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
        "previousPrincipalsInformationEntry"
    })
    public static class PreviousPrincipalsInformation {

        @XmlElement(name = "PreviousPrincipalsInformationEntry", required = true)
        protected List<PrincipalsInformationEntryType> previousPrincipalsInformationEntry;

        /**
         * Gets the value of the previousPrincipalsInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousPrincipalsInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousPrincipalsInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrincipalsInformationEntryType }
         * 
         * 
         */
        public List<PrincipalsInformationEntryType> getPreviousPrincipalsInformationEntry() {
            if (previousPrincipalsInformationEntry == null) {
                previousPrincipalsInformationEntry = new ArrayList<PrincipalsInformationEntryType>();
            }
            return this.previousPrincipalsInformationEntry;
        }

    }

}
