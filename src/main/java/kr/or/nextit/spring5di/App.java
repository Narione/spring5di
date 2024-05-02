package kr.or.nextit.spring5di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
//    	Greeter greeter = new Greeter();
    	//reflection 사용하는 방법 3가지
    	//1.
//    	greeter.getClass();
    	//2.
//    	Greeter.class;
    	//3.
//    	Class.forName("kr.or.nextit.spring5di.Greeter");
    	
//       Greeter greeter = new Greeter();(이것이 밑에 앞 두줄)
//       greeter.setFormat("%s, 안녕하세요!");
//       System.out.println(greeter.greet("미소"));
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
    	Greeter greeter = context.getBean("greeter", Greeter.class);
    	greeter.setFormat("%s님, 안녕하세요!");
    	System.out.println(greeter.greet("쵸파"));
    }
}
