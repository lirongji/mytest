package cn.lrj.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lrj.springboot.dao.NoticeDao;
import cn.lrj.springboot.domain.Notice;
import cn.lrj.springboot.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<Notice> findAll() {
		
		return noticeDao.findAll();
	}
	

}
