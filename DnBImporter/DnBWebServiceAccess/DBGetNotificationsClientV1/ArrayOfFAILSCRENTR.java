
package DBGetNotificationsClientV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFAIL_SCR_ENTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFAIL_SCR_ENTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfFAIL_SCR_ENTRItem" type="{https://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V1/wsp_GetNotifications_V1}FAIL_SCR_ENTR" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFAIL_SCR_ENTR", propOrder = {
    "arrayOfFAILSCRENTRItem"
})
public class ArrayOfFAILSCRENTR {

    @XmlElement(name = "ArrayOfFAIL_SCR_ENTRItem", required = true)
    protected List<FAILSCRENTR> arrayOfFAILSCRENTRItem;

    /**
     * Gets the value of the arrayOfFAILSCRENTRItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfFAILSCRENTRItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfFAILSCRENTRItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FAILSCRENTR }
     * 
     * 
     */
    public List<FAILSCRENTR> getArrayOfFAILSCRENTRItem() {
        if (arrayOfFAILSCRENTRItem == null) {
            arrayOfFAILSCRENTRItem = new ArrayList<FAILSCRENTR>();
        }
        return this.arrayOfFAILSCRENTRItem;
    }

}
