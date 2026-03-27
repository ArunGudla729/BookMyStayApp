Book My Stay App – Use Case 7
Overview
This use case allows guests to select optional add-on services for an existing reservation. Services are managed separately to avoid modifying core booking or inventory logic.

Objective
Attach multiple services to a single reservation
Map reservation IDs to selected services
Calculate total add-on cost
Maintain separation from core booking and inventory
Features
Service class representing an add-on offering
AddOnServiceManager to map reservations to services
Support for multiple services per reservation
Total add-on cost calculation
File Structure
UseCase7AddOnServiceSelection.java – Contains reservation, service, and manager logic
How to Compile and Run
Compile
javac UseCase7AddOnServiceSelection.java
Run
java UseCase7AddOnServiceSelection
Expected Output
Welcome to Book My Stay App
Hotel Booking System v7.0
Guest: Alice, Room Type: Single Room, Room ID: S-12
Added service Breakfast to reservation S-12
Added service Spa Session to reservation S-12
Added service Airport Pickup to reservation S-12

--- Add-On Services for Reservation S-12 ---
Service: Breakfast, Cost: 200.0
Service: Spa Session, Cost: 500.0
Service: Airport Pickup, Cost: 300.0
Total Add-On Cost: 1000.0
Key Concepts Used
Composition over Inheritance
Map<String, List> for reservation-service mapping
Separation of Core and Optional Features
Cost Aggregation
Flexible extensibility for new services
Version
7.0