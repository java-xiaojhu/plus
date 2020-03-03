package com.accp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.springboot.biz.StuBiz;
import com.accp.springboot.pojo.Student;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@SpringBootTest
class SpringBootMybitsPlusApplicationTests {

	@Resource
	private StuBiz stuBiz;

	@Test
	public void contextLoads() {
		Scanner input = new Scanner(System.in);
		/**
		 * 1．添加学员信息：姓名,密码,性别,生日
		 */
		/**
		 * if(stuBiz.addStudent(new Student(null, "琳琳", "123", "女", "2002-2-04"))>0) {
		 * System.out.println("添加成功!"); }else { System.out.println("添加失败!"); }
		 */
		/**
		 * 2．修改学员信息：用户必须输入学号，才能修改姓名，密码,性别，生日
		 */
		/**
		 * 
		 * Student stu=new Student(); System.out.println("请输入学号");
		 * stu.setStuno(input.nextInt()); System.out.println("请输入姓名");
		 * stu.setStuname(input.nextLine()); System.out.println("请输入密码");
		 * stu.setStupwd(input.nextLine()); System.out.println("请输入性别");
		 * stu.setStusex(input.nextLine()); System.out.println("请输入生日");
		 * stu.setStudate(input.nextLine()); if(stuBiz.modifStuend(stu)>0) {
		 * System.out.println("修改成功!"); }else { System.out.println("修改失败!"); }
		 */
		/**
		 * 3.删除学员信息：用户必须输入学号才能删除学生信息
		 */
		/**
		 * System.out.println("请输入学号"); if(stuBiz.removeStudent(input.nextInt())>0) {
		 * System.out.println("删除成功!"); }else { System.out.println("删除失败!"); }
		 */

		/**
		 * 4．查询所有学员信息：按照生日降序显示所有学生表列数据
		 * //5．查询所有未成年男学员信息//7.根据学员姓名模糊查询学员信息：用户必须输入学员姓名才能模糊查询
		 */

		/*
		 * System.out.println("按照生日降序显示所有学生表列数据================"); QueryWrapper<Student>
		 * qw = Wrappers.query(); qw.orderByDesc("studate");
		 * stuBiz.findStudentAll(qw).forEach(temp -> { System.out.println(temp); });
		 * System.out.println();
		 */

		/*
		 * System.out.println("查询所有未成年男学员信息================"); QueryWrapper<Student> qw1
		 * = Wrappers.query(); Calendar calendar = Calendar.getInstance();
		 * System.out.println(calendar); SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); String now =
		 * sdf.format(calendar.getTime()); System.out.println("现在时间" + now);
		 * calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 18); String
		 * shibabefore = sdf.format(calendar.getTime()); System.out.println("十八年" +
		 * shibabefore); qw1.between("studate", shibabefore, now); qw1.eq("stusex",
		 * "男"); stuBiz.findStudentAll(qw1).forEach(temp -> { System.out.println(temp);
		 * });
		 */

		/*
		 * System.out.println();
		 * System.out.println("根据学员姓名模糊查询学员信息：用户必须输入学员姓名才能模糊查询================");
		 * QueryWrapper<Student> qw2 = Wrappers.query();
		 * System.out.println("请输入要模糊查询的学生姓名"); qw2.like("stuname", input.nextLine());
		 * stuBiz.findStudentAll(qw2).forEach(temp -> { System.out.println(temp); });
		 */

		/**
		 * 6．根据学号加载一个学生信息/ /8．根据学员姓名和密码实现登陆验证
		 */
		/*
		 * System.out.println("6．根据学号加载一个学生信息=============================");
		 * QueryWrapper<Student> qw3 = Wrappers.query(); System.out.println("请输入学号");
		 * qw3.eq("stuno", input.nextLine());
		 * System.out.println(stuBiz.findStudentOne(qw3));
		 * System.out.println("8．根据学员姓名和密码实现登陆验证=============================");
		 * QueryWrapper<Student> qw4 = Wrappers.query(); System.out.println("请输入姓名");
		 * qw4.eq("stuname", input.nextLine()); System.out.println("请输入密码");
		 * qw4.eq("stupwd", input.nextLine());
		 * System.out.println(stuBiz.findStudentOne(qw4));
		 */
	}

}
