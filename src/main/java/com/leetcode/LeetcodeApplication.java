package com.leetcode;

import com.leetcode.code75.Address;
import com.leetcode.code75.Employee;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LeetcodeApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Employee employee = new Employee(1, List.of(new Address(1, "", "", "Sangli", 400)));
		List<Employee> employee1 = List.of(employee);

		employee1.stream()
				.filter(employee2 -> employee2.getAddresses().stream()
						.anyMatch(address -> "Sangli".equalsIgnoreCase(address.getDistrict())))
				.forEach(System.out::println);

	}
}
