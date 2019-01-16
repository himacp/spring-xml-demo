package com.stackroute.domain;

import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet");
    }
}
