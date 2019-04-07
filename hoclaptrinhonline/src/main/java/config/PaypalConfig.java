package config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@Configuration
	public class PaypalConfig {

		@Value("ATPbaXbcIckBRS_MXNDGfx-mFugEE1FTJocZnqrwTiRCu8dfrelHEdbOVHRMsRWf_lyRNa_e_1jIKW7t")
	    private String clientId;
		@Value("EKjtTh46DILNLx4rFrzgskIBIGAUWPFMAB0bR-IdZekSDwIJzRfCimk-PxzxAtpyb9tji89jUwcCXNRK")
	    private String clientSecret;
		@Value("sandbox")
	    private String mode;
		@Value("8080")
	    private String port;
	    
		@Bean
		public Map<String, String> paypalSdkConfig(){
			Map<String, String> sdkConfig = new HashMap<String, String>();
			sdkConfig.put("mode", mode);
			return sdkConfig;
		}
		
		@Bean
		public OAuthTokenCredential authTokenCredential(){
			return new OAuthTokenCredential(clientId, clientSecret, paypalSdkConfig());
		}
		
		@Bean
		public APIContext apiContext() throws PayPalRESTException{
			APIContext apiContext = new APIContext(authTokenCredential().getAccessToken());
			apiContext.setConfigurationMap(paypalSdkConfig());
			return apiContext;
		}
	
}

