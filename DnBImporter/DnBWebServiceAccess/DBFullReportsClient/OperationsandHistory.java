
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectOperationalInformation" type="{http://gateway.dnb.com/getProduct}OperationalInformationType" minOccurs="0"/>
 *         &lt;element name="SubjectOperationalHistoryInformation" type="{http://gateway.dnb.com/getProduct}SubjectHistoryInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subjectOperationalInformation",
    "subjectOperationalHistoryInformation"
})
@XmlRootElement(name = "OperationsandHistory")
public class OperationsandHistory {

    @XmlElement(name = "SubjectOperationalInformation")
    protected OperationalInformationType subjectOperationalInformation;
    @XmlElement(name = "SubjectOperationalHistoryInformation")
    protected SubjectHistoryInformationType subjectOperationalHistoryInformation;

    /**
     * Gets the value of the subjectOperationalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalInformationType }
     *     
     */
    public OperationalInformationType getSubjectOperationalInformation() {
        return subjectOperationalInformation;
    }

    /**
     * Sets the value of the subjectOperationalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalInformationType }
     *     
     */
    public void setSubjectOperationalInformation(OperationalInformationType value) {
        this.subjectOperationalInformation = value;
    }

    /**
     * Gets the value of the subjectOperationalHistoryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType }
     *     
     */
    public SubjectHistoryInformationType getSubjectOperationalHistoryInformation() {
        return subjectOperationalHistoryInformation;
    }

    /**
     * Sets the value of the subjectOperationalHistoryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType }
     *     
     */
    public void setSubjectOperationalHistoryInformation(SubjectHistoryInformationType value) {
        this.subjectOperationalHistoryInformation = value;
    }

}
