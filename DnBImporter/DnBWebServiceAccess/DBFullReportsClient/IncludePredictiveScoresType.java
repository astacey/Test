
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Section used by user to select his response data topics for SIDEX product order
 * 
 * <p>Java class for IncludePredictiveScoresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncludePredictiveScoresType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://gateway.dnb.com/getProduct>BooleanType">
 *       &lt;attribute name="HistoryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludePredictiveScoresType", propOrder = {
    "value"
})
public class IncludePredictiveScoresType {

    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "HistoryIndicator")
    protected Boolean historyIndicator;

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
     * Gets the value of the historyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHistoryIndicator() {
        if (historyIndicator == null) {
            return true;
        } else {
            return historyIndicator;
        }
    }

    /**
     * Sets the value of the historyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoryIndicator(Boolean value) {
        this.historyIndicator = value;
    }

}
