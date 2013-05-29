
package DBGetNotificationsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMON_PROD_RS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMON_PROD_RS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfMON_PROD_RSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications}MON_PROD_RS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMON_PROD_RS", propOrder = {
    "arrayOfMONPRODRSItem"
})
public class ArrayOfMONPRODRS {

    @XmlElement(name = "ArrayOfMON_PROD_RSItem", required = true)
    protected List<MONPRODRS> arrayOfMONPRODRSItem;

    /**
     * Gets the value of the arrayOfMONPRODRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfMONPRODRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfMONPRODRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MONPRODRS }
     * 
     * 
     */
    public List<MONPRODRS> getArrayOfMONPRODRSItem() {
        if (arrayOfMONPRODRSItem == null) {
            arrayOfMONPRODRSItem = new ArrayList<MONPRODRS>();
        }
        return this.arrayOfMONPRODRSItem;
    }

}
