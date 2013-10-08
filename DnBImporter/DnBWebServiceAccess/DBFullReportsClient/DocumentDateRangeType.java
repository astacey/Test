
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentDateRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentDateRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RangeFromDate" type="{http://gateway.dnb.com/getProduct}RangeFromDateType"/>
 *         &lt;element name="RangeToDate" type="{http://gateway.dnb.com/getProduct}RangeToDateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentDateRangeType", propOrder = {
    "rangeFromDate",
    "rangeToDate"
})
public class DocumentDateRangeType {

    @XmlElement(name = "RangeFromDate", required = true)
    protected XMLGregorianCalendar rangeFromDate;
    @XmlElement(name = "RangeToDate", required = true)
    protected XMLGregorianCalendar rangeToDate;

    /**
     * Gets the value of the rangeFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRangeFromDate() {
        return rangeFromDate;
    }

    /**
     * Sets the value of the rangeFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRangeFromDate(XMLGregorianCalendar value) {
        this.rangeFromDate = value;
    }

    /**
     * Gets the value of the rangeToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRangeToDate() {
        return rangeToDate;
    }

    /**
     * Sets the value of the rangeToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRangeToDate(XMLGregorianCalendar value) {
        this.rangeToDate = value;
    }

}
