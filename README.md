# OOP Java Project

## Project Overview

This project is a demonstration of Object-Oriented Programming (OOP) principles using Java. It focuses on building a class hierarchy with inheritance, encapsulation, and polymorphism. The project models real-world entities like Person, Student, Staff, and various staff roles such as Administrator, Instructor, and Technician, capturing their shared and unique properties through class relationships.

Class Structure and Relationships

## 1. Person Class (Base Class)

The Person class serves as the base class for all other entities. It represents general attributes and behaviors shared by everyone in the system, such as a person's identity and contact details. This class is extended by more specific roles like Student and Staff.

### Relation:

Superclass for both Student and Staff classes.



## 2. Student Class (Extends Person)

The Student class represents a person who is a student, inheriting general properties from the Person class. It introduces additional attributes and methods specific to students, such as their academic level and GPA.

### Relation:

Extends the Person class, meaning it inherits common properties like name and contact information but adds student-specific details like academic level and GPA.



## 3. Staff Class (Extends Person)

The Staff class represents employees in an institution, extending the Person class. It introduces attributes relevant to staff members, such as salary, department, and contact information.

### Relation:

Extends the Person class.

Serves as the parent class for specific staff roles like Administrator, Instructor, and Technician.



## 4. Administrator Class (Extends Staff)

The Administrator class represents a staff member who holds an administrative position. It inherits from Staff and adds functionality related to an administrator’s role in the organization.

### Relation:

Extends the Staff class, inheriting all properties of a staff member while adding the specific role of the administrator.



## 5. Instructor Class (Extends Staff)

The Instructor class represents a staff member responsible for teaching courses. It inherits from the Staff class and includes attributes like the course they teach.

### Relation:

Extends the Staff class, inheriting general staff properties and adding instructor-specific details, such as the course they teach.



## 6. Technician Class (Extends Staff)

The Technician class represents technical staff. It inherits from the Staff class and introduces attributes related to technical specialization.

### Relation:

Extends the Staff class, inheriting the general staff properties but focusing on technical roles with the addition of specialization.



## Class Hierarchy Overview

    Person
    ├── Student
    └── Staff
         ├── Administrator
         ├── Instructor
         └── Technician
         

Person: The base class for everyone (shared attributes like name, contact details).

Student: A Person with additional academic-related attributes.

Staff: A Person who works at the institution, with employment-related attributes.

Administrator: A Staff member with an administrative role.

Instructor: A Staff member responsible for teaching courses.

Technician: A Staff member responsible for technical work, with a specific specialization.



## How to Use

1. Clone this repository:

git clone https://github.com/yourusername/yourrepository.git


2. Open the project in your preferred Java IDE.


3. Run the Main class to interact with the various objects representing Person, Student, Staff, and specific staff roles (Administrator, Instructor, Technician).



## Example Usage
```java
// Creating a Student object
Student student = new Student();
student.setFirstName("John");
student.setLastName("Doe");
student.setLevel(3);
student.setGPA(3.75);

// Creating an Instructor object
Instructor instructor = new Instructor();
instructor.setFirstName("Jane");
instructor.setLastName("Smith");
instructor.setCourse("Java Programming");

// Creating an Administrator object
Administrator admin = new Administrator();
admin.setFirstName("Alice");
admin.setRole("Head of IT");
```
## Contributing

If you want to contribute to this project, feel free to fork the repository and submit pull requests. Any contributions are welcome!
