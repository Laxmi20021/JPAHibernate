package com.xworkz.xworkz_course_registration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

public class WebConfiguration {

    public WebConfiguration(){
        System.out.println("No-Args Const Of WebConfiguration");
    }
    @Bean
    public ViewResolver viewResolver() {
        return new InternalResourceViewResolver("/", ".jsp");
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/coursedb");
        dataSource.setUsername("root");
        dataSource.setPassword("Xworkzodc@123");
        return dataSource;

    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContEnititymangFactBean() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();

        // Specify the package to scan for entities
        bean.setPackagesToScan("com.xworkz.xworkz_course_reg.entity");

        // Set the data source (ensure your dataSource() method is correct)
        bean.setDataSource(dataSource());

        // Specify the JPA vendor adapter (using Hibernate in this case)
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

        return bean;
    }
}
