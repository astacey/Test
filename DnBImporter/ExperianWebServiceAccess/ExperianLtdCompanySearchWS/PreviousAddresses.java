
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousAddresses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousAddresses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumPrevAddresses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreviousCRO" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PrevCRO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousAddresses", propOrder = {
    "numPrevAddresses",
    "previousCRO"
})
public class PreviousAddresses {

    @XmlElement(name = "NumPrevAddresses")
    protected Integer numPrevAddresses;
    @XmlElement(name = "PreviousCRO")
    protected List<PrevCRO> previousCRO;

    /**
     * Gets the value of the numPrevAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevAddresses() {
        return numPrevAddresses;
    }

    /**
     * Sets the value of the numPrevAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevAddresses(Integer value) {
        this.numPrevAddresses = value;
    }

    /**
     * Gets the value of the previousCRO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousCRO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousCRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrevCRO }
     * 
     * 
     */
    public List<PrevCRO> getPreviousCRO() {
        if (previousCRO == null) {
            previousCRO = new ArrayList<PrevCRO>();
        }
        return this.previousCRO;
    }

}
