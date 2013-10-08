
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Section used by user to select his response data topics for SIDEX product order
 * 
 * <p>Java class for IncludeFinancialsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncludeFinancialsType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://gateway.dnb.com/getProduct>BooleanType">
 *       &lt;attribute name="NoOfOccuranceType" type="{http://gateway.dnb.com/getProduct}OccuranceType" />
 *       &lt;attribute name="FormatIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeFinancialsType", propOrder = {
    "value"
})
public class IncludeFinancialsType {

    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "NoOfOccuranceType")
    protected Integer noOfOccuranceType;
    @XmlAttribute(name = "FormatIndicator")
    protected Boolean formatIndicator;

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
     * Gets the value of the noOfOccuranceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfOccuranceType() {
        return noOfOccuranceType;
    }

    /**
     * Sets the value of the noOfOccuranceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfOccuranceType(Integer value) {
        this.noOfOccuranceType = value;
    }

    /**
     * Gets the value of the formatIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFormatIndicator() {
        if (formatIndicator == null) {
            return false;
        } else {
            return formatIndicator;
        }
    }

    /**
     * Sets the value of the formatIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFormatIndicator(Boolean value) {
        this.formatIndicator = value;
    }

}
