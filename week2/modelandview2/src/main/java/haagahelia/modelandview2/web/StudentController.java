package haagahelia.modelandview2.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

import haagahelia.modelandview2.domain.Student;


@Controller
public class StudentController {
	

	
//	Student[] studentArr = {
//			new Student("John", "Lennon")};
	
	@GetMapping("/hello")
	public String greeting(Model model) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student stu1 = new Student("kid", "young");
		studentList.add(stu1);
		model.addAttribute("students", studentList);
		return "student";
		
	}
		
	}

