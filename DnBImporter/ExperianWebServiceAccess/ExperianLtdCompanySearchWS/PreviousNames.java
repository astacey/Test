
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousNames complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousNames">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumPrevNames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreviousName" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PrevName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousNames", propOrder = {
    "numPrevNames",
    "previousName"
})
public class PreviousNames {

    @XmlElement(name = "NumPrevNames")
    protected Integer numPrevNames;
    @XmlElement(name = "PreviousName")
    protected List<PrevName> previousName;

    /**
     * Gets the value of the numPrevNames property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevNames() {
        return numPrevNames;
    }

    /**
     * Sets the value of the numPrevNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevNames(Integer value) {
        this.numPrevNames = value;
    }

    /**
     * Gets the value of the previousName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrevName }
     * 
     * 
     */
    public List<PrevName> getPreviousName() {
        if (previousName == null) {
            previousName = new ArrayList<PrevName>();
        }
        return this.previousName;
    }

}
