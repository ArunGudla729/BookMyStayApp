# Use Case 10: Booking Cancellation & Inventory Rollback

## 🎯 Project Goal
The goal of Use Case 10 is to implement a reliable **Cancellation Mechanism** that maintains system consistency. It ensures that when a booking is voided, the allocated room is immediately returned to the available inventory, and the event is logged in a rollback history.

---

## 🛠️ Key Components

### 1. Stack-Based Rollback (`Stack<String>`)
*   **LIFO Principle:** Utilizes a Stack to track released reservation IDs. This follows the **Last-In, First-Out** model, ensuring that the most recent cancellation is always at the top of the history.
*   **Audit Trail:** Maintains a chronological record of "Released Reservation IDs" for administrative review.

### 2. Inventory Restoration Logic
*   **State Recovery:** Automatically communicates with the `RoomInventory` to increment the room count for the specific type (e.g., Single, Double) being cancelled.
*   **Real-time Updates:** Provides immediate visibility into updated room availability following a successful rollback.

### 3. Data Integrity
*   **Mapping:** Ensures that the inventory restoration is type-specific, preventing a "Suite" cancellation from accidentally increasing "Single" room counts.

---

## 🏗️ Architectural Benefits
*   **Operational Consistency:** Guarantees that the system state (Inventory) always reflects the actual physical availability of the hotel.
*   **Undo Capability:** The use of a Stack provides the foundational logic required for multi-level "Undo" operations in complex transactional systems.
*   **Traceability:** Every cancellation creates a verifiable trail, essential for resolving customer disputes or performing system audits.

---

## 📊 Sample Output (As implemented)
```text
Booking Cancellation
Booking cancelled successfully. Inventory restored for room type: Single

Rollback History (Most Recent First):
Released Reservation ID: Single-1

Updated Single Room Availability: 6
