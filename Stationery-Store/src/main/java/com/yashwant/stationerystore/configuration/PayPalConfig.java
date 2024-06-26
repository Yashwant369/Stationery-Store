package com.yashwant.stationerystore.configuration;

import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@Configuration
public class PayPalConfig 
{
	private String clientId = "AR0WSv224gShqOcg3t-c_m8A7AdrRa3dNc7OlZ5Kz6WM6RU_dBcUk4fx9iVwIqQ2NOBjJVj6yiStsINW";
	private String clientSecret = "ENrdk-HQv7H5a-6FufzS3B3I2zZ3Did6gSJhjZWhq3XXd1O1q0BPVXXau1cqS5BlTH_1kjsQOKauekOM";
	private String mode = "sandbox";

	@Bean
	public Map<String, String> paypalSdkConfig() {
		Map<String, String> configMap = new HashMap<>();
		configMap.put("mode", mode);
		return configMap;
	}

	@Bean
	public OAuthTokenCredential oAuthTokenCredential() 
	{
		return new OAuthTokenCredential(clientId, clientSecret, paypalSdkConfig());
	}
	

	@Bean
	public APIContext apiContext() throws PayPalRESTException {
	
		APIContext context = new APIContext(clientId, clientSecret, mode);
		context.setConfigurationMap(paypalSdkConfig());
		return context;
	}
	

}
