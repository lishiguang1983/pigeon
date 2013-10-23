/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.provider;

import com.dianping.pigeon.demo.EchoService;

/**
 * 
 * 
 * @author jianhuihuang
 * @version $Id: EchoServiceImpl.java, v 0.1 2013-6-22 下午7:05:18 jianhuihuang
 *          Exp $
 */
public class EchoServiceImpl implements EchoService {

	// private SayHelloService sayHelloService;

	@Override
	public String echo(String input) {
		System.out.println("Received: " + input);
		return "Echo: " + input;
	}

}