package com.springboot.learn.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.learn.service.ComputeService;

/**  

 * @Title: ComputeServiceImpl.java

 * @Prject: ProviderService

 * @Package: com.springboot.learn.service.impl

 * @Description: TODO

 * @author: ping.wen  

 * @date: 2017年7月12日 上午11:11:04

 */
@Service
public class ComputeServiceImpl implements ComputeService {

	/* (non-Javadoc)
	 * @see com.springboot.learn.service.ComputeService#add(int, int)
	 */
	@Override
	public Integer add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
