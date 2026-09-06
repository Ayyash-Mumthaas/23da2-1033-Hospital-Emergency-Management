# Hospital Emergency Management System

## CIT300 - Data Structures and Algorithms

**Student:** Ayyash Mumthaas
**Language:** Java
**Project Type:** Individual Mid Assignment

---

## 1. Project Overview

The Hospital Emergency Management System is a Java-based console application developed to demonstrate the practical use of fundamental data structures.

The system manages patient records, emergency patients, treatment history, and previous patient visits using four different data structures:

* Binary Search Tree (BST)
* Queue
* Stack
* Singly Linked List

The application provides a menu-driven interface that allows users to perform the required operations on each data structure.

---

## 2. Objectives

The main objectives of this project are:

* To implement a Binary Search Tree for patient records.
* To implement a Queue for emergency patients.
* To implement a Stack for completed treatment records.
* To implement a Singly Linked List for patient visit history.
* To connect the data structures to form a simple hospital management system.
* To demonstrate searching, insertion, deletion, FIFO and LIFO operations.
* To test the system using valid and invalid/empty cases.

---

## 3. Data Structures Used

### 3.1 Binary Search Tree

The Binary Search Tree is used to store patient records.

Each patient is identified using a unique Patient ID as the key.

* Smaller Patient IDs are stored in the left subtree.
* Larger Patient IDs are stored in the right subtree.
* Search is performed using the Patient ID.
* Patient records can be deleted.
* In-order traversal displays patients in ascending Patient ID order.

### 3.2 Queue

The Queue is used to manage emergency patients.

The queue follows the **FIFO (First In, First Out)** principle.

Operations implemented:

* Enqueue
* Dequeue
* Display waiting patients
* Empty queue handling

Therefore, the patient who enters the emergency queue first is treated first.

### 3.3 Stack

The Stack is used to maintain completed treatment records.

The stack follows the **LIFO (Last In, First Out)** principle.

Operations implemented:

* Push
* Pop
* Display treatment history
* Empty stack handling

Therefore, the most recently completed treatment is returned first.

### 3.4 Singly Linked List

Each patient has a separate Singly Linked List for previous visits.

Each visit contains:

* Visit ID
* Date
* Doctor
* Diagnosis
* Treatment

Operations implemented:

* Add visit
* Remove visit
* Search visit
* Display visit history

Each patient's visit history is stored separately through the `visitHistory` field in the `Patient` class.

---

## 4. Main Features

The system provides the following menu options:

1. Register New Patient
2. Search Patient
3. Delete Patient
4. Display Patients by ID
5. Add Patient to Emergency Queue
6. Treat Next Emergency Patient
7. Display Emergency Queue
8. Complete Treatment
9. Pop Last Treatment Record
10. Display Treatment History
11. Add Patient Visit
12. Remove Patient Visit
13. Search Patient Visit
14. Display Patient Visit History
15. Exit

---

## 5. Project Structure

```text
Hospital_Emergency_System
│
├── src
│   ├── Main.java
│   ├── Patient.java
│   ├── PatientNode.java
│   ├── PatientBST.java
│   ├── EmergencyQueue.java
│   ├── TreatmentRecord.java
│   ├── TreatmentStack.java
│   ├── Visit.java
│   ├── VisitNode.java
│   └── VisitLinkedList.java
│
├── .gitignore
└── README.md
```

---

## 6. Requirements

* Java Development Kit (JDK) 23 or compatible Java version
* Command Prompt or PowerShell
* Git
* GitHub account

---

## 7. How to Compile and Run

Open a terminal inside the project directory.

Compile the Java source files:

```bash
javac src/*.java
```

Run the application:

```bash
java -cp src Main
```

---

## 8. Testing

The system was tested using the following scenarios.

### Patient BST

* Displayed patient records using in-order traversal.
* Confirmed that Patient IDs are displayed in ascending order.
* Searched for an existing patient.
* Tested deletion of a patient.
* Tested registration of a new patient.
* Tested duplicate Patient ID handling.

### Emergency Queue

Patients were added in the following order:

```text
1001
1003
1005
```

The patients were removed in the same order:

```text
1001
1003
1005
```

This confirmed the FIFO behaviour of the Queue.

The empty queue condition was also tested.

### Treatment Stack

Treatment records were added for two patients.

The most recently added treatment was returned first during the pop operation.

This confirmed the LIFO behaviour of the Stack.

The empty stack condition was also tested.

### Patient Visit Linked List

Visits were added to a patient's history and displayed.

The system was tested for:

* Adding visits
* Searching visits
* Removing visits
* Displaying visits
* Searching for a visit under the wrong patient

The test confirmed that each patient maintains a separate visit history.

---

## 9. Design Decisions

Different data structures were selected based on the requirements of each hospital operation.

The Binary Search Tree was selected because patient records need to be searched using Patient ID and displayed in sorted order.

The Queue was selected because emergency patients should be processed according to their arrival order.

The Stack was selected because treatment history requires the most recently completed treatment to be accessed first.

The Singly Linked List was selected because each patient may have a sequential history of previous visits, and visits can be added, searched and removed.

The `Patient` class contains a `VisitLinkedList`, which allows each patient object to maintain its own visit history.

---

## 10. Development History

The project was developed progressively using multiple Git commits.

Development milestones include:

1. Created Project Structure
2. Implemented Patient BST
3. Implemented Emergency Patient Queue
4. Implemented Treatment History Stack
5. Implemented Patient Visit History Linked List
6. Linked Patient Records with Visit History
7. Completed Hospital Management System
8. Added Project README and Documentation

This development history demonstrates incremental implementation and testing rather than creating the entire project in a single commit.

---

## 11. Conclusion

This project demonstrates the practical application of four fundamental data structures in a single Java application.

The system successfully manages patient records using a Binary Search Tree, emergency patients using a Queue, treatment history using a Stack, and patient visit history using a Singly Linked List.

Developing the project helped demonstrate how the choice of a data structure depends on the type of operation required by the system.
