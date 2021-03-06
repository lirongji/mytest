package cn.lrj.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		/** 运行SpringBoot应用 */
		//SpringApplication.run(Application.class, args);
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}

}
