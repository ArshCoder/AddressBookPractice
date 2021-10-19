package practice.laibrary;

import java.util.ArrayList;


import java.util.Scanner;

public class AddressBook {
	ArrayList<PersonInfo> contacts = new ArrayList<PersonInfo>();
	private int index;

	public void addContact() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter FirstName: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter LastName: ");
		String lastName = scanner.nextLine();
		System.out.println("Enter addres: ");
		String address = scanner.nextLine();
		System.out.println("Enter city: ");
		String city = scanner.nextLine();
		System.out.println("Enter state: ");
		String state = scanner.nextLine();
		System.out.println("Enter zip: ");
		String zip = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = scanner.nextLine();
		System.out.println("Enter email: ");
		String email = scanner.nextLine();
		scanner.close();

		PersonInfo addPerson = new PersonInfo(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contacts.add(addPerson);
		System.out.println(addPerson);
		System.out.println(contacts);

	}
}
	
