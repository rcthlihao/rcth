package cn.rcth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.rcth.*.mapper")
@EnableTransactionManagement
public class ApplicationCoreConfig {


}
