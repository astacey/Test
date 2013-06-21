
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Alerts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alerts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NotesLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Notes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alerts", propOrder = {
    "notesCount",
    "notesLength",
    "notes"
})
public class Alerts {

    @XmlElement(name = "NotesCount")
    protected Integer notesCount;
    @XmlElement(name = "NotesLength")
    protected String notesLength;
    @XmlElement(name = "Notes")
    protected List<Notes> notes;

    /**
     * Gets the value of the notesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNotesCount() {
        return notesCount;
    }

    /**
     * Sets the value of the notesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNotesCount(Integer value) {
        this.notesCount = value;
    }

    /**
     * Gets the value of the notesLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesLength() {
        return notesLength;
    }

    /**
     * Sets the value of the notesLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesLength(String value) {
        this.notesLength = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notes }
     * 
     * 
     */
    public List<Notes> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Notes>();
        }
        return this.notes;
    }

}
