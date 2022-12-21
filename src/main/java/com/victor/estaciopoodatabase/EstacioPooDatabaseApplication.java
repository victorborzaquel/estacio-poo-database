package com.victor.estaciopoodatabase;

import com.victor.estaciopoodatabase.entities.Student;
import com.victor.estaciopoodatabase.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class EstacioPooDatabaseApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(EstacioPooDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(null, "Victor", 2021);
		Student student2 = new Student(null, "Victor", 2021);

		studentRepository.save(student);
		studentRepository.save(student2);

		System.out.println("Matricular Aluno");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String name = sc.nextLine();
		System.out.println("Digite o ano do aluno: ");
		int year = sc.nextInt();
		Student student3 = new Student(null, name, year);
		studentRepository.save(student3);
	}
}
