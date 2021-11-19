package com.csy.jc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * servlet-context.xml 파일을 대신할 Java Config 클래스
 * 
 * @Configuration : 이 파일은 (모든) context.xml 을 대신할 파일이다
 * @EnableWebMvc : 이제 Spring MVC 프로젝트의 servlet 이 시작됨
 *      servlet-context.xml, dispatcher-servlet.xml 등을 대신할 파일
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.csy.jc.controller", "com.csy.jc.service", "com.csy.jc.config.beans"})
public class ServletConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

    /**
     * method 에 @Bean Annotation 을 부착하면
     * 이 method 는 반드시 객체를 생성해서 return 해야 한다
     *
     * Spring 컨테이너는 프로젝트가 시작되는 시점에 이 method 를 자동으로(강제로) 실행하고
     * 생성된 객체를 컨테이너에 보관하여 다른 곳에서 필요할 경우 주입하도록 준비해둔다
     */
    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(2);
        return viewResolver;
    }
}
