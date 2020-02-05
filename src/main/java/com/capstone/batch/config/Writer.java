package com.capstone.batch.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.Student;


@Component
public class Writer implements ItemWriter<Student> {

	/*@Autowired
	StudentRepository studentRepository;*/
	
	@Override
	public void write(List<? extends Student> students) throws Exception {
		for(Student student: students) {
			//studentRepository.save(student);
			System.out.println(student);
		}
	}

	
}