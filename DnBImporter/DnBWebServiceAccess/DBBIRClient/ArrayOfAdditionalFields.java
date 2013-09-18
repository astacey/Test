
package DBBIRClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdditionalFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdditionalFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfAdditionalFieldsItem" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}AdditionalFields" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdditionalFields", propOrder = {
    "arrayOfAdditionalFieldsItem"
})
public class ArrayOfAdditionalFields {

    @XmlElement(name = "ArrayOfAdditionalFieldsItem", required = true)
    protected List<AdditionalFields> arrayOfAdditionalFieldsItem;

    /**
     * Gets the value of the arrayOfAdditionalFieldsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfAdditionalFieldsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfAdditionalFieldsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFields }
     * 
     * 
     */
    public List<AdditionalFields> getArrayOfAdditionalFieldsItem() {
        if (arrayOfAdditionalFieldsItem == null) {
            arrayOfAdditionalFieldsItem = new ArrayList<AdditionalFields>();
        }
        return this.arrayOfAdditionalFieldsItem;
    }

}
