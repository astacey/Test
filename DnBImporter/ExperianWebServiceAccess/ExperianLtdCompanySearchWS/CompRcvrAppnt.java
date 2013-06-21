
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompRcvrAppnt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompRcvrAppnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LodgedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="InstrumentDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="PublicationTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberReceivers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberInstrumentHolders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReceiverData" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}RcvrAppntData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstrumentHolder" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}InstrHolder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompRcvrAppnt", propOrder = {
    "lodgedDate",
    "instrumentDate",
    "publicationTown",
    "formType",
    "numberReceivers",
    "numberInstrumentHolders",
    "receiverData",
    "instrumentHolder"
})
public class CompRcvrAppnt {

    @XmlElement(name = "LodgedDate")
    protected CCYYMMDD lodgedDate;
    @XmlElement(name = "InstrumentDate")
    protected CCYYMMDD instrumentDate;
    @XmlElement(name = "PublicationTown")
    protected String publicationTown;
    @XmlElement(name = "FormType")
    protected String formType;
    @XmlElement(name = "NumberReceivers")
    protected Integer numberReceivers;
    @XmlElement(name = "NumberInstrumentHolders")
    protected Integer numberInstrumentHolders;
    @XmlElement(name = "ReceiverData")
    protected List<RcvrAppntData> receiverData;
    @XmlElement(name = "InstrumentHolder")
    protected List<InstrHolder> instrumentHolder;

    /**
     * Gets the value of the lodgedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLodgedDate() {
        return lodgedDate;
    }

    /**
     * Sets the value of the lodgedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLodgedDate(CCYYMMDD value) {
        this.lodgedDate = value;
    }

    /**
     * Gets the value of the instrumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getInstrumentDate() {
        return instrumentDate;
    }

    /**
     * Sets the value of the instrumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setInstrumentDate(CCYYMMDD value) {
        this.instrumentDate = value;
    }

    /**
     * Gets the value of the publicationTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationTown() {
        return publicationTown;
    }

    /**
     * Sets the value of the publicationTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationTown(String value) {
        this.publicationTown = value;
    }

    /**
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormType(String value) {
        this.formType = value;
    }

    /**
     * Gets the value of the numberReceivers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberReceivers() {
        return numberReceivers;
    }

    /**
     * Sets the value of the numberReceivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberReceivers(Integer value) {
        this.numberReceivers = value;
    }

    /**
     * Gets the value of the numberInstrumentHolders property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberInstrumentHolders() {
        return numberInstrumentHolders;
    }

    /**
     * Sets the value of the numberInstrumentHolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberInstrumentHolders(Integer value) {
        this.numberInstrumentHolders = value;
    }

    /**
     * Gets the value of the receiverData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RcvrAppntData }
     * 
     * 
     */
    public List<RcvrAppntData> getReceiverData() {
        if (receiverData == null) {
            receiverData = new ArrayList<RcvrAppntData>();
        }
        return this.receiverData;
    }

    /**
     * Gets the value of the instrumentHolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentHolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentHolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrHolder }
     * 
     * 
     */
    public List<InstrHolder> getInstrumentHolder() {
        if (instrumentHolder == null) {
            instrumentHolder = new ArrayList<InstrHolder>();
        }
        return this.instrumentHolder;
    }

}
