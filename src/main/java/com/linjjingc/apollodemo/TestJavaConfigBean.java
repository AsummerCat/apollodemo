package com.linjjingc.apollodemo;

import org.springframework.beans.factory.annotation.Value;

public class TestJavaConfigBean {
	@Value("${timeout:100}")
	private Integer timeout;
	private Integer batch;

	@Value("${batch:200}")
	public void setBatch(int batch) {
		this.batch = batch;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public Integer getBatch() {
		return batch;
	}
}