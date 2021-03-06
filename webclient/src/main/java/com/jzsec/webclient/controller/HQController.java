package com.jzsec.webclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jzsec.gupiao.entity.HQShow;

@Controller
public class HQController {
	
	@Autowired
	private HQShow hq;
	
	private Gson gson = new GsonBuilder().create();
	@ResponseBody
	@RequestMapping(value = "/hq", method= RequestMethod.GET)
	public String fetchHQ() {
		
		return gson.toJson(hq);
	}
}
