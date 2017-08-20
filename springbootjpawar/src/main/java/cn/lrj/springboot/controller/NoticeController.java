package cn.lrj.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lrj.springboot.domain.Notice;
import cn.lrj.springboot.service.NoticeService;
@RestController
public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@GetMapping("/findAll")
	public List<Notice> findAll(Model model){
		return noticeService.findAll();
	}
	
}

