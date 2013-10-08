
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationCommentsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationCommentsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociationComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationCommentsEntryType", propOrder = {
    "associationComment"
})
public class AssociationCommentsEntryType {

    @XmlElement(name = "AssociationComment", required = true)
    protected String associationComment;

    /**
     * Gets the value of the associationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationComment() {
        return associationComment;
    }

    /**
     * Sets the value of the associationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationComment(String value) {
        this.associationComment = value;
    }

}
