# Use Case 8: Booking History & Reporting

## Project Goal
The primary objective of this use case is to introduce **historical tracking** of confirmed bookings. This provides operational visibility for administrators, enables system audits, and supports reporting. It establishes a **persistence-oriented mindset** by treating in-memory data as long-lived information, preparing the system for future database integration.

---

## Key Components


| Component | Role |
| :--- | :--- |
| **Admin (Actor)** | Reviews booking history and reports for operational purposes. |
| **Booking History** | Maintains a record of confirmed reservations using ordered storage. |
| **Booking Report Service** | Generates summaries and formatted reports from stored data. |

---

## Architectural Principles Applied

*   **Operational Visibility:** Provides insight into past transactions to understand system usage.
*   **Ordered Storage:** Uses a `List<Reservation>` to preserve **insertion order**, ensuring a chronological record of events.
*   **Separation of Concerns:** Data storage (`BookingHistory`) is decoupled from reporting logic (`BookingReportService`).
*   **Persistence Mindset:** Although the data is stored in-memory, it is treated as an audit trail that persists throughout the application's lifecycle.
*   **Reporting Readiness:** Structured data allows reports to be generated at any time without reprocessing live booking flows.

---

## How to Run

1.  **Compile the code:**
    ```bash
    javac UseCase8BookingHistoryReport.java
    ```
2.  **Execute the application:**
    ```bash
    java UseCase8BookingHistoryReport
    ```

---

## Sample Output
As implemented in the final code, the system generates the following report:

```text
Booking History and Reporting

Booking History Report
Guest: Abhi, Room Type: Single
Guest: Subha, Room Type: Double
Guest: Vanmathi, Room Type: Suite
