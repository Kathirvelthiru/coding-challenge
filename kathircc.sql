create database codechal;
use codechal;

CREATE TABLE Pet (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    breed VARCHAR(255)
);

CREATE TABLE Dog (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    breed VARCHAR(255),
    dogBreed VARCHAR(255)
);

CREATE TABLE Cat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    breed VARCHAR(255),
    Catcolor VARCHAR(255)
);
create table ItemDonation(
donorName varchar(255), amount double, itemType varchar(255));
create table Donation(
	donorName varchar(255), amount double);
INSERT INTO Pet (name, age, breed) VALUES
('Buddy', 3, 'Labrador Retriever'),
('Max', 2, 'German Shepherd'),
('Charlie', 4, 'Beagle'),
('Lucy', 5, 'Poodle');

INSERT INTO Dog (name, age, breed, dogBreed) VALUES
('Buddy', 3, 'Labrador Retriever', 'Golden Labrador'),
('Max', 2, 'German Shepherd', 'Long-haired German Shepherd'),
('Rex', 4, 'Siberian Husky', 'Alaskan Husky');

INSERT INTO Cat (name, age, breed, Catcolor) VALUES
('Whiskers', 2, 'Persian', 'White'),
('Mittens', 3, 'Siamese', 'Brown'),
('Shadow', 4, 'Maine Coon', 'Gray');