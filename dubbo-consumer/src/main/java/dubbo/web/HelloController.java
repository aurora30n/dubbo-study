package dubbo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dubbo.service.HelloService;

@RequestMapping(value="hello")
@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="sayHi")
	public String sayHi(String name) {
		return this.helloService.sayHi(name);
	}

}
