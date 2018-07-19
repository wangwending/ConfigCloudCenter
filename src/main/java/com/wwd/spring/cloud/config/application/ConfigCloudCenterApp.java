package com.wwd.spring.cloud.config.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
		* ClassName: ConfigCloudCenterApp <br/>
		* Function: 配置中心服务启动入口. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigCloudCenterApp {
	
	// 程序启动入口
	public static void main(String[] args) {
		SpringApplication.run(ConfigCloudCenterApp.class, args);
	}
}
