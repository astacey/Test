
package DBLookUpClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLOOKUPRSCOMPANY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLOOKUPRSCOMPANY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfLOOKUPRSCOMPANYItem" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LOOKUPRSCOMPANY" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLOOKUPRSCOMPANY", propOrder = {
    "arrayOfLOOKUPRSCOMPANYItem"
})
public class ArrayOfLOOKUPRSCOMPANY {

    @XmlElement(name = "ArrayOfLOOKUPRSCOMPANYItem", required = true)
    protected List<LOOKUPRSCOMPANY> arrayOfLOOKUPRSCOMPANYItem;

    /**
     * Gets the value of the arrayOfLOOKUPRSCOMPANYItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfLOOKUPRSCOMPANYItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfLOOKUPRSCOMPANYItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOOKUPRSCOMPANY }
     * 
     * 
     */
    public List<LOOKUPRSCOMPANY> getArrayOfLOOKUPRSCOMPANYItem() {
        if (arrayOfLOOKUPRSCOMPANYItem == null) {
            arrayOfLOOKUPRSCOMPANYItem = new ArrayList<LOOKUPRSCOMPANY>();
        }
        return this.arrayOfLOOKUPRSCOMPANYItem;
    }

}
