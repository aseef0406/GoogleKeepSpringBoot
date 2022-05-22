package com.keep.googlekeepspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.keep.googlekeepspringboot.label.Repository.LabelRepository;
import com.keep.googlekeepspringboot.label.Entity.Label;

@SpringBootApplication
public class GoogleKeepSpringBootApplication  {
    @Autowired 
//	LabelRepository lebObject;
	public static void main(String[] args) {
		SpringApplication.run(GoogleKeepSpringBootApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("check Error");
//		lebObject.saveLabel(new Label("1","1",1,"1"));
//		System.out.println("check Error");
//		
//	}

}
