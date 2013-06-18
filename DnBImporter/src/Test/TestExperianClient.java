package Test;

import static org.junit.Assert.*;

import javax.xml.ws.BindingProvider;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import ExperianTokenService.*;

public class TestExperianClient {

	private static final String serviceUrl = "https://secure.wasp.uat.uk.experian.com/WASPAuthenticator/tokenService.asmx";
		
	@Test
	public void test()
	{
		System.setProperty("javax.net.ssl.keyStoreType", "JKS");
		System.setProperty("javax.net.ssl.keyStore", "/home/astacey/Experian/experiancert2.jks");
		System.setProperty("javax.net.ssl.keyStorePassword", "Caste11");
		
		TokenService tssrv = new TokenService();
		TokenServiceSoap tssoap = tssrv.getTokenServiceSoap();
		BindingProvider bindingProvider = (BindingProvider) tssoap;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);
		
		String token = tssoap.loginWithCertificate("Unit4Testing", true); //base64 encoding the returned token 
		String encoded = Base64.encodeBase64String(token.getBytes());
		System.out.println(token);
		System.out.println(encoded);
		
		// RXJyb3IgaXNzdWluZyBhdXRoZW50aWNhdGlvbiB0b2tlbg==
		// RXJyb3IgaXNzdWluZyBhdXRoZW50aWNhdGlvbiB0b2tlbg==
	}
}
