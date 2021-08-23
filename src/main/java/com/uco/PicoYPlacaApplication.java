package com.uco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.uco.utilities.JWTAuthorizationFilter;

@SpringBootApplication
public class PicoYPlacaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicoYPlacaApplication.class, args);
	}
	
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, "/admin/login").permitAll()
				.anyRequest().authenticated();
		}
	}
	
	@Configuration
	public class WebConfig implements WebMvcConfigurer {
	    @Override
	    public void addCorsMappings(CorsRegistry corsRegistry) {
	        corsRegistry.addMapping( "/**" )
	                .allowedOrigins( "http://localhost:4200/" )
	                .allowedMethods( "GET", "POST", "DELETE", "PUT" )
	                .allowedHeaders( "*" )
	                .allowCredentials( true )
	                .exposedHeaders( "Authorization" )
	                .maxAge( 3600 );
	    }

	}

}
