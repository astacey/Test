
package ExperianBusinessTargetWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocalityResolution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalityResolution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Warning" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}OutputLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalityResolution", propOrder = {
    "warning",
    "location"
})
public class LocalityResolution {

    @XmlElement(name = "Warning")
    protected ArrayOfString warning;
    @XmlElement(name = "Location")
    protected List<OutputLocation> location;

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setWarning(ArrayOfString value) {
        this.warning = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputLocation }
     * 
     * 
     */
    public List<OutputLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<OutputLocation>();
        }
        return this.location;
    }

}
