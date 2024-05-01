package com.sb.example.springbootautoconfigurationdemo;

import com.sb.example.springbootautoconfigurationdemo.beans.ConditionalClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ActiveProfiles("test-bean-not-load")
public class TestConditionalBeanNotLoad {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testConditionalBeanNotLoading() {
        assertThrows(NoSuchBeanDefinitionException.class, () -> applicationContext.getBean(ConditionalClass.class));
    }
}
