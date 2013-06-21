
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoticeOfCorrection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeOfCorrection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumCorrections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NOCDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}NOCDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeOfCorrection", propOrder = {
    "numCorrections",
    "nocDetail"
})
public class NoticeOfCorrection {

    @XmlElement(name = "NumCorrections")
    protected Integer numCorrections;
    @XmlElement(name = "NOCDetail")
    protected List<NOCDetail> nocDetail;

    /**
     * Gets the value of the numCorrections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCorrections() {
        return numCorrections;
    }

    /**
     * Sets the value of the numCorrections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCorrections(Integer value) {
        this.numCorrections = value;
    }

    /**
     * Gets the value of the nocDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nocDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNOCDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NOCDetail }
     * 
     * 
     */
    public List<NOCDetail> getNOCDetail() {
        if (nocDetail == null) {
            nocDetail = new ArrayList<NOCDetail>();
        }
        return this.nocDetail;
    }

}
