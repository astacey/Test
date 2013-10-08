
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialEventsEntry" type="{http://gateway.dnb.com/getProduct}EventsInformationEntryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "specialEventsEntry"
})
@XmlRootElement(name = "SpecialEvents")
public class SpecialEvents {

    @XmlElement(name = "SpecialEventsEntry", required = true)
    protected List<EventsInformationEntryType> specialEventsEntry;

    /**
     * Gets the value of the specialEventsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialEventsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialEventsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventsInformationEntryType }
     * 
     * 
     */
    public List<EventsInformationEntryType> getSpecialEventsEntry() {
        if (specialEventsEntry == null) {
            specialEventsEntry = new ArrayList<EventsInformationEntryType>();
        }
        return this.specialEventsEntry;
    }

}
