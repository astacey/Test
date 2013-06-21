
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfString3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfString3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeHistoricalAverageDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfString3", propOrder = {
    "ageHistoricalAverageDelphiScore"
})
public class ArrayOfString3 {

    @XmlElement(name = "AgeHistoricalAverageDelphiScore")
    protected List<String> ageHistoricalAverageDelphiScore;

    /**
     * Gets the value of the ageHistoricalAverageDelphiScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageHistoricalAverageDelphiScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeHistoricalAverageDelphiScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAgeHistoricalAverageDelphiScore() {
        if (ageHistoricalAverageDelphiScore == null) {
            ageHistoricalAverageDelphiScore = new ArrayList<String>();
        }
        return this.ageHistoricalAverageDelphiScore;
    }

}
