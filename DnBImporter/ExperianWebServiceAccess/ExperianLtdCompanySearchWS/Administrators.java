
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Administrators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Administrators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appointment" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Appointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Discharge" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Discharge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrators", propOrder = {
    "appointment",
    "discharge"
})
public class Administrators {

    @XmlElement(name = "Appointment")
    protected List<Appointment> appointment;
    @XmlElement(name = "Discharge")
    protected List<Discharge> discharge;

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
     * {@link Appointment }
     * 
     * 
     */
    public List<Appointment> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<Appointment>();
        }
        return this.appointment;
    }

    /**
     * Gets the value of the discharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDischarge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discharge }
     * 
     * 
     */
    public List<Discharge> getDischarge() {
        if (discharge == null) {
            discharge = new ArrayList<Discharge>();
        }
        return this.discharge;
    }

}
