
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="RecordHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RequestDUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
 *                   &lt;element name="RequestCountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType" minOccurs="0"/>
 *                   &lt;element name="RequestLanguageCode" type="{http://gateway.dnb.com/getProduct}ISOLanguageCodeType" minOccurs="0"/>
 *                   &lt;element name="RequestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="RecordCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="StopDistributionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="SubjectInformationUpdateDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                   &lt;element name="RecordStatusNotification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ValidRecordIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="ErrorReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ErrorSeverityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RequestedSectionsAvailability" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CompanySummaryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="IdentificationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="PaymentInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="PredictiveScoresAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="SpecialEventsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="CorporateLinkagesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="PrincipalsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="OperationsandHistoryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="PublicFilingsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="FinancialsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="RecordPayload" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}CompanySummary" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="Identification" type="{http://gateway.dnb.com/getProduct}IdentificationType" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}PaymentInformation" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}PredictiveScores" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}SpecialEvents" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}CorporateLinkages" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}PrincipalsInformation" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}OperationsandHistory" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}PublicFilings" minOccurs="0"/>
 *                     &lt;element ref="{http://gateway.dnb.com/getProduct}Financials" minOccurs="0"/>
 *                   &lt;/sequence>
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
    "recordHeader",
    "recordPayload"
})
@XmlRootElement(name = "CCDP")
public class CCDP {

    @XmlElement(name = "RecordHeader", required = true)
    protected CCDP.RecordHeader recordHeader;
    @XmlElement(name = "RecordPayload")
    protected CCDP.RecordPayload recordPayload;

    /**
     * Gets the value of the recordHeader property.
     * 
     * @return
     *     possible object is
     *     {@link CCDP.RecordHeader }
     *     
     */
    public CCDP.RecordHeader getRecordHeader() {
        return recordHeader;
    }

    /**
     * Sets the value of the recordHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDP.RecordHeader }
     *     
     */
    public void setRecordHeader(CCDP.RecordHeader value) {
        this.recordHeader = value;
    }

    /**
     * Gets the value of the recordPayload property.
     * 
     * @return
     *     possible object is
     *     {@link CCDP.RecordPayload }
     *     
     */
    public CCDP.RecordPayload getRecordPayload() {
        return recordPayload;
    }

    /**
     * Sets the value of the recordPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDP.RecordPayload }
     *     
     */
    public void setRecordPayload(CCDP.RecordPayload value) {
        this.recordPayload = value;
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
     *         &lt;element name="RequestTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RequestDUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
     *         &lt;element name="RequestCountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType" minOccurs="0"/>
     *         &lt;element name="RequestLanguageCode" type="{http://gateway.dnb.com/getProduct}ISOLanguageCodeType" minOccurs="0"/>
     *         &lt;element name="RequestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="RecordCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="StopDistributionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="SubjectInformationUpdateDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *         &lt;element name="RecordStatusNotification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ValidRecordIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="ErrorReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ErrorSeverityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RequestedSectionsAvailability" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CompanySummaryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="IdentificationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="PaymentInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="PredictiveScoresAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="SpecialEventsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="CorporateLinkagesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="PrincipalsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="OperationsandHistoryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="PublicFilingsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="FinancialsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "requestTransactionID",
        "requestDUNSNumber",
        "requestCountryCode",
        "requestLanguageCode",
        "requestDateTime",
        "recordCreationDateTime",
        "stopDistributionIndicator",
        "subjectInformationUpdateDate",
        "recordStatusNotification"
    })
    public static class RecordHeader {

        @XmlElement(name = "RequestTransactionID")
        protected String requestTransactionID;
        @XmlElement(name = "RequestDUNSNumber")
        protected BigInteger requestDUNSNumber;
        @XmlElement(name = "RequestCountryCode")
        protected String requestCountryCode;
        @XmlElement(name = "RequestLanguageCode")
        protected ISOLanguageCodeType requestLanguageCode;
        @XmlElement(name = "RequestDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar requestDateTime;
        @XmlElement(name = "RecordCreationDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar recordCreationDateTime;
        @XmlElement(name = "StopDistributionIndicator", defaultValue = "false")
        protected Boolean stopDistributionIndicator;
        @XmlElement(name = "SubjectInformationUpdateDate")
        protected DNBDate subjectInformationUpdateDate;
        @XmlElement(name = "RecordStatusNotification")
        protected CCDP.RecordHeader.RecordStatusNotification recordStatusNotification;

        /**
         * Gets the value of the requestTransactionID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestTransactionID() {
            return requestTransactionID;
        }

        /**
         * Sets the value of the requestTransactionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestTransactionID(String value) {
            this.requestTransactionID = value;
        }

        /**
         * Gets the value of the requestDUNSNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRequestDUNSNumber() {
            return requestDUNSNumber;
        }

        /**
         * Sets the value of the requestDUNSNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRequestDUNSNumber(BigInteger value) {
            this.requestDUNSNumber = value;
        }

        /**
         * Gets the value of the requestCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestCountryCode() {
            return requestCountryCode;
        }

        /**
         * Sets the value of the requestCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestCountryCode(String value) {
            this.requestCountryCode = value;
        }

        /**
         * Gets the value of the requestLanguageCode property.
         * 
         * @return
         *     possible object is
         *     {@link ISOLanguageCodeType }
         *     
         */
        public ISOLanguageCodeType getRequestLanguageCode() {
            return requestLanguageCode;
        }

        /**
         * Sets the value of the requestLanguageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ISOLanguageCodeType }
         *     
         */
        public void setRequestLanguageCode(ISOLanguageCodeType value) {
            this.requestLanguageCode = value;
        }

        /**
         * Gets the value of the requestDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRequestDateTime() {
            return requestDateTime;
        }

        /**
         * Sets the value of the requestDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRequestDateTime(XMLGregorianCalendar value) {
            this.requestDateTime = value;
        }

        /**
         * Gets the value of the recordCreationDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRecordCreationDateTime() {
            return recordCreationDateTime;
        }

        /**
         * Sets the value of the recordCreationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRecordCreationDateTime(XMLGregorianCalendar value) {
            this.recordCreationDateTime = value;
        }

        /**
         * Gets the value of the stopDistributionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStopDistributionIndicator() {
            return stopDistributionIndicator;
        }

        /**
         * Sets the value of the stopDistributionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStopDistributionIndicator(Boolean value) {
            this.stopDistributionIndicator = value;
        }

        /**
         * Gets the value of the subjectInformationUpdateDate property.
         * 
         * @return
         *     possible object is
         *     {@link DNBDate }
         *     
         */
        public DNBDate getSubjectInformationUpdateDate() {
            return subjectInformationUpdateDate;
        }

        /**
         * Sets the value of the subjectInformationUpdateDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DNBDate }
         *     
         */
        public void setSubjectInformationUpdateDate(DNBDate value) {
            this.subjectInformationUpdateDate = value;
        }

        /**
         * Gets the value of the recordStatusNotification property.
         * 
         * @return
         *     possible object is
         *     {@link CCDP.RecordHeader.RecordStatusNotification }
         *     
         */
        public CCDP.RecordHeader.RecordStatusNotification getRecordStatusNotification() {
            return recordStatusNotification;
        }

        /**
         * Sets the value of the recordStatusNotification property.
         * 
         * @param value
         *     allowed object is
         *     {@link CCDP.RecordHeader.RecordStatusNotification }
         *     
         */
        public void setRecordStatusNotification(CCDP.RecordHeader.RecordStatusNotification value) {
            this.recordStatusNotification = value;
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
         *         &lt;element name="ValidRecordIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="ErrorReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ErrorSeverityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RequestedSectionsAvailability" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CompanySummaryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="IdentificationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="PaymentInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="PredictiveScoresAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="SpecialEventsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="CorporateLinkagesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="PrincipalsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="OperationsandHistoryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="PublicFilingsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="FinancialsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "validRecordIndicator",
            "errorReasonCode",
            "errorSeverityCode",
            "requestedSectionsAvailability"
        })
        public static class RecordStatusNotification {

            @XmlElement(name = "ValidRecordIndicator")
            protected boolean validRecordIndicator;
            @XmlElement(name = "ErrorReasonCode")
            protected String errorReasonCode;
            @XmlElement(name = "ErrorSeverityCode")
            protected String errorSeverityCode;
            @XmlElement(name = "RequestedSectionsAvailability")
            protected CCDP.RecordHeader.RecordStatusNotification.RequestedSectionsAvailability requestedSectionsAvailability;

            /**
             * Gets the value of the validRecordIndicator property.
             * 
             */
            public boolean isValidRecordIndicator() {
                return validRecordIndicator;
            }

            /**
             * Sets the value of the validRecordIndicator property.
             * 
             */
            public void setValidRecordIndicator(boolean value) {
                this.validRecordIndicator = value;
            }

            /**
             * Gets the value of the errorReasonCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorReasonCode() {
                return errorReasonCode;
            }

            /**
             * Sets the value of the errorReasonCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorReasonCode(String value) {
                this.errorReasonCode = value;
            }

            /**
             * Gets the value of the errorSeverityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorSeverityCode() {
                return errorSeverityCode;
            }

            /**
             * Sets the value of the errorSeverityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorSeverityCode(String value) {
                this.errorSeverityCode = value;
            }

            /**
             * Gets the value of the requestedSectionsAvailability property.
             * 
             * @return
             *     possible object is
             *     {@link CCDP.RecordHeader.RecordStatusNotification.RequestedSectionsAvailability }
             *     
             */
            public CCDP.RecordHeader.RecordStatusNotification.RequestedSectionsAvailability getRequestedSectionsAvailability() {
                return requestedSectionsAvailability;
            }

            /**
             * Sets the value of the requestedSectionsAvailability property.
             * 
             * @param value
             *     allowed object is
             *     {@link CCDP.RecordHeader.RecordStatusNotification.RequestedSectionsAvailability }
             *     
             */
            public void setRequestedSectionsAvailability(CCDP.RecordHeader.RecordStatusNotification.RequestedSectionsAvailability value) {
                this.requestedSectionsAvailability = value;
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
             *         &lt;element name="CompanySummaryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="IdentificationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="PaymentInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="PredictiveScoresAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="SpecialEventsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="CorporateLinkagesAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="PrincipalsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="OperationsandHistoryAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="PublicFilingsAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="FinancialsInformationAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "companySummaryAvailabilityIndicator",
                "identificationAvailabilityIndicator",
                "paymentInformationAvailabilityIndicator",
                "predictiveScoresAvailabilityIndicator",
                "specialEventsAvailabilityIndicator",
                "corporateLinkagesAvailabilityIndicator",
                "principalsInformationAvailabilityIndicator",
                "operationsandHistoryAvailabilityIndicator",
                "publicFilingsAvailabilityIndicator",
                "financialsInformationAvailabilityIndicator"
            })
            public static class RequestedSectionsAvailability {

                @XmlElement(name = "CompanySummaryAvailabilityIndicator")
                protected Boolean companySummaryAvailabilityIndicator;
                @XmlElement(name = "IdentificationAvailabilityIndicator")
                protected Boolean identificationAvailabilityIndicator;
                @XmlElement(name = "PaymentInformationAvailabilityIndicator")
                protected Boolean paymentInformationAvailabilityIndicator;
                @XmlElement(name = "PredictiveScoresAvailabilityIndicator")
                protected Boolean predictiveScoresAvailabilityIndicator;
                @XmlElement(name = "SpecialEventsAvailabilityIndicator")
                protected Boolean specialEventsAvailabilityIndicator;
                @XmlElement(name = "CorporateLinkagesAvailabilityIndicator")
                protected Boolean corporateLinkagesAvailabilityIndicator;
                @XmlElement(name = "PrincipalsInformationAvailabilityIndicator")
                protected Boolean principalsInformationAvailabilityIndicator;
                @XmlElement(name = "OperationsandHistoryAvailabilityIndicator")
                protected Boolean operationsandHistoryAvailabilityIndicator;
                @XmlElement(name = "PublicFilingsAvailabilityIndicator")
                protected Boolean publicFilingsAvailabilityIndicator;
                @XmlElement(name = "FinancialsInformationAvailabilityIndicator")
                protected Boolean financialsInformationAvailabilityIndicator;

                /**
                 * Gets the value of the companySummaryAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isCompanySummaryAvailabilityIndicator() {
                    return companySummaryAvailabilityIndicator;
                }

                /**
                 * Sets the value of the companySummaryAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setCompanySummaryAvailabilityIndicator(Boolean value) {
                    this.companySummaryAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the identificationAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isIdentificationAvailabilityIndicator() {
                    return identificationAvailabilityIndicator;
                }

                /**
                 * Sets the value of the identificationAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIdentificationAvailabilityIndicator(Boolean value) {
                    this.identificationAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the paymentInformationAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPaymentInformationAvailabilityIndicator() {
                    return paymentInformationAvailabilityIndicator;
                }

                /**
                 * Sets the value of the paymentInformationAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPaymentInformationAvailabilityIndicator(Boolean value) {
                    this.paymentInformationAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the predictiveScoresAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPredictiveScoresAvailabilityIndicator() {
                    return predictiveScoresAvailabilityIndicator;
                }

                /**
                 * Sets the value of the predictiveScoresAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPredictiveScoresAvailabilityIndicator(Boolean value) {
                    this.predictiveScoresAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the specialEventsAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSpecialEventsAvailabilityIndicator() {
                    return specialEventsAvailabilityIndicator;
                }

                /**
                 * Sets the value of the specialEventsAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSpecialEventsAvailabilityIndicator(Boolean value) {
                    this.specialEventsAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the corporateLinkagesAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isCorporateLinkagesAvailabilityIndicator() {
                    return corporateLinkagesAvailabilityIndicator;
                }

                /**
                 * Sets the value of the corporateLinkagesAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setCorporateLinkagesAvailabilityIndicator(Boolean value) {
                    this.corporateLinkagesAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the principalsInformationAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPrincipalsInformationAvailabilityIndicator() {
                    return principalsInformationAvailabilityIndicator;
                }

                /**
                 * Sets the value of the principalsInformationAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPrincipalsInformationAvailabilityIndicator(Boolean value) {
                    this.principalsInformationAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the operationsandHistoryAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isOperationsandHistoryAvailabilityIndicator() {
                    return operationsandHistoryAvailabilityIndicator;
                }

                /**
                 * Sets the value of the operationsandHistoryAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setOperationsandHistoryAvailabilityIndicator(Boolean value) {
                    this.operationsandHistoryAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the publicFilingsAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPublicFilingsAvailabilityIndicator() {
                    return publicFilingsAvailabilityIndicator;
                }

                /**
                 * Sets the value of the publicFilingsAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPublicFilingsAvailabilityIndicator(Boolean value) {
                    this.publicFilingsAvailabilityIndicator = value;
                }

                /**
                 * Gets the value of the financialsInformationAvailabilityIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isFinancialsInformationAvailabilityIndicator() {
                    return financialsInformationAvailabilityIndicator;
                }

                /**
                 * Sets the value of the financialsInformationAvailabilityIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setFinancialsInformationAvailabilityIndicator(Boolean value) {
                    this.financialsInformationAvailabilityIndicator = value;
                }

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
     *         &lt;sequence minOccurs="0">
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}CompanySummary" minOccurs="0"/>
     *         &lt;/sequence>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="Identification" type="{http://gateway.dnb.com/getProduct}IdentificationType" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}PaymentInformation" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}PredictiveScores" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}SpecialEvents" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}CorporateLinkages" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}PrincipalsInformation" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}OperationsandHistory" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}PublicFilings" minOccurs="0"/>
     *           &lt;element ref="{http://gateway.dnb.com/getProduct}Financials" minOccurs="0"/>
     *         &lt;/sequence>
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
        "companySummary",
        "identification",
        "paymentInformation",
        "predictiveScores",
        "specialEvents",
        "corporateLinkages",
        "principalsInformation",
        "operationsandHistory",
        "publicFilings",
        "financials"
    })
    public static class RecordPayload {

        @XmlElement(name = "CompanySummary")
        protected CompanySummary companySummary;
        @XmlElement(name = "Identification")
        protected IdentificationType identification;
        @XmlElement(name = "PaymentInformation")
        protected PaymentInformation paymentInformation;
        @XmlElement(name = "PredictiveScores")
        protected PredictiveScores predictiveScores;
        @XmlElement(name = "SpecialEvents")
        protected SpecialEvents specialEvents;
        @XmlElement(name = "CorporateLinkages")
        protected CorporateLinkages corporateLinkages;
        @XmlElement(name = "PrincipalsInformation")
        protected PrincipalsInformation principalsInformation;
        @XmlElement(name = "OperationsandHistory")
        protected OperationsandHistory operationsandHistory;
        @XmlElement(name = "PublicFilings")
        protected PublicFilings publicFilings;
        @XmlElement(name = "Financials")
        protected Financials financials;

        /**
         * Gets the value of the companySummary property.
         * 
         * @return
         *     possible object is
         *     {@link CompanySummary }
         *     
         */
        public CompanySummary getCompanySummary() {
            return companySummary;
        }

        /**
         * Sets the value of the companySummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanySummary }
         *     
         */
        public void setCompanySummary(CompanySummary value) {
            this.companySummary = value;
        }

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link IdentificationType }
         *     
         */
        public IdentificationType getIdentification() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentificationType }
         *     
         */
        public void setIdentification(IdentificationType value) {
            this.identification = value;
        }

        /**
         * Gets the value of the paymentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentInformation }
         *     
         */
        public PaymentInformation getPaymentInformation() {
            return paymentInformation;
        }

        /**
         * Sets the value of the paymentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentInformation }
         *     
         */
        public void setPaymentInformation(PaymentInformation value) {
            this.paymentInformation = value;
        }

        /**
         * Gets the value of the predictiveScores property.
         * 
         * @return
         *     possible object is
         *     {@link PredictiveScores }
         *     
         */
        public PredictiveScores getPredictiveScores() {
            return predictiveScores;
        }

        /**
         * Sets the value of the predictiveScores property.
         * 
         * @param value
         *     allowed object is
         *     {@link PredictiveScores }
         *     
         */
        public void setPredictiveScores(PredictiveScores value) {
            this.predictiveScores = value;
        }

        /**
         * Gets the value of the specialEvents property.
         * 
         * @return
         *     possible object is
         *     {@link SpecialEvents }
         *     
         */
        public SpecialEvents getSpecialEvents() {
            return specialEvents;
        }

        /**
         * Sets the value of the specialEvents property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialEvents }
         *     
         */
        public void setSpecialEvents(SpecialEvents value) {
            this.specialEvents = value;
        }

        /**
         * Gets the value of the corporateLinkages property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateLinkages }
         *     
         */
        public CorporateLinkages getCorporateLinkages() {
            return corporateLinkages;
        }

        /**
         * Sets the value of the corporateLinkages property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateLinkages }
         *     
         */
        public void setCorporateLinkages(CorporateLinkages value) {
            this.corporateLinkages = value;
        }

        /**
         * Gets the value of the principalsInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PrincipalsInformation }
         *     
         */
        public PrincipalsInformation getPrincipalsInformation() {
            return principalsInformation;
        }

        /**
         * Sets the value of the principalsInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrincipalsInformation }
         *     
         */
        public void setPrincipalsInformation(PrincipalsInformation value) {
            this.principalsInformation = value;
        }

        /**
         * Gets the value of the operationsandHistory property.
         * 
         * @return
         *     possible object is
         *     {@link OperationsandHistory }
         *     
         */
        public OperationsandHistory getOperationsandHistory() {
            return operationsandHistory;
        }

        /**
         * Sets the value of the operationsandHistory property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationsandHistory }
         *     
         */
        public void setOperationsandHistory(OperationsandHistory value) {
            this.operationsandHistory = value;
        }

        /**
         * Gets the value of the publicFilings property.
         * 
         * @return
         *     possible object is
         *     {@link PublicFilings }
         *     
         */
        public PublicFilings getPublicFilings() {
            return publicFilings;
        }

        /**
         * Sets the value of the publicFilings property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicFilings }
         *     
         */
        public void setPublicFilings(PublicFilings value) {
            this.publicFilings = value;
        }

        /**
         * Gets the value of the financials property.
         * 
         * @return
         *     possible object is
         *     {@link Financials }
         *     
         */
        public Financials getFinancials() {
            return financials;
        }

        /**
         * Sets the value of the financials property.
         * 
         * @param value
         *     allowed object is
         *     {@link Financials }
         *     
         */
        public void setFinancials(Financials value) {
            this.financials = value;
        }

    }

}
