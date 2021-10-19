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

	public void newContact() {
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
		PersonInfo addNewPerson = new PersonInfo(firstName, lastName, city, address, state, zip, phoneNumber, email);
		contacts.add(addNewPerson);
		System.out.println(addNewPerson);

	}

	public void set(String firstname) {

	}

	public void remove(String firstName1) {
		for (int i = 0; i < contacts.size(); i++) {
			PersonInfo p = (PersonInfo) contacts.get(i);
			if (firstName1.equals(p.firstName)) {
				contacts.remove(i);
				System.out.println(p);
			}
		}

	}

	public void editDetails(ArrayList<PersonInfo> contactDetails) {
		Scanner scan = new Scanner(System.in);
		System.out.println(contactDetails.size());
		for (int i = 0; i < contactDetails.size(); i++) {
			Object name = scan.nextLine();
			if (contactDetails.get(i).getFirstName().equals(name)) {
				System.out.println(
						"Enter number to update \n 1:FirstName \n 2:Lastname \n 3:Address \n 4:City \n 5:State \n 6:Zip \n 7:PhoneNumber \n 8:Email ");
				int updateChoice = scan.nextInt();
				scan.nextLine();

				switch (updateChoice) {
				case 1:
					System.out.println("Enter FirstName to edit");
					String firstName = scan.nextLine();
					contactDetails.get(i).setFirstName(firstName);
					break;
				case 2:
					System.out.println("Enter LatName to edit");
					String lastName = scan.nextLine();
					contactDetails.get(i).setLastName(lastName);
					break;
				case 3:
					System.out.println("Enter Address to edit");
					String address = scan.nextLine();
					contactDetails.get(i).setAddress(address);
					break;
				case 4:
					System.out.println("Enter City to edit");
					String city = scan.nextLine();
					contactDetails.get(i).setCity(city);
					break;
				case 5:
					System.out.println("Enter  State to edit");
					String state = scan.nextLine();
					contactDetails.get(i).setState(state);
					break;
				case 6:
					System.out.println("Enter Zip to edit");
					String zip = scan.nextLine();
					contactDetails.get(i).setZip(zip);
					break;
				case 7:
					System.out.println("Enter PhoneNumber to edit");
					String phoneNumber = scan.nextLine();
					contactDetails.get(i).setPhoneNumber(phoneNumber);
					break;
				case 8:
					System.out.println("Enter Email to edit");
					String email = scan.nextLine();
					contactDetails.get(i).setEmail(email);
					break;
				}

			}
		}
	}

	public void NewAddressBook() {
		Scanner s = new Scanner(System.in);
        System.out.print("How many books do you want to create? ");
        int howManyBooks;
        int howManyEntries;

        PersonInfo newAddressBook = new PersonInfo(null, null, null, null, null, null, null, null);


        while(true){
            howManyBooks = s.nextInt();
            if (howManyBooks>0){
                PersonInfo person = new PersonInfo(null, null, null, null, null, null, null, null);                   //This code decides how many books are in the array of books/the library
                break;
            }
            else System.out.print("You must create at least 1 book.");
            }


	}

	public void editDetails(String firstname) {
		
	}

}
