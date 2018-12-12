package com.ycoko.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * refer to <a href="https://www.jb51.net/article/145859.htm">使用Springboot搭建OAuth2.0 Server的方法示例</a>
 * @author machenike
 *
 */
@SpringBootApplication
public class AuthApp {
	public static void main(String[] args) {
		SpringApplication.run(AuthApp.class, args);
	}
}
