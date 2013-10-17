
package DBGetNotificationsClientV3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNTFCRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNTFCRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfNTFCRSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}NTFCRS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNTFCRS", propOrder = {
    "arrayOfNTFCRSItem"
})
public class ArrayOfNTFCRS {

    @XmlElement(name = "ArrayOfNTFCRSItem", required = true)
    protected List<NTFCRS> arrayOfNTFCRSItem;

    /**
     * Gets the value of the arrayOfNTFCRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfNTFCRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfNTFCRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NTFCRS }
     * 
     * 
     */
    public List<NTFCRS> getArrayOfNTFCRSItem() {
        if (arrayOfNTFCRSItem == null) {
            arrayOfNTFCRSItem = new ArrayList<NTFCRS>();
        }
        return this.arrayOfNTFCRSItem;
    }

}
