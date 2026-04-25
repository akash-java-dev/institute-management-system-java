package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc {
	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	@Override
	public void addCourse() {
		Course c = new Course();
		System.out.print("Enter Course Id: ");
		c.setCid(sc.next());
		System.out.print("Enter Cource Name: ");
		c.setCname(sc.next());
		clist.add(c);
	}

	@Override
	public void viewCourse() {
		for (Course course : clist) {
			System.out.println("Course ID: " + course.getCid());
			System.out.println("Course Name: " + course.getCname());
		}
	}

	@Override
	public void addFaculty() {
		Faculty f = new Faculty();
		System.out.print("Enter Faculty ID: ");
		f.setFid(sc.next());
		System.out.print("Enter Faculty Name: ");
		f.setFname(sc.next());
		System.out.print("Enter Course ID: ");
		String course = sc.next();
		for (Course cou : clist) {
			if (cou.getCid() == course) {
				f.setCourse(cou);
			}
		}
		flist.add(f);
	}

	@Override
	public void viewFaculty() {
		for (Faculty faculty : flist) {
			System.out.println("Faculty ID: " + faculty.getFid());
			System.out.println("Faculty Name: " + faculty.getFname());
			System.out.println("Cource Id: " + faculty.getCourse().getCid());
			System.out.println("Cource Name: " + faculty.getCourse().getCname());
		}

	}

	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.print("Enter Batch ID: ");
		b.setBid(sc.next());
		System.out.print("Enter Batch Name: ");
		b.setBname(sc.next());
		System.out.print("Enter Faculty ID: ");
		String facid = sc.next();
		for (Faculty fac : flist) {
			if (fac.getFid() == facid) {
				b.setFaculty(fac);
			}
		}
		blist.add(b);
	}

	@Override
	public void viewBatch() {
		for (Batch batch : blist) {
			System.out.println("Batch ID: " + batch.getBid());
			System.out.println("Batch Name: " + batch.getBname());
			System.out.println("Faculty ID: " + batch.getFaculty().getFid());
			System.out.println("Faculty Name: " + batch.getFaculty().getFname());
			System.out.println("Course ID: " + batch.getFaculty().getCourse().getCid());
			System.out.println("Course Name: " + batch.getFaculty().getCourse().getCname());
		}

	}

	@Override
	public void addStudent() {
		Student s = new Student();
		System.out.print("Enter Student ID: ");
		s.setSid(sc.next());
		System.out.print("Enter Student Name: ");
		s.setSname(sc.next());
		System.out.print("Enter Batch Id: ");
		String bid = sc.next();
		for (Batch batch : blist) {
			if (batch.getBid() == bid) {
				s.setBatch(batch);
			}
		}
		slist.add(s);
	}

	@Override
	public void viewStudent() {
		for (Student student : slist) {
			System.out.println("Student ID: " + student.getSid());
			System.out.println("Student Name: " + student.getSname());
			System.out.println("Batch ID: " + student.getBatch().getBid());
			System.out.println("Batch Name: " + student.getBatch().getBname());
			System.out.println("Faculty ID: " + student.getBatch().getFaculty().getFid());
			System.out.println("Faculty Name: " + student.getBatch().getFaculty().getFname());
			System.out.println("Course ID: " + student.getBatch().getFaculty().getCourse().getCid());
			System.out.println("Course Name: " + student.getBatch().getFaculty().getCourse().getCname());
		}

	}

}
