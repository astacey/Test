
package DBLookUpClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMTCH_BASS_ENTR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMTCH_BASS_ENTR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfMTCH_BASS_ENTRItem" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MTCH_BASS_ENTR" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMTCH_BASS_ENTR", propOrder = {
    "arrayOfMTCHBASSENTRItem"
})
public class ArrayOfMTCHBASSENTR {

    @XmlElement(name = "ArrayOfMTCH_BASS_ENTRItem", required = true)
    protected List<MTCHBASSENTR> arrayOfMTCHBASSENTRItem;

    /**
     * Gets the value of the arrayOfMTCHBASSENTRItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfMTCHBASSENTRItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfMTCHBASSENTRItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MTCHBASSENTR }
     * 
     * 
     */
    public List<MTCHBASSENTR> getArrayOfMTCHBASSENTRItem() {
        if (arrayOfMTCHBASSENTRItem == null) {
            arrayOfMTCHBASSENTRItem = new ArrayList<MTCHBASSENTR>();
        }
        return this.arrayOfMTCHBASSENTRItem;
    }

}
