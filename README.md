---

# 📄 **README – UC6: Reservation Confirmation & Room Allocation**

## 📌 Overview

This project implements **Use Case 6: Room Allocation Service**, where booking requests are **confirmed and assigned rooms** based on availability.

It ensures:

* Unique room assignment
* No double booking
* Immediate inventory update

---

## 🎯 Objective

To simulate a real-world hotel system where:

* Guests request rooms
* System confirms booking
* Rooms are allocated safely

---

## 🧩 Features

* ✅ Unique Room ID generation
* ✅ Inventory management
* ✅ Prevents overbooking
* ✅ Tracks allocated rooms by type
* ✅ Simple and efficient design using collections

---

## 🏗️ Classes Used

### 1. `Reservation`

* Represents a booking request
* Attributes:

  * `guestName`
  * `roomType`

---

### 2. `RoomInventory`

* Maintains available room counts
* Methods:

  * `isAvailable()` → checks availability
  * `bookRoom()` → updates inventory

---

### 3. `RoomAllocationService`

* Core service class

* Responsibilities:

  * Allocate rooms
  * Generate unique Room IDs
  * Prevent duplicate assignments

* Data Structures:

  * `Set<String>` → ensures unique room IDs
  * `Map<String, Set<String>>` → tracks rooms by type

---

### 4. `UseCase6RoomAllocation`

* Main class
* Simulates booking confirmation process

---

## ⚙️ How It Works

1. Create room inventory
2. Create booking requests
3. Check availability
4. Generate unique room ID
5. Assign room
6. Update inventory

---

## ▶️ How to Run

### Step 1: Compile

```bash
javac UseCase6RoomAllocation.java
```

### Step 2: Run

```bash
java UseCase6RoomAllocation
```

---

## 📤 Sample Output

```
Room Allocation Processing
Booking confirmed for Guest: Abhi, Room ID: Single-1
Booking confirmed for Guest: Subha, Room ID: Single-2
Booking confirmed for Guest: Vamathi, Room ID: Suite-1
```

---

## 📚 Concepts Used

* OOPS (Encapsulation, Modularity)
* Java Collections:

  * HashSet
  * HashMap
* Unique ID Generation
* Resource Allocation Logic

---

## ⚠️ Assumptions

* Room IDs are generated sequentially (e.g., Single-1, Single-2)
* Inventory is limited and predefined
* No database is used (in-memory only)

---

## 🚀 Future Enhancements

* Add **FIFO Queue (UC5 integration)**
* Connect to **Database (JDBC)**
* Add **User Interface (GUI / Web App)**
* Implement **Cancellation & Refund logic**

---



