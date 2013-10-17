
package DBGetNotificationsClientV3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGLBL_FAIL_SCR_ENTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGLBL_FAIL_SCR_ENTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfGLBL_FAIL_SCR_ENTRItem" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}GLBL_FAIL_SCR_ENTR" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGLBL_FAIL_SCR_ENTR", propOrder = {
    "arrayOfGLBLFAILSCRENTRItem"
})
public class ArrayOfGLBLFAILSCRENTR {

    @XmlElement(name = "ArrayOfGLBL_FAIL_SCR_ENTRItem", required = true)
    protected List<GLBLFAILSCRENTR> arrayOfGLBLFAILSCRENTRItem;

    /**
     * Gets the value of the arrayOfGLBLFAILSCRENTRItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfGLBLFAILSCRENTRItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfGLBLFAILSCRENTRItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLBLFAILSCRENTR }
     * 
     * 
     */
    public List<GLBLFAILSCRENTR> getArrayOfGLBLFAILSCRENTRItem() {
        if (arrayOfGLBLFAILSCRENTRItem == null) {
            arrayOfGLBLFAILSCRENTRItem = new ArrayList<GLBLFAILSCRENTR>();
        }
        return this.arrayOfGLBLFAILSCRENTRItem;
    }

}
