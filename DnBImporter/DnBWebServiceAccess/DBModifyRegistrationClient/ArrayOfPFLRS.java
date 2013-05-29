
package DBModifyRegistrationClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPFLRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPFLRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfPFLRSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}PFLRS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPFLRS", propOrder = {
    "arrayOfPFLRSItem"
})
public class ArrayOfPFLRS {

    @XmlElement(name = "ArrayOfPFLRSItem", required = true)
    protected List<PFLRS> arrayOfPFLRSItem;

    /**
     * Gets the value of the arrayOfPFLRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfPFLRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfPFLRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PFLRS }
     * 
     * 
     */
    public List<PFLRS> getArrayOfPFLRSItem() {
        if (arrayOfPFLRSItem == null) {
            arrayOfPFLRSItem = new ArrayList<PFLRS>();
        }
        return this.arrayOfPFLRSItem;
    }

}
