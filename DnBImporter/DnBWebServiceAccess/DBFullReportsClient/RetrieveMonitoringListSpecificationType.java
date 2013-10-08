
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMonitoringListSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMonitoringListSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeAllUsers" type="{http://gateway.dnb.com/getProduct}IncludeAllUsersType" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://gateway.dnb.com/getProduct}HitCountType" minOccurs="0"/>
 *         &lt;element name="RetrievalCountPerRequest" type="{http://gateway.dnb.com/getProduct}RetrievalCountPerRequestType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMonitoringListSpecificationType", propOrder = {
    "includeAllUsers",
    "hitCount",
    "retrievalCountPerRequest"
})
public class RetrieveMonitoringListSpecificationType {

    @XmlElement(name = "IncludeAllUsers")
    protected Boolean includeAllUsers;
    @XmlElement(name = "HitCount")
    protected BigInteger hitCount;
    @XmlElement(name = "RetrievalCountPerRequest")
    protected BigInteger retrievalCountPerRequest;

    /**
     * Gets the value of the includeAllUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllUsers() {
        return includeAllUsers;
    }

    /**
     * Sets the value of the includeAllUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllUsers(Boolean value) {
        this.includeAllUsers = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHitCount(BigInteger value) {
        this.hitCount = value;
    }

    /**
     * Gets the value of the retrievalCountPerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetrievalCountPerRequest() {
        return retrievalCountPerRequest;
    }

    /**
     * Sets the value of the retrievalCountPerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetrievalCountPerRequest(BigInteger value) {
        this.retrievalCountPerRequest = value;
    }

}
