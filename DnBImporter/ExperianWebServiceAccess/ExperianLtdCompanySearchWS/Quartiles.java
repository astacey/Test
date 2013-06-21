
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quartiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quartiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullQuartiles" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}FullQuartiles" minOccurs="0"/>
 *         &lt;element name="MedianQuartiles" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}MedianQuartiles" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quartiles", propOrder = {
    "fullQuartiles",
    "medianQuartiles"
})
public class Quartiles {

    @XmlElement(name = "FullQuartiles")
    protected FullQuartiles fullQuartiles;
    @XmlElement(name = "MedianQuartiles")
    protected MedianQuartiles medianQuartiles;

    /**
     * Gets the value of the fullQuartiles property.
     * 
     * @return
     *     possible object is
     *     {@link FullQuartiles }
     *     
     */
    public FullQuartiles getFullQuartiles() {
        return fullQuartiles;
    }

    /**
     * Sets the value of the fullQuartiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullQuartiles }
     *     
     */
    public void setFullQuartiles(FullQuartiles value) {
        this.fullQuartiles = value;
    }

    /**
     * Gets the value of the medianQuartiles property.
     * 
     * @return
     *     possible object is
     *     {@link MedianQuartiles }
     *     
     */
    public MedianQuartiles getMedianQuartiles() {
        return medianQuartiles;
    }

    /**
     * Sets the value of the medianQuartiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedianQuartiles }
     *     
     */
    public void setMedianQuartiles(MedianQuartiles value) {
        this.medianQuartiles = value;
    }

}
