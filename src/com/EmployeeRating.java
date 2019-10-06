package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program to put rating for an employee based on his performance in deliverable, sports and outreach. If he is A, A and A in all 3 then give 1st. Likewise.
public class EmployeeRating {

	private String deliverable;
	private String sports;
	private String outreach;
	private int empid;
	private String empname;
	public static String rate = null;

	public String getDeliverable() {
		return deliverable;
	}

	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getOutreach() {
		return outreach;
	}

	public void setOutreach(String outreach) {
		this.outreach = outreach;
	}

	public int getempid() {
		return empid;
	}

	public void setempid(int empid) {
		this.empid = empid;
	}

	public String getempname() {
		return empname;
	}

	public void setempname(String empname) {
		this.empname = empname;
	}

	public String rating(String deliverable, String sports, String outreach) {

		if (deliverable.equals("A") && sports.equals("A") && outreach.equals("A")) {
			rate = "A";
		} else if (deliverable.equals("A") && sports.equals("A") && outreach.equals("B")) {
			rate = "B";
		} else if (deliverable.equals("A") && sports.equals("B") && outreach.equals("A")) {
			rate = "B";
		} else if (deliverable.equals("A") && sports.equals("B") && outreach.equals("B")) {
			rate = "B";
		} else if (deliverable.equals("B") && sports.equals("B") && outreach.equals("B")) {
			rate = "B";
		} else {
			rate = "C";
		}
		return rate;
	}

	public static void main(String Args[]) {
		EmployeeRating r = new EmployeeRating();
		Scanner S = new Scanner(System.in);
		System.out.println("Please enter number of employee who are going to be rated");
		int count = S.nextInt();
		List<String> empList = new ArrayList<String>();

		for (int i = 0; i < count; i++) {
			System.out.println("Please enter the Employee ID");
			r.empid = S.nextInt();
			System.out.println("Please enter the Employee Name");
			r.empname = S.next();
			System.out.println("Please enter the rating for deliverable in terms of A or B or C");
			r.setDeliverable(S.next());
			System.out.println("Please enter the rating for Sports in terms of A or B or C");
			r.setSports(S.next());
			System.out.println("Please enter the rating for Outreach in terms of A or B or C");
			r.setOutreach(S.next());
			r.rating(r.deliverable, r.sports, r.outreach);

			empList.add(Integer.toString((r.getempid())));
			empList.add(r.getempname());
			empList.add(rate);

		}
		System.out.println(empList);
	}
}
