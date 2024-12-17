package com.ps.zapier.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ps.zapier.entity.ZapierData;
import com.ps.zapier.repo.ZapierRepository;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/zapier")
public class ZapierContoller {
	
	@Autowired
	ZapierRepository zapierRepository;
	
	@PostMapping("/sendData")
	public void insertOpportunitiesFromZapier(@RequestBody String data) {
		ZapierData zapierData= new ZapierData();
		zapierData.setData(data);
		this.zapierRepository.save(zapierData);
	}
	
	@GetMapping("/fetch/token")
	public void fetchToken(HttpServletResponse response, @RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "mobile", required = true) String mobile) throws IOException
	{
		String returnUrl = "https://www.purpleslate.com?token=eygdhjhdfhjh.abc&mail="+email+"&mobile="+mobile;
		response.sendRedirect(returnUrl);
	}

}
