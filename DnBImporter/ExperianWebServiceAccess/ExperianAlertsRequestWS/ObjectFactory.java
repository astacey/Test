
package ExperianAlertsRequestWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ExperianAlertsRequestWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlertsMessageOutput_QNAME = new QName("http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest", "AlertsMessageOutput");
    private final static QName _AlertsMessageInput_QNAME = new QName("http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest", "AlertsMessageInput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ExperianAlertsRequestWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlertMessage }
     * 
     */
    public AlertMessage createAlertMessage() {
        return new AlertMessage();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link AlertsMessageOutput }
     * 
     */
    public AlertsMessageOutput createAlertsMessageOutput() {
        return new AlertsMessageOutput();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link CCYYMMDD }
     * 
     */
    public CCYYMMDD createCCYYMMDD() {
        return new CCYYMMDD();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link AlertsMessageInput }
     * 
     */
    public AlertsMessageInput createAlertsMessageInput() {
        return new AlertsMessageInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsMessageOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest", name = "AlertsMessageOutput")
    public JAXBElement<AlertsMessageOutput> createAlertsMessageOutput(AlertsMessageOutput value) {
        return new JAXBElement<AlertsMessageOutput>(_AlertsMessageOutput_QNAME, AlertsMessageOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsMessageInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest", name = "AlertsMessageInput")
    public JAXBElement<AlertsMessageInput> createAlertsMessageInput(AlertsMessageInput value) {
        return new JAXBElement<AlertsMessageInput>(_AlertsMessageInput_QNAME, AlertsMessageInput.class, null, value);
    }

}
