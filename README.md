# Hotel Management System

Console-based Java practice project focused on Object-Oriented Programming fundamentals: classes, object composition, collections, and list handling.

## Description

A console application that simulates basic hotel management: client registration, room management, and reservation creation, including availability checks and price calculation.

## Structure

- `Client.java` — stores the account holder’s data.
- `Room.java` — stores room information such as number, type, price per night, and availability.
- `Booking.java` — connects a client with a room and stores the number of nights.
- `Hotel.java` — manages clients, rooms, and bookings, including searches, bookings, cancellations, availability checks, and price calculations.
- `Main.java` — contains the program tests and demonstrates the main functionality.

## Applied Concepts

- Classes, attributes, constructors, getters and setters
- Object composition (Booking links Client and Room)
- Collections (ArrayList, List)
- List iteration using enhanced for loops
- Safe removal using Iterator and iterator.remove()
- Searching for objects inside lists
- Returning objects or null when no match is found
- Null-checking before adding objects to collections
- Boolean methods for operation results
- Basic validation of user operations
- Encapsulation using private attributes and public methods

## Example Operations

### The Main class demonstrates:

1. Creating a hotel
2. Registering clients
3. Adding rooms
4. Creating a booking
5. Checking room availability
6. Calculating the total booking price
7. Cancelling a booking
8. Booking the same room again
9. Rejecting a booking with an invalid number of nights

## Next Steps

- Add inheritance and polymorphism
- Add exception handling
- Add more advanced booking management
- Add database persistence using SQL/JDBC
- Add a graphical or web-based interface
