# Student Database Management System (SDMS) - Console Application

This is a simple, console-based Student Database Management System (SDMS) developed in Java. It allows basic management of student, teacher, course, attendance, fee, and message records directly through the command line. All data is stored in memory (`ArrayList`s) and is **not persistent** across application runs.

This project serves as a foundational step towards building a more complex, persistent, and GUI-driven (or web-based) SDMS.

## Table of Contents

* [Features](#features)
* [How It Works](#how-it-works)
* [Prerequisites](#prerequisites)
* [Getting Started](#getting-started)
* [Usage](#usage)
* [Project Structure](#project-structure)
* [Future Enhancements](#future-enhancements)
* [Contributing](#contributing)
* [License](#license)

---

## Features

This console application provides the following core functionalities:

* **Student Management**: Add, view, update, and delete student records.
* **Teacher Management**: Add, view, update, and delete teacher records.
* **Course Management**: Add, view, update, and delete course records.
* **Attendance Management**: Mark and view student attendance records.
* **Fee Management**: Record and view student fee payments.
* **Message Management**: Send and view internal messages.
* **In-Memory Storage**: All data is stored in `ArrayList`s while the program is running.

---

## How It Works

The application operates entirely through a text-based menu in your console/terminal.

* When you run the `SDMSConsoleApp`, it presents a main menu.
* You navigate through sub-menus (e.g., "Student Management," "Teacher Management") by entering numbers.
* Operations like "Add Student," "View All Students," etc., prompt you for necessary information and display results directly in the console.
* Since data is in-memory, any changes you make will be lost once the application is closed.

---

## Prerequisites

To run this project, you need:

* **Java Development Kit (JDK) 17 or higher**: [Download from Oracle](https://www.oracle.com/java/technologies/downloads/) or [Adoptium (Eclipse Temurin)](https://adoptium.net/)
* **An IDE (Integrated Development Environment)**:
    * [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) (Recommended)
    * Eclipse IDE for Java Developers

---

## Getting Started

Follow these steps to get a copy of the project up and running on your local machine.

### 1. Clone the Repository

```bash
git clone [https://github.com/your-username/SDMS-Console-App.git](https://github.com/your-username/SDMS-Console-App.git)
cd SDMS-Console-App

(Replace your-username with your actual GitHub username)

2. Open in IntelliJ IDEA
Open IntelliJ IDEA.

Select "Open" from the Welcome screen or File > Open....

Navigate to the SDMS-Console-App directory you just cloned and click "OK".

IntelliJ IDEA should automatically detect it as a Java project and configure the JDK.

3. Build the Project
IntelliJ IDEA typically builds the project automatically. If not, go to Build > Build Project.


Usage
Running the Application
Locate the SDMSConsoleApp.java file in the src directory within IntelliJ IDEA.

Click the green "Run" arrow next to the main method declaration.

Alternatively, go to Run > Run 'SDMSConsoleApp'.

Interacting with the Console
The application will start in your IDE's "Run" or "Console" window.


******************************************
* Welcome to the Console-Based SDMS!   *
******************************************
Sample data loaded.


--- Main Menu ---
1. Manage Students
2. Manage Teachers
3. Manage Courses
4. Manage Attendance
5. Manage Fees
6. Manage Messages
0. Exit
Enter your choice:


SDMS-Console-App/
├── src/
│   ├── SDMSConsoleApp.java         # Main application logic and data management
│   ├── Student.java                # Student entity class
│   ├── Teacher.java                # Teacher entity class
│   ├── Course.java                 # Course entity class
│   ├── Attendance.java             # Attendance record entity class
│   ├── Fee.java                    # Fee record entity class
│   └── Message.java                # Message entity class
└── .gitignore                      # Specifies intentionally untracked files to ignore
└── README.md                       # This file
