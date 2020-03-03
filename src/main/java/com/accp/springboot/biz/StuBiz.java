package com.accp.springboot.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.springboot.dao.IStuDao;
import com.accp.springboot.pojo.Student;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StuBiz {
	@Resource
	private IStuDao iStuDao;
	
	/**
	 * 1．添加学员信息：姓名,密码,性别,生日
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer addStudent(Student stu) {		
		return iStuDao.insert(stu);
	}
	
	/**
	 * 2．修改学员信息：用户必须输入学号，才能修改姓名，密码,性别，生日
	 */
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer modifStuend(Student stu) {
		return iStuDao.updateById(stu);
	}
	
	/**
	 * 3.删除学员信息：用户必须输入学号才能删除学生信息
	 */
	public Integer removeStudent(Integer stuno) {
		return iStuDao.deleteById(stuno);
	}
	
	
	/**
	 * 4．查询所有学员信息：按照生日降序显示所有学生表列数据 //5．查询所有未成年男学员信息//7.根据学员姓名模糊查询学员信息：用户必须输入学员姓名才能模糊查询
	 */
	public List<Student> findStudentAll(QueryWrapper<Student> qw){
		return iStuDao.selectList(qw);
	}
	
	
	/**
	 * 6．根据学号加载一个学生信息/ /8．根据学员姓名和密码实现登陆验证
	 */
	public Student findStudentOne(QueryWrapper<Student> qw){
		return iStuDao.selectOne(qw);
	}
	
	
	
}
