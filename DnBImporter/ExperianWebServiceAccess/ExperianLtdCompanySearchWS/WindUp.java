
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WindUp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindUp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Petition" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Petition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dismissal" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Dimissal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Resolution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Order" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindUp", propOrder = {
    "petition",
    "dismissal",
    "resolution",
    "order"
})
public class WindUp {

    @XmlElement(name = "Petition")
    protected List<Petition> petition;
    @XmlElement(name = "Dismissal")
    protected List<Dimissal> dismissal;
    @XmlElement(name = "Resolution")
    protected List<Resolution> resolution;
    @XmlElement(name = "Order")
    protected List<Order> order;

    /**
     * Gets the value of the petition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the petition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPetition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Petition }
     * 
     * 
     */
    public List<Petition> getPetition() {
        if (petition == null) {
            petition = new ArrayList<Petition>();
        }
        return this.petition;
    }

    /**
     * Gets the value of the dismissal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dismissal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDismissal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimissal }
     * 
     * 
     */
    public List<Dimissal> getDismissal() {
        if (dismissal == null) {
            dismissal = new ArrayList<Dimissal>();
        }
        return this.dismissal;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolution }
     * 
     * 
     */
    public List<Resolution> getResolution() {
        if (resolution == null) {
            resolution = new ArrayList<Resolution>();
        }
        return this.resolution;
    }

    /**
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Order }
     * 
     * 
     */
    public List<Order> getOrder() {
        if (order == null) {
            order = new ArrayList<Order>();
        }
        return this.order;
    }

}
