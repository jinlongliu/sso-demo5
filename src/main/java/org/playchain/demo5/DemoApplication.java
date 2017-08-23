package org.playchain.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableOAuth2Sso
//@EnableWebSecurity
//@EnableResourceServer
public class DemoApplication {

/*	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.antMatcher("*//**")
				.authorizeRequests()
				.antMatchers("/","login**","/webjars*//**","/hello")
				.permitAll()
				.anyRequest()
				.authenticated()
				.and()
				.logout()
				.logoutUrl("/logout")
				.deleteCookies("JSESSIONID")
				.invalidateHttpSession(true)
				.clearAuthentication(true)
				.logoutSuccessUrl("/hello").permitAll()
				.and()
				.csrf().disable();
	}*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
