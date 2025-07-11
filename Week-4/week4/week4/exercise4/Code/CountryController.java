package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {
        // Load the country.xml Spring XML config file
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // Get the 'country' bean (which should be India configured in your XML)
        Country country = context.getBean("country", Country.class);

        return country;  // Spring automatically converts this to JSON
    }
}
