package com.BalajiIT.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SequrityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http)throws Exception {
		
		http.authorizeRequests()
		.antMatchers("checkBalance").authenticated()
		.antMatchers("getStatement").authenticated()
		.antMatchers("getLoan").authenticated()
		.antMatchers("home").permitAll()
		.antMatchers("contact").permitAll()
		.and().formLogin().and().httpBasic();
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("balaji")
		.password("Balu@1234")
		.authorities("Admin").and()
		.withUser("sanket")
		.password("s@123")
		.authorities("Student").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	}
	
