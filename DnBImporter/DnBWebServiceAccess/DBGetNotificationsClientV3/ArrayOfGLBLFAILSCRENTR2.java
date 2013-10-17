
package DBGetNotificationsClientV3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGLBL_FAIL_SCR_ENTR2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGLBL_FAIL_SCR_ENTR2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfGLBL_FAIL_SCR_ENTR2Item" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}GLBL_FAIL_SCR_ENTR2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGLBL_FAIL_SCR_ENTR2", propOrder = {
    "arrayOfGLBLFAILSCRENTR2Item"
})
public class ArrayOfGLBLFAILSCRENTR2 {

    @XmlElement(name = "ArrayOfGLBL_FAIL_SCR_ENTR2Item", required = true)
    protected List<GLBLFAILSCRENTR2> arrayOfGLBLFAILSCRENTR2Item;

    /**
     * Gets the value of the arrayOfGLBLFAILSCRENTR2Item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfGLBLFAILSCRENTR2Item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfGLBLFAILSCRENTR2Item().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLBLFAILSCRENTR2 }
     * 
     * 
     */
    public List<GLBLFAILSCRENTR2> getArrayOfGLBLFAILSCRENTR2Item() {
        if (arrayOfGLBLFAILSCRENTR2Item == null) {
            arrayOfGLBLFAILSCRENTR2Item = new ArrayList<GLBLFAILSCRENTR2>();
        }
        return this.arrayOfGLBLFAILSCRENTR2Item;
    }

}
