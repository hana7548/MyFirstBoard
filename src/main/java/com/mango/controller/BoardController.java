package com.mango.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mango.service.BoardService;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {

	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Locale locale, Model model) throws Exception
	{
		List list = service.list();
		model.addAttribute("list", list);
		
	}
}
