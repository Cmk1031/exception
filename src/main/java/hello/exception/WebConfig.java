package hello.exception;

import hello.exception.filter.LogFilter;
import jakarta.servlet.Filter;

import org.springframework.boot.web.servlet.DispatcherType;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.boot.web.servlet.DispatcherType.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /*@Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new LogFilter());
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setDispatcherTypes(REQUEST, ERROR);
        return filterRegistrationBean;
    }*/
}
