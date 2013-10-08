
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Section used by user to select his response data topics for SIDEX product order
 * 
 * <p>Java class for IncludePrincipalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncludePrincipalsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://gateway.dnb.com/getProduct>BooleanType">
 *       &lt;attribute name="CompactIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludePrincipalsType", propOrder = {
    "value"
})
public class IncludePrincipalsType {

    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "CompactIndicator")
    protected Boolean compactIndicator;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the compactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompactIndicator() {
        if (compactIndicator == null) {
            return false;
        } else {
            return compactIndicator;
        }
    }

    /**
     * Sets the value of the compactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompactIndicator(Boolean value) {
        this.compactIndicator = value;
    }

}
