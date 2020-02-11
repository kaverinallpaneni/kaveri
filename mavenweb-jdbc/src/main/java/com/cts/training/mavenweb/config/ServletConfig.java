package com.cts.training.mavenweb.config;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.cts.training.mavenweb")
@PropertySource("classpath:database.properties")
public class ServletConfig {
	@Autowired
	private Environment env;
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(this.env.getProperty("jdbc.driver"));
		datasource.setUrl(this.env.getProperty("jdbc.url"));
		datasource.setUsername(this.env.getProperty("jdbc.user"));
		datasource.setPassword(this.env.getProperty("jdbc.password"));
		
		return datasource;
		
	}

}
