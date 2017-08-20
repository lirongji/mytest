package cn.lrj.springboot.service;

import java.util.List;

import cn.lrj.springboot.domain.Notice;

public interface NoticeService {
	/** 查询所有的公告 */
	public List<Notice> findAll();


}
