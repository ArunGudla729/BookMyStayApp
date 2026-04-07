# Use Case 9: Error Handling & Validation

## 🎯 Goal
The objective of Use Case 9 is to implement robust **Error Handling and Input Validation**. This ensures that only valid booking data enters the system and provides clear, domain-specific feedback to users when a booking fails.

---

## 🛠️ Key Components

### 1. Custom Exception: `InvalidBookingException`
*   **Purpose:** A domain-specific exception class that extends `java.lang.Exception`.
*   **Benefit:** Instead of using generic errors, this allows the system to identify and handle hotel-specific booking failures (e.g., empty names or invalid room types) distinctly.

### 2. Centralized Validator: `ReservationValidator`
*   **Responsibility:** Segregates validation logic from the main application flow.
*   **Strict Rules:**
    *   **Guest Name:** Must not be null or empty.
    *   **Room Type:** Must match "Single", "Double", or "Suite" exactly (Case-Sensitive).
*   **Action:** Throws an `InvalidBookingException` if any rule is violated.

### 3. Professional Resource Management
*   **Try-Catch-Finally:** The application uses a standard error-handling block to:
    *   `try`: Execute the booking flow.
    *   `catch`: Intercept and display specific validation error messages.
    *   `finally`: Ensure the `Scanner` resource is closed to prevent memory leaks.

---

## 📊 Validation Scenarios


| Scenario | Input Name | Input Room Type | Expected Result |
| :--- | :--- | :--- | :--- |
| **Success** | `Abhisheak` | `Single` | `Booking processed successfully!` |
| **Case Error** | `Abhisheak` | `single` | `Booking failed: Invalid room type selected.` |
| **Empty Input** | ` ` | `Double` | `Booking failed: Guest name cannot be empty.` |

---

## 🏗️ Architectural Benefits
*   **Data Integrity:** Prevents "dirty data" or incorrect room types from ever reaching the `BookingHistory`.
*   **Robustness:** The system handles unexpected user input gracefully without crashing.
*   **User Feedback:** Provides precise error messages, improving the user experience and auditability.
