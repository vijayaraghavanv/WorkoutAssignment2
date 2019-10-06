package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Create an employee object and compare the object only by id. Override equals and hash code method.
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EqualsandHashCode emp1=new EqualsandHashCode(101,"vijay","HCLTech");
		EqualsandHashCode emp2=new EqualsandHashCode(101,"vijay","HCLTech");
		EqualsandHashCode emp3=new EqualsandHashCode(102,"vj","TechM");
		EqualsandHashCode emp4=new EqualsandHashCode(103,"raghavan","CTS");
		EqualsandHashCode emp5=emp1;
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp5.equals(emp1));
		System.out.println("Hashcode for emp1-->"+emp1.hashCode());
		System.out.println("Hashcode for emp2-->"+emp2.hashCode());
		System.out.println("Hashcode for emp3-->"+emp3.hashCode());
		System.out.println("Hashcode for emp4-->"+emp4.hashCode());
		
		System.out.println("printing employee objects from hashset");
		Set<EqualsandHashCode> empset=new HashSet<>();
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
		for (EqualsandHashCode eHC : empset) {
			System.out.println(eHC);
		}
		
		Map<EqualsandHashCode,EqualsandHashCode> empMap=new HashMap<>();
		empMap.put(emp1, emp1);
		empMap.put(emp2, emp2);
		empMap.put(emp3, emp3);
		empMap.put(emp4, emp4);
		
		System.out.println("printing employee objects from hashmap");
		for (Map.Entry<EqualsandHashCode,EqualsandHashCode> eqHC : empMap.entrySet()) {
			System.out.println("key is"+eqHC.getKey()+"===> value is"+eqHC.getValue());
		}
		
		System.out.println(empMap.get(emp1));
		
	}

}
