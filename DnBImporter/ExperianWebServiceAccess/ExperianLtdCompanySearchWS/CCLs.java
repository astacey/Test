
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCLs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCLs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalNumberCCL" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCLDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CCLDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCLs", propOrder = {
    "totalNumberCCL",
    "cclDetail"
})
public class CCLs {

    @XmlElement(name = "TotalNumberCCL")
    protected Integer totalNumberCCL;
    @XmlElement(name = "CCLDetail")
    protected List<CCLDetail> cclDetail;

    /**
     * Gets the value of the totalNumberCCL property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberCCL() {
        return totalNumberCCL;
    }

    /**
     * Sets the value of the totalNumberCCL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberCCL(Integer value) {
        this.totalNumberCCL = value;
    }

    /**
     * Gets the value of the cclDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cclDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCLDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCLDetail }
     * 
     * 
     */
    public List<CCLDetail> getCCLDetail() {
        if (cclDetail == null) {
            cclDetail = new ArrayList<CCLDetail>();
        }
        return this.cclDetail;
    }

}
