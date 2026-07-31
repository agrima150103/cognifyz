<div align="center">

# ☕ Cognifyz Java Development Internship
### A progressive Java engineering portfolio covering core programming, OOP, file handling, networking, concurrency, security and desktop development

<br />

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Object--Oriented-Programming-4F46E5?style=for-the-badge)
![Networking](https://img.shields.io/badge/Java-Networking-2563EB?style=for-the-badge)
![Multithreading](https://img.shields.io/badge/Multithreading-Concurrency-7C3AED?style=for-the-badge)
![Swing](https://img.shields.io/badge/Java-Swing-059669?style=for-the-badge)
![Internship](https://img.shields.io/badge/Cognifyz-Java%20Development-E11D48?style=for-the-badge)

<br />


Java Development Internship at Cognifyz Technologies

</div>

---

## Overview

This repository contains the applications completed during my **Java Development Internship at Cognifyz Technologies**. The tasks progress from foundational Java programming to intermediate and advanced software development concepts, demonstrating practical experience in:

- Core Java programming
- Object-oriented design
- String and collection handling
- File input and output
- Basic encryption and decryption
- Client-server socket communication
- Multithreading and synchronization
- Java Swing desktop interfaces
- Application logic and problem solving

---

## Repository Structure

```text
Cognifyz-Java-Development/
├── Level1/
│   ├── TemperatureConverter.java
│   ├── PalindromeChecker.java
│   ├── StudentGradeCalculator.java
│   └── RandomPasswordGenerator.java
│
├── Level2/
│   ├── TicTacToe.java
│   ├── PasswordStrengthChecker.java
│   ├── FileEncryptionDecryption.java
│   ├── input.txt
│   ├── encrypted.txt
│   └── decrypted.txt
│
├── Level3/
│   ├── ChatServer.java
│   ├── ChatClient.java
│   ├── MultithreadedApplication.java
│   ├── CurrencyConverter.java
│   ├── SimpleNotepad.java
│   └── BankAccountSimulation.java
│
└── OUTPUTS/
    ├── Level1/
    ├── Level2/
    ├── Level3/
    └── Notepad/
```

---

## Level 1 — Core Java Fundamentals

Focused on programming fundamentals, conditional logic, string operations, and user input.

| Project | Description | Concepts |
|---|---|---|
| **Temperature Converter** | Converts temperatures between Celsius and Fahrenheit | Input handling, arithmetic operations |
| **Palindrome Checker** | Determines whether a word or phrase reads the same in reverse | String processing, loops |
| **Student Grade Calculator** | Calculates a student's grade from entered marks | Conditions, arithmetic |
| **Random Password Generator** | Generates passwords from configurable character sets | Randomization, strings |

---

## Level 2 — Intermediate Java Development

Introduces application state, validation, file processing, and basic security logic.

### Tic-Tac-Toe
A two-player console game that manages:
- Board state
- Player turns
- Winning combinations
- Draw detection
- Input validation

### Password Strength Checker
Evaluates password quality using checks for:
- Minimum length
- Uppercase characters
- Lowercase characters
- Numeric characters
- Special characters

### File Encryption and Decryption
Reads data from a text file, transforms the contents, and writes encrypted and decrypted outputs.

```text
input.txt
   ↓
Encryption Logic
   ↓
encrypted.txt
   ↓
Decryption Logic
   ↓
decrypted.txt
```

This task demonstrates:
- File reading and writing
- Exception handling
- Data transformation
- Basic cryptographic reasoning

---

## Level 3 — Advanced Java Applications

Focused on networking, concurrency, desktop interfaces, and object-oriented system design.

### Client-Server Chat Application
A real-time communication application implemented using Java socket programming.

```text
Chat Client
     │
     │ TCP Socket Connection
     ▼
Chat Server
     │
     ▼
Message Exchange
```

**Key concepts:** Java sockets, client-server architecture, input/output streams, network communication, connection handling

**Files:** `ChatServer.java`, `ChatClient.java`

### Multithreaded Application
Demonstrates concurrent task execution using Java threads.

**Concepts applied:** Thread creation, Runnable tasks, concurrent execution, synchronization, shared-resource handling

### Currency Converter
An interactive Java application that performs currency conversions using structured calculation logic and user-provided values.

### Simple Notepad
A lightweight desktop text editor built using Java Swing.

**Features:** Text entry and editing, desktop graphical interface, file interaction, menu-based controls, event-driven programming

### Bank Account Simulation
An object-oriented banking simulation that models:
- Account creation
- Deposits
- Withdrawals
- Balance validation
- Encapsulated banking operations

Demonstrates practical use of classes, methods, constructors, encapsulation, and reusable business logic.

---

## Technology Stack

| Category | Technologies |
|---|---|
| Language | Java |
| Programming | Core Java, OOP |
| Data Handling | Strings, arrays, collections |
| File Processing | Java I/O |
| Networking | Java Sockets |
| Concurrency | Threads, synchronization |
| Desktop UI | Java Swing |
| Security | Password validation, basic encryption |
| Tools | JDK, VS Code / IntelliJ IDEA, Command Line |

---

## Running the Projects

### Prerequisites
Install a Java Development Kit (Java 17 or newer is recommended):

```bash
java --version
javac --version
```

### Compile and run a program

```bash
cd Level1
javac TemperatureConverter.java
java TemperatureConverter
```

**Example: Tic-Tac-Toe**
```bash
cd Level2
javac TicTacToe.java
java TicTacToe
```

**Example: Chat Application**

Open two terminal windows.

Terminal 1 — Start the server:
```bash
cd Level3
javac ChatServer.java
java ChatServer
```

Terminal 2 — Start the client:
```bash
cd Level3
javac ChatClient.java
java ChatClient
```

---

## Outputs

Screenshots and execution results are available in the `OUTPUTS/` folder, containing:
- Level 1 program outputs
- Level 2 program outputs
- Level 3 application outputs
- Notepad interface output
- Chat application execution
- File encryption and decryption results

---

## Learning Outcomes

Through this internship, I strengthened my ability to:
- Translate requirements into working Java applications
- Apply object-oriented principles to reusable program design
- Build validation and error-handling logic
- Read, transform, and persist file data
- Develop client-server applications using Java sockets
- Implement concurrent workflows using multithreading
- Create desktop interfaces using Java Swing
- Debug applications across console, networking, and GUI environments
- Organize software projects by feature and complexity level

---

## Engineering Progression

```text
Java Fundamentals
        ↓
Application Logic
        ↓
Object-Oriented Design
        ↓
File Processing
        ↓
Security Utilities
        ↓
Networking
        ↓
Multithreading
        ↓
Desktop Applications
```

---

## Future Improvements

- Add automated JUnit tests
- Introduce Maven or Gradle
- Add structured logging
- Improve encryption using modern cryptographic APIs
- Support multiple concurrent chat clients
- Add persistent chat history
- Apply MVC architecture to Swing applications
- Build a Spring Boot API version of selected projects
- Add GitHub Actions for automated compilation and testing

---

## Author

**Agrima Saxena**

If this repository helped you understand Java development, consider giving it a ⭐
