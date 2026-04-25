package com.cjc.ims.app.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {

	public static void main(String[] args) {

		Karvenagar kn = new Karvenagar();
		Scanner sc = new Scanner(System.in);
		int choice = 9;
		System.out.println("Welcome to CJC...!");
		System.out.println("Note: Use Underscore('_') for spaces...!");
		System.out.println();

		try {
			do {
				System.out.println("1-For Add Course.");
				System.out.println("2-For View Course.");
				System.out.println("3-For Add Faculty.");
				System.out.println("4-For View Faculty.");
				System.out.println("5-For Add Batch.");
				System.out.println("6-For View Batch.");
				System.out.println("7-For Add Student.");
				System.out.println("8-For View Student.");
				System.out.println("0-For Exit.");
				System.out.println();
				System.out.print("Your Choice: ");
				choice = sc.nextInt();
				System.out.println();

				if (choice > 0 && choice < 9) {
					if (choice == 1) {
						kn.addCourse();
					} else if (choice == 2) {
						kn.viewCourse();
					} else if (choice == 3) {
						kn.addFaculty();
					} else if (choice == 4) {
						kn.viewFaculty();
					} else if (choice == 5) {
						kn.addBatch();
					} else if (choice == 6) {
						kn.viewBatch();
					} else if (choice == 7) {
						kn.addStudent();
					} else if (choice == 8) {
						kn.viewStudent();
					}
					System.out.println();
				} else {
					System.out.println("");
				}
			} while (choice != 0);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		System.out.println("Visit Again...!");
	}

}
