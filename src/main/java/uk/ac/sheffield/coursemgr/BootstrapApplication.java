package uk.ac.sheffield.coursemgr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SpringBoot项目的启动器，运行这个main方法即可跑起来这个项目,内置了一个Tomcat服务器.
 * @author lizhen
 * @date 2019/03/04
 */
@EnableSwagger2
@EnableAspectJAutoProxy
@SpringBootApplication
@ServletComponentScan
@MapperScan("uk.ac.sheffield.coursemgr.mapper")
public class BootstrapApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }

}
