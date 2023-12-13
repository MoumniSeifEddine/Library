package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Domain.Course;
import com.example.demo.Domain.StudentDAO;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.CourseService;
import com.example.demo.Service.StudentService;

@Controller
@RequestMapping("/")
public class IndexController {

	
	@Autowired
	private CourseService service;
	@Autowired
	private StudentService services;
	@Autowired
	private StudentRepository studentrepository;
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String viewStudentPage(Model model)
	{
		List<StudentDAO> li= new ArrayList<>();
		for (Object[] E : studentrepository.findStudent()) {
		StudentDAO student =new StudentDAO();
		student.setId(Long.parseLong(String.valueOf(E[0])));
		student.setStname((String) E[1]);
		student.setCoursename((String) E[2]);
		li.add(student);
		}
		model.addAttribute("liststudent", li);
		return "student";
		
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	 public String index()
	 {
		return "index";
	 }
	
	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public String viewHomePage(Model model)
	{
		List<Course> listcourse = service.listAll();
		model.addAttribute("listcourse", listcourse);
		System.out.print("Get / ");
		return"course";
	}
		
	}
