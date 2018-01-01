package com.unilog.prime.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class PrimeEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeEcommerceApplication.class, args);
	}
	
	@Bean
	public MessageSource messageSource() {
	    final ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();

	    messageSource.setBasename("classpath:i18n/messages");
	    messageSource.setFallbackToSystemLocale(false);
	    messageSource.setCacheSeconds(0);

	    return messageSource;
	}
}
