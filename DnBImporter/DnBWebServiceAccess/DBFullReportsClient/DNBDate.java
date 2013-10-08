
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DNBDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBDate">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://gateway.dnb.com/getProduct>DateType">
 *       &lt;attribute name="reliability" type="{http://gateway.dnb.com/getProduct}DateReliability" default="actual" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBDate", propOrder = {
    "value"
})
public class DNBDate {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected DateReliability reliability;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     * @return
     *     possible object is
     *     {@link DateReliability }
     *     
     */
    public DateReliability getReliability() {
        if (reliability == null) {
            return DateReliability.ACTUAL;
        } else {
            return reliability;
        }
    }

    /**
     * Sets the value of the reliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateReliability }
     *     
     */
    public void setReliability(DateReliability value) {
        this.reliability = value;
    }

}
