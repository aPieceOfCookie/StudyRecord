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