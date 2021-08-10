package com.student.enrollment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.enrollment.entities.StudentEnroll;
import com.student.enrollment.services.StudentEnrollService;

@Controller
@RequestMapping("/enroll")
public class StudentEnrollController {

	@Autowired
	private StudentEnrollService enrollService;

	public StudentEnrollService getEnrollService() {
		return enrollService;
	}

	public void setEnrollService(StudentEnrollService enrollService) {
		this.enrollService = enrollService;
	}

	@RequestMapping("/enrollForm")
	public String studentEnrollPage(@ModelAttribute("enroll") StudentEnroll enroll, ModelMap model) {
		model.addAttribute(enroll);
		return "enrollStudent";
	}

	@RequestMapping(value = "enrollStudents", method = RequestMethod.POST)
	public String studentEnroll(@ModelAttribute("enroll") StudentEnroll enroll, ModelMap model) {
		enrollService.enrollStudent(enroll);
		return "redirect:showAll";
	}

	@RequestMapping("/updateStudent")
	public String update(@ModelAttribute("enroll") StudentEnroll enroll, ModelMap model) {
		StudentEnroll senroll = enrollService.updateStudent(enroll);
		model.addAttribute("enroll", senroll);
		return "enrollUpdateForm";
	}

	@RequestMapping(value = "enrollUpdate", method = RequestMethod.POST)
	public String updateEnroll(@ModelAttribute("enroll") StudentEnroll enroll, ModelMap model) {
		enrollService.updateStudent(enroll);
		return "redirect:showAll";
	}
	@RequestMapping("/remove")
	public String removeStudent(@RequestParam("id") int id) {
		enrollService.removeStudent(id);
		return "redirect:showAll";
	}

	@RequestMapping("showAll")
	public String showStudents(ModelMap model) {
		List<StudentEnroll> studentEnroll = enrollService.allStudent();
		model.addAttribute("enroll", studentEnroll);
		return "showAllStudent";
	}

}
