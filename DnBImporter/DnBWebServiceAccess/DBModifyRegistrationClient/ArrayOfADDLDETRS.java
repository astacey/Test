
package DBModifyRegistrationClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfADDL_DET_RS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfADDL_DET_RS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfADDL_DET_RSItem" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}ADDL_DET_RS" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfADDL_DET_RS", propOrder = {
    "arrayOfADDLDETRSItem"
})
public class ArrayOfADDLDETRS {

    @XmlElement(name = "ArrayOfADDL_DET_RSItem", required = true)
    protected List<ADDLDETRS> arrayOfADDLDETRSItem;

    /**
     * Gets the value of the arrayOfADDLDETRSItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfADDLDETRSItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfADDLDETRSItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ADDLDETRS }
     * 
     * 
     */
    public List<ADDLDETRS> getArrayOfADDLDETRSItem() {
        if (arrayOfADDLDETRSItem == null) {
            arrayOfADDLDETRSItem = new ArrayList<ADDLDETRS>();
        }
        return this.arrayOfADDLDETRSItem;
    }

}
