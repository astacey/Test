
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalNotices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalNotices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SummaryLine" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}SummaryLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notice6253" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Notice6253" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WindUp" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}WindUp" minOccurs="0"/>
 *         &lt;element name="MeetingCreditors" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}MeetingCreditors" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Administrators" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Administrators" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Receiver" minOccurs="0"/>
 *         &lt;element name="Liquidators" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Liquidators" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VolArrangement" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}VolArrangement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalNotices", propOrder = {
    "summaryCount",
    "summaryLine",
    "notice6253",
    "windUp",
    "meetingCreditors",
    "administrators",
    "receiver",
    "liquidators",
    "volArrangement"
})
public class LegalNotices {

    @XmlElement(name = "SummaryCount")
    protected Integer summaryCount;
    @XmlElement(name = "SummaryLine")
    protected List<SummaryLine> summaryLine;
    @XmlElement(name = "Notice6253")
    protected List<Notice6253> notice6253;
    @XmlElement(name = "WindUp")
    protected WindUp windUp;
    @XmlElement(name = "MeetingCreditors")
    protected List<MeetingCreditors> meetingCreditors;
    @XmlElement(name = "Administrators")
    protected Administrators administrators;
    @XmlElement(name = "Receiver")
    protected Receiver receiver;
    @XmlElement(name = "Liquidators")
    protected List<Liquidators> liquidators;
    @XmlElement(name = "VolArrangement")
    protected List<VolArrangement> volArrangement;

    /**
     * Gets the value of the summaryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSummaryCount() {
        return summaryCount;
    }

    /**
     * Sets the value of the summaryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSummaryCount(Integer value) {
        this.summaryCount = value;
    }

    /**
     * Gets the value of the summaryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryLine }
     * 
     * 
     */
    public List<SummaryLine> getSummaryLine() {
        if (summaryLine == null) {
            summaryLine = new ArrayList<SummaryLine>();
        }
        return this.summaryLine;
    }

    /**
     * Gets the value of the notice6253 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notice6253 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotice6253().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notice6253 }
     * 
     * 
     */
    public List<Notice6253> getNotice6253() {
        if (notice6253 == null) {
            notice6253 = new ArrayList<Notice6253>();
        }
        return this.notice6253;
    }

    /**
     * Gets the value of the windUp property.
     * 
     * @return
     *     possible object is
     *     {@link WindUp }
     *     
     */
    public WindUp getWindUp() {
        return windUp;
    }

    /**
     * Sets the value of the windUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindUp }
     *     
     */
    public void setWindUp(WindUp value) {
        this.windUp = value;
    }

    /**
     * Gets the value of the meetingCreditors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingCreditors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingCreditors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingCreditors }
     * 
     * 
     */
    public List<MeetingCreditors> getMeetingCreditors() {
        if (meetingCreditors == null) {
            meetingCreditors = new ArrayList<MeetingCreditors>();
        }
        return this.meetingCreditors;
    }

    /**
     * Gets the value of the administrators property.
     * 
     * @return
     *     possible object is
     *     {@link Administrators }
     *     
     */
    public Administrators getAdministrators() {
        return administrators;
    }

    /**
     * Sets the value of the administrators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Administrators }
     *     
     */
    public void setAdministrators(Administrators value) {
        this.administrators = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the liquidators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liquidators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiquidators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Liquidators }
     * 
     * 
     */
    public List<Liquidators> getLiquidators() {
        if (liquidators == null) {
            liquidators = new ArrayList<Liquidators>();
        }
        return this.liquidators;
    }

    /**
     * Gets the value of the volArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolArrangement }
     * 
     * 
     */
    public List<VolArrangement> getVolArrangement() {
        if (volArrangement == null) {
            volArrangement = new ArrayList<VolArrangement>();
        }
        return this.volArrangement;
    }

}
