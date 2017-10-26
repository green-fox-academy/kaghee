package com.greenfox.kaghee.helloworld;

import com.greenfox.kaghee.helloworld.config.ColourConfig;
import com.greenfox.kaghee.helloworld.config.HelloWorldConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloworldApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld hw = ctx.getBean(HelloWorld.class);
		hw.setMessage("Hello World!");
		hw.getMessage();

		ApplicationContext ctx1 = new AnnotationConfigApplicationContext(ColourConfig.class);

		MyColor myRed = ctx1.getBean(RedColour.class);
		myRed.printColor();

		MyColor myBlue = ctx1.getBean(BlueColour.class);
		myBlue.printColor();
	}
}
