package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
/*@RequestMapping(value = "/mica")*/
public class LoginRestService {
	
	

	private static Logger logger = LoggerFactory.getLogger(LoginRestService.class);
	
	//LoginServiceImp loginServiceImp;
	/**
	 * verifyCredentials
	 * @param loginDTO
	 * @return
	 * @throws InventoryReceiveException
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String hello() {
	
	//	loginServiceImp.getName(builder );
		return "Hello  Ranjan";
		
	}
	
		
}
