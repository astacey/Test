package WebServiceClients;

import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;

import org.apache.commons.codec.binary.Base64;

import ExperianTokenService.TokenService;
import ExperianTokenService.TokenServiceSoap;

public class TokenServiceClient 
{
	private static Logger logger = Logger.getLogger(TokenServiceClient.class.getName());
	
	private static final String serviceUrl = "https://secure.wasp.uat.uk.experian.com/WASPAuthenticator/tokenService.asmx";
	private static TokenServiceClient tokenService;
	
	private String encodedToken;
	
	private TokenServiceClient()
	{}
	
	public static TokenServiceClient getInstance()
	{
		if(tokenService==null)
			tokenService = new TokenServiceClient();
		return tokenService;
	}
	
	public String getEncodedToken()
	{
		if(encodedToken==null)
			encodedToken=getToken();
		return encodedToken;
	}
	
	private String getToken()
	{
		logger.info("Start Get Token");
		TokenService tssrv = new TokenService();
		TokenServiceSoap tssoap = tssrv.getTokenServiceSoap();
		BindingProvider bindingProvider = (BindingProvider) tssoap;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);
		
		String token = tssoap.loginWithCertificate("Unit4Testing", true); //base64 encoding the returned token
		String encoded = Base64.encodeBase64String(token.getBytes());
		logger.info("End Get Token - [" + token + "], [" + encoded + "]");
		
		return encoded;
	}
}
