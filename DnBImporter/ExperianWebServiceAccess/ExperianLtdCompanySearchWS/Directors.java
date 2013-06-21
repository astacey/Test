
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Directors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Directors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentDirector" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CurrentDirectors" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreviousDirector" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PreviousDirectors" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Directors", propOrder = {
    "currentDirector",
    "previousDirector"
})
public class Directors {

    @XmlElement(name = "CurrentDirector")
    protected List<CurrentDirectors> currentDirector;
    @XmlElement(name = "PreviousDirector")
    protected List<PreviousDirectors> previousDirector;

    /**
     * Gets the value of the currentDirector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentDirector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentDirector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentDirectors }
     * 
     * 
     */
    public List<CurrentDirectors> getCurrentDirector() {
        if (currentDirector == null) {
            currentDirector = new ArrayList<CurrentDirectors>();
        }
        return this.currentDirector;
    }

    /**
     * Gets the value of the previousDirector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousDirector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousDirector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousDirectors }
     * 
     * 
     */
    public List<PreviousDirectors> getPreviousDirector() {
        if (previousDirector == null) {
            previousDirector = new ArrayList<PreviousDirectors>();
        }
        return this.previousDirector;
    }

}
