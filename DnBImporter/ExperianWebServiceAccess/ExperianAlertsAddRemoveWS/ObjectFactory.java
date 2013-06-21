
package ExperianAlertsAddRemoveWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ExperianAlertsAddRemoveWS package. 
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

    private final static QName _AlertsAddRemoveInput_QNAME = new QName("http://schema.uk.experian.com/experian/bi/alertsaddremove/intr/v100/alertsaddremove", "AlertsAddRemoveInput");
    private final static QName _AlertsAddRemoveOutput_QNAME = new QName("http://schema.uk.experian.com/experian/bi/alertsaddremove/intr/v100/alertsaddremove", "AlertsAddRemoveOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ExperianAlertsAddRemoveWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlertsAddRemoveOutput }
     * 
     */
    public AlertsAddRemoveOutput createAlertsAddRemoveOutput() {
        return new AlertsAddRemoveOutput();
    }

    /**
     * Create an instance of {@link Confirmation }
     * 
     */
    public Confirmation createConfirmation() {
        return new Confirmation();
    }

    /**
     * Create an instance of {@link AlertsAddRemoveInput }
     * 
     */
    public AlertsAddRemoveInput createAlertsAddRemoveInput() {
        return new AlertsAddRemoveInput();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Business }
     * 
     */
    public Business createBusiness() {
        return new Business();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsAddRemoveInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.uk.experian.com/experian/bi/alertsaddremove/intr/v100/alertsaddremove", name = "AlertsAddRemoveInput")
    public JAXBElement<AlertsAddRemoveInput> createAlertsAddRemoveInput(AlertsAddRemoveInput value) {
        return new JAXBElement<AlertsAddRemoveInput>(_AlertsAddRemoveInput_QNAME, AlertsAddRemoveInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsAddRemoveOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.uk.experian.com/experian/bi/alertsaddremove/intr/v100/alertsaddremove", name = "AlertsAddRemoveOutput")
    public JAXBElement<AlertsAddRemoveOutput> createAlertsAddRemoveOutput(AlertsAddRemoveOutput value) {
        return new JAXBElement<AlertsAddRemoveOutput>(_AlertsAddRemoveOutput_QNAME, AlertsAddRemoveOutput.class, null, value);
    }

}
