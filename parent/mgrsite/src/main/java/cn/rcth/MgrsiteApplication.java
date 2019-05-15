package cn.rcth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * 前台应用的配置
 */
@SpringBootApplication
@PropertySource("classpath:application-mgr.properties")
@Import(ApplicationCoreConfig.class)
public class MgrsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgrsiteApplication.class, args);
	}

}
