
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Liquidators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Liquidators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AppointmentDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LiquidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppointedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberLiquidators" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NatureOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Liquidator" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Liquidator" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liquidators", propOrder = {
    "publicationDate",
    "appointmentDate",
    "liquidationType",
    "appointedBy",
    "numberLiquidators",
    "tradingName",
    "natureOfBusiness",
    "liquidator"
})
public class Liquidators {

    @XmlElement(name = "PublicationDate")
    protected CCYYMMDD publicationDate;
    @XmlElement(name = "AppointmentDate")
    protected CCYYMMDD appointmentDate;
    @XmlElement(name = "LiquidationType")
    protected String liquidationType;
    @XmlElement(name = "AppointedBy")
    protected String appointedBy;
    @XmlElement(name = "NumberLiquidators")
    protected Integer numberLiquidators;
    @XmlElement(name = "TradingName")
    protected String tradingName;
    @XmlElement(name = "NatureOfBusiness")
    protected String natureOfBusiness;
    @XmlElement(name = "Liquidator")
    protected List<Liquidator> liquidator;

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setPublicationDate(CCYYMMDD value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setAppointmentDate(CCYYMMDD value) {
        this.appointmentDate = value;
    }

    /**
     * Gets the value of the liquidationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiquidationType() {
        return liquidationType;
    }

    /**
     * Sets the value of the liquidationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiquidationType(String value) {
        this.liquidationType = value;
    }

    /**
     * Gets the value of the appointedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointedBy() {
        return appointedBy;
    }

    /**
     * Sets the value of the appointedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointedBy(String value) {
        this.appointedBy = value;
    }

    /**
     * Gets the value of the numberLiquidators property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberLiquidators() {
        return numberLiquidators;
    }

    /**
     * Sets the value of the numberLiquidators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberLiquidators(Integer value) {
        this.numberLiquidators = value;
    }

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
     * Gets the value of the natureOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    /**
     * Sets the value of the natureOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureOfBusiness(String value) {
        this.natureOfBusiness = value;
    }

    /**
     * Gets the value of the liquidator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liquidator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiquidator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Liquidator }
     * 
     * 
     */
    public List<Liquidator> getLiquidator() {
        if (liquidator == null) {
            liquidator = new ArrayList<Liquidator>();
        }
        return this.liquidator;
    }

}
