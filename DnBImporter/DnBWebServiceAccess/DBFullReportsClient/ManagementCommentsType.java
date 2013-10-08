
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementCommentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagementCommentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialComments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InterimFinancials" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InterimTurnover" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="InterimTurnoverPeriod" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="InterimProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="InterimProfitPeriod" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EstimatedFinancials" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EstimatedNetworth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="EstimatedTurnover" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="EstimatedTotalStock" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="EstimatedTotalAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RealEstatePropertiesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RealEstatePropertiesInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RealEstatePropertiesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="BuildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AdditonalDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RatingTrendComments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RatingTrendCommentsEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RatingTrendComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InsurersInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InsurersInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InsurerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehiclesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehiclesInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VehicleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VehicleRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalComments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalCommentsEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CommentInformationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CommentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="CommentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "ManagementCommentsType", propOrder = {
    "financialComments",
    "realEstatePropertiesInformation",
    "ratingTrendComments",
    "insurersInformation",
    "vehiclesInformation",
    "additionalComments"
})
public class ManagementCommentsType {

    @XmlElement(name = "FinancialComments")
    protected ManagementCommentsType.FinancialComments financialComments;
    @XmlElement(name = "RealEstatePropertiesInformation")
    protected ManagementCommentsType.RealEstatePropertiesInformation realEstatePropertiesInformation;
    @XmlElement(name = "RatingTrendComments")
    protected ManagementCommentsType.RatingTrendComments ratingTrendComments;
    @XmlElement(name = "InsurersInformation")
    protected ManagementCommentsType.InsurersInformation insurersInformation;
    @XmlElement(name = "VehiclesInformation")
    protected ManagementCommentsType.VehiclesInformation vehiclesInformation;
    @XmlElement(name = "AdditionalComments")
    protected ManagementCommentsType.AdditionalComments additionalComments;

    /**
     * Gets the value of the financialComments property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementCommentsType.FinancialComments }
     *     
     */
    public ManagementCommentsType.FinancialComments getFinancialComments() {
        return financialComments;
    }

    /**
     * Sets the value of the financialComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementCommentsType.FinancialComments }
     *     
     */
    public void setFinancialComments(ManagementCommentsType.FinancialComments value) {
        this.financialComments = value;
    }

    /**
     * Gets the value of the realEstatePropertiesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementCommentsType.RealEstatePropertiesInformation }
     *     
     */
    public ManagementCommentsType.RealEstatePropertiesInformation getRealEstatePropertiesInformation() {
        return realEstatePropertiesInformation;
    }

    /**
     * Sets the value of the realEstatePropertiesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementCommentsType.RealEstatePropertiesInformation }
     *     
     */
    public void setRealEstatePropertiesInformation(ManagementCommentsType.RealEstatePropertiesInformation value) {
        this.realEstatePropertiesInformation = value;
    }

    /**
     * Gets the value of the ratingTrendComments property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementCommentsType.RatingTrendComments }
     *     
     */
    public ManagementCommentsType.RatingTrendComments getRatingTrendComments() {
        return ratingTrendComments;
    }

    /**
     * Sets the value of the ratingTrendComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementCommentsType.RatingTrendComments }
     *     
     */
    public void setRatingTrendComments(ManagementCommentsType.RatingTrendComments value) {
        this.ratingTrendComments = value;
    }

    /**
     * Gets the value of the insurersInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementCommentsType.InsurersInformation }
     *     
     */
    public ManagementCommentsType.InsurersInformation getInsurersInformation() {
        return insurersInformation;
    }

    /**
     * Sets the value of the insurersInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementCommentsType.InsurersInformation }
     *     
     */
    public void setInsurersInformation(ManagementCommentsType.InsurersInformation value) {
        this.insurersInformation = value;
    }

    /**
     * Gets the value of the vehiclesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementCommentsType.VehiclesInformation }
     *     
     */
    public ManagementCommentsType.VehiclesInformation getVehiclesInformation() {
        return vehiclesInformation;
    }

    /**
     * Sets the value of the vehiclesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementCommentsType.VehiclesInformation }
     *     
     */
    public void setVehiclesInformation(ManagementCommentsType.VehiclesInformation value) {
        this.vehiclesInformation = value;
    }

    /**
     * Gets the value of the additionalComments property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementCommentsType.AdditionalComments }
     *     
     */
    public ManagementCommentsType.AdditionalComments getAdditionalComments() {
        return additionalComments;
    }

    /**
     * Sets the value of the additionalComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementCommentsType.AdditionalComments }
     *     
     */
    public void setAdditionalComments(ManagementCommentsType.AdditionalComments value) {
        this.additionalComments = value;
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
     *         &lt;element name="AdditionalCommentsEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CommentInformationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CommentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="CommentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "additionalCommentsEntry"
    })
    public static class AdditionalComments {

        @XmlElement(name = "AdditionalCommentsEntry", required = true)
        protected List<ManagementCommentsType.AdditionalComments.AdditionalCommentsEntry> additionalCommentsEntry;

        /**
         * Gets the value of the additionalCommentsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalCommentsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalCommentsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ManagementCommentsType.AdditionalComments.AdditionalCommentsEntry }
         * 
         * 
         */
        public List<ManagementCommentsType.AdditionalComments.AdditionalCommentsEntry> getAdditionalCommentsEntry() {
            if (additionalCommentsEntry == null) {
                additionalCommentsEntry = new ArrayList<ManagementCommentsType.AdditionalComments.AdditionalCommentsEntry>();
            }
            return this.additionalCommentsEntry;
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
         *         &lt;element name="CommentInformationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CommentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="CommentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "commentInformationType",
            "commentDate",
            "commentStatus",
            "comment",
            "businessContactPerson"
        })
        public static class AdditionalCommentsEntry {

            @XmlElement(name = "CommentInformationType")
            protected String commentInformationType;
            @XmlElement(name = "CommentDate")
            protected DNBDate commentDate;
            @XmlElement(name = "CommentStatus")
            protected String commentStatus;
            @XmlElement(name = "Comment")
            protected String comment;
            @XmlElement(name = "BusinessContactPerson")
            protected String businessContactPerson;

            /**
             * Gets the value of the commentInformationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommentInformationType() {
                return commentInformationType;
            }

            /**
             * Sets the value of the commentInformationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommentInformationType(String value) {
                this.commentInformationType = value;
            }

            /**
             * Gets the value of the commentDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getCommentDate() {
                return commentDate;
            }

            /**
             * Sets the value of the commentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setCommentDate(DNBDate value) {
                this.commentDate = value;
            }

            /**
             * Gets the value of the commentStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCommentStatus() {
                return commentStatus;
            }

            /**
             * Sets the value of the commentStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCommentStatus(String value) {
                this.commentStatus = value;
            }

            /**
             * Gets the value of the comment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComment() {
                return comment;
            }

            /**
             * Sets the value of the comment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComment(String value) {
                this.comment = value;
            }

            /**
             * Gets the value of the businessContactPerson property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessContactPerson() {
                return businessContactPerson;
            }

            /**
             * Sets the value of the businessContactPerson property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessContactPerson(String value) {
                this.businessContactPerson = value;
            }

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
     *         &lt;element name="InterimFinancials" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InterimTurnover" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="InterimTurnoverPeriod" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="InterimProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="InterimProfitPeriod" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EstimatedFinancials" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EstimatedNetworth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="EstimatedTurnover" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="EstimatedTotalStock" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="EstimatedTotalAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "interimFinancials",
        "estimatedFinancials"
    })
    public static class FinancialComments {

        @XmlElement(name = "InterimFinancials")
        protected ManagementCommentsType.FinancialComments.InterimFinancials interimFinancials;
        @XmlElement(name = "EstimatedFinancials")
        protected ManagementCommentsType.FinancialComments.EstimatedFinancials estimatedFinancials;

        /**
         * Gets the value of the interimFinancials property.
         * 
         * @return
         *     possible object is
         *     {@link ManagementCommentsType.FinancialComments.InterimFinancials }
         *     
         */
        public ManagementCommentsType.FinancialComments.InterimFinancials getInterimFinancials() {
            return interimFinancials;
        }

        /**
         * Sets the value of the interimFinancials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ManagementCommentsType.FinancialComments.InterimFinancials }
         *     
         */
        public void setInterimFinancials(ManagementCommentsType.FinancialComments.InterimFinancials value) {
            this.interimFinancials = value;
        }

        /**
         * Gets the value of the estimatedFinancials property.
         * 
         * @return
         *     possible object is
         *     {@link ManagementCommentsType.FinancialComments.EstimatedFinancials }
         *     
         */
        public ManagementCommentsType.FinancialComments.EstimatedFinancials getEstimatedFinancials() {
            return estimatedFinancials;
        }

        /**
         * Sets the value of the estimatedFinancials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ManagementCommentsType.FinancialComments.EstimatedFinancials }
         *     
         */
        public void setEstimatedFinancials(ManagementCommentsType.FinancialComments.EstimatedFinancials value) {
            this.estimatedFinancials = value;
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
         *         &lt;element name="EstimatedNetworth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="EstimatedTurnover" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="EstimatedTotalStock" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="EstimatedTotalAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "estimatedNetworth",
            "estimatedTurnover",
            "estimatedTotalStock",
            "estimatedTotalAssets",
            "businessContactPerson"
        })
        public static class EstimatedFinancials {

            @XmlElement(name = "EstimatedNetworth")
            protected AmountType estimatedNetworth;
            @XmlElement(name = "EstimatedTurnover")
            protected AmountType estimatedTurnover;
            @XmlElement(name = "EstimatedTotalStock")
            protected AmountType estimatedTotalStock;
            @XmlElement(name = "EstimatedTotalAssets")
            protected AmountType estimatedTotalAssets;
            @XmlElement(name = "BusinessContactPerson")
            protected String businessContactPerson;

            /**
             * Gets the value of the estimatedNetworth property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getEstimatedNetworth() {
                return estimatedNetworth;
            }

            /**
             * Sets the value of the estimatedNetworth property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setEstimatedNetworth(AmountType value) {
                this.estimatedNetworth = value;
            }

            /**
             * Gets the value of the estimatedTurnover property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getEstimatedTurnover() {
                return estimatedTurnover;
            }

            /**
             * Sets the value of the estimatedTurnover property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setEstimatedTurnover(AmountType value) {
                this.estimatedTurnover = value;
            }

            /**
             * Gets the value of the estimatedTotalStock property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getEstimatedTotalStock() {
                return estimatedTotalStock;
            }

            /**
             * Sets the value of the estimatedTotalStock property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setEstimatedTotalStock(AmountType value) {
                this.estimatedTotalStock = value;
            }

            /**
             * Gets the value of the estimatedTotalAssets property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getEstimatedTotalAssets() {
                return estimatedTotalAssets;
            }

            /**
             * Sets the value of the estimatedTotalAssets property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setEstimatedTotalAssets(AmountType value) {
                this.estimatedTotalAssets = value;
            }

            /**
             * Gets the value of the businessContactPerson property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessContactPerson() {
                return businessContactPerson;
            }

            /**
             * Sets the value of the businessContactPerson property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessContactPerson(String value) {
                this.businessContactPerson = value;
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
         *         &lt;element name="InterimTurnover" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="InterimTurnoverPeriod" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="InterimProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="InterimProfitPeriod" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "interimTurnover",
            "interimTurnoverPeriod",
            "interimProfit",
            "interimProfitPeriod",
            "businessContactPerson"
        })
        public static class InterimFinancials {

            @XmlElement(name = "InterimTurnover")
            protected AmountType interimTurnover;
            @XmlElement(name = "InterimTurnoverPeriod")
            protected DNBDate interimTurnoverPeriod;
            @XmlElement(name = "InterimProfit")
            protected AmountType interimProfit;
            @XmlElement(name = "InterimProfitPeriod")
            protected DNBDate interimProfitPeriod;
            @XmlElement(name = "BusinessContactPerson")
            protected String businessContactPerson;

            /**
             * Gets the value of the interimTurnover property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getInterimTurnover() {
                return interimTurnover;
            }

            /**
             * Sets the value of the interimTurnover property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setInterimTurnover(AmountType value) {
                this.interimTurnover = value;
            }

            /**
             * Gets the value of the interimTurnoverPeriod property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getInterimTurnoverPeriod() {
                return interimTurnoverPeriod;
            }

            /**
             * Sets the value of the interimTurnoverPeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setInterimTurnoverPeriod(DNBDate value) {
                this.interimTurnoverPeriod = value;
            }

            /**
             * Gets the value of the interimProfit property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getInterimProfit() {
                return interimProfit;
            }

            /**
             * Sets the value of the interimProfit property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setInterimProfit(AmountType value) {
                this.interimProfit = value;
            }

            /**
             * Gets the value of the interimProfitPeriod property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getInterimProfitPeriod() {
                return interimProfitPeriod;
            }

            /**
             * Sets the value of the interimProfitPeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setInterimProfitPeriod(DNBDate value) {
                this.interimProfitPeriod = value;
            }

            /**
             * Gets the value of the businessContactPerson property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessContactPerson() {
                return businessContactPerson;
            }

            /**
             * Sets the value of the businessContactPerson property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessContactPerson(String value) {
                this.businessContactPerson = value;
            }

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
     *         &lt;element name="InsurersInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InsurerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "insurersInformationEntry"
    })
    public static class InsurersInformation {

        @XmlElement(name = "InsurersInformationEntry", required = true)
        protected List<ManagementCommentsType.InsurersInformation.InsurersInformationEntry> insurersInformationEntry;

        /**
         * Gets the value of the insurersInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the insurersInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInsurersInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ManagementCommentsType.InsurersInformation.InsurersInformationEntry }
         * 
         * 
         */
        public List<ManagementCommentsType.InsurersInformation.InsurersInformationEntry> getInsurersInformationEntry() {
            if (insurersInformationEntry == null) {
                insurersInformationEntry = new ArrayList<ManagementCommentsType.InsurersInformation.InsurersInformationEntry>();
            }
            return this.insurersInformationEntry;
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
         *         &lt;element name="InsurerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "insurerName"
        })
        public static class InsurersInformationEntry {

            @XmlElement(name = "InsurerName", required = true)
            protected String insurerName;

            /**
             * Gets the value of the insurerName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsurerName() {
                return insurerName;
            }

            /**
             * Sets the value of the insurerName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsurerName(String value) {
                this.insurerName = value;
            }

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
     *         &lt;element name="RatingTrendCommentsEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RatingTrendComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "ratingTrendCommentsEntry"
    })
    public static class RatingTrendComments {

        @XmlElement(name = "RatingTrendCommentsEntry", required = true)
        protected List<ManagementCommentsType.RatingTrendComments.RatingTrendCommentsEntry> ratingTrendCommentsEntry;

        /**
         * Gets the value of the ratingTrendCommentsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ratingTrendCommentsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRatingTrendCommentsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ManagementCommentsType.RatingTrendComments.RatingTrendCommentsEntry }
         * 
         * 
         */
        public List<ManagementCommentsType.RatingTrendComments.RatingTrendCommentsEntry> getRatingTrendCommentsEntry() {
            if (ratingTrendCommentsEntry == null) {
                ratingTrendCommentsEntry = new ArrayList<ManagementCommentsType.RatingTrendComments.RatingTrendCommentsEntry>();
            }
            return this.ratingTrendCommentsEntry;
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
         *         &lt;element name="RatingTrendComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "ratingTrendComment"
        })
        public static class RatingTrendCommentsEntry {

            @XmlElement(name = "RatingTrendComment", required = true)
            protected String ratingTrendComment;

            /**
             * Gets the value of the ratingTrendComment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRatingTrendComment() {
                return ratingTrendComment;
            }

            /**
             * Sets the value of the ratingTrendComment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRatingTrendComment(String value) {
                this.ratingTrendComment = value;
            }

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
     *         &lt;element name="RealEstatePropertiesInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RealEstatePropertiesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="BuildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AdditonalDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "realEstatePropertiesInformationEntry"
    })
    public static class RealEstatePropertiesInformation {

        @XmlElement(name = "RealEstatePropertiesInformationEntry", required = true)
        protected List<ManagementCommentsType.RealEstatePropertiesInformation.RealEstatePropertiesInformationEntry> realEstatePropertiesInformationEntry;

        /**
         * Gets the value of the realEstatePropertiesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the realEstatePropertiesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRealEstatePropertiesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ManagementCommentsType.RealEstatePropertiesInformation.RealEstatePropertiesInformationEntry }
         * 
         * 
         */
        public List<ManagementCommentsType.RealEstatePropertiesInformation.RealEstatePropertiesInformationEntry> getRealEstatePropertiesInformationEntry() {
            if (realEstatePropertiesInformationEntry == null) {
                realEstatePropertiesInformationEntry = new ArrayList<ManagementCommentsType.RealEstatePropertiesInformation.RealEstatePropertiesInformationEntry>();
            }
            return this.realEstatePropertiesInformationEntry;
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
         *         &lt;element name="RealEstatePropertiesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="BuildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AdditonalDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BusinessContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "realEstatePropertiesIndicator",
            "buildingName",
            "ownerName",
            "additonalDetail",
            "businessContactPerson"
        })
        public static class RealEstatePropertiesInformationEntry {

            @XmlElement(name = "RealEstatePropertiesIndicator")
            protected Boolean realEstatePropertiesIndicator;
            @XmlElement(name = "BuildingName")
            protected String buildingName;
            @XmlElement(name = "OwnerName")
            protected String ownerName;
            @XmlElement(name = "AdditonalDetail")
            protected String additonalDetail;
            @XmlElement(name = "BusinessContactPerson")
            protected String businessContactPerson;

            /**
             * Gets the value of the realEstatePropertiesIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRealEstatePropertiesIndicator() {
                return realEstatePropertiesIndicator;
            }

            /**
             * Sets the value of the realEstatePropertiesIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRealEstatePropertiesIndicator(Boolean value) {
                this.realEstatePropertiesIndicator = value;
            }

            /**
             * Gets the value of the buildingName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildingName() {
                return buildingName;
            }

            /**
             * Sets the value of the buildingName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuildingName(String value) {
                this.buildingName = value;
            }

            /**
             * Gets the value of the ownerName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerName() {
                return ownerName;
            }

            /**
             * Sets the value of the ownerName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerName(String value) {
                this.ownerName = value;
            }

            /**
             * Gets the value of the additonalDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditonalDetail() {
                return additonalDetail;
            }

            /**
             * Sets the value of the additonalDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditonalDetail(String value) {
                this.additonalDetail = value;
            }

            /**
             * Gets the value of the businessContactPerson property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessContactPerson() {
                return businessContactPerson;
            }

            /**
             * Sets the value of the businessContactPerson property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessContactPerson(String value) {
                this.businessContactPerson = value;
            }

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
     *         &lt;element name="VehiclesInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VehicleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VehicleRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "vehiclesInformationEntry"
    })
    public static class VehiclesInformation {

        @XmlElement(name = "VehiclesInformationEntry", required = true)
        protected List<ManagementCommentsType.VehiclesInformation.VehiclesInformationEntry> vehiclesInformationEntry;

        /**
         * Gets the value of the vehiclesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehiclesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehiclesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ManagementCommentsType.VehiclesInformation.VehiclesInformationEntry }
         * 
         * 
         */
        public List<ManagementCommentsType.VehiclesInformation.VehiclesInformationEntry> getVehiclesInformationEntry() {
            if (vehiclesInformationEntry == null) {
                vehiclesInformationEntry = new ArrayList<ManagementCommentsType.VehiclesInformation.VehiclesInformationEntry>();
            }
            return this.vehiclesInformationEntry;
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
         *         &lt;element name="VehicleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VehicleRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "vehicleName",
            "vehicleRegistrationNumber"
        })
        public static class VehiclesInformationEntry {

            @XmlElement(name = "VehicleName")
            protected String vehicleName;
            @XmlElement(name = "VehicleRegistrationNumber")
            protected String vehicleRegistrationNumber;

            /**
             * Gets the value of the vehicleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehicleName() {
                return vehicleName;
            }

            /**
             * Sets the value of the vehicleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehicleName(String value) {
                this.vehicleName = value;
            }

            /**
             * Gets the value of the vehicleRegistrationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehicleRegistrationNumber() {
                return vehicleRegistrationNumber;
            }

            /**
             * Sets the value of the vehicleRegistrationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehicleRegistrationNumber(String value) {
                this.vehicleRegistrationNumber = value;
            }

        }

    }

}
