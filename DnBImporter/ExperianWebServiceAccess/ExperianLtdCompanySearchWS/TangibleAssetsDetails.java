
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TangibleAssetsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TangibleAssetsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TangibleAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LandBuildings" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Freehold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Leasehold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FixturesFittings" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PlantVehicles" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Plant" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Vehicles" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AssetsInCourseConstruction" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherTangibleAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TangibleAssetsDetails", propOrder = {
    "tangibleAssets",
    "landBuildings",
    "freehold",
    "leasehold",
    "fixturesFittings",
    "plantVehicles",
    "plant",
    "vehicles",
    "assetsInCourseConstruction",
    "otherTangibleAssets"
})
public class TangibleAssetsDetails {

    @XmlElement(name = "TangibleAssets")
    protected Long tangibleAssets;
    @XmlElement(name = "LandBuildings")
    protected Long landBuildings;
    @XmlElement(name = "Freehold")
    protected Long freehold;
    @XmlElement(name = "Leasehold")
    protected Long leasehold;
    @XmlElement(name = "FixturesFittings")
    protected Long fixturesFittings;
    @XmlElement(name = "PlantVehicles")
    protected Long plantVehicles;
    @XmlElement(name = "Plant")
    protected Long plant;
    @XmlElement(name = "Vehicles")
    protected Long vehicles;
    @XmlElement(name = "AssetsInCourseConstruction")
    protected Long assetsInCourseConstruction;
    @XmlElement(name = "OtherTangibleAssets")
    protected Long otherTangibleAssets;

    /**
     * Gets the value of the tangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTangibleAssets() {
        return tangibleAssets;
    }

    /**
     * Sets the value of the tangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTangibleAssets(Long value) {
        this.tangibleAssets = value;
    }

    /**
     * Gets the value of the landBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLandBuildings() {
        return landBuildings;
    }

    /**
     * Sets the value of the landBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLandBuildings(Long value) {
        this.landBuildings = value;
    }

    /**
     * Gets the value of the freehold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreehold() {
        return freehold;
    }

    /**
     * Sets the value of the freehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreehold(Long value) {
        this.freehold = value;
    }

    /**
     * Gets the value of the leasehold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLeasehold() {
        return leasehold;
    }

    /**
     * Sets the value of the leasehold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLeasehold(Long value) {
        this.leasehold = value;
    }

    /**
     * Gets the value of the fixturesFittings property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFixturesFittings() {
        return fixturesFittings;
    }

    /**
     * Sets the value of the fixturesFittings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFixturesFittings(Long value) {
        this.fixturesFittings = value;
    }

    /**
     * Gets the value of the plantVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlantVehicles() {
        return plantVehicles;
    }

    /**
     * Sets the value of the plantVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlantVehicles(Long value) {
        this.plantVehicles = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlant(Long value) {
        this.plant = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicles(Long value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the assetsInCourseConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetsInCourseConstruction() {
        return assetsInCourseConstruction;
    }

    /**
     * Sets the value of the assetsInCourseConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetsInCourseConstruction(Long value) {
        this.assetsInCourseConstruction = value;
    }

    /**
     * Gets the value of the otherTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherTangibleAssets() {
        return otherTangibleAssets;
    }

    /**
     * Sets the value of the otherTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherTangibleAssets(Long value) {
        this.otherTangibleAssets = value;
    }

}
