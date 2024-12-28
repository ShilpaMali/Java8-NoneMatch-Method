package com.stram.none.match;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI1 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "sohan", 40000));
		list.add(new Employee(102, "sandip", 45000));
		list.add(new Employee(103, "sagar", 55000));
		list.add(new Employee(104, "samadhan", 50000));
		list.add(new Employee(105, "shantanu", 35000));

		System.out.println(list.stream().noneMatch(p -> p.getEmpName().startsWith("s")));
	}

}
