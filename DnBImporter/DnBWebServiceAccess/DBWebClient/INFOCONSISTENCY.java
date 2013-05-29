
package DBWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INFO_CONSISTENCY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INFO_CONSISTENCY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MOST_FREQ_1_TLCM_NBR" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_1_TLCM_NBR"/>
 *         &lt;element name="MOST_FREQ_2_TLCM_NBR" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_2_TLCM_NBR"/>
 *         &lt;element name="MOST_FREQ_3_TLCM_NBR" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_3_TLCM_NBR"/>
 *         &lt;element name="MOST_FREQ_4_TLCM_NBR" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_4_TLCM_NBR"/>
 *         &lt;element name="MOST_FREQ_5_TLCM_NBR" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_5_TLCM_NBR"/>
 *         &lt;element name="CNT_NO_TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNT_OTHER_TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOST_FREQ_1_DUNS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_1_DUNS"/>
 *         &lt;element name="MOST_FREQ_2_DUNS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_2_DUNS"/>
 *         &lt;element name="MOST_FREQ_3_DUNS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_3_DUNS"/>
 *         &lt;element name="MOST_FREQ_4_DUNS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_4_DUNS"/>
 *         &lt;element name="MOST_FREQ_5_DUNS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MOST_FREQ_5_DUNS"/>
 *         &lt;element name="CNT_NO_DUNS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNT_OTHER_DUNS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HIST_SRCH_FR_RSK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INFO_CONSISTENCY", propOrder = {
    "mostfreq1TLCMNBR",
    "mostfreq2TLCMNBR",
    "mostfreq3TLCMNBR",
    "mostfreq4TLCMNBR",
    "mostfreq5TLCMNBR",
    "cntnotlcmnbr",
    "cntothertlcmnbr",
    "mostfreq1DUNS",
    "mostfreq2DUNS",
    "mostfreq3DUNS",
    "mostfreq4DUNS",
    "mostfreq5DUNS",
    "cntnoduns",
    "cntotherduns",
    "histsrchfrrsk"
})
public class INFOCONSISTENCY {

    @XmlElement(name = "MOST_FREQ_1_TLCM_NBR", required = true, nillable = true)
    protected MOSTFREQ1TLCMNBR mostfreq1TLCMNBR;
    @XmlElement(name = "MOST_FREQ_2_TLCM_NBR", required = true, nillable = true)
    protected MOSTFREQ2TLCMNBR mostfreq2TLCMNBR;
    @XmlElement(name = "MOST_FREQ_3_TLCM_NBR", required = true, nillable = true)
    protected MOSTFREQ3TLCMNBR mostfreq3TLCMNBR;
    @XmlElement(name = "MOST_FREQ_4_TLCM_NBR", required = true, nillable = true)
    protected MOSTFREQ4TLCMNBR mostfreq4TLCMNBR;
    @XmlElement(name = "MOST_FREQ_5_TLCM_NBR", required = true, nillable = true)
    protected MOSTFREQ5TLCMNBR mostfreq5TLCMNBR;
    @XmlElement(name = "CNT_NO_TLCM_NBR", required = true, nillable = true)
    protected String cntnotlcmnbr;
    @XmlElement(name = "CNT_OTHER_TLCM_NBR", required = true, nillable = true)
    protected String cntothertlcmnbr;
    @XmlElement(name = "MOST_FREQ_1_DUNS", required = true, nillable = true)
    protected MOSTFREQ1DUNS mostfreq1DUNS;
    @XmlElement(name = "MOST_FREQ_2_DUNS", required = true, nillable = true)
    protected MOSTFREQ2DUNS mostfreq2DUNS;
    @XmlElement(name = "MOST_FREQ_3_DUNS", required = true, nillable = true)
    protected MOSTFREQ3DUNS mostfreq3DUNS;
    @XmlElement(name = "MOST_FREQ_4_DUNS", required = true, nillable = true)
    protected MOSTFREQ4DUNS mostfreq4DUNS;
    @XmlElement(name = "MOST_FREQ_5_DUNS", required = true, nillable = true)
    protected MOSTFREQ5DUNS mostfreq5DUNS;
    @XmlElement(name = "CNT_NO_DUNS", required = true, nillable = true)
    protected String cntnoduns;
    @XmlElement(name = "CNT_OTHER_DUNS", required = true, nillable = true)
    protected String cntotherduns;
    @XmlElement(name = "HIST_SRCH_FR_RSK", required = true, nillable = true)
    protected String histsrchfrrsk;

    /**
     * Gets the value of the mostfreq1TLCMNBR property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ1TLCMNBR }
     *     
     */
    public MOSTFREQ1TLCMNBR getMOSTFREQ1TLCMNBR() {
        return mostfreq1TLCMNBR;
    }

    /**
     * Sets the value of the mostfreq1TLCMNBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ1TLCMNBR }
     *     
     */
    public void setMOSTFREQ1TLCMNBR(MOSTFREQ1TLCMNBR value) {
        this.mostfreq1TLCMNBR = value;
    }

    /**
     * Gets the value of the mostfreq2TLCMNBR property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ2TLCMNBR }
     *     
     */
    public MOSTFREQ2TLCMNBR getMOSTFREQ2TLCMNBR() {
        return mostfreq2TLCMNBR;
    }

    /**
     * Sets the value of the mostfreq2TLCMNBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ2TLCMNBR }
     *     
     */
    public void setMOSTFREQ2TLCMNBR(MOSTFREQ2TLCMNBR value) {
        this.mostfreq2TLCMNBR = value;
    }

    /**
     * Gets the value of the mostfreq3TLCMNBR property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ3TLCMNBR }
     *     
     */
    public MOSTFREQ3TLCMNBR getMOSTFREQ3TLCMNBR() {
        return mostfreq3TLCMNBR;
    }

    /**
     * Sets the value of the mostfreq3TLCMNBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ3TLCMNBR }
     *     
     */
    public void setMOSTFREQ3TLCMNBR(MOSTFREQ3TLCMNBR value) {
        this.mostfreq3TLCMNBR = value;
    }

    /**
     * Gets the value of the mostfreq4TLCMNBR property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ4TLCMNBR }
     *     
     */
    public MOSTFREQ4TLCMNBR getMOSTFREQ4TLCMNBR() {
        return mostfreq4TLCMNBR;
    }

    /**
     * Sets the value of the mostfreq4TLCMNBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ4TLCMNBR }
     *     
     */
    public void setMOSTFREQ4TLCMNBR(MOSTFREQ4TLCMNBR value) {
        this.mostfreq4TLCMNBR = value;
    }

    /**
     * Gets the value of the mostfreq5TLCMNBR property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ5TLCMNBR }
     *     
     */
    public MOSTFREQ5TLCMNBR getMOSTFREQ5TLCMNBR() {
        return mostfreq5TLCMNBR;
    }

    /**
     * Sets the value of the mostfreq5TLCMNBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ5TLCMNBR }
     *     
     */
    public void setMOSTFREQ5TLCMNBR(MOSTFREQ5TLCMNBR value) {
        this.mostfreq5TLCMNBR = value;
    }

    /**
     * Gets the value of the cntnotlcmnbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTNOTLCMNBR() {
        return cntnotlcmnbr;
    }

    /**
     * Sets the value of the cntnotlcmnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTNOTLCMNBR(String value) {
        this.cntnotlcmnbr = value;
    }

    /**
     * Gets the value of the cntothertlcmnbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTOTHERTLCMNBR() {
        return cntothertlcmnbr;
    }

    /**
     * Sets the value of the cntothertlcmnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTOTHERTLCMNBR(String value) {
        this.cntothertlcmnbr = value;
    }

    /**
     * Gets the value of the mostfreq1DUNS property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ1DUNS }
     *     
     */
    public MOSTFREQ1DUNS getMOSTFREQ1DUNS() {
        return mostfreq1DUNS;
    }

    /**
     * Sets the value of the mostfreq1DUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ1DUNS }
     *     
     */
    public void setMOSTFREQ1DUNS(MOSTFREQ1DUNS value) {
        this.mostfreq1DUNS = value;
    }

    /**
     * Gets the value of the mostfreq2DUNS property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ2DUNS }
     *     
     */
    public MOSTFREQ2DUNS getMOSTFREQ2DUNS() {
        return mostfreq2DUNS;
    }

    /**
     * Sets the value of the mostfreq2DUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ2DUNS }
     *     
     */
    public void setMOSTFREQ2DUNS(MOSTFREQ2DUNS value) {
        this.mostfreq2DUNS = value;
    }

    /**
     * Gets the value of the mostfreq3DUNS property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ3DUNS }
     *     
     */
    public MOSTFREQ3DUNS getMOSTFREQ3DUNS() {
        return mostfreq3DUNS;
    }

    /**
     * Sets the value of the mostfreq3DUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ3DUNS }
     *     
     */
    public void setMOSTFREQ3DUNS(MOSTFREQ3DUNS value) {
        this.mostfreq3DUNS = value;
    }

    /**
     * Gets the value of the mostfreq4DUNS property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ4DUNS }
     *     
     */
    public MOSTFREQ4DUNS getMOSTFREQ4DUNS() {
        return mostfreq4DUNS;
    }

    /**
     * Sets the value of the mostfreq4DUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ4DUNS }
     *     
     */
    public void setMOSTFREQ4DUNS(MOSTFREQ4DUNS value) {
        this.mostfreq4DUNS = value;
    }

    /**
     * Gets the value of the mostfreq5DUNS property.
     * 
     * @return
     *     possible object is
     *     {@link MOSTFREQ5DUNS }
     *     
     */
    public MOSTFREQ5DUNS getMOSTFREQ5DUNS() {
        return mostfreq5DUNS;
    }

    /**
     * Sets the value of the mostfreq5DUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOSTFREQ5DUNS }
     *     
     */
    public void setMOSTFREQ5DUNS(MOSTFREQ5DUNS value) {
        this.mostfreq5DUNS = value;
    }

    /**
     * Gets the value of the cntnoduns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTNODUNS() {
        return cntnoduns;
    }

    /**
     * Sets the value of the cntnoduns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTNODUNS(String value) {
        this.cntnoduns = value;
    }

    /**
     * Gets the value of the cntotherduns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTOTHERDUNS() {
        return cntotherduns;
    }

    /**
     * Sets the value of the cntotherduns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTOTHERDUNS(String value) {
        this.cntotherduns = value;
    }

    /**
     * Gets the value of the histsrchfrrsk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHISTSRCHFRRSK() {
        return histsrchfrrsk;
    }

    /**
     * Sets the value of the histsrchfrrsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHISTSRCHFRRSK(String value) {
        this.histsrchfrrsk = value;
    }

}
