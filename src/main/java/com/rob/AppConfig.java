package com.rob;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
// @PropertySources(value = {
// @PropertySource("classpath:/application.properties") })
@ComponentScan(basePackages = "com.rob")
public class AppConfig {

	@Autowired
	DataSource ds;

	@Autowired
	private Environment env;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(ds);
		factory.setPackagesToScan("com.rob.entity");
		factory.setHibernateProperties(new Properties() {
			{
				// setProperty("hibernate.hbm2ddl.auto", "update");
				// setProperty("hibernate.dialect",
				// env.getProperty("hibernate.dialect"));
				// setProperty("hibernate.globally_quoted_identifiers", "true");
			}
		});
		return factory;
	}

	@Bean
    @Autowired
    public HibernateTransactionManager transactionManager(
            SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
	
}
