package io.ymq.dubbo.provider.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 描述:启动提供方服务
 *
 **/
@SpringBootApplication
@ComponentScan(value = {"io.ymq.dubbo"})
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
}
