
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
 *         &lt;element name="DataArea" type="{http://gateway.dnb.com/getProduct}getDocAvailResponseDataAreaType"/>
 *         &lt;element name="Response" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Report" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "dataArea",
    "response"
})
@XmlRootElement(name = "getDocumentAvailabilityResponse")
public class GetDocumentAvailabilityResponse {

    @XmlElement(name = "ApplicationArea", required = true)
    protected ApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected GetDocAvailResponseDataAreaType dataArea;
    @XmlElement(name = "Response")
    protected GetDocumentAvailabilityResponse.Response response;

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
     *     {@link GetDocAvailResponseDataAreaType }
     *     
     */
    public GetDocAvailResponseDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocAvailResponseDataAreaType }
     *     
     */
    public void setDataArea(GetDocAvailResponseDataAreaType value) {
        this.dataArea = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link GetDocumentAvailabilityResponse.Response }
     *     
     */
    public GetDocumentAvailabilityResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDocumentAvailabilityResponse.Response }
     *     
     */
    public void setResponse(GetDocumentAvailabilityResponse.Response value) {
        this.response = value;
    }


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
     *         &lt;element name="Report" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
        "report"
    })
    public static class Response {

        @XmlElement(name = "Report")
        protected byte[] report;

        /**
         * Gets the value of the report property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getReport() {
            return report;
        }

        /**
         * Sets the value of the report property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setReport(byte[] value) {
            this.report = ((byte[]) value);
        }

    }

}
