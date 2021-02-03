package com.linjjingc.apollodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipsController {

	@Autowired
	private TestJavaConfigBean testJavaConfigBean;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public Integer sendTip() {
		return testJavaConfigBean.getTimeout();
	}

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public Integer index() {
		return testJavaConfigBean.getBatch();
	}

}
