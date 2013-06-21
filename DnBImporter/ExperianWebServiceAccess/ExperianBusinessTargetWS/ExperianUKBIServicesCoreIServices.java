
package ExperianBusinessTargetWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Experian.UK.BI.Services.Core.IServices", targetNamespace = "http://services.experian.com/experian/wbsv/generic/bi")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExperianUKBIServicesCoreIServices {


    /**
     * 
     * @param businessTargetInput
     * @return
     *     returns ExperianBusinessTargetWS.BusinessTargetOutput
     */
    @WebMethod(operationName = "CallBusinessTarget", action = "http://services.experian.com/experian/wbsv/generic/bi/Experian.UK.BI.Services.Core.IServices/CallBusinessTarget")
    @WebResult(name = "BusinessTargetOutput", targetNamespace = "http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", partName = "BusinessTargetOutput")
    public BusinessTargetOutput callBusinessTarget(
        @WebParam(name = "BusinessTargetInput", targetNamespace = "http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", partName = "BusinessTargetInput")
        BusinessTargetInput businessTargetInput);

}
