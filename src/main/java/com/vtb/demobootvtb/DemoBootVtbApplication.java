package com.vtb.demobootvtb;

import com.vtb.demobootvtb.aop.Quoter;
import com.vtb.demobootvtb.dima.Elf;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ImportResource("classpath:aop.xml")
@EnableScheduling
public class DemoBootVtbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoBootVtbApplication.class, args);
        Quoter quoter = context.getBean(Quoter.class);
        quoter.sayQuote();
        //        System.out.println(quoter.getClass());
//        quoter.beer();

    }

}
