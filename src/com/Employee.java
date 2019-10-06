package com;

import java.util.HashMap;
import java.util.Map;

//Create a class Employee and load a list of employee and convert it into map which takes Emp id as key and the object itself as value.
public class Employee {

	public static void main(String[] args) {
		Map<Integer,Emp> employee = new HashMap<Integer,Emp>();
		
		Emp emp1 = new Emp();
		emp1.setempid(1);
		emp1.setname("Raghavan");
		emp1.setaddress("Chennai");
		Emp emp2 = new Emp();
		emp2.setempid(2);
		emp2.setname("Vijay");
		emp2.setaddress("Avadi");
		Emp emp3 = new Emp();
		emp3.setempid(3);
		emp3.setname("Basha");
		emp3.setaddress("Tiruvallur");
		
		employee.put(emp1.getempid(), emp1);
		employee.put(emp2.getempid(), emp2);
		employee.put(emp3.getempid(), emp3);

		for(Map.Entry e:employee.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());	
		}
	}

	

}
