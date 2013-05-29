
package DBAddRegistrationClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfADDREGNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfADDREGNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfADDREGNRSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/AddRegistration}ADDREGNRS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfADDREGNRS", propOrder = {
    "arrayOfADDREGNRSItem"
})
public class ArrayOfADDREGNRS {

    @XmlElement(name = "ArrayOfADDREGNRSItem", required = true)
    protected List<ADDREGNRS> arrayOfADDREGNRSItem;

    /**
     * Gets the value of the arrayOfADDREGNRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfADDREGNRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfADDREGNRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADDREGNRS }
     * 
     * 
     */
    public List<ADDREGNRS> getArrayOfADDREGNRSItem() {
        if (arrayOfADDREGNRSItem == null) {
            arrayOfADDREGNRSItem = new ArrayList<ADDREGNRS>();
        }
        return this.arrayOfADDREGNRSItem;
    }

}
