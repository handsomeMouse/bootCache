package bootcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Configuration
@EnableCaching
@SpringBootApplication
@EntityScan(basePackages = { "com.xu.test" })
@EnableJpaRepositories(basePackages = { "com.xu.test"})
@ComponentScan(basePackages = { "com.xu.test" })
public class MainStart {
public static void main(String[] args) {
	 SpringApplication.run(MainStart.class, args);
}
}
