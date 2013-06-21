
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessLinks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessLinks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociatedBusLinks" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}BusinessLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PossAssociatedBusLinks" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}BusinessLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessLinks", propOrder = {
    "associatedBusLinks",
    "possAssociatedBusLinks"
})
public class BusinessLinks {

    @XmlElement(name = "AssociatedBusLinks")
    protected List<BusinessLink> associatedBusLinks;
    @XmlElement(name = "PossAssociatedBusLinks")
    protected List<BusinessLink> possAssociatedBusLinks;

    /**
     * Gets the value of the associatedBusLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedBusLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedBusLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessLink }
     * 
     * 
     */
    public List<BusinessLink> getAssociatedBusLinks() {
        if (associatedBusLinks == null) {
            associatedBusLinks = new ArrayList<BusinessLink>();
        }
        return this.associatedBusLinks;
    }

    /**
     * Gets the value of the possAssociatedBusLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possAssociatedBusLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossAssociatedBusLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessLink }
     * 
     * 
     */
    public List<BusinessLink> getPossAssociatedBusLinks() {
        if (possAssociatedBusLinks == null) {
            possAssociatedBusLinks = new ArrayList<BusinessLink>();
        }
        return this.possAssociatedBusLinks;
    }

}
