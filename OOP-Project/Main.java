import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Person> faculty = new ArrayList<Person>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("facultyData.ser"))) {
            faculty = (ArrayList<Person>) ois.readObject();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No existing data found, starting fresh.");
        }

        Students maged = new Students("maged", "medhat", "305152315", "magedmedhat2@gmail.com", 2, 3.49);
        Students mohamed = new Students("mohamed", "hassan", "4548684", "mohamedhassan@gmail.com", 2, 3.4);
        faculty.add(maged);
        faculty.add(mohamed);

        int n = 0;
        // Adding try-catch block for `n` input
        try {
            System.out.println("Hi,\nWhat I can do for you\n1-Add\n2-Remove\n3-Search and display\nPlease, choose a number:");
            n = input.nextInt();

            // Check if `n` is out of range
            if (n < 1 || n > 3) {
                throw new IllegalArgumentException("Invalid option. Number must be between 1 and 3.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;  // Exit the program if invalid option is selected
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            return;  // Exit the program if input is not an integer
        }

        if (n == 1) {
            int x = 0;
            
            try {
                System.out.println("Add:\nWho do you want to add:\n1-Student\n2-Instructor\n3-Administrator\n4-Technicians\nPlease, choose a number:");
                x = input.nextInt();

                if (x < 1 || x > 4) {
                    throw new IllegalArgumentException("Invalid option. Number must be between 1 and 4.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;  
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                return;  
            }

            if (x == 1) {
                System.out.print("Please,Enter:\nFirst name: ");
                String first = input.next();
                System.out.print("Last name: ");
                String last = input.next();
                System.out.print("National number: ");
                String national = input.next();
                System.out.print("Email: ");
                String mail = input.next();
                System.out.print("Level: ");
                int lev = input.nextInt();
                System.out.print("GPA: ");
                double G = input.nextDouble();
                Students newcomers = new Students(first, last, national, mail, lev, G);
                faculty.add(newcomers);
                System.out.println("Student has been added successfully");
                System.out.println(newcomers);
            }
            else if (x == 2) {
                System.out.print("Please,Enter:\nFirst name: ");
                String first = input.next();
                System.out.print("Last name: ");
                String last = input.next();
                System.out.print("National number: ");
                String national = input.next();
                System.out.print("Email: ");
                String mail = input.next();
                System.out.print("Salary: ");
                double sala = input.nextDouble();
                System.out.print("Department: ");
                String dep = input.next();
                System.out.print("Contact number: ");
                String contnum = input.next();
                System.out.print("Shift hours: ");
                double shifh = input.nextDouble();
                System.out.print("Office number: ");
                double offinum = input.nextDouble();
                System.out.print("Course: ");
                String cour = input.next();
                Inatractors newcomers = new Inatractors(first, last, national, mail, sala, dep, contnum, shifh, offinum, cour);
                faculty.add(newcomers);
                System.out.println("Instructor has been added successfully");
                System.out.println(newcomers);
            }
            else if (x == 3) {
                System.out.print("Please,Enter:\nFirst name: ");
                String first = input.next();
                System.out.print("Last name: ");
                String last = input.next();
                System.out.print("National number: ");
                String national = input.next();
                System.out.print("Email: ");
                String mail = input.next();
                System.out.print("Salary: ");
                double sala = input.nextDouble();
                System.out.print("Department: ");
                String dep = input.next();
                System.out.print("Contact number: ");
                String contnum = input.next();
                System.out.print("Shift hours: ");
                double shifh = input.nextDouble();
                System.out.print("Office number: ");
                double offinum = input.nextDouble();
                System.out.print("Role: ");
                String rol = input.next();
                Adminstrators newcomers = new Adminstrators(first, last, national, mail, sala, dep, contnum, shifh, offinum, rol);
                faculty.add(newcomers);
                System.out.println("Administrator has been added successfully");
                System.out.println(newcomers);
            }
            else if (x == 4) {
                System.out.print("Please,Enter:\nFirst name: ");
                String first = input.next();
                System.out.print("Last name: ");
                String last = input.next();
                System.out.print("National number: ");
                String national = input.next();
                System.out.print("Email: ");
                String mail = input.next();
                System.out.print("Salary: ");
                double sala = input.nextDouble();
                System.out.print("Department: ");
                String dep = input.next();
                System.out.print("Contact number: ");
                String contnum = input.next();
                System.out.print("Shift hours: ");
                double shifh = input.nextDouble();
                System.out.print("Office number: ");
                double offinum = input.nextDouble();
                System.out.print("Specialization: ");
                String special = input.next();
                Technicans newcomers = new Technicans(first, last, national, mail, sala, dep, contnum, shifh, offinum, special);
                faculty.add(newcomers);
                System.out.println("Technician has been added successfully");
                System.out.println(newcomers);
            }
        }
		else if (n == 2) {
			boolean mark = false;
			System.out.println("Remove:\nEnter the national number of the person you want to remove:\n");
			String x = input.next();
			for (Person i : faculty) {
				if (i.getNationalNumber().equals(x)) {
					faculty.remove(i);
					System.out.println("The person has been removed\n");
					mark = true;
					break;
				}

			}

			if (mark == false) {
				System.out.println("Not found");
			}

		}

		else if (n == 3) {
			boolean mark = false;
			System.out.println("Search:\nEnter the national number of the person you want to find:\n");
			String x = input.next();
			for (Person i : faculty) {
				if (i.getNationalNumber().equals(x)) {
					System.out.println("Found,do you want to display the information of this person?\n1-Yes\n2-No");
					int yn = input.nextInt();
					if (yn == 1) {
						System.out.print(i);
					}
					mark = true;
					break;
				}

			}

			if (mark == false) {
				System.out.println("Not found");
			}

		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("facultyData.ser"))) {
			oos.writeObject(faculty);
			System.out.println("Data saved successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while saving data.");
		}

	}
}
