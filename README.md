# Room Search & Availability System (Use Case 4)

## 📌 Overview
This project implements a **Room Search & Availability Check system** for a hotel.

It allows users (guests) to:
- View available rooms
- See room details (beds, size, price)
- Check availability count

⚠️ This system is **read-only** and does NOT perform booking.

---

## 🏗️ Architecture

### 1. Room Class
Represents room details:
- Type (Single, Double, Suite)
- Beds
- Size (sqft)
- Price per night

---

### 2. RoomInventory Class
Stores room availability using:
HashMap<String, Integer>


Example:

Single → 5
Double → 3
Suite → 2


---

### 3. RoomSearchService Class
Handles:
- Fetching availability
- Displaying room details

✔ Read-only access  
❌ No booking or modification

---

### 4. Main Class (UseCase4RoomSearch)
- Creates objects
- Calls search service
- Runs the program

---

## ▶️ How to Compile & Run

### Step 1: Compile

javac UseCase4RoomSearch.java
Step 2: Run
java UseCase4RoomSearch
📊 Sample Output
Room Search

Single Room:
Beds: 1
Size: 250 sqft
Price per night: 1500.0
Available: 5

Double Room:
Beds: 2
Size: 400 sqft
Price per night: 2500.0
Available: 3

Suite Room:
Beds: 3
Size: 750 sqft
Price per night: 5000.0
Available: 2
🎯 Key Concepts Used

Object-Oriented Programming (OOP)

Encapsulation

Separation of Concerns

Read-only design principle

HashMap (Data Structure)

🚀 Future Enhancements

Add booking system

Add user login

Add database integration

Add REST API

📌 Version

v4.0