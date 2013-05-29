
package DBGetNotificationsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDELQ_SCR_ENTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDELQ_SCR_ENTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfDELQ_SCR_ENTRItem" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications}DELQ_SCR_ENTR" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDELQ_SCR_ENTR", propOrder = {
    "arrayOfDELQSCRENTRItem"
})
public class ArrayOfDELQSCRENTR {

    @XmlElement(name = "ArrayOfDELQ_SCR_ENTRItem", required = true)
    protected List<DELQSCRENTR> arrayOfDELQSCRENTRItem;

    /**
     * Gets the value of the arrayOfDELQSCRENTRItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfDELQSCRENTRItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfDELQSCRENTRItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELQSCRENTR }
     * 
     * 
     */
    public List<DELQSCRENTR> getArrayOfDELQSCRENTRItem() {
        if (arrayOfDELQSCRENTRItem == null) {
            arrayOfDELQSCRENTRItem = new ArrayList<DELQSCRENTR>();
        }
        return this.arrayOfDELQSCRENTRItem;
    }

}
