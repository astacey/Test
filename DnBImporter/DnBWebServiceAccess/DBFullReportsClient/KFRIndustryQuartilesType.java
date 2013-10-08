
package DBFullReportsClient;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for KFRIndustryQuartilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KFRIndustryQuartilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowerQuartile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MedianQuartile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HigherQuartile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KFRIndustryQuartilesType", propOrder = {
    "lowerQuartile",
    "medianQuartile",
    "higherQuartile"
})
public class KFRIndustryQuartilesType {

    @XmlElement(name = "LowerQuartile")
    protected KFRIndustryQuartilesType.LowerQuartile lowerQuartile;
    @XmlElement(name = "MedianQuartile")
    protected KFRIndustryQuartilesType.MedianQuartile medianQuartile;
    @XmlElement(name = "HigherQuartile")
    protected KFRIndustryQuartilesType.HigherQuartile higherQuartile;

    /**
     * Gets the value of the lowerQuartile property.
     * 
     * @return
     *     possible object is
     *     {@link KFRIndustryQuartilesType.LowerQuartile }
     *     
     */
    public KFRIndustryQuartilesType.LowerQuartile getLowerQuartile() {
        return lowerQuartile;
    }

    /**
     * Sets the value of the lowerQuartile property.
     * 
     * @param value
     *     allowed object is
     *     {@link KFRIndustryQuartilesType.LowerQuartile }
     *     
     */
    public void setLowerQuartile(KFRIndustryQuartilesType.LowerQuartile value) {
        this.lowerQuartile = value;
    }

    /**
     * Gets the value of the medianQuartile property.
     * 
     * @return
     *     possible object is
     *     {@link KFRIndustryQuartilesType.MedianQuartile }
     *     
     */
    public KFRIndustryQuartilesType.MedianQuartile getMedianQuartile() {
        return medianQuartile;
    }

    /**
     * Sets the value of the medianQuartile property.
     * 
     * @param value
     *     allowed object is
     *     {@link KFRIndustryQuartilesType.MedianQuartile }
     *     
     */
    public void setMedianQuartile(KFRIndustryQuartilesType.MedianQuartile value) {
        this.medianQuartile = value;
    }

    /**
     * Gets the value of the higherQuartile property.
     * 
     * @return
     *     possible object is
     *     {@link KFRIndustryQuartilesType.HigherQuartile }
     *     
     */
    public KFRIndustryQuartilesType.HigherQuartile getHigherQuartile() {
        return higherQuartile;
    }

    /**
     * Sets the value of the higherQuartile property.
     * 
     * @param value
     *     allowed object is
     *     {@link KFRIndustryQuartilesType.HigherQuartile }
     *     
     */
    public void setHigherQuartile(KFRIndustryQuartilesType.HigherQuartile value) {
        this.higherQuartile = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class HigherQuartile {

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LowerQuartile {

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}unitofSize"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MedianQuartile {

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

}
