package com.hoclaptrinhonline;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hoclaptrinhonline.entity.TypeCourse;
import com.hoclaptrinhonline.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	@GetMapping(path="",produces="text/plan; charset:utf-8" )
	@Transactional
	public String Default(ModelMap modelmap, Integer offset, Integer maxResults ) {
//		List<TypeCourse> listTypeCourse = courseService.loadListCourse(0);
//		modelmap.addAttribute("listTypeLimit",listTypeCourse);
		 List<TypeCourse> list = courseService.findAll(offset,maxResults);
		 modelmap.addAttribute("count", courseService.countAll());
		 modelmap.addAttribute("offset", offset);
		 modelmap.addAttribute("listTypeCourse", list);
		 
		return "course";
	}
	@PostMapping
	@Transactional
	public String addTypeCourse(@RequestParam String name,@RequestParam String imag,@RequestParam String descrip, ModelMap modelmap) {
		TypeCourse typeCourse = new TypeCourse();
		typeCourse.setName(name);
		typeCourse.setDescrip(descrip);
		typeCourse.setImag(imag);
		boolean checkAdd = courseService.addTypeCourse(typeCourse);
		return "course";
	}
	@GetMapping("/{id_type_course}")
	@Transactional
	public String deleteTypeCourse(@PathVariable int id_type_course, ModelMap modelmap) {	
		TypeCourse typeCourse = new TypeCourse();
		typeCourse.setId_type_course(id_type_course);
		courseService.deleteTypeCourse(typeCourse);		
		return "course";
	}
}