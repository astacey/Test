
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TurnOverSalesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TurnOverSalesDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TurnoverSales" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HomeNation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Europe" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RestOfTheWorld" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Export" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TurnOverSalesDetails", propOrder = {
    "turnoverSales",
    "homeNation",
    "europe",
    "restOfTheWorld",
    "export"
})
public class TurnOverSalesDetails {

    @XmlElement(name = "TurnoverSales")
    protected Long turnoverSales;
    @XmlElement(name = "HomeNation")
    protected Long homeNation;
    @XmlElement(name = "Europe")
    protected Long europe;
    @XmlElement(name = "RestOfTheWorld")
    protected Long restOfTheWorld;
    @XmlElement(name = "Export")
    protected Long export;

    /**
     * Gets the value of the turnoverSales property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnoverSales() {
        return turnoverSales;
    }

    /**
     * Sets the value of the turnoverSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnoverSales(Long value) {
        this.turnoverSales = value;
    }

    /**
     * Gets the value of the homeNation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHomeNation() {
        return homeNation;
    }

    /**
     * Sets the value of the homeNation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHomeNation(Long value) {
        this.homeNation = value;
    }

    /**
     * Gets the value of the europe property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEurope() {
        return europe;
    }

    /**
     * Sets the value of the europe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEurope(Long value) {
        this.europe = value;
    }

    /**
     * Gets the value of the restOfTheWorld property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestOfTheWorld() {
        return restOfTheWorld;
    }

    /**
     * Sets the value of the restOfTheWorld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestOfTheWorld(Long value) {
        this.restOfTheWorld = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExport(Long value) {
        this.export = value;
    }

}
