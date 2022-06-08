package com.javainuse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class ApplicationConfiguration {

    @Bean(name = "threadPoolWSDLServiceExecutor1")
    public Executor wsdlServiceExecutor1() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        executor.setQueueCapacity(50);
        executor.setThreadNamePrefix("threadPoolWSDLServiceExecutor1::");
        executor.initialize();
        return executor;
    }

    @Bean(name = "threadPoolWSDLServiceExecutor2")
    public Executor wsdlServiceExecutor2() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        executor.setQueueCapacity(50);
        executor.setThreadNamePrefix("threadPoolWSDLServiceExecutor2::");
        executor.initialize();
        return executor;
    }
}
