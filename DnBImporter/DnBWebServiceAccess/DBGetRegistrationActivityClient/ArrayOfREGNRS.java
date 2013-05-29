
package DBGetRegistrationActivityClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfREGNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfREGNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfREGNRSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity}REGNRS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfREGNRS", propOrder = {
    "arrayOfREGNRSItem"
})
public class ArrayOfREGNRS {

    @XmlElement(name = "ArrayOfREGNRSItem", required = true)
    protected List<REGNRS> arrayOfREGNRSItem;

    /**
     * Gets the value of the arrayOfREGNRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfREGNRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfREGNRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REGNRS }
     * 
     * 
     */
    public List<REGNRS> getArrayOfREGNRSItem() {
        if (arrayOfREGNRSItem == null) {
            arrayOfREGNRSItem = new ArrayList<REGNRS>();
        }
        return this.arrayOfREGNRSItem;
    }

}
