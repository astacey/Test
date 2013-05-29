
package DBWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOOKUPRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOOKUPRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LOOKUPDUPLICATETOWNRS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}ArrayOfLOOKUPDUPLICATETOWNRS" minOccurs="0"/>
 *         &lt;element name="LOOKUPRSCLOSETOWN" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}ArrayOfLOOKUPRSCLOSETOWN" minOccurs="0"/>
 *         &lt;element name="LOOKUPRSCOMPANY" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}ArrayOfLOOKUPRSCOMPANY" minOccurs="0"/>
 *         &lt;element name="SRVTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOOKUPRS", propOrder = {
    "lookupduplicatetownrs",
    "lookuprsclosetown",
    "lookuprscompany",
    "srvtid"
})
public class LOOKUPRS {

    @XmlElementRef(name = "LOOKUPDUPLICATETOWNRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLOOKUPDUPLICATETOWNRS> lookupduplicatetownrs;
    @XmlElementRef(name = "LOOKUPRSCLOSETOWN", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLOOKUPRSCLOSETOWN> lookuprsclosetown;
    @XmlElementRef(name = "LOOKUPRSCOMPANY", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLOOKUPRSCOMPANY> lookuprscompany;
    @XmlElementRef(name = "SRVTID", type = JAXBElement.class)
    protected JAXBElement<String> srvtid;

    /**
     * Gets the value of the lookupduplicatetownrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPDUPLICATETOWNRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLOOKUPDUPLICATETOWNRS> getLOOKUPDUPLICATETOWNRS() {
        return lookupduplicatetownrs;
    }

    /**
     * Sets the value of the lookupduplicatetownrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPDUPLICATETOWNRS }{@code >}
     *     
     */
    public void setLOOKUPDUPLICATETOWNRS(JAXBElement<ArrayOfLOOKUPDUPLICATETOWNRS> value) {
        this.lookupduplicatetownrs = ((JAXBElement<ArrayOfLOOKUPDUPLICATETOWNRS> ) value);
    }

    /**
     * Gets the value of the lookuprsclosetown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPRSCLOSETOWN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLOOKUPRSCLOSETOWN> getLOOKUPRSCLOSETOWN() {
        return lookuprsclosetown;
    }

    /**
     * Sets the value of the lookuprsclosetown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPRSCLOSETOWN }{@code >}
     *     
     */
    public void setLOOKUPRSCLOSETOWN(JAXBElement<ArrayOfLOOKUPRSCLOSETOWN> value) {
        this.lookuprsclosetown = ((JAXBElement<ArrayOfLOOKUPRSCLOSETOWN> ) value);
    }

    /**
     * Gets the value of the lookuprscompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPRSCOMPANY }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLOOKUPRSCOMPANY> getLOOKUPRSCOMPANY() {
        return lookuprscompany;
    }

    /**
     * Sets the value of the lookuprscompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPRSCOMPANY }{@code >}
     *     
     */
    public void setLOOKUPRSCOMPANY(JAXBElement<ArrayOfLOOKUPRSCOMPANY> value) {
        this.lookuprscompany = ((JAXBElement<ArrayOfLOOKUPRSCOMPANY> ) value);
    }

    /**
     * Gets the value of the srvtid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSRVTID() {
        return srvtid;
    }

    /**
     * Sets the value of the srvtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSRVTID(JAXBElement<String> value) {
        this.srvtid = ((JAXBElement<String> ) value);
    }

}
