package cn.hsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 花生皮编程(抖音、快手、B站、西瓜视频、今日头条)
 */
@MapperScan({"cn.hsp.mapper","cn.hsp.login.mapper"}) //扫描的mapper
@SpringBootApplication
public class HspBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(HspBlogApplication.class, args);
	}
}
