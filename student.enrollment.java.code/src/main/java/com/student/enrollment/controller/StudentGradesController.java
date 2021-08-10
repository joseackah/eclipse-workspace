package com.student.enrollment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.enrollment.entities.StudentGrades;
import com.student.enrollment.services.StudentGradesService;

@Controller
@RequestMapping("/grades")
public class StudentGradesController {

	@Autowired
	private StudentGradesService gradesService;

	public StudentGradesService getGradesService() {
		return gradesService;
	}

	public void setGradesService(StudentGradesService gradesService) {
		this.gradesService = gradesService;
	}

	@RequestMapping("/gradesForm")
	public String studentGradesPage(@ModelAttribute("grades") StudentGrades grades, ModelMap model) {
		model.addAttribute(grades);
		return "gradesForStudent";
	}

	@RequestMapping(value = "studentGrade", method = RequestMethod.POST)
	public String gradesUpload(@ModelAttribute("grades") StudentGrades grades, ModelMap model) {
		gradesService.saveGrade(grades);
		return "redirect:showAllGrade";
	}

	@RequestMapping("/updateGrade")
	public String update(@ModelAttribute("grades") StudentGrades grades, ModelMap model) {
		StudentGrades sgrades = gradesService.updateGrade(grades);
		model.addAttribute("sgrades", sgrades);
		return "gradesUpdateForm";
	}

	@RequestMapping(value = "gradesUpdate", method = RequestMethod.POST)
	public String updateGrades(@ModelAttribute("grades") StudentGrades grades, ModelMap model) {
		gradesService.updateGrade(grades);
		return "redirect:showAllGrade";
	}

	@RequestMapping("/delete")
	public String deleteGrades(@RequestParam("id") int id) {
		gradesService.deleteGrade(id);
		return "redirect:showAllGrade";
	}

	@RequestMapping("/showAllGrade")
	public String showGrades(ModelMap model) {
		List<StudentGrades> studentGrades = gradesService.showGrades();
		model.addAttribute("grades", studentGrades);
		return "showAllGrades";
	}

}
