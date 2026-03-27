---

## 🧩 Features
- Booking request representation
- Queue-based processing
- Fair scheduling (FIFO)
- Simple and efficient design

---

## 🏗️ Classes

### 1. Reservation
- Represents a booking request
- Fields:
  - guestName
  - roomType

---

### 2. BookingRequestQueue
- Uses Queue (LinkedList)
- Methods:
  - addRequest()
  - getNextRequest()
  - hasPendingRequests()

---

### 3. UseCase5BookingRequestQueue
- Main driver class
- Simulates booking requests

---

## ▶️ How to Run

### Step 1: Compile
```bash
javac UseCase5BookingRequestQueue.java

Step 2: Run
java UseCase5BookingRequestQueue

📤 Sample Output
Booking Request Queue:
Processing booking for Guest: John, Room Type: Single
Processing booking for Guest: Sneha, Room Type: Double
Processing booking for Guest: Vamshi, Room Type: Suite

📚 Concepts Used
Queue (FIFO)
Java Collections (LinkedList)
OOPS (Encapsulation)
Sequential Processing