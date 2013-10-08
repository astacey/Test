
package DBFullReportsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for OperationalInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationalInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessOperationsStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="OldEstablishedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessControlStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="BusinessIncorporatedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="BusinessOperatingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessFoundersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EconomicallyActiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessConstitutionDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessConstitutionDetailsEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PublishedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="PublishedDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OffcialReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OperationalBusinessNames" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BrandNames" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TradeMarks" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherNames" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherName">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
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
 *         &lt;element name="ActivityCodesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ActivityCodesInformationEntry" type="{http://gateway.dnb.com/getProduct}ActitvityCodesEntryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LineofBusiness" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineofBusinessEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ActivityText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="MarketsInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ImportsInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ImportsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="ImportsInformationEntry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ImportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ImportsTerritories" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ImportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="ExportsInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ExportsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="ExportsInformationEntry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ExportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ExportsTerritories" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ExportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *         &lt;element name="SalesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LocalMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="RegionalMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="NationalMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ExportMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DirectCustomersIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DirectCustomersQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="CustomerDescriptions" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustomerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SalesChannels" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CustomerNames" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SupplierNames" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AgentsUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="AgentsUsedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StorageUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="BusinessisAgentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="SubContractorsUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="SubContractorsUsedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="BusinessSeasonalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="PayTerms" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PayTermText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SalesTerms" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SalesTermText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="EmployeesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeesInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TotalEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MinimumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MaximumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="EstimatedEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="VariableEmployeesQuantityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="DataProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ConsolidatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="CategorizedEmployeesInformationEntry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="EmployeeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="BusinessRegistrationInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RegistrationInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RegistrationNumber" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegistrationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegistrationIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="PremisesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PremisesInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PremisesTypeEntry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PremiseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TenureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PremiseLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegisteredAddressisPhysicalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="TotalArea" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                                     &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BuiltArea" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                                     &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AdditionalDetailsEntry" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="LegalFormInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LegalForm" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LegalFormStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                   &lt;element name="LegalFormExpiryDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                   &lt;element name="InitialLegalForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CapitalInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CapitalInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CapitalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CapitalAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="CapitalStockDetail" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CapitalStockDetailEntry" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CapitalStockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="CapitalStockSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="CapitalStockQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                                 &lt;element name="CapitalStockAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                                 &lt;element name="CapitalStockValue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                                 &lt;element name="VotingRightsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CapitalStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="CapitalDifferenceAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
 *         &lt;element name="BankingInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BankingInformationEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BankAddress" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
 *                             &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BankIdentificationNumbers" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BankIdentificationNumber">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PrimaryBankIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="BusinessSigningAuthorities" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SigningAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ManagementComments" type="{http://gateway.dnb.com/getProduct}ManagementCommentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalInformationType", propOrder = {
    "businessOperationsStartDate",
    "oldEstablishedIndicator",
    "businessControlStartDate",
    "businessIncorporatedDate",
    "businessOperatingStatus",
    "businessFoundersName",
    "economicallyActiveIndicator",
    "businessConstitutionDetails",
    "operationalBusinessNames",
    "activityCodesInformation",
    "lineofBusiness",
    "marketsInformation",
    "salesInformation",
    "employeesInformation",
    "businessRegistrationInformation",
    "premisesInformation",
    "legalFormInformation",
    "capitalInformation",
    "bankingInformation",
    "businessSigningAuthorities",
    "managementComments"
})
public class OperationalInformationType {

    @XmlElement(name = "BusinessOperationsStartDate")
    protected DNBDate businessOperationsStartDate;
    @XmlElement(name = "OldEstablishedIndicator")
    protected Boolean oldEstablishedIndicator;
    @XmlElement(name = "BusinessControlStartDate")
    protected DNBDate businessControlStartDate;
    @XmlElement(name = "BusinessIncorporatedDate")
    protected DNBDate businessIncorporatedDate;
    @XmlElement(name = "BusinessOperatingStatus")
    protected String businessOperatingStatus;
    @XmlElement(name = "BusinessFoundersName")
    protected String businessFoundersName;
    @XmlElement(name = "EconomicallyActiveIndicator")
    protected Boolean economicallyActiveIndicator;
    @XmlElement(name = "BusinessConstitutionDetails")
    protected OperationalInformationType.BusinessConstitutionDetails businessConstitutionDetails;
    @XmlElement(name = "OperationalBusinessNames")
    protected OperationalInformationType.OperationalBusinessNames operationalBusinessNames;
    @XmlElement(name = "ActivityCodesInformation")
    protected OperationalInformationType.ActivityCodesInformation activityCodesInformation;
    @XmlElement(name = "LineofBusiness")
    protected OperationalInformationType.LineofBusiness lineofBusiness;
    @XmlElement(name = "MarketsInformation")
    protected OperationalInformationType.MarketsInformation marketsInformation;
    @XmlElement(name = "SalesInformation")
    protected OperationalInformationType.SalesInformation salesInformation;
    @XmlElement(name = "EmployeesInformation")
    protected OperationalInformationType.EmployeesInformation employeesInformation;
    @XmlElement(name = "BusinessRegistrationInformation")
    protected OperationalInformationType.BusinessRegistrationInformation businessRegistrationInformation;
    @XmlElement(name = "PremisesInformation")
    protected OperationalInformationType.PremisesInformation premisesInformation;
    @XmlElement(name = "LegalFormInformation")
    protected OperationalInformationType.LegalFormInformation legalFormInformation;
    @XmlElement(name = "CapitalInformation")
    protected OperationalInformationType.CapitalInformation capitalInformation;
    @XmlElement(name = "BankingInformation")
    protected OperationalInformationType.BankingInformation bankingInformation;
    @XmlElement(name = "BusinessSigningAuthorities")
    protected List<OperationalInformationType.BusinessSigningAuthorities> businessSigningAuthorities;
    @XmlElement(name = "ManagementComments")
    protected ManagementCommentsType managementComments;

    /**
     * Gets the value of the businessOperationsStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBusinessOperationsStartDate() {
        return businessOperationsStartDate;
    }

    /**
     * Sets the value of the businessOperationsStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBusinessOperationsStartDate(DNBDate value) {
        this.businessOperationsStartDate = value;
    }

    /**
     * Gets the value of the oldEstablishedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOldEstablishedIndicator() {
        return oldEstablishedIndicator;
    }

    /**
     * Sets the value of the oldEstablishedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOldEstablishedIndicator(Boolean value) {
        this.oldEstablishedIndicator = value;
    }

    /**
     * Gets the value of the businessControlStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBusinessControlStartDate() {
        return businessControlStartDate;
    }

    /**
     * Sets the value of the businessControlStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBusinessControlStartDate(DNBDate value) {
        this.businessControlStartDate = value;
    }

    /**
     * Gets the value of the businessIncorporatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBusinessIncorporatedDate() {
        return businessIncorporatedDate;
    }

    /**
     * Sets the value of the businessIncorporatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBusinessIncorporatedDate(DNBDate value) {
        this.businessIncorporatedDate = value;
    }

    /**
     * Gets the value of the businessOperatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOperatingStatus() {
        return businessOperatingStatus;
    }

    /**
     * Sets the value of the businessOperatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOperatingStatus(String value) {
        this.businessOperatingStatus = value;
    }

    /**
     * Gets the value of the businessFoundersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessFoundersName() {
        return businessFoundersName;
    }

    /**
     * Sets the value of the businessFoundersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessFoundersName(String value) {
        this.businessFoundersName = value;
    }

    /**
     * Gets the value of the economicallyActiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEconomicallyActiveIndicator() {
        return economicallyActiveIndicator;
    }

    /**
     * Sets the value of the economicallyActiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEconomicallyActiveIndicator(Boolean value) {
        this.economicallyActiveIndicator = value;
    }

    /**
     * Gets the value of the businessConstitutionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.BusinessConstitutionDetails }
     *     
     */
    public OperationalInformationType.BusinessConstitutionDetails getBusinessConstitutionDetails() {
        return businessConstitutionDetails;
    }

    /**
     * Sets the value of the businessConstitutionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.BusinessConstitutionDetails }
     *     
     */
    public void setBusinessConstitutionDetails(OperationalInformationType.BusinessConstitutionDetails value) {
        this.businessConstitutionDetails = value;
    }

    /**
     * Gets the value of the operationalBusinessNames property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.OperationalBusinessNames }
     *     
     */
    public OperationalInformationType.OperationalBusinessNames getOperationalBusinessNames() {
        return operationalBusinessNames;
    }

    /**
     * Sets the value of the operationalBusinessNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.OperationalBusinessNames }
     *     
     */
    public void setOperationalBusinessNames(OperationalInformationType.OperationalBusinessNames value) {
        this.operationalBusinessNames = value;
    }

    /**
     * Gets the value of the activityCodesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.ActivityCodesInformation }
     *     
     */
    public OperationalInformationType.ActivityCodesInformation getActivityCodesInformation() {
        return activityCodesInformation;
    }

    /**
     * Sets the value of the activityCodesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.ActivityCodesInformation }
     *     
     */
    public void setActivityCodesInformation(OperationalInformationType.ActivityCodesInformation value) {
        this.activityCodesInformation = value;
    }

    /**
     * Gets the value of the lineofBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.LineofBusiness }
     *     
     */
    public OperationalInformationType.LineofBusiness getLineofBusiness() {
        return lineofBusiness;
    }

    /**
     * Sets the value of the lineofBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.LineofBusiness }
     *     
     */
    public void setLineofBusiness(OperationalInformationType.LineofBusiness value) {
        this.lineofBusiness = value;
    }

    /**
     * Gets the value of the marketsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.MarketsInformation }
     *     
     */
    public OperationalInformationType.MarketsInformation getMarketsInformation() {
        return marketsInformation;
    }

    /**
     * Sets the value of the marketsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.MarketsInformation }
     *     
     */
    public void setMarketsInformation(OperationalInformationType.MarketsInformation value) {
        this.marketsInformation = value;
    }

    /**
     * Gets the value of the salesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.SalesInformation }
     *     
     */
    public OperationalInformationType.SalesInformation getSalesInformation() {
        return salesInformation;
    }

    /**
     * Sets the value of the salesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.SalesInformation }
     *     
     */
    public void setSalesInformation(OperationalInformationType.SalesInformation value) {
        this.salesInformation = value;
    }

    /**
     * Gets the value of the employeesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.EmployeesInformation }
     *     
     */
    public OperationalInformationType.EmployeesInformation getEmployeesInformation() {
        return employeesInformation;
    }

    /**
     * Sets the value of the employeesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.EmployeesInformation }
     *     
     */
    public void setEmployeesInformation(OperationalInformationType.EmployeesInformation value) {
        this.employeesInformation = value;
    }

    /**
     * Gets the value of the businessRegistrationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.BusinessRegistrationInformation }
     *     
     */
    public OperationalInformationType.BusinessRegistrationInformation getBusinessRegistrationInformation() {
        return businessRegistrationInformation;
    }

    /**
     * Sets the value of the businessRegistrationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.BusinessRegistrationInformation }
     *     
     */
    public void setBusinessRegistrationInformation(OperationalInformationType.BusinessRegistrationInformation value) {
        this.businessRegistrationInformation = value;
    }

    /**
     * Gets the value of the premisesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.PremisesInformation }
     *     
     */
    public OperationalInformationType.PremisesInformation getPremisesInformation() {
        return premisesInformation;
    }

    /**
     * Sets the value of the premisesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.PremisesInformation }
     *     
     */
    public void setPremisesInformation(OperationalInformationType.PremisesInformation value) {
        this.premisesInformation = value;
    }

    /**
     * Gets the value of the legalFormInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.LegalFormInformation }
     *     
     */
    public OperationalInformationType.LegalFormInformation getLegalFormInformation() {
        return legalFormInformation;
    }

    /**
     * Sets the value of the legalFormInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.LegalFormInformation }
     *     
     */
    public void setLegalFormInformation(OperationalInformationType.LegalFormInformation value) {
        this.legalFormInformation = value;
    }

    /**
     * Gets the value of the capitalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.CapitalInformation }
     *     
     */
    public OperationalInformationType.CapitalInformation getCapitalInformation() {
        return capitalInformation;
    }

    /**
     * Sets the value of the capitalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.CapitalInformation }
     *     
     */
    public void setCapitalInformation(OperationalInformationType.CapitalInformation value) {
        this.capitalInformation = value;
    }

    /**
     * Gets the value of the bankingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType.BankingInformation }
     *     
     */
    public OperationalInformationType.BankingInformation getBankingInformation() {
        return bankingInformation;
    }

    /**
     * Sets the value of the bankingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType.BankingInformation }
     *     
     */
    public void setBankingInformation(OperationalInformationType.BankingInformation value) {
        this.bankingInformation = value;
    }

    /**
     * Gets the value of the businessSigningAuthorities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessSigningAuthorities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessSigningAuthorities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalInformationType.BusinessSigningAuthorities }
     * 
     * 
     */
    public List<OperationalInformationType.BusinessSigningAuthorities> getBusinessSigningAuthorities() {
        if (businessSigningAuthorities == null) {
            businessSigningAuthorities = new ArrayList<OperationalInformationType.BusinessSigningAuthorities>();
        }
        return this.businessSigningAuthorities;
    }

    /**
     * Gets the value of the managementComments property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementCommentsType }
     *     
     */
    public ManagementCommentsType getManagementComments() {
        return managementComments;
    }

    /**
     * Sets the value of the managementComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementCommentsType }
     *     
     */
    public void setManagementComments(ManagementCommentsType value) {
        this.managementComments = value;
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
     *         &lt;element name="ActivityCodesInformationEntry" type="{http://gateway.dnb.com/getProduct}ActitvityCodesEntryType" maxOccurs="unbounded"/>
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
        "activityCodesInformationEntry"
    })
    public static class ActivityCodesInformation {

        @XmlElement(name = "ActivityCodesInformationEntry", required = true)
        protected List<ActitvityCodesEntryType> activityCodesInformationEntry;

        /**
         * Gets the value of the activityCodesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activityCodesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivityCodesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActitvityCodesEntryType }
         * 
         * 
         */
        public List<ActitvityCodesEntryType> getActivityCodesInformationEntry() {
            if (activityCodesInformationEntry == null) {
                activityCodesInformationEntry = new ArrayList<ActitvityCodesEntryType>();
            }
            return this.activityCodesInformationEntry;
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
     *         &lt;element name="BankingInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BankAddress" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
     *                   &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BankIdentificationNumbers" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BankIdentificationNumber">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PrimaryBankIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "bankingInformationEntry"
    })
    public static class BankingInformation {

        @XmlElement(name = "BankingInformationEntry", required = true)
        protected List<OperationalInformationType.BankingInformation.BankingInformationEntry> bankingInformationEntry;

        /**
         * Gets the value of the bankingInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bankingInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBankingInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.BankingInformation.BankingInformationEntry }
         * 
         * 
         */
        public List<OperationalInformationType.BankingInformation.BankingInformationEntry> getBankingInformationEntry() {
            if (bankingInformationEntry == null) {
                bankingInformationEntry = new ArrayList<OperationalInformationType.BankingInformation.BankingInformationEntry>();
            }
            return this.bankingInformationEntry;
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
         *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BankAddress" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
         *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BankIdentificationNumbers" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BankIdentificationNumber">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PrimaryBankIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "bankName",
            "bankAddress",
            "bankAccountNumber",
            "bankIdentificationNumbers",
            "primaryBankIndicator"
        })
        public static class BankingInformationEntry {

            @XmlElement(name = "BankName")
            protected String bankName;
            @XmlElement(name = "BankAddress")
            protected AddressType bankAddress;
            @XmlElement(name = "BankAccountNumber")
            protected String bankAccountNumber;
            @XmlElement(name = "BankIdentificationNumbers")
            protected List<OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers> bankIdentificationNumbers;
            @XmlElement(name = "PrimaryBankIndicator")
            protected Boolean primaryBankIndicator;

            /**
             * Gets the value of the bankName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankName() {
                return bankName;
            }

            /**
             * Sets the value of the bankName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankName(String value) {
                this.bankName = value;
            }

            /**
             * Gets the value of the bankAddress property.
             * 
             * @return
             *     possible object is
             *     {@link AddressType }
             *     
             */
            public AddressType getBankAddress() {
                return bankAddress;
            }

            /**
             * Sets the value of the bankAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressType }
             *     
             */
            public void setBankAddress(AddressType value) {
                this.bankAddress = value;
            }

            /**
             * Gets the value of the bankAccountNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankAccountNumber() {
                return bankAccountNumber;
            }

            /**
             * Sets the value of the bankAccountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankAccountNumber(String value) {
                this.bankAccountNumber = value;
            }

            /**
             * Gets the value of the bankIdentificationNumbers property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bankIdentificationNumbers property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBankIdentificationNumbers().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers }
             * 
             * 
             */
            public List<OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers> getBankIdentificationNumbers() {
                if (bankIdentificationNumbers == null) {
                    bankIdentificationNumbers = new ArrayList<OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers>();
                }
                return this.bankIdentificationNumbers;
            }

            /**
             * Gets the value of the primaryBankIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrimaryBankIndicator() {
                return primaryBankIndicator;
            }

            /**
             * Sets the value of the primaryBankIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrimaryBankIndicator(Boolean value) {
                this.primaryBankIndicator = value;
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
             *         &lt;element name="BankIdentificationNumber">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "bankIdentificationNumber"
            })
            public static class BankIdentificationNumbers {

                @XmlElement(name = "BankIdentificationNumber", required = true)
                protected OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers.BankIdentificationNumber bankIdentificationNumber;

                /**
                 * Gets the value of the bankIdentificationNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers.BankIdentificationNumber }
                 *     
                 */
                public OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers.BankIdentificationNumber getBankIdentificationNumber() {
                    return bankIdentificationNumber;
                }

                /**
                 * Sets the value of the bankIdentificationNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers.BankIdentificationNumber }
                 *     
                 */
                public void setBankIdentificationNumber(OperationalInformationType.BankingInformation.BankingInformationEntry.BankIdentificationNumbers.BankIdentificationNumber value) {
                    this.bankIdentificationNumber = value;
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
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                public static class BankIdentificationNumber {

                    @XmlValue
                    protected String value;
                    @XmlAttribute
                    @XmlSchemaType(name = "anySimpleType")
                    protected String type;

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
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

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
     *         &lt;element name="BusinessConstitutionDetailsEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PublishedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="PublishedDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OffcialReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "businessConstitutionDetailsEntry"
    })
    public static class BusinessConstitutionDetails {

        @XmlElement(name = "BusinessConstitutionDetailsEntry", required = true)
        protected List<OperationalInformationType.BusinessConstitutionDetails.BusinessConstitutionDetailsEntry> businessConstitutionDetailsEntry;

        /**
         * Gets the value of the businessConstitutionDetailsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the businessConstitutionDetailsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusinessConstitutionDetailsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.BusinessConstitutionDetails.BusinessConstitutionDetailsEntry }
         * 
         * 
         */
        public List<OperationalInformationType.BusinessConstitutionDetails.BusinessConstitutionDetailsEntry> getBusinessConstitutionDetailsEntry() {
            if (businessConstitutionDetailsEntry == null) {
                businessConstitutionDetailsEntry = new ArrayList<OperationalInformationType.BusinessConstitutionDetails.BusinessConstitutionDetailsEntry>();
            }
            return this.businessConstitutionDetailsEntry;
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
         *         &lt;element name="PublishedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="PublishedDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OffcialReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "publishedDate",
            "publishedDocument",
            "offcialReference"
        })
        public static class BusinessConstitutionDetailsEntry {

            @XmlElement(name = "PublishedDate")
            protected DNBDate publishedDate;
            @XmlElement(name = "PublishedDocument")
            protected String publishedDocument;
            @XmlElement(name = "OffcialReference")
            protected String offcialReference;

            /**
             * Gets the value of the publishedDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getPublishedDate() {
                return publishedDate;
            }

            /**
             * Sets the value of the publishedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setPublishedDate(DNBDate value) {
                this.publishedDate = value;
            }

            /**
             * Gets the value of the publishedDocument property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPublishedDocument() {
                return publishedDocument;
            }

            /**
             * Sets the value of the publishedDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPublishedDocument(String value) {
                this.publishedDocument = value;
            }

            /**
             * Gets the value of the offcialReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffcialReference() {
                return offcialReference;
            }

            /**
             * Sets the value of the offcialReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffcialReference(String value) {
                this.offcialReference = value;
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
     *         &lt;element name="RegistrationInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RegistrationNumber" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegistrationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegistrationIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "registrationInformationEntry"
    })
    public static class BusinessRegistrationInformation {

        @XmlElement(name = "RegistrationInformationEntry", required = true)
        protected List<OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry> registrationInformationEntry;

        /**
         * Gets the value of the registrationInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the registrationInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegistrationInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry }
         * 
         * 
         */
        public List<OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry> getRegistrationInformationEntry() {
            if (registrationInformationEntry == null) {
                registrationInformationEntry = new ArrayList<OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry>();
            }
            return this.registrationInformationEntry;
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
         *         &lt;element name="RegistrationNumber" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegistrationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegistrationIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "registrationNumber",
            "registrationStatus",
            "registrationStartDate",
            "registrationLocation",
            "registrationIssuer"
        })
        public static class RegistrationInformationEntry {

            @XmlElement(name = "RegistrationNumber")
            protected OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry.RegistrationNumber registrationNumber;
            @XmlElement(name = "RegistrationStatus")
            protected String registrationStatus;
            @XmlElement(name = "RegistrationStartDate")
            protected DNBDate registrationStartDate;
            @XmlElement(name = "RegistrationLocation")
            protected String registrationLocation;
            @XmlElement(name = "RegistrationIssuer")
            protected String registrationIssuer;

            /**
             * Gets the value of the registrationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry.RegistrationNumber }
             *     
             */
            public OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry.RegistrationNumber getRegistrationNumber() {
                return registrationNumber;
            }

            /**
             * Sets the value of the registrationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry.RegistrationNumber }
             *     
             */
            public void setRegistrationNumber(OperationalInformationType.BusinessRegistrationInformation.RegistrationInformationEntry.RegistrationNumber value) {
                this.registrationNumber = value;
            }

            /**
             * Gets the value of the registrationStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistrationStatus() {
                return registrationStatus;
            }

            /**
             * Sets the value of the registrationStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistrationStatus(String value) {
                this.registrationStatus = value;
            }

            /**
             * Gets the value of the registrationStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getRegistrationStartDate() {
                return registrationStartDate;
            }

            /**
             * Sets the value of the registrationStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setRegistrationStartDate(DNBDate value) {
                this.registrationStartDate = value;
            }

            /**
             * Gets the value of the registrationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistrationLocation() {
                return registrationLocation;
            }

            /**
             * Sets the value of the registrationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistrationLocation(String value) {
                this.registrationLocation = value;
            }

            /**
             * Gets the value of the registrationIssuer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistrationIssuer() {
                return registrationIssuer;
            }

            /**
             * Sets the value of the registrationIssuer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistrationIssuer(String value) {
                this.registrationIssuer = value;
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
             *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
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
            public static class RegistrationNumber {

                @XmlValue
                protected String value;
                @XmlAttribute
                @XmlSchemaType(name = "anySimpleType")
                protected String type;
                @XmlAttribute
                protected BigInteger priority;
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
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the priority property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPriority() {
                    return priority;
                }

                /**
                 * Sets the value of the priority property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPriority(BigInteger value) {
                    this.priority = value;
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
     *         &lt;element name="SigningAuthority" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "signingAuthority"
    })
    public static class BusinessSigningAuthorities {

        @XmlElement(name = "SigningAuthority", required = true)
        protected String signingAuthority;

        /**
         * Gets the value of the signingAuthority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSigningAuthority() {
            return signingAuthority;
        }

        /**
         * Sets the value of the signingAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSigningAuthority(String value) {
            this.signingAuthority = value;
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
     *         &lt;element name="CapitalInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CapitalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CapitalAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="CapitalStockDetail" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CapitalStockDetailEntry" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CapitalStockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="CapitalStockSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="CapitalStockQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                                       &lt;element name="CapitalStockAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                                       &lt;element name="CapitalStockValue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                                       &lt;element name="VotingRightsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
     *                   &lt;element name="CapitalStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="CapitalDifferenceAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "capitalInformationEntry"
    })
    public static class CapitalInformation {

        @XmlElement(name = "CapitalInformationEntry", required = true)
        protected List<OperationalInformationType.CapitalInformation.CapitalInformationEntry> capitalInformationEntry;

        /**
         * Gets the value of the capitalInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capitalInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapitalInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.CapitalInformation.CapitalInformationEntry }
         * 
         * 
         */
        public List<OperationalInformationType.CapitalInformation.CapitalInformationEntry> getCapitalInformationEntry() {
            if (capitalInformationEntry == null) {
                capitalInformationEntry = new ArrayList<OperationalInformationType.CapitalInformation.CapitalInformationEntry>();
            }
            return this.capitalInformationEntry;
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
         *         &lt;element name="CapitalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CapitalAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="CapitalStockDetail" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CapitalStockDetailEntry" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CapitalStockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="CapitalStockSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="CapitalStockQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                             &lt;element name="CapitalStockAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                             &lt;element name="CapitalStockValue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                             &lt;element name="VotingRightsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
         *         &lt;element name="CapitalStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="CapitalDifferenceAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "capitalType",
            "capitalAmount",
            "capitalStockDetail",
            "capitalStartDate",
            "capitalDifferenceAmount"
        })
        public static class CapitalInformationEntry {

            @XmlElement(name = "CapitalType")
            protected String capitalType;
            @XmlElement(name = "CapitalAmount")
            protected AmountType capitalAmount;
            @XmlElement(name = "CapitalStockDetail")
            protected OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail capitalStockDetail;
            @XmlElement(name = "CapitalStartDate")
            protected DNBDate capitalStartDate;
            @XmlElement(name = "CapitalDifferenceAmount")
            protected AmountType capitalDifferenceAmount;

            /**
             * Gets the value of the capitalType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCapitalType() {
                return capitalType;
            }

            /**
             * Sets the value of the capitalType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCapitalType(String value) {
                this.capitalType = value;
            }

            /**
             * Gets the value of the capitalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getCapitalAmount() {
                return capitalAmount;
            }

            /**
             * Sets the value of the capitalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setCapitalAmount(AmountType value) {
                this.capitalAmount = value;
            }

            /**
             * Gets the value of the capitalStockDetail property.
             * 
             * @return
             *     possible object is
             *     {@link OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail }
             *     
             */
            public OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail getCapitalStockDetail() {
                return capitalStockDetail;
            }

            /**
             * Sets the value of the capitalStockDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail }
             *     
             */
            public void setCapitalStockDetail(OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail value) {
                this.capitalStockDetail = value;
            }

            /**
             * Gets the value of the capitalStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getCapitalStartDate() {
                return capitalStartDate;
            }

            /**
             * Sets the value of the capitalStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setCapitalStartDate(DNBDate value) {
                this.capitalStartDate = value;
            }

            /**
             * Gets the value of the capitalDifferenceAmount property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getCapitalDifferenceAmount() {
                return capitalDifferenceAmount;
            }

            /**
             * Sets the value of the capitalDifferenceAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setCapitalDifferenceAmount(AmountType value) {
                this.capitalDifferenceAmount = value;
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
             *         &lt;element name="CapitalStockDetailEntry" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CapitalStockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="CapitalStockSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="CapitalStockQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *                   &lt;element name="CapitalStockAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *                   &lt;element name="CapitalStockValue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *                   &lt;element name="VotingRightsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                "capitalStockDetailEntry"
            })
            public static class CapitalStockDetail {

                @XmlElement(name = "CapitalStockDetailEntry", required = true)
                protected List<OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail.CapitalStockDetailEntry> capitalStockDetailEntry;

                /**
                 * Gets the value of the capitalStockDetailEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the capitalStockDetailEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCapitalStockDetailEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail.CapitalStockDetailEntry }
                 * 
                 * 
                 */
                public List<OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail.CapitalStockDetailEntry> getCapitalStockDetailEntry() {
                    if (capitalStockDetailEntry == null) {
                        capitalStockDetailEntry = new ArrayList<OperationalInformationType.CapitalInformation.CapitalInformationEntry.CapitalStockDetail.CapitalStockDetailEntry>();
                    }
                    return this.capitalStockDetailEntry;
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
                 *         &lt;element name="CapitalStockType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="CapitalStockSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="CapitalStockQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
                 *         &lt;element name="CapitalStockAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
                 *         &lt;element name="CapitalStockValue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
                 *         &lt;element name="VotingRightsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
                    "capitalStockType",
                    "capitalStockSubtype",
                    "capitalStockQuantity",
                    "capitalStockAmount",
                    "capitalStockValue",
                    "votingRightsIndicator"
                })
                public static class CapitalStockDetailEntry {

                    @XmlElement(name = "CapitalStockType")
                    protected String capitalStockType;
                    @XmlElement(name = "CapitalStockSubtype")
                    protected String capitalStockSubtype;
                    @XmlElement(name = "CapitalStockQuantity")
                    protected BigInteger capitalStockQuantity;
                    @XmlElement(name = "CapitalStockAmount")
                    protected AmountType capitalStockAmount;
                    @XmlElement(name = "CapitalStockValue")
                    protected AmountType capitalStockValue;
                    @XmlElement(name = "VotingRightsIndicator")
                    protected Boolean votingRightsIndicator;

                    /**
                     * Gets the value of the capitalStockType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCapitalStockType() {
                        return capitalStockType;
                    }

                    /**
                     * Sets the value of the capitalStockType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCapitalStockType(String value) {
                        this.capitalStockType = value;
                    }

                    /**
                     * Gets the value of the capitalStockSubtype property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCapitalStockSubtype() {
                        return capitalStockSubtype;
                    }

                    /**
                     * Sets the value of the capitalStockSubtype property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCapitalStockSubtype(String value) {
                        this.capitalStockSubtype = value;
                    }

                    /**
                     * Gets the value of the capitalStockQuantity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCapitalStockQuantity() {
                        return capitalStockQuantity;
                    }

                    /**
                     * Sets the value of the capitalStockQuantity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCapitalStockQuantity(BigInteger value) {
                        this.capitalStockQuantity = value;
                    }

                    /**
                     * Gets the value of the capitalStockAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AmountType }
                     *     
                     */
                    public AmountType getCapitalStockAmount() {
                        return capitalStockAmount;
                    }

                    /**
                     * Sets the value of the capitalStockAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AmountType }
                     *     
                     */
                    public void setCapitalStockAmount(AmountType value) {
                        this.capitalStockAmount = value;
                    }

                    /**
                     * Gets the value of the capitalStockValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AmountType }
                     *     
                     */
                    public AmountType getCapitalStockValue() {
                        return capitalStockValue;
                    }

                    /**
                     * Sets the value of the capitalStockValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AmountType }
                     *     
                     */
                    public void setCapitalStockValue(AmountType value) {
                        this.capitalStockValue = value;
                    }

                    /**
                     * Gets the value of the votingRightsIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isVotingRightsIndicator() {
                        return votingRightsIndicator;
                    }

                    /**
                     * Sets the value of the votingRightsIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setVotingRightsIndicator(Boolean value) {
                        this.votingRightsIndicator = value;
                    }

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
     *         &lt;element name="EmployeesInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TotalEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MinimumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MaximumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="EstimatedEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="VariableEmployeesQuantityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="DataProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ConsolidatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="CategorizedEmployeesInformationEntry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="EmployeeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "employeesInformationEntry"
    })
    public static class EmployeesInformation {

        @XmlElement(name = "EmployeesInformationEntry", required = true)
        protected List<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry> employeesInformationEntry;

        /**
         * Gets the value of the employeesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.EmployeesInformation.EmployeesInformationEntry }
         * 
         * 
         */
        public List<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry> getEmployeesInformationEntry() {
            if (employeesInformationEntry == null) {
                employeesInformationEntry = new ArrayList<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry>();
            }
            return this.employeesInformationEntry;
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
         *         &lt;element name="TotalEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MinimumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MaximumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="EstimatedEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="VariableEmployeesQuantityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="DataProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ConsolidatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="CategorizedEmployeesInformationEntry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="EmployeeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "totalEmployeesQuantity",
            "minimumEmployeesQuantity",
            "maximumEmployeesQuantity",
            "estimatedEmployeesQuantity",
            "variableEmployeesQuantityIndicator",
            "dataProvider",
            "consolidatedIndicator",
            "categorizedEmployeesInformationEntry",
            "additionalDetailsEntry"
        })
        public static class EmployeesInformationEntry {

            @XmlElement(name = "TotalEmployeesQuantity")
            protected BigInteger totalEmployeesQuantity;
            @XmlElement(name = "MinimumEmployeesQuantity")
            protected BigInteger minimumEmployeesQuantity;
            @XmlElement(name = "MaximumEmployeesQuantity")
            protected BigInteger maximumEmployeesQuantity;
            @XmlElement(name = "EstimatedEmployeesQuantity")
            protected BigInteger estimatedEmployeesQuantity;
            @XmlElement(name = "VariableEmployeesQuantityIndicator")
            protected Boolean variableEmployeesQuantityIndicator;
            @XmlElement(name = "DataProvider")
            protected String dataProvider;
            @XmlElement(name = "ConsolidatedIndicator")
            protected Boolean consolidatedIndicator;
            @XmlElement(name = "CategorizedEmployeesInformationEntry")
            protected List<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.CategorizedEmployeesInformationEntry> categorizedEmployeesInformationEntry;
            @XmlElement(name = "AdditionalDetailsEntry")
            protected List<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.AdditionalDetailsEntry> additionalDetailsEntry;

            /**
             * Gets the value of the totalEmployeesQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalEmployeesQuantity() {
                return totalEmployeesQuantity;
            }

            /**
             * Sets the value of the totalEmployeesQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalEmployeesQuantity(BigInteger value) {
                this.totalEmployeesQuantity = value;
            }

            /**
             * Gets the value of the minimumEmployeesQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinimumEmployeesQuantity() {
                return minimumEmployeesQuantity;
            }

            /**
             * Sets the value of the minimumEmployeesQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinimumEmployeesQuantity(BigInteger value) {
                this.minimumEmployeesQuantity = value;
            }

            /**
             * Gets the value of the maximumEmployeesQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaximumEmployeesQuantity() {
                return maximumEmployeesQuantity;
            }

            /**
             * Sets the value of the maximumEmployeesQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaximumEmployeesQuantity(BigInteger value) {
                this.maximumEmployeesQuantity = value;
            }

            /**
             * Gets the value of the estimatedEmployeesQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getEstimatedEmployeesQuantity() {
                return estimatedEmployeesQuantity;
            }

            /**
             * Sets the value of the estimatedEmployeesQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setEstimatedEmployeesQuantity(BigInteger value) {
                this.estimatedEmployeesQuantity = value;
            }

            /**
             * Gets the value of the variableEmployeesQuantityIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isVariableEmployeesQuantityIndicator() {
                return variableEmployeesQuantityIndicator;
            }

            /**
             * Sets the value of the variableEmployeesQuantityIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setVariableEmployeesQuantityIndicator(Boolean value) {
                this.variableEmployeesQuantityIndicator = value;
            }

            /**
             * Gets the value of the dataProvider property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataProvider() {
                return dataProvider;
            }

            /**
             * Sets the value of the dataProvider property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataProvider(String value) {
                this.dataProvider = value;
            }

            /**
             * Gets the value of the consolidatedIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isConsolidatedIndicator() {
                return consolidatedIndicator;
            }

            /**
             * Sets the value of the consolidatedIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setConsolidatedIndicator(Boolean value) {
                this.consolidatedIndicator = value;
            }

            /**
             * Gets the value of the categorizedEmployeesInformationEntry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the categorizedEmployeesInformationEntry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCategorizedEmployeesInformationEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.CategorizedEmployeesInformationEntry }
             * 
             * 
             */
            public List<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.CategorizedEmployeesInformationEntry> getCategorizedEmployeesInformationEntry() {
                if (categorizedEmployeesInformationEntry == null) {
                    categorizedEmployeesInformationEntry = new ArrayList<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.CategorizedEmployeesInformationEntry>();
                }
                return this.categorizedEmployeesInformationEntry;
            }

            /**
             * Gets the value of the additionalDetailsEntry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalDetailsEntry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdditionalDetailsEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.AdditionalDetailsEntry }
             * 
             * 
             */
            public List<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.AdditionalDetailsEntry> getAdditionalDetailsEntry() {
                if (additionalDetailsEntry == null) {
                    additionalDetailsEntry = new ArrayList<OperationalInformationType.EmployeesInformation.EmployeesInformationEntry.AdditionalDetailsEntry>();
                }
                return this.additionalDetailsEntry;
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
             *         &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "additionalDetail"
            })
            public static class AdditionalDetailsEntry {

                @XmlElement(name = "AdditionalDetail", required = true)
                protected String additionalDetail;

                /**
                 * Gets the value of the additionalDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdditionalDetail() {
                    return additionalDetail;
                }

                /**
                 * Sets the value of the additionalDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdditionalDetail(String value) {
                    this.additionalDetail = value;
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
             *         &lt;element name="EmployeeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
                "employeeCategory",
                "employeeQuantity"
            })
            public static class CategorizedEmployeesInformationEntry {

                @XmlElement(name = "EmployeeCategory")
                protected String employeeCategory;
                @XmlElement(name = "EmployeeQuantity")
                protected BigInteger employeeQuantity;

                /**
                 * Gets the value of the employeeCategory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmployeeCategory() {
                    return employeeCategory;
                }

                /**
                 * Sets the value of the employeeCategory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmployeeCategory(String value) {
                    this.employeeCategory = value;
                }

                /**
                 * Gets the value of the employeeQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getEmployeeQuantity() {
                    return employeeQuantity;
                }

                /**
                 * Sets the value of the employeeQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setEmployeeQuantity(BigInteger value) {
                    this.employeeQuantity = value;
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
     *         &lt;element name="LegalForm" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LegalFormStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *         &lt;element name="LegalFormExpiryDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *         &lt;element name="InitialLegalForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "legalForm",
        "legalFormStartDate",
        "legalFormExpiryDate",
        "initialLegalForm"
    })
    public static class LegalFormInformation {

        @XmlElement(name = "LegalForm")
        protected OperationalInformationType.LegalFormInformation.LegalForm legalForm;
        @XmlElement(name = "LegalFormStartDate")
        protected DNBDate legalFormStartDate;
        @XmlElement(name = "LegalFormExpiryDate")
        protected DNBDate legalFormExpiryDate;
        @XmlElement(name = "InitialLegalForm")
        protected String initialLegalForm;

        /**
         * Gets the value of the legalForm property.
         * 
         * @return
         *     possible object is
         *     {@link OperationalInformationType.LegalFormInformation.LegalForm }
         *     
         */
        public OperationalInformationType.LegalFormInformation.LegalForm getLegalForm() {
            return legalForm;
        }

        /**
         * Sets the value of the legalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationalInformationType.LegalFormInformation.LegalForm }
         *     
         */
        public void setLegalForm(OperationalInformationType.LegalFormInformation.LegalForm value) {
            this.legalForm = value;
        }

        /**
         * Gets the value of the legalFormStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link DNBDate }
         *     
         */
        public DNBDate getLegalFormStartDate() {
            return legalFormStartDate;
        }

        /**
         * Sets the value of the legalFormStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DNBDate }
         *     
         */
        public void setLegalFormStartDate(DNBDate value) {
            this.legalFormStartDate = value;
        }

        /**
         * Gets the value of the legalFormExpiryDate property.
         * 
         * @return
         *     possible object is
         *     {@link DNBDate }
         *     
         */
        public DNBDate getLegalFormExpiryDate() {
            return legalFormExpiryDate;
        }

        /**
         * Sets the value of the legalFormExpiryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DNBDate }
         *     
         */
        public void setLegalFormExpiryDate(DNBDate value) {
            this.legalFormExpiryDate = value;
        }

        /**
         * Gets the value of the initialLegalForm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialLegalForm() {
            return initialLegalForm;
        }

        /**
         * Sets the value of the initialLegalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialLegalForm(String value) {
            this.initialLegalForm = value;
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
        public static class LegalForm {

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
     *         &lt;element name="LineofBusinessEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ActivityText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "lineofBusinessEntry"
    })
    public static class LineofBusiness {

        @XmlElement(name = "LineofBusinessEntry", required = true)
        protected List<OperationalInformationType.LineofBusiness.LineofBusinessEntry> lineofBusinessEntry;

        /**
         * Gets the value of the lineofBusinessEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineofBusinessEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineofBusinessEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.LineofBusiness.LineofBusinessEntry }
         * 
         * 
         */
        public List<OperationalInformationType.LineofBusiness.LineofBusinessEntry> getLineofBusinessEntry() {
            if (lineofBusinessEntry == null) {
                lineofBusinessEntry = new ArrayList<OperationalInformationType.LineofBusiness.LineofBusinessEntry>();
            }
            return this.lineofBusinessEntry;
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
         *         &lt;element name="ActivityText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "activityText"
        })
        public static class LineofBusinessEntry {

            @XmlElement(name = "ActivityText", required = true)
            protected String activityText;

            /**
             * Gets the value of the activityText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityText() {
                return activityText;
            }

            /**
             * Sets the value of the activityText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityText(String value) {
                this.activityText = value;
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
     *         &lt;element name="ImportsInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ImportsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="ImportsInformationEntry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ImportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ImportsTerritories" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ImportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
     *         &lt;element name="ExportsInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ExportsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="ExportsInformationEntry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ExportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ExportsTerritories" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ExportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
        "importsInformation",
        "exportsInformation"
    })
    public static class MarketsInformation {

        @XmlElement(name = "ImportsInformation")
        protected OperationalInformationType.MarketsInformation.ImportsInformation importsInformation;
        @XmlElement(name = "ExportsInformation")
        protected OperationalInformationType.MarketsInformation.ExportsInformation exportsInformation;

        /**
         * Gets the value of the importsInformation property.
         * 
         * @return
         *     possible object is
         *     {@link OperationalInformationType.MarketsInformation.ImportsInformation }
         *     
         */
        public OperationalInformationType.MarketsInformation.ImportsInformation getImportsInformation() {
            return importsInformation;
        }

        /**
         * Sets the value of the importsInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationalInformationType.MarketsInformation.ImportsInformation }
         *     
         */
        public void setImportsInformation(OperationalInformationType.MarketsInformation.ImportsInformation value) {
            this.importsInformation = value;
        }

        /**
         * Gets the value of the exportsInformation property.
         * 
         * @return
         *     possible object is
         *     {@link OperationalInformationType.MarketsInformation.ExportsInformation }
         *     
         */
        public OperationalInformationType.MarketsInformation.ExportsInformation getExportsInformation() {
            return exportsInformation;
        }

        /**
         * Sets the value of the exportsInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationalInformationType.MarketsInformation.ExportsInformation }
         *     
         */
        public void setExportsInformation(OperationalInformationType.MarketsInformation.ExportsInformation value) {
            this.exportsInformation = value;
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
         *         &lt;element name="ExportsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="ExportsInformationEntry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ExportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ExportsTerritories" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ExportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
            "exportsIndicator",
            "exportsInformationEntry"
        })
        public static class ExportsInformation {

            @XmlElement(name = "ExportsIndicator")
            protected Boolean exportsIndicator;
            @XmlElement(name = "ExportsInformationEntry")
            protected List<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry> exportsInformationEntry;

            /**
             * Gets the value of the exportsIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExportsIndicator() {
                return exportsIndicator;
            }

            /**
             * Sets the value of the exportsIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExportsIndicator(Boolean value) {
                this.exportsIndicator = value;
            }

            /**
             * Gets the value of the exportsInformationEntry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the exportsInformationEntry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExportsInformationEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry }
             * 
             * 
             */
            public List<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry> getExportsInformationEntry() {
                if (exportsInformationEntry == null) {
                    exportsInformationEntry = new ArrayList<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry>();
                }
                return this.exportsInformationEntry;
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
             *         &lt;element name="ExportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ExportsTerritories" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ExportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
                "exportsPercentage",
                "exportsTerritories",
                "exportsCountryCodes"
            })
            public static class ExportsInformationEntry {

                @XmlElement(name = "ExportsPercentage")
                protected BigDecimal exportsPercentage;
                @XmlElement(name = "ExportsTerritories")
                protected List<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsTerritories> exportsTerritories;
                @XmlElement(name = "ExportsCountryCodes")
                protected List<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsCountryCodes> exportsCountryCodes;

                /**
                 * Gets the value of the exportsPercentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getExportsPercentage() {
                    return exportsPercentage;
                }

                /**
                 * Sets the value of the exportsPercentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setExportsPercentage(BigDecimal value) {
                    this.exportsPercentage = value;
                }

                /**
                 * Gets the value of the exportsTerritories property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the exportsTerritories property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getExportsTerritories().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsTerritories }
                 * 
                 * 
                 */
                public List<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsTerritories> getExportsTerritories() {
                    if (exportsTerritories == null) {
                        exportsTerritories = new ArrayList<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsTerritories>();
                    }
                    return this.exportsTerritories;
                }

                /**
                 * Gets the value of the exportsCountryCodes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the exportsCountryCodes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getExportsCountryCodes().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsCountryCodes }
                 * 
                 * 
                 */
                public List<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsCountryCodes> getExportsCountryCodes() {
                    if (exportsCountryCodes == null) {
                        exportsCountryCodes = new ArrayList<OperationalInformationType.MarketsInformation.ExportsInformation.ExportsInformationEntry.ExportsCountryCodes>();
                    }
                    return this.exportsCountryCodes;
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
                 *         &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
                    "countryCode"
                })
                public static class ExportsCountryCodes {

                    @XmlElement(name = "CountryCode", required = true)
                    protected String countryCode;

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryCode(String value) {
                        this.countryCode = value;
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
                 *         &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "territoryText"
                })
                public static class ExportsTerritories {

                    @XmlElement(name = "TerritoryText", required = true)
                    protected String territoryText;

                    /**
                     * Gets the value of the territoryText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTerritoryText() {
                        return territoryText;
                    }

                    /**
                     * Sets the value of the territoryText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTerritoryText(String value) {
                        this.territoryText = value;
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
         *         &lt;element name="ImportsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="ImportsInformationEntry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ImportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ImportsTerritories" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ImportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
            "importsIndicator",
            "importsInformationEntry"
        })
        public static class ImportsInformation {

            @XmlElement(name = "ImportsIndicator")
            protected Boolean importsIndicator;
            @XmlElement(name = "ImportsInformationEntry")
            protected List<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry> importsInformationEntry;

            /**
             * Gets the value of the importsIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isImportsIndicator() {
                return importsIndicator;
            }

            /**
             * Sets the value of the importsIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setImportsIndicator(Boolean value) {
                this.importsIndicator = value;
            }

            /**
             * Gets the value of the importsInformationEntry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the importsInformationEntry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImportsInformationEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry }
             * 
             * 
             */
            public List<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry> getImportsInformationEntry() {
                if (importsInformationEntry == null) {
                    importsInformationEntry = new ArrayList<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry>();
                }
                return this.importsInformationEntry;
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
             *         &lt;element name="ImportsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ImportsTerritories" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ImportsCountryCodes" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
                "importsPercentage",
                "importsTerritories",
                "importsCountryCodes"
            })
            public static class ImportsInformationEntry {

                @XmlElement(name = "ImportsPercentage")
                protected BigDecimal importsPercentage;
                @XmlElement(name = "ImportsTerritories")
                protected List<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsTerritories> importsTerritories;
                @XmlElement(name = "ImportsCountryCodes")
                protected List<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsCountryCodes> importsCountryCodes;

                /**
                 * Gets the value of the importsPercentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getImportsPercentage() {
                    return importsPercentage;
                }

                /**
                 * Sets the value of the importsPercentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setImportsPercentage(BigDecimal value) {
                    this.importsPercentage = value;
                }

                /**
                 * Gets the value of the importsTerritories property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the importsTerritories property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getImportsTerritories().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsTerritories }
                 * 
                 * 
                 */
                public List<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsTerritories> getImportsTerritories() {
                    if (importsTerritories == null) {
                        importsTerritories = new ArrayList<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsTerritories>();
                    }
                    return this.importsTerritories;
                }

                /**
                 * Gets the value of the importsCountryCodes property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the importsCountryCodes property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getImportsCountryCodes().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsCountryCodes }
                 * 
                 * 
                 */
                public List<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsCountryCodes> getImportsCountryCodes() {
                    if (importsCountryCodes == null) {
                        importsCountryCodes = new ArrayList<OperationalInformationType.MarketsInformation.ImportsInformation.ImportsInformationEntry.ImportsCountryCodes>();
                    }
                    return this.importsCountryCodes;
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
                 *         &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
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
                    "countryCode"
                })
                public static class ImportsCountryCodes {

                    @XmlElement(name = "CountryCode", required = true)
                    protected String countryCode;

                    /**
                     * Gets the value of the countryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCountryCode() {
                        return countryCode;
                    }

                    /**
                     * Sets the value of the countryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCountryCode(String value) {
                        this.countryCode = value;
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
                 *         &lt;element name="TerritoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "territoryText"
                })
                public static class ImportsTerritories {

                    @XmlElement(name = "TerritoryText", required = true)
                    protected String territoryText;

                    /**
                     * Gets the value of the territoryText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTerritoryText() {
                        return territoryText;
                    }

                    /**
                     * Sets the value of the territoryText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTerritoryText(String value) {
                        this.territoryText = value;
                    }

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
     *         &lt;element name="BrandNames" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TradeMarks" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherNames" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherName">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
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
        "brandNames",
        "tradeMarks",
        "otherNames"
    })
    public static class OperationalBusinessNames {

        @XmlElement(name = "BrandNames")
        protected List<OperationalInformationType.OperationalBusinessNames.BrandNames> brandNames;
        @XmlElement(name = "TradeMarks")
        protected List<OperationalInformationType.OperationalBusinessNames.TradeMarks> tradeMarks;
        @XmlElement(name = "OtherNames")
        protected List<OperationalInformationType.OperationalBusinessNames.OtherNames> otherNames;

        /**
         * Gets the value of the brandNames property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the brandNames property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBrandNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.OperationalBusinessNames.BrandNames }
         * 
         * 
         */
        public List<OperationalInformationType.OperationalBusinessNames.BrandNames> getBrandNames() {
            if (brandNames == null) {
                brandNames = new ArrayList<OperationalInformationType.OperationalBusinessNames.BrandNames>();
            }
            return this.brandNames;
        }

        /**
         * Gets the value of the tradeMarks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tradeMarks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTradeMarks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.OperationalBusinessNames.TradeMarks }
         * 
         * 
         */
        public List<OperationalInformationType.OperationalBusinessNames.TradeMarks> getTradeMarks() {
            if (tradeMarks == null) {
                tradeMarks = new ArrayList<OperationalInformationType.OperationalBusinessNames.TradeMarks>();
            }
            return this.tradeMarks;
        }

        /**
         * Gets the value of the otherNames property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherNames property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.OperationalBusinessNames.OtherNames }
         * 
         * 
         */
        public List<OperationalInformationType.OperationalBusinessNames.OtherNames> getOtherNames() {
            if (otherNames == null) {
                otherNames = new ArrayList<OperationalInformationType.OperationalBusinessNames.OtherNames>();
            }
            return this.otherNames;
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
         *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "brandName"
        })
        public static class BrandNames {

            @XmlElement(name = "BrandName", required = true)
            protected String brandName;

            /**
             * Gets the value of the brandName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBrandName() {
                return brandName;
            }

            /**
             * Sets the value of the brandName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBrandName(String value) {
                this.brandName = value;
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
         *         &lt;element name="OtherName">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "otherName"
        })
        public static class OtherNames {

            @XmlElement(name = "OtherName", required = true)
            protected OperationalInformationType.OperationalBusinessNames.OtherNames.OtherName otherName;

            /**
             * Gets the value of the otherName property.
             * 
             * @return
             *     possible object is
             *     {@link OperationalInformationType.OperationalBusinessNames.OtherNames.OtherName }
             *     
             */
            public OperationalInformationType.OperationalBusinessNames.OtherNames.OtherName getOtherName() {
                return otherName;
            }

            /**
             * Sets the value of the otherName property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationalInformationType.OperationalBusinessNames.OtherNames.OtherName }
             *     
             */
            public void setOtherName(OperationalInformationType.OperationalBusinessNames.OtherNames.OtherName value) {
                this.otherName = value;
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
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class OtherName {

                @XmlValue
                protected String value;
                @XmlAttribute
                protected String type;

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
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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
         *         &lt;element name="TradeMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "tradeMark"
        })
        public static class TradeMarks {

            @XmlElement(name = "TradeMark", required = true)
            protected String tradeMark;

            /**
             * Gets the value of the tradeMark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTradeMark() {
                return tradeMark;
            }

            /**
             * Sets the value of the tradeMark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradeMark(String value) {
                this.tradeMark = value;
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
     *         &lt;element name="PremisesInformationEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PremisesTypeEntry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PremiseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TenureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PremiseLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegisteredAddressisPhysicalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="TotalArea" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BuiltArea" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AdditionalDetailsEntry" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "premisesInformationEntry"
    })
    public static class PremisesInformation {

        @XmlElement(name = "PremisesInformationEntry", required = true)
        protected List<OperationalInformationType.PremisesInformation.PremisesInformationEntry> premisesInformationEntry;

        /**
         * Gets the value of the premisesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the premisesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPremisesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry }
         * 
         * 
         */
        public List<OperationalInformationType.PremisesInformation.PremisesInformationEntry> getPremisesInformationEntry() {
            if (premisesInformationEntry == null) {
                premisesInformationEntry = new ArrayList<OperationalInformationType.PremisesInformation.PremisesInformationEntry>();
            }
            return this.premisesInformationEntry;
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
         *         &lt;element name="PremisesTypeEntry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PremiseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TenureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PremiseLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegisteredAddressisPhysicalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="TotalArea" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BuiltArea" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AdditionalDetailsEntry" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "premisesTypeEntry",
            "tenureType",
            "premiseLocation",
            "registeredAddressisPhysicalIndicator",
            "totalArea",
            "builtArea",
            "additionalDetailsEntry"
        })
        public static class PremisesInformationEntry {

            @XmlElement(name = "PremisesTypeEntry")
            protected List<OperationalInformationType.PremisesInformation.PremisesInformationEntry.PremisesTypeEntry> premisesTypeEntry;
            @XmlElement(name = "TenureType")
            protected String tenureType;
            @XmlElement(name = "PremiseLocation")
            protected String premiseLocation;
            @XmlElement(name = "RegisteredAddressisPhysicalIndicator")
            protected Boolean registeredAddressisPhysicalIndicator;
            @XmlElement(name = "TotalArea")
            protected OperationalInformationType.PremisesInformation.PremisesInformationEntry.TotalArea totalArea;
            @XmlElement(name = "BuiltArea")
            protected OperationalInformationType.PremisesInformation.PremisesInformationEntry.BuiltArea builtArea;
            @XmlElement(name = "AdditionalDetailsEntry")
            protected OperationalInformationType.PremisesInformation.PremisesInformationEntry.AdditionalDetailsEntry additionalDetailsEntry;

            /**
             * Gets the value of the premisesTypeEntry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premisesTypeEntry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremisesTypeEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry.PremisesTypeEntry }
             * 
             * 
             */
            public List<OperationalInformationType.PremisesInformation.PremisesInformationEntry.PremisesTypeEntry> getPremisesTypeEntry() {
                if (premisesTypeEntry == null) {
                    premisesTypeEntry = new ArrayList<OperationalInformationType.PremisesInformation.PremisesInformationEntry.PremisesTypeEntry>();
                }
                return this.premisesTypeEntry;
            }

            /**
             * Gets the value of the tenureType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTenureType() {
                return tenureType;
            }

            /**
             * Sets the value of the tenureType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTenureType(String value) {
                this.tenureType = value;
            }

            /**
             * Gets the value of the premiseLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremiseLocation() {
                return premiseLocation;
            }

            /**
             * Sets the value of the premiseLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPremiseLocation(String value) {
                this.premiseLocation = value;
            }

            /**
             * Gets the value of the registeredAddressisPhysicalIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRegisteredAddressisPhysicalIndicator() {
                return registeredAddressisPhysicalIndicator;
            }

            /**
             * Sets the value of the registeredAddressisPhysicalIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRegisteredAddressisPhysicalIndicator(Boolean value) {
                this.registeredAddressisPhysicalIndicator = value;
            }

            /**
             * Gets the value of the totalArea property.
             * 
             * @return
             *     possible object is
             *     {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry.TotalArea }
             *     
             */
            public OperationalInformationType.PremisesInformation.PremisesInformationEntry.TotalArea getTotalArea() {
                return totalArea;
            }

            /**
             * Sets the value of the totalArea property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry.TotalArea }
             *     
             */
            public void setTotalArea(OperationalInformationType.PremisesInformation.PremisesInformationEntry.TotalArea value) {
                this.totalArea = value;
            }

            /**
             * Gets the value of the builtArea property.
             * 
             * @return
             *     possible object is
             *     {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry.BuiltArea }
             *     
             */
            public OperationalInformationType.PremisesInformation.PremisesInformationEntry.BuiltArea getBuiltArea() {
                return builtArea;
            }

            /**
             * Sets the value of the builtArea property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry.BuiltArea }
             *     
             */
            public void setBuiltArea(OperationalInformationType.PremisesInformation.PremisesInformationEntry.BuiltArea value) {
                this.builtArea = value;
            }

            /**
             * Gets the value of the additionalDetailsEntry property.
             * 
             * @return
             *     possible object is
             *     {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry.AdditionalDetailsEntry }
             *     
             */
            public OperationalInformationType.PremisesInformation.PremisesInformationEntry.AdditionalDetailsEntry getAdditionalDetailsEntry() {
                return additionalDetailsEntry;
            }

            /**
             * Sets the value of the additionalDetailsEntry property.
             * 
             * @param value
             *     allowed object is
             *     {@link OperationalInformationType.PremisesInformation.PremisesInformationEntry.AdditionalDetailsEntry }
             *     
             */
            public void setAdditionalDetailsEntry(OperationalInformationType.PremisesInformation.PremisesInformationEntry.AdditionalDetailsEntry value) {
                this.additionalDetailsEntry = value;
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
             *         &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "additionalDetail"
            })
            public static class AdditionalDetailsEntry {

                @XmlElement(name = "AdditionalDetail", required = true)
                protected String additionalDetail;

                /**
                 * Gets the value of the additionalDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdditionalDetail() {
                    return additionalDetail;
                }

                /**
                 * Sets the value of the additionalDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdditionalDetail(String value) {
                    this.additionalDetail = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
             *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
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
            public static class BuiltArea {

                @XmlValue
                protected BigInteger value;
                @XmlAttribute
                protected String unitofSize;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the unitofSize property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitofSize() {
                    return unitofSize;
                }

                /**
                 * Sets the value of the unitofSize property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitofSize(String value) {
                    this.unitofSize = value;
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
             *         &lt;element name="PremiseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "premiseType"
            })
            public static class PremisesTypeEntry {

                @XmlElement(name = "PremiseType", required = true)
                protected String premiseType;

                /**
                 * Gets the value of the premiseType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPremiseType() {
                    return premiseType;
                }

                /**
                 * Sets the value of the premiseType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPremiseType(String value) {
                    this.premiseType = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
             *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
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
            public static class TotalArea {

                @XmlValue
                protected BigInteger value;
                @XmlAttribute
                protected String unitofSize;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the unitofSize property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitofSize() {
                    return unitofSize;
                }

                /**
                 * Sets the value of the unitofSize property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitofSize(String value) {
                    this.unitofSize = value;
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
     *         &lt;element name="LocalMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="RegionalMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="NationalMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ExportMarketSalesPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DirectCustomersIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DirectCustomersQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="CustomerDescriptions" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustomerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SalesChannels" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CustomerNames" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SupplierNames" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AgentsUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="AgentsUsedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StorageUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="BusinessisAgentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="SubContractorsUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="SubContractorsUsedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="BusinessSeasonalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="PayTerms" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PayTermText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SalesTerms" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SalesTermText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "localMarketSalesPercentage",
        "regionalMarketSalesPercentage",
        "nationalMarketSalesPercentage",
        "exportMarketSalesPercentage",
        "directCustomersIndicator",
        "directCustomersQuantity",
        "customerDescriptions",
        "salesChannels",
        "customerNames",
        "supplierNames",
        "agentsUsedIndicator",
        "agentsUsedQuantity",
        "storageUsedIndicator",
        "businessisAgentIndicator",
        "subContractorsUsedIndicator",
        "subContractorsUsedPercentage",
        "businessSeasonalIndicator",
        "payTerms",
        "salesTerms",
        "additionalDetailsEntry"
    })
    public static class SalesInformation {

        @XmlElement(name = "LocalMarketSalesPercentage")
        protected BigDecimal localMarketSalesPercentage;
        @XmlElement(name = "RegionalMarketSalesPercentage")
        protected BigDecimal regionalMarketSalesPercentage;
        @XmlElement(name = "NationalMarketSalesPercentage")
        protected BigDecimal nationalMarketSalesPercentage;
        @XmlElement(name = "ExportMarketSalesPercentage")
        protected BigDecimal exportMarketSalesPercentage;
        @XmlElement(name = "DirectCustomersIndicator")
        protected Boolean directCustomersIndicator;
        @XmlElement(name = "DirectCustomersQuantity")
        protected BigInteger directCustomersQuantity;
        @XmlElement(name = "CustomerDescriptions")
        protected List<OperationalInformationType.SalesInformation.CustomerDescriptions> customerDescriptions;
        @XmlElement(name = "SalesChannels")
        protected List<OperationalInformationType.SalesInformation.SalesChannels> salesChannels;
        @XmlElement(name = "CustomerNames")
        protected List<OperationalInformationType.SalesInformation.CustomerNames> customerNames;
        @XmlElement(name = "SupplierNames")
        protected List<OperationalInformationType.SalesInformation.SupplierNames> supplierNames;
        @XmlElement(name = "AgentsUsedIndicator")
        protected Boolean agentsUsedIndicator;
        @XmlElement(name = "AgentsUsedQuantity")
        protected String agentsUsedQuantity;
        @XmlElement(name = "StorageUsedIndicator")
        protected Boolean storageUsedIndicator;
        @XmlElement(name = "BusinessisAgentIndicator")
        protected Boolean businessisAgentIndicator;
        @XmlElement(name = "SubContractorsUsedIndicator")
        protected Boolean subContractorsUsedIndicator;
        @XmlElement(name = "SubContractorsUsedPercentage")
        protected BigDecimal subContractorsUsedPercentage;
        @XmlElement(name = "BusinessSeasonalIndicator")
        protected Boolean businessSeasonalIndicator;
        @XmlElement(name = "PayTerms")
        protected List<OperationalInformationType.SalesInformation.PayTerms> payTerms;
        @XmlElement(name = "SalesTerms")
        protected List<OperationalInformationType.SalesInformation.SalesTerms> salesTerms;
        @XmlElement(name = "AdditionalDetailsEntry")
        protected List<OperationalInformationType.SalesInformation.AdditionalDetailsEntry> additionalDetailsEntry;

        /**
         * Gets the value of the localMarketSalesPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLocalMarketSalesPercentage() {
            return localMarketSalesPercentage;
        }

        /**
         * Sets the value of the localMarketSalesPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLocalMarketSalesPercentage(BigDecimal value) {
            this.localMarketSalesPercentage = value;
        }

        /**
         * Gets the value of the regionalMarketSalesPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRegionalMarketSalesPercentage() {
            return regionalMarketSalesPercentage;
        }

        /**
         * Sets the value of the regionalMarketSalesPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRegionalMarketSalesPercentage(BigDecimal value) {
            this.regionalMarketSalesPercentage = value;
        }

        /**
         * Gets the value of the nationalMarketSalesPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNationalMarketSalesPercentage() {
            return nationalMarketSalesPercentage;
        }

        /**
         * Sets the value of the nationalMarketSalesPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNationalMarketSalesPercentage(BigDecimal value) {
            this.nationalMarketSalesPercentage = value;
        }

        /**
         * Gets the value of the exportMarketSalesPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExportMarketSalesPercentage() {
            return exportMarketSalesPercentage;
        }

        /**
         * Sets the value of the exportMarketSalesPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setExportMarketSalesPercentage(BigDecimal value) {
            this.exportMarketSalesPercentage = value;
        }

        /**
         * Gets the value of the directCustomersIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDirectCustomersIndicator() {
            return directCustomersIndicator;
        }

        /**
         * Sets the value of the directCustomersIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDirectCustomersIndicator(Boolean value) {
            this.directCustomersIndicator = value;
        }

        /**
         * Gets the value of the directCustomersQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDirectCustomersQuantity() {
            return directCustomersQuantity;
        }

        /**
         * Sets the value of the directCustomersQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDirectCustomersQuantity(BigInteger value) {
            this.directCustomersQuantity = value;
        }

        /**
         * Gets the value of the customerDescriptions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerDescriptions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerDescriptions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.SalesInformation.CustomerDescriptions }
         * 
         * 
         */
        public List<OperationalInformationType.SalesInformation.CustomerDescriptions> getCustomerDescriptions() {
            if (customerDescriptions == null) {
                customerDescriptions = new ArrayList<OperationalInformationType.SalesInformation.CustomerDescriptions>();
            }
            return this.customerDescriptions;
        }

        /**
         * Gets the value of the salesChannels property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the salesChannels property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSalesChannels().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.SalesInformation.SalesChannels }
         * 
         * 
         */
        public List<OperationalInformationType.SalesInformation.SalesChannels> getSalesChannels() {
            if (salesChannels == null) {
                salesChannels = new ArrayList<OperationalInformationType.SalesInformation.SalesChannels>();
            }
            return this.salesChannels;
        }

        /**
         * Gets the value of the customerNames property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerNames property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.SalesInformation.CustomerNames }
         * 
         * 
         */
        public List<OperationalInformationType.SalesInformation.CustomerNames> getCustomerNames() {
            if (customerNames == null) {
                customerNames = new ArrayList<OperationalInformationType.SalesInformation.CustomerNames>();
            }
            return this.customerNames;
        }

        /**
         * Gets the value of the supplierNames property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplierNames property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplierNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.SalesInformation.SupplierNames }
         * 
         * 
         */
        public List<OperationalInformationType.SalesInformation.SupplierNames> getSupplierNames() {
            if (supplierNames == null) {
                supplierNames = new ArrayList<OperationalInformationType.SalesInformation.SupplierNames>();
            }
            return this.supplierNames;
        }

        /**
         * Gets the value of the agentsUsedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAgentsUsedIndicator() {
            return agentsUsedIndicator;
        }

        /**
         * Sets the value of the agentsUsedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAgentsUsedIndicator(Boolean value) {
            this.agentsUsedIndicator = value;
        }

        /**
         * Gets the value of the agentsUsedQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentsUsedQuantity() {
            return agentsUsedQuantity;
        }

        /**
         * Sets the value of the agentsUsedQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentsUsedQuantity(String value) {
            this.agentsUsedQuantity = value;
        }

        /**
         * Gets the value of the storageUsedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStorageUsedIndicator() {
            return storageUsedIndicator;
        }

        /**
         * Sets the value of the storageUsedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStorageUsedIndicator(Boolean value) {
            this.storageUsedIndicator = value;
        }

        /**
         * Gets the value of the businessisAgentIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBusinessisAgentIndicator() {
            return businessisAgentIndicator;
        }

        /**
         * Sets the value of the businessisAgentIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBusinessisAgentIndicator(Boolean value) {
            this.businessisAgentIndicator = value;
        }

        /**
         * Gets the value of the subContractorsUsedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSubContractorsUsedIndicator() {
            return subContractorsUsedIndicator;
        }

        /**
         * Sets the value of the subContractorsUsedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSubContractorsUsedIndicator(Boolean value) {
            this.subContractorsUsedIndicator = value;
        }

        /**
         * Gets the value of the subContractorsUsedPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSubContractorsUsedPercentage() {
            return subContractorsUsedPercentage;
        }

        /**
         * Sets the value of the subContractorsUsedPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSubContractorsUsedPercentage(BigDecimal value) {
            this.subContractorsUsedPercentage = value;
        }

        /**
         * Gets the value of the businessSeasonalIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBusinessSeasonalIndicator() {
            return businessSeasonalIndicator;
        }

        /**
         * Sets the value of the businessSeasonalIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBusinessSeasonalIndicator(Boolean value) {
            this.businessSeasonalIndicator = value;
        }

        /**
         * Gets the value of the payTerms property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payTerms property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayTerms().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.SalesInformation.PayTerms }
         * 
         * 
         */
        public List<OperationalInformationType.SalesInformation.PayTerms> getPayTerms() {
            if (payTerms == null) {
                payTerms = new ArrayList<OperationalInformationType.SalesInformation.PayTerms>();
            }
            return this.payTerms;
        }

        /**
         * Gets the value of the salesTerms property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the salesTerms property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSalesTerms().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.SalesInformation.SalesTerms }
         * 
         * 
         */
        public List<OperationalInformationType.SalesInformation.SalesTerms> getSalesTerms() {
            if (salesTerms == null) {
                salesTerms = new ArrayList<OperationalInformationType.SalesInformation.SalesTerms>();
            }
            return this.salesTerms;
        }

        /**
         * Gets the value of the additionalDetailsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalDetailsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalDetailsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OperationalInformationType.SalesInformation.AdditionalDetailsEntry }
         * 
         * 
         */
        public List<OperationalInformationType.SalesInformation.AdditionalDetailsEntry> getAdditionalDetailsEntry() {
            if (additionalDetailsEntry == null) {
                additionalDetailsEntry = new ArrayList<OperationalInformationType.SalesInformation.AdditionalDetailsEntry>();
            }
            return this.additionalDetailsEntry;
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
         *         &lt;element name="AdditionalDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "additionalDetail"
        })
        public static class AdditionalDetailsEntry {

            @XmlElement(name = "AdditionalDetail", required = true)
            protected String additionalDetail;

            /**
             * Gets the value of the additionalDetail property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalDetail() {
                return additionalDetail;
            }

            /**
             * Sets the value of the additionalDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalDetail(String value) {
                this.additionalDetail = value;
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
         *         &lt;element name="CustomerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "customerDescription"
        })
        public static class CustomerDescriptions {

            @XmlElement(name = "CustomerDescription", required = true)
            protected String customerDescription;

            /**
             * Gets the value of the customerDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerDescription() {
                return customerDescription;
            }

            /**
             * Sets the value of the customerDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerDescription(String value) {
                this.customerDescription = value;
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
         *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "customerName"
        })
        public static class CustomerNames {

            @XmlElement(name = "CustomerName", required = true)
            protected String customerName;

            /**
             * Gets the value of the customerName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerName() {
                return customerName;
            }

            /**
             * Sets the value of the customerName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerName(String value) {
                this.customerName = value;
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
         *         &lt;element name="PayTermText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "payTermText"
        })
        public static class PayTerms {

            @XmlElement(name = "PayTermText", required = true)
            protected String payTermText;

            /**
             * Gets the value of the payTermText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayTermText() {
                return payTermText;
            }

            /**
             * Sets the value of the payTermText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayTermText(String value) {
                this.payTermText = value;
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
         *         &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "salesChannel"
        })
        public static class SalesChannels {

            @XmlElement(name = "SalesChannel", required = true)
            protected String salesChannel;

            /**
             * Gets the value of the salesChannel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalesChannel() {
                return salesChannel;
            }

            /**
             * Sets the value of the salesChannel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalesChannel(String value) {
                this.salesChannel = value;
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
         *         &lt;element name="SalesTermText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "salesTermText"
        })
        public static class SalesTerms {

            @XmlElement(name = "SalesTermText", required = true)
            protected String salesTermText;

            /**
             * Gets the value of the salesTermText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSalesTermText() {
                return salesTermText;
            }

            /**
             * Sets the value of the salesTermText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSalesTermText(String value) {
                this.salesTermText = value;
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
         *         &lt;element name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "supplierName"
        })
        public static class SupplierNames {

            @XmlElement(name = "SupplierName", required = true)
            protected String supplierName;

            /**
             * Gets the value of the supplierName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierName() {
                return supplierName;
            }

            /**
             * Sets the value of the supplierName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierName(String value) {
                this.supplierName = value;
            }

        }

    }

}
