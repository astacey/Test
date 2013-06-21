
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shareholders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shareholders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeaderInfo" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}HeaderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShareCapital" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ShareCapital" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shareholdings" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Shareholdings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shareholder" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Shareholder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shareholders", propOrder = {
    "headerInfo",
    "shareCapital",
    "shareholdings",
    "shareholder"
})
public class Shareholders {

    @XmlElement(name = "HeaderInfo")
    protected List<HeaderInfo> headerInfo;
    @XmlElement(name = "ShareCapital")
    protected List<ShareCapital> shareCapital;
    @XmlElement(name = "Shareholdings")
    protected List<Shareholdings> shareholdings;
    @XmlElement(name = "Shareholder")
    protected List<Shareholder> shareholder;

    /**
     * Gets the value of the headerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderInfo }
     * 
     * 
     */
    public List<HeaderInfo> getHeaderInfo() {
        if (headerInfo == null) {
            headerInfo = new ArrayList<HeaderInfo>();
        }
        return this.headerInfo;
    }

    /**
     * Gets the value of the shareCapital property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareCapital property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareCapital().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareCapital }
     * 
     * 
     */
    public List<ShareCapital> getShareCapital() {
        if (shareCapital == null) {
            shareCapital = new ArrayList<ShareCapital>();
        }
        return this.shareCapital;
    }

    /**
     * Gets the value of the shareholdings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholdings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholdings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shareholdings }
     * 
     * 
     */
    public List<Shareholdings> getShareholdings() {
        if (shareholdings == null) {
            shareholdings = new ArrayList<Shareholdings>();
        }
        return this.shareholdings;
    }

    /**
     * Gets the value of the shareholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shareholder }
     * 
     * 
     */
    public List<Shareholder> getShareholder() {
        if (shareholder == null) {
            shareholder = new ArrayList<Shareholder>();
        }
        return this.shareholder;
    }

}
