select name,population,area from description where area > 3000000 or population > 25000000;
DROP TABLE
    IF
    EXISTS salary;
CREATE TABLE salary ( id INT, NAME VARCHAR ( 100 ), sex CHAR ( 1 ), salary INT );
INSERT INTO salary ( id, NAME, sex, salary )
VALUES
( '1', 'A', 'm', '2500' ),
( '2', 'B', 'f', '1500' ),
( '3', 'C', 'm', '5500' ),
( '4', 'D', 'f', '500' );
update salary
set
    sex = CHAR(ASCII(sex)^ASCII('m')^ASCII('f'))
select *
from salary;
DROP TABLE
    IF
    EXISTS cinema;
CREATE TABLE cinema ( id INT, movie VARCHAR ( 255 ), description VARCHAR ( 255 ), rating FLOAT ( 2, 1 ) );
INSERT INTO cinema ( id, movie, description, rating )
VALUES
( 1, 'War', 'great 3D', 8.9 ),
( 2, 'Science', 'fiction', 8.5 ),
( 3, 'irish', 'boring', 6.2 ),
( 4, 'Ice song', 'Fantacy', 8.6 ),
( 5, 'House card', 'Interesting', 9.1 );
select * from cinema
where id%2!=0 and description != 'boring' order by rating desc

DROP TABLE
    IF
    EXISTS courses;
CREATE TABLE courses ( student VARCHAR ( 255 ), class VARCHAR ( 255 ) );
INSERT INTO courses ( student, class )
VALUES
( 'A', 'Math' ),
( 'B', 'English' ),
( 'C', 'Math' ),
( 'D', 'Biology' ),
( 'E', 'Math' ),
( 'F', 'Computer' ),
( 'G', 'Math' ),
( 'H', 'Math' ),
( 'I', 'Math' );
delete p1
from person p1 , person p2
where
    p1.Id>p2.Id and p1.Email=p2.Email
;
DROP TABLE
    IF
    EXISTS Person;
CREATE TABLE Person ( PersonId INT, FirstName VARCHAR ( 255 ), LastName VARCHAR ( 255 ) );
DROP TABLE
    IF
    EXISTS Address;
CREATE TABLE Address ( AddressId INT, PersonId INT, City VARCHAR ( 255 ), State VARCHAR ( 255 ) );
INSERT INTO Person ( PersonId, LastName, FirstName )
VALUES
( 1, 'Wang', 'Allen' );
INSERT INTO Address ( AddressId, PersonId, City, State )
VALUES
( 1, 2, 'New York City', 'New York' );
DROP TABLE
    IF
    EXISTS Employee;
CREATE TABLE Employee ( Id INT, NAME VARCHAR ( 255 ), Salary INT, ManagerId INT );
INSERT INTO Employee ( Id, NAME, Salary, ManagerId )
VALUES
( 1, 'Joe', 70000, 3 ),
( 2, 'Henry', 80000, 4 ),
( 3, 'Sam', 60000, NULL ),
( 4, 'Max', 90000, NULL );
SELECT
    E1.NAME AS Employee
FROM
    Employee E1
        INNER JOIN Employee E2
                   ON E1.ManagerId = E2.Id
                       AND E1.Salary > E2.Salary;