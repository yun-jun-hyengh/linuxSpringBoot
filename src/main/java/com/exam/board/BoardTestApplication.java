package com.exam.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * SpringBootServletInitializer 란?
 * - war 파일을 배포를 할 경우 해당 클래스를 반드시 상속받아야 한다 만약 jar 로 배포를 할거면 
 * 해당 클래스를 상속받을 필요는 없다 
 * - 외부 톰캣에서 동작하도록 하기 위해서는 web.xml에 애플리케이션 컨텍스트를 등록해야 함 
 * 아파치 톰캣이 구동될 때 web.xml을 읽어 웹 애플리케이션을 구동한다 !! 
 */

@SpringBootApplication
public class BoardTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BoardTestApplication.class, args);
	}
	
	/*
	 * 외부 톰캣에서 스프링 부트 앱을 부팅할 수 있도록 설정한 메소드 
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}

}
