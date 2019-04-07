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

import com.hoclaptrinhonline.entity.Course;
import com.hoclaptrinhonline.entity.TypeCourse;
import com.hoclaptrinhonline.service.CourseService;

@Controller
@RequestMapping("/detailCourse")
public class DetailCourse {
	@Autowired
	CourseService courseService;
//	@GetMapping(path="",produces="text/plan; charset:utf-8" )
//	public String Default(ModelMap modelmap, Integer offset, Integer maxResults ) {
//
//		 List<Course> list = courseService.findAllCourse(offset,maxResults);
//		 modelmap.addAttribute("count", courseService.countAllCoure());
//		 modelmap.addAttribute("offset", offset);
//		 modelmap.addAttribute("listCourse", list);
//		 
//		return "detailCourse";
//	}
	@GetMapping("/{id_type_course}")
	@Transactional
	public String getCourseById(ModelMap modelmap,@PathVariable int id_type_course ) {
		modelmap.addAttribute("listCourseById", courseService.getCourseById(id_type_course));
		return "detailCourse";
	}
	
}
