package com.shop.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Member;
import com.shop.cafe.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@PostMapping("insertMember")
	public String insertMember(@RequestBody Member m) {
		try {
			memberService.insertMember(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
		return "ok";
}

}
