
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
 *         &lt;element name="ApplicationArea" type="{http://gateway.dnb.com/getProduct}ApplicationAreaType"/>
 *         &lt;element name="DataArea" type="{http://gateway.dnb.com/getProduct}getDocumentOrderReqDataAreaType"/>
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
    "applicationArea",
    "dataArea"
})
@XmlRootElement(name = "getDocumentOrderRequest")
public class GetDocumentOrderRequest {

    @XmlElement(name = "ApplicationArea", required = true)
    protected ApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected GetDocumentOrderReqDataAreaType dataArea;

    /**
     * Gets the value of the applicationArea property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationAreaType }
     *     
     */
    public ApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * Sets the value of the applicationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationAreaType }
     *     
     */
    public void setApplicationArea(ApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentOrderReqDataAreaType }
     *     
     */
    public GetDocumentOrderReqDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentOrderReqDataAreaType }
     *     
     */
    public void setDataArea(GetDocumentOrderReqDataAreaType value) {
        this.dataArea = value;
    }

}
