package practice.laibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TestClass {

	public void data() {
		PersonInfo person = new PersonInfo(null, null, null, null, null, null, null, null);
		person.setFirstName("Arshjeet");
		person.setLastName("Barkade");
		person.setAddress("Supe");
		person.setCity("Baramati");
		person.setState("Maharastra");
		person.setZip("412204");
		person.setPhoneNumber("7756096271");
		person.setEmail("arshjeetb08@gmail.com");

		System.out.println(person);
		person.add("set");
	}

	public static void main(String[] args) {

		System.out.println("Choice your Option");

		while (true) {
			AddressBook add = new AddressBook();
			Scanner name = new Scanner(System.in);
			System.out.println(
					"1. Add a person to the address book.\n 2. Edit erson Info. \n 3. Delete person Info \n 4. Add new contact \n 5. Add Address Book ");
			int answer = name.nextInt();

			switch (answer) {
			case 1:
				add.addContact();
				break;
			case 2:
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter FirstName: ");
				String firstname = scan.nextLine();
				PersonInfo.get();
				add.editDetails(firstname);
				break;
			case 3:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter FirstName: ");
//				String firstName1 = scan1.nextLine();
//				add.remove(firstName1);
				break;
			case 4:
				add.newContact();
			case 5:
				add.NewAddressBook();
				break;
			case 6:
				System.exit(0);
//		default:
//			System.out.println("Enter a number between 1 and 3.");
//			scanner.close();
			}
		}

	}
}
