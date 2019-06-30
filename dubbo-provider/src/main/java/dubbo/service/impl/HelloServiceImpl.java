package dubbo.service.impl;

import dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHi(String name) {
		return "Hi, " + name + "!";
	}

}
