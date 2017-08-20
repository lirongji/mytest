package cn.lrj.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.lrj.springboot.domain.Notice;
@Repository
public interface NoticeDao extends JpaRepository<Notice, Long> {

}
