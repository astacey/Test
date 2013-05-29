
package DBDataWebClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFLD_LST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFLD_LST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfFLD_LSTItem" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}FLD_LST" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFLD_LST", propOrder = {
    "arrayOfFLDLSTItem"
})
public class ArrayOfFLDLST {

    @XmlElement(name = "ArrayOfFLD_LSTItem", required = true)
    protected List<FLDLST> arrayOfFLDLSTItem;

    /**
     * Gets the value of the arrayOfFLDLSTItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfFLDLSTItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfFLDLSTItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLDLST }
     * 
     * 
     */
    public List<FLDLST> getArrayOfFLDLSTItem() {
        if (arrayOfFLDLSTItem == null) {
            arrayOfFLDLSTItem = new ArrayList<FLDLST>();
        }
        return this.arrayOfFLDLSTItem;
    }

}
