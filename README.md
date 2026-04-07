# Use Case 12: Data Persistence & System Recovery

## 🎯 Goal
The primary objective of Use Case 12 is to move beyond temporary in-memory storage to **File-based Persistence**. This ensures that room inventory data is preserved even after the application is closed or the system is restarted.

## 🛠️ Key Features
*   **System Recovery:** At startup, the system automatically checks for `inventory_state.txt`. If found, it bypasses default values and restores the exact counts from the previous session.
*   **Data Persistence:** Every successful booking triggers an immediate update to the physical state file, guaranteeing that the "Source of Truth" is always current.
*   **Error Resilience:** If the data file is missing or corrupted, the system performs a "Fresh Start" by initializing default inventory levels without crashing.

## 🏗️ Architectural Benefits
*   **Persistence Mindset:** Moves the application closer to real-world production standards where data durability is critical.
*   **State Integrity:** Prevents the loss of inventory data due to power failure, maintenance, or application updates.
*   **Foundation for Databases:** Establishes the logical pattern of Loading -> Processing -> Saving required for future integration with SQL or NoSQL databases.

## 🚀 Execution Logic
1.  **Bootstrapping:** The `PersistenceManager` attempts to load state from `inventory_state.txt`.
2.  **State Reconstruction:** If the file exists, inventory counts are parsed and loaded into memory.
3.  **Active Persistence:** As rooms are booked, the system calls `saveInventory()` to reflect changes on the disk.
