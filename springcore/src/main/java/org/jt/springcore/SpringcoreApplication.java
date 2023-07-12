package org.jt.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("Bean.xml")
public class SpringcoreApplication {

	public static void main(String[] args) {
		var beans = SpringApplication.run(SpringcoreApplication.class, args);
		var Greeting = beans.getBean(gretting.class);

		Greeting.greet();

		var hell = beans.getBean(hello.class);
		hell.hello();

		var student =  beans.getBean(Student.class);
		System.out.println(student.getName()+"id:"+student.getId());


		var employee = beans.getBean(Employee.class);
		System.out.println(employee.getName());

	}

}
