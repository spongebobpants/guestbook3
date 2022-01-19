package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Controller
@RequestMapping(value = "/guest")
public class GuestController {
	
	//field
	//constructor
	//g.s
	//method
	
	@RequestMapping(value ="/addList", method = {RequestMethod.GET, RequestMethod.POST} )
	public String addList(Model model) {
		System.out.println("GuestController > addList");
		
		List<GuestbookVo>guestbookList = new GuestbookDao().getList();
		System.out.println(guestbookList.toString());
	
		//controller -> data
		model.addAttribute("guestList", guestbookList);
		return "/WEB-INF/views/addList.jsp";
		
		
	}

}
