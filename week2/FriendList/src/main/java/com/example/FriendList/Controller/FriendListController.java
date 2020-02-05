package com.example.FriendList.Controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FriendList.domain.FriendList;

@Controller
public class FriendListController {
	
	//ARRAYLÍT Ò  of friend
	
	private ArrayList <FriendList> friendArr = new ArrayList <FriendList>();
	
	//ENDPOINT  FOR LISTING THE FRIENDS
	@GetMapping("/index")
	public String friendList(Model model) {
		FriendList friend = new FriendList();
		model.addAttribute("friend", friend);
		return "friendlist";
	}
	//ENDPOINT FOR ADDING A FRIEND
	
	@PostMapping("/index")
	public  String friendSubmit(@ModelAttribute FriendList friend, Model model) {
		friendArr.add(friend);
		model.addAttribute("friends", friendArr);
		friend = new FriendList();
		model.addAttribute("friend", friend);		
		return "friendlist";
	}
}