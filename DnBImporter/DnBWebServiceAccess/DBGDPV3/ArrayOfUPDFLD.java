
package DBGDPV3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUPD_FLD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUPD_FLD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfUPD_FLDItem" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}UPD_FLD" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUPD_FLD", propOrder = {
    "arrayOfUPDFLDItem"
})
public class ArrayOfUPDFLD {

    @XmlElement(name = "ArrayOfUPD_FLDItem", required = true)
    protected List<UPDFLD> arrayOfUPDFLDItem;

    /**
     * Gets the value of the arrayOfUPDFLDItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfUPDFLDItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfUPDFLDItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UPDFLD }
     * 
     * 
     */
    public List<UPDFLD> getArrayOfUPDFLDItem() {
        if (arrayOfUPDFLDItem == null) {
            arrayOfUPDFLDItem = new ArrayList<UPDFLD>();
        }
        return this.arrayOfUPDFLDItem;
    }

}
