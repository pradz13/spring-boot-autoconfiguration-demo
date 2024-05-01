package com.sb.example.springbootautoconfigurationdemo.configuration;

import com.sb.example.springbootautoconfigurationdemo.beans.ConditionalClass;
import com.sb.example.springbootautoconfigurationdemo.conditional.ConditionToMatch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    @Conditional(ConditionToMatch.class)
    public ConditionalClass conditionalClass() {
        return new ConditionalClass();
    }
}
