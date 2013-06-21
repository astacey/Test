
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Receiver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Receiver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CompRcvrAppnt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cessation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CompRcvrCessation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Receiver", propOrder = {
    "appointment",
    "cessation"
})
public class Receiver {

    @XmlElement(name = "Appointment")
    protected List<CompRcvrAppnt> appointment;
    @XmlElement(name = "Cessation")
    protected List<CompRcvrCessation> cessation;

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompRcvrAppnt }
     * 
     * 
     */
    public List<CompRcvrAppnt> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<CompRcvrAppnt>();
        }
        return this.appointment;
    }

    /**
     * Gets the value of the cessation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cessation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCessation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompRcvrCessation }
     * 
     * 
     */
    public List<CompRcvrCessation> getCessation() {
        if (cessation == null) {
            cessation = new ArrayList<CompRcvrCessation>();
        }
        return this.cessation;
    }

}
