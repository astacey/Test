
package DBFullReportsClient;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FinancialRatio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRatio">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="unitofSize" type="{http://gateway.dnb.com/getProduct}unitofSizeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRatio", propOrder = {
    "value"
})
public class FinancialRatio {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute
    protected String unitofSize;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitofSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofSize() {
        return unitofSize;
    }

    /**
     * Sets the value of the unitofSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofSize(String value) {
        this.unitofSize = value;
    }

}
