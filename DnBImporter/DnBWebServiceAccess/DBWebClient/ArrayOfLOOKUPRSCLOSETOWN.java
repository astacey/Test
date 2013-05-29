
package DBWebClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLOOKUPRSCLOSETOWN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLOOKUPRSCLOSETOWN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfLOOKUPRSCLOSETOWNItem" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LOOKUPRSCLOSETOWN" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLOOKUPRSCLOSETOWN", propOrder = {
    "arrayOfLOOKUPRSCLOSETOWNItem"
})
public class ArrayOfLOOKUPRSCLOSETOWN {

    @XmlElement(name = "ArrayOfLOOKUPRSCLOSETOWNItem", required = true)
    protected List<LOOKUPRSCLOSETOWN> arrayOfLOOKUPRSCLOSETOWNItem;

    /**
     * Gets the value of the arrayOfLOOKUPRSCLOSETOWNItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfLOOKUPRSCLOSETOWNItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfLOOKUPRSCLOSETOWNItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOOKUPRSCLOSETOWN }
     * 
     * 
     */
    public List<LOOKUPRSCLOSETOWN> getArrayOfLOOKUPRSCLOSETOWNItem() {
        if (arrayOfLOOKUPRSCLOSETOWNItem == null) {
            arrayOfLOOKUPRSCLOSETOWNItem = new ArrayList<LOOKUPRSCLOSETOWN>();
        }
        return this.arrayOfLOOKUPRSCLOSETOWNItem;
    }

}
