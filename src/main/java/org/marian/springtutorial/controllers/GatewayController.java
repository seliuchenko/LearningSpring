package org.marian.springtutorial.controllers;

import java.security.Principal;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.marian.springtutorial.beans.Department;
import org.marian.springtutorial.dao.BaseDao;
import org.marian.springtutorial.dao.impl.DepartmentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Controller
public class GatewayController {
	private static final Logger logger = Logger.getLogger(GatewayController.class);
	

	//ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
	//BaseDao baseDao = (BaseDao)context.getBean("departmentDAO");
	
	@RequestMapping(value={"/","welcome"}, method=RequestMethod.GET)
	public String welcomePage(Model model){
		logger.debug("Entered Controller");
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		return "welcomePage";
	}
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String adminPage(Model model){
		return "adminPage";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage(Model model){
		return "loginPage";
	}
	
	@RequestMapping(value="/logoutSuccessful", method=RequestMethod.GET)
	public String logoutSuccessfulPage(Model model){
		model.addAttribute("title","Logout");
		return "logoutSuccessfulPage";
	}
	
	@RequestMapping(value="/userInfo", method=RequestMethod.GET)
	public String userInfo(Model model, Principal principal){
		String userName = principal.getName();
		model.addAttribute("userName", userName);
		return "userInfoPage";
	}
	
	@RequestMapping(value="/403", method=RequestMethod.GET)
	public String accessDenied(Model model, Principal principal){
		if(principal!=null){
			model.addAttribute("message","Hi "+principal.getName()+
					",<br> you do not have permission to access this page!");
		}else{
			model.addAttribute("message","You do not have permission to access this page!");
		}
		return "403Page";
	}
	
}
