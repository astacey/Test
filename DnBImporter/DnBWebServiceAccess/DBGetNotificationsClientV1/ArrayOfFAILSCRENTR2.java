
package DBGetNotificationsClientV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFAIL_SCR_ENTR2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFAIL_SCR_ENTR2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfFAIL_SCR_ENTR2Item" type="{https://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V1/wsp_GetNotifications_V1}FAIL_SCR_ENTR2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFAIL_SCR_ENTR2", propOrder = {
    "arrayOfFAILSCRENTR2Item"
})
public class ArrayOfFAILSCRENTR2 {

    @XmlElement(name = "ArrayOfFAIL_SCR_ENTR2Item", required = true)
    protected List<FAILSCRENTR2> arrayOfFAILSCRENTR2Item;

    /**
     * Gets the value of the arrayOfFAILSCRENTR2Item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfFAILSCRENTR2Item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfFAILSCRENTR2Item().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAILSCRENTR2 }
     * 
     * 
     */
    public List<FAILSCRENTR2> getArrayOfFAILSCRENTR2Item() {
        if (arrayOfFAILSCRENTR2Item == null) {
            arrayOfFAILSCRENTR2Item = new ArrayList<FAILSCRENTR2>();
        }
        return this.arrayOfFAILSCRENTR2Item;
    }

}
