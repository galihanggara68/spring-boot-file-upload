package com.galih.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.galih.spring.model.User;
import com.galih.spring.service.StorageService;

@Controller
public class IndexController {
	@Autowired
	private StorageService storageService;
	
	@RequestMapping("/")
	public String index(Model model){
		return "index";
	}
	
	@PostMapping("/post")
	public String test(@RequestParam("file") MultipartFile file){
		storageService.saveFile(file);
		return "index";
	}
}
