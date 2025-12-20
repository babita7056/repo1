Hospital Management System (Stream API + CSV + optional MySQL)
=============================================================
This project implements a console-based Hospital Management System in Java.
Key features:
  - Uses Java Stream API to read/write CSV files and to generate reports.
  - Modular design: com.hospital.model, com.hospital.service, com.hospital.main
  - CSV files: patients.csv, doctors.csv, appointments.csv (created automatically)
  - Optional MySQL support (via JDBC) if MySQL is available.

How to compile (Windows PowerShell):
  1. Place mysql-connector jar in project folder if you plan to use MySQL.
  2. From project root run:
     mkdir out
     javac -d out -cp "mysql-connector-j-<version>.jar" src\com\hospital\model\*.java src\com\hospital\service\*.java src\com\hospital\main\*.java

How to run (Windows PowerShell):
  java -cp "out;mysql-connector-j-<version>.jar" com.hospital.main.HospitalApp

Notes:
  - If you don't have MySQL, the app will still run using CSV files only.
  - Option 10 in the menu overwrites CSV files using current in-memory data.
