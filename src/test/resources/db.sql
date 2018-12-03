CREATE SCHEMA IF NOT EXISTS demo;
    
CREATE TABLE IF NOT EXISTS demo.employee
(
    employeeId SERIAL,
    firstname character varying,
    lastname character varying,
    dateOfHire date
);