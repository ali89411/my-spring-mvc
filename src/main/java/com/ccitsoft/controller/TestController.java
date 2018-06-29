package com.ccitsoft.controller;

import com.ccitsoft.annotation.MyController;
import com.ccitsoft.annotation.MyRequestMapping;
import com.ccitsoft.annotation.MyRequestParam;

@MyController
@MyRequestMapping(value="/test")
public class TestController {
	
	@MyRequestMapping(value="/testMethod")
	public String testMethod(@MyRequestParam(value="name") String name){
		return name;
	}
	
}
