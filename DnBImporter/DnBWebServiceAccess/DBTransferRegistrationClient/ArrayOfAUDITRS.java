
package DBTransferRegistrationClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAUDITRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAUDITRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfAUDITRSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration}AUDITRS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAUDITRS", propOrder = {
    "arrayOfAUDITRSItem"
})
public class ArrayOfAUDITRS {

    @XmlElement(name = "ArrayOfAUDITRSItem", required = true)
    protected List<AUDITRS> arrayOfAUDITRSItem;

    /**
     * Gets the value of the arrayOfAUDITRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfAUDITRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfAUDITRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AUDITRS }
     * 
     * 
     */
    public List<AUDITRS> getArrayOfAUDITRSItem() {
        if (arrayOfAUDITRSItem == null) {
            arrayOfAUDITRSItem = new ArrayList<AUDITRS>();
        }
        return this.arrayOfAUDITRSItem;
    }

}
