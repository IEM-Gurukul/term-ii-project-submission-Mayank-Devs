[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

---Vehicle Rental Management System with GPS-Based Vehicle Tracking

## Problem Statement (max 150 words)

---Problem Statement:
Vehicle rental organizations face the challenge of effectively managing vehicle availability, customer 
bookings, and rental records. For small organizations providing vehicle rental services, it is common to 
maintain records of rented vehicles using manual logs or simple digital records. With an increase in the 
number of vehicles and customers, it becomes challenging to maintain accurate records of rented vehicles. 
Furthermore, it is difficult for rental organizations to keep track of the location of a rented vehicle 
during an ongoing rental period.
The proposed Vehicle Rental Management System would effectively solve all the problems mentioned above by 
representing vehicles, customers, and rental records using a well-structured object-oriented hierarchy. For
 each vehicle, attributes would be included to represent vehicle ID, type, rental cost, availability status,
 and location. In addition, a component would be included to simulate the use of GPS to keep track of vehicle location during rental periods.

## Target User
Vehicle rental service administrators who manage vehicle inventory, customer bookings, and monitor the location of rented vehicles.
---

## Core Features

- Add, update, and remove vehicles from the system
- Register and manage customer information
- Book vehicles for specific rental periods
-View vehicle status and current location
-Simulate GPS-based vehicle location tracking
-Process vehicle returns and update availability

---

## OOP Concepts Used

- Abstraction:
- Inheritance:
- Polymorphism:
- Exception Handling:
- Collections / Threads:

---

## Proposed Architecture Description

---The system follows a modular object-oriented architecture where domain classes such as Vehicle, Customer, RentalTransaction, and Location represent the core entities. A central RentalManager class coordinates operations such as vehicle booking, return processing, and location updates. A simulated GPS tracking component updates the current location of vehicles during rental periods. Collections are used to store and manage system records dynamically, while a persistence layer handles storage and retrieval of data. This layered structure ensures clear separation of responsibilities between system logic, tracking functionality, and data management.

## How to Run

---
1. Compile all Java files:
   javac *.java
2. Run the program:
   java Main

## Git Discipline Notes
Minimum 10 meaningful commits required.
