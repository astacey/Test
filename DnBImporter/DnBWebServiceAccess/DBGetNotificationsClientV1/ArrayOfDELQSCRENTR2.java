
package DBGetNotificationsClientV1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDELQ_SCR_ENTR2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDELQ_SCR_ENTR2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfDELQ_SCR_ENTR2Item" type="{https://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V1/wsp_GetNotifications_V1}DELQ_SCR_ENTR2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDELQ_SCR_ENTR2", propOrder = {
    "arrayOfDELQSCRENTR2Item"
})
public class ArrayOfDELQSCRENTR2 {

    @XmlElement(name = "ArrayOfDELQ_SCR_ENTR2Item", required = true)
    protected List<DELQSCRENTR2> arrayOfDELQSCRENTR2Item;

    /**
     * Gets the value of the arrayOfDELQSCRENTR2Item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfDELQSCRENTR2Item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfDELQSCRENTR2Item().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELQSCRENTR2 }
     * 
     * 
     */
    public List<DELQSCRENTR2> getArrayOfDELQSCRENTR2Item() {
        if (arrayOfDELQSCRENTR2Item == null) {
            arrayOfDELQSCRENTR2Item = new ArrayList<DELQSCRENTR2>();
        }
        return this.arrayOfDELQSCRENTR2Item;
    }

}
