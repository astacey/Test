
package DBModifyRegistrationClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMODREGNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMODREGNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfMODREGNRSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}MODREGNRS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMODREGNRS", propOrder = {
    "arrayOfMODREGNRSItem"
})
public class ArrayOfMODREGNRS {

    @XmlElement(name = "ArrayOfMODREGNRSItem", required = true)
    protected List<MODREGNRS> arrayOfMODREGNRSItem;

    /**
     * Gets the value of the arrayOfMODREGNRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfMODREGNRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfMODREGNRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MODREGNRS }
     * 
     * 
     */
    public List<MODREGNRS> getArrayOfMODREGNRSItem() {
        if (arrayOfMODREGNRSItem == null) {
            arrayOfMODREGNRSItem = new ArrayList<MODREGNRS>();
        }
        return this.arrayOfMODREGNRSItem;
    }

}
