package Application;

import javax.xml.ws.BindingProvider;

import org.apache.commons.codec.binary.Base64;

import ExperianTokenService.TokenService;
import ExperianTokenService.TokenServiceSoap;

public class ExperianConnectionTest {
		private static final String serviceUrl = "https://secure.wasp.uat.uk.experian.com/WASPAuthenticator/tokenService.asmx";
			
		public void test()
		{
			
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
