# Room Search & Availability Check (UC4)

## 📌 Overview
This project implements a **Room Search System** that allows users to:
- Search rooms by type (Single, Double, Suite)
- Filter based on size
- Filter based on price
- Check availability

---

## 🧩 Features
- Inventory-based room storage
- Filtering logic using multiple conditions
- Object-Oriented Design (OOPS)
- Inheritance (Room → Suite)
- Uses ArrayList for storage

---

## 🏗️ Classes

### 1. Room
- Base class for all rooms
- Attributes:
    - type
    - size
    - pricePerNight
    - availability

### 2. Suite
- Inherits from Room

### 3. RoomInventory
- Stores all rooms
- Provides access to room list

### 4. RoomSearchService
- Core logic for searching rooms
- Filters:
    - Type
    - Minimum Size
    - Maximum Price
    - Availability

---

## ▶️ How to Run

### Step 1: Compile
```bash
javac RoomSearchService.java
Step 2: Run
java RoomSearchService
💻 Sample Input
Enter room type: Suite
Enter minimum size: 300
Enter max price: 6000
📤 Sample Output
--- Available Rooms ---

Room Type: Suite
Size: 350 sqft
Price per night: 5000.0
Available: true
📚 Concepts Used
OOPS (Encapsulation, Inheritance)
Collections (ArrayList)
Filtering Logic
Command-line Input