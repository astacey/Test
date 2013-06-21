
package ExperianBusinessTargetWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ExperianBusinessTargetWS package. 
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

    private final static QName _BusinessTargetInput_QNAME = new QName("http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", "BusinessTargetInput");
    private final static QName _BusinessTargetOutput_QNAME = new QName("http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", "BusinessTargetOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ExperianBusinessTargetWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link LocalityResolution }
     * 
     */
    public LocalityResolution createLocalityResolution() {
        return new LocalityResolution();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link InputLocation }
     * 
     */
    public InputLocation createInputLocation() {
        return new InputLocation();
    }

    /**
     * Create an instance of {@link OutputLocation }
     * 
     */
    public OutputLocation createOutputLocation() {
        return new OutputLocation();
    }

    /**
     * Create an instance of {@link BusinessTargetInput }
     * 
     */
    public BusinessTargetInput createBusinessTargetInput() {
        return new BusinessTargetInput();
    }

    /**
     * Create an instance of {@link BusinessDetails }
     * 
     */
    public BusinessDetails createBusinessDetails() {
        return new BusinessDetails();
    }

    /**
     * Create an instance of {@link BusinessTargetOutput }
     * 
     */
    public BusinessTargetOutput createBusinessTargetOutput() {
        return new BusinessTargetOutput();
    }

    /**
     * Create an instance of {@link SearchSummary }
     * 
     */
    public SearchSummary createSearchSummary() {
        return new SearchSummary();
    }

    /**
     * Create an instance of {@link SICInfo }
     * 
     */
    public SICInfo createSICInfo() {
        return new SICInfo();
    }

    /**
     * Create an instance of {@link SearchCriteria }
     * 
     */
    public SearchCriteria createSearchCriteria() {
        return new SearchCriteria();
    }

    /**
     * Create an instance of {@link SearchResults }
     * 
     */
    public SearchResults createSearchResults() {
        return new SearchResults();
    }

    /**
     * Create an instance of {@link BusinessLocation }
     * 
     */
    public BusinessLocation createBusinessLocation() {
        return new BusinessLocation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTargetInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", name = "BusinessTargetInput")
    public JAXBElement<BusinessTargetInput> createBusinessTargetInput(BusinessTargetInput value) {
        return new JAXBElement<BusinessTargetInput>(_BusinessTargetInput_QNAME, BusinessTargetInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessTargetOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", name = "BusinessTargetOutput")
    public JAXBElement<BusinessTargetOutput> createBusinessTargetOutput(BusinessTargetOutput value) {
        return new JAXBElement<BusinessTargetOutput>(_BusinessTargetOutput_QNAME, BusinessTargetOutput.class, null, value);
    }

}
