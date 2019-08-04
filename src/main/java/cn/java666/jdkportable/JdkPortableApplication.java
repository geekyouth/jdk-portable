package cn.java666.jdkportable;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@Slf4j
@SpringBootApplication
public class JdkPortableApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JdkPortableApplication.class, args);
		log.warn("====== 主程序启动成功，以下是jdk信息 ======");
		
		Properties properties = System.getProperties();
		String version = properties.getProperty("java.version");
		String path = properties.getProperty("sun.boot.library.path");
		log.warn("当前jdk版本号={}，路径={}, 完整信息:\n\n\n", version, path);
		
		properties.forEach((o, o2) -> log.warn(o.toString()+"="+o2.toString()));
		
		log.warn("====== END ======");
	}
	
}