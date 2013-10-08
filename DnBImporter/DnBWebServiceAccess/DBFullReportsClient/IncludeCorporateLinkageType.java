
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Section used by user to select his response data topics for SIDEX product order
 * 
 * <p>Java class for IncludeCorporateLinkageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncludeCorporateLinkageType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://gateway.dnb.com/getProduct>BooleanType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeCorporateLinkageType", propOrder = {
    "value"
})
public class IncludeCorporateLinkageType {

    @XmlValue
    protected boolean value;

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

}
