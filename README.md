# Hotel Management System

Console-based Java practice project focused on Object-Oriented Programming fundamentals: classes, object composition, collections, and list handling.

## Description

A console application that simulates basic hotel management: client registration, room management, and reservation creation, including availability checks and price calculation.

## Structure

- `Cliente.java` — stores the account holder’s data.
- `Cuenta.java` — base class with balance, deposit/withdraw operations.
- `CuentaCorriente.java` — inherits from Cuenta, allows overdraft up to a limit.
- `CuentaAhorro.java` — inherits from Cuenta, allows applying interest.
- `Banco.java` — manages clients and accounts, supports transfers.
- `Main.java` — system tests.

## Applied Concepts

- Classes, attributes, constructors, getters and setters
- Object composition (Reserva links Cliente and Habitacion)
- Collections (ArrayList, List)
- List iteration with for-each
- Safe removal using Iterator (iterator.remove())
- Object search inside lists (returning the object or null)
- Null-checking before operating on objects

## Next Steps

- Add inheritance and polymorphism (see SistemaAlquiler)
- Add exception handling (see SistemaBancario)
- Add database persistence (SQL/JDBC)
