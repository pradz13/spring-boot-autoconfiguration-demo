package com.sb.example.springbootautoconfigurationdemo;

import com.sb.example.springbootautoconfigurationdemo.beans.ConditionalClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test-bean-load")
public class TestConditionalBeanLoad {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testConditionalBeanLoading() {
        assertNotNull(applicationContext.getBean(ConditionalClass.class));
    }
}
