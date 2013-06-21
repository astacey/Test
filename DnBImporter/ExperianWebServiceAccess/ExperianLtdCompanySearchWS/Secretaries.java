
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Secretaries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Secretaries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentSecretary" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CurrentSecretary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreviousSecretary" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PreviousSecretary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Secretaries", propOrder = {
    "currentSecretary",
    "previousSecretary"
})
public class Secretaries {

    @XmlElement(name = "CurrentSecretary")
    protected List<CurrentSecretary> currentSecretary;
    @XmlElement(name = "PreviousSecretary")
    protected List<PreviousSecretary> previousSecretary;

    /**
     * Gets the value of the currentSecretary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentSecretary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentSecretary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentSecretary }
     * 
     * 
     */
    public List<CurrentSecretary> getCurrentSecretary() {
        if (currentSecretary == null) {
            currentSecretary = new ArrayList<CurrentSecretary>();
        }
        return this.currentSecretary;
    }

    /**
     * Gets the value of the previousSecretary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousSecretary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousSecretary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousSecretary }
     * 
     * 
     */
    public List<PreviousSecretary> getPreviousSecretary() {
        if (previousSecretary == null) {
            previousSecretary = new ArrayList<PreviousSecretary>();
        }
        return this.previousSecretary;
    }

}
