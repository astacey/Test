
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoriesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoriesDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inventories" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RawMaterialStock" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WorkInProgress" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FinishedGoods" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoriesDetails", propOrder = {
    "inventories",
    "rawMaterialStock",
    "workInProgress",
    "finishedGoods"
})
public class InventoriesDetails {

    @XmlElement(name = "Inventories")
    protected Long inventories;
    @XmlElement(name = "RawMaterialStock")
    protected Long rawMaterialStock;
    @XmlElement(name = "WorkInProgress")
    protected Long workInProgress;
    @XmlElement(name = "FinishedGoods")
    protected Long finishedGoods;

    /**
     * Gets the value of the inventories property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInventories() {
        return inventories;
    }

    /**
     * Sets the value of the inventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInventories(Long value) {
        this.inventories = value;
    }

    /**
     * Gets the value of the rawMaterialStock property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRawMaterialStock() {
        return rawMaterialStock;
    }

    /**
     * Sets the value of the rawMaterialStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRawMaterialStock(Long value) {
        this.rawMaterialStock = value;
    }

    /**
     * Gets the value of the workInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkInProgress() {
        return workInProgress;
    }

    /**
     * Sets the value of the workInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkInProgress(Long value) {
        this.workInProgress = value;
    }

    /**
     * Gets the value of the finishedGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinishedGoods() {
        return finishedGoods;
    }

    /**
     * Sets the value of the finishedGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinishedGoods(Long value) {
        this.finishedGoods = value;
    }

}
