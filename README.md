# Use Case 11: Concurrent Booking Processing

## 🎯 Project Goal
The objective of Use Case 11 is to evolve the system into a **Multithreaded Architecture**. By simulating a high-traffic environment, this use case demonstrates how to handle multiple booking requests simultaneously while maintaining **Thread-Safety** to prevent overbooking.

---

## 🛠️ Key Components

### 1. The `Runnable` Interface
*   **Parallel Processing:** Implements `Runnable` in the `ConcurrentBookingProcessor` so that multiple worker threads can run the same logic independently.
*   **Worker Threads:** Demonstrates the creation, starting, and joining of `Thread` objects to manage the application lifecycle.

### 2. Thread Synchronization (`synchronized`)
*   **Critical Sections:** Uses synchronized blocks to protect the shared `bookingQueue` and `RoomInventory`.
*   **Race Condition Prevention:** Ensures that checking room availability and decrementing the count happens as one **Atomic Operation**, preventing two threads from claiming the same last room.

### 3. Shared Resource Management
*   **Concurrency Control:** Effectively manages global objects shared between threads, ensuring that the system state remains consistent even under heavy parallel load.

---

## 🏗️ Architectural Benefits
*   **Scalability:** The system can now scale to handle hundreds of simultaneous requests by distributing the load across multiple processor threads.
*   **Data Integrity:** Guarantees that the "Remaining Inventory" counts are always 100% accurate.
*   **Performance:** Maximizes CPU utilization by processing reservations in parallel rather than sequentially.

---

## 📊 Final Simulation Results
As verified by the console output:
1.  **Concurrent Execution:** Multiple threads (Thread-1, Thread-2) successfully processed the queue.
2.  **Confirmed Bookings:** Reservations for Abhi, Vanmathi, Kural, and Subha were recorded.
3.  **Inventory Integrity:** Final counts correctly reflected the decremented stock (e.g., Single: 3, Double: 2, Suite: 1).
