package com.example.codeclan.Employee;

import com.example.codeclan.Employee.models.Employee;
import com.example.codeclan.Employee.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddEmployee() {
		Employee carlos = new Employee("Carlos", 31, 567, "car.zubillaga@gmail.com");
		employeeRepository.save(carlos);
	}

}
