# Catalogue People Book (c.p.b)
catalogue people book

this project is open surce

### Description
It serves to help people who are beginning to read the Bible or book,
to take notes on characters and their events, and events described in the Bible.

And like a more structured notepad.

this project is open surce


## Api

## Person
### create person
post
path:

     http://localhost:8080/person/insert

body json:

| Param | Value |
| --- | --- |
| "name": | "x", |
| "descriptive_name": | "x", |
| "surname": | "x", |
| "nickname": | "x", |
| "age_at_death": | "x", |
| "first_time_appears_here_the_Bible”: | “x” |

#### example:

    {
        "name":"Adamo",
        "descriptib_name":"first man",
        "surname":"",
        "nickname":"",
        "age_at_death":"930",
        "first_time_appears_here_the_Bible":"genesi 5:1-5"
    }

### fix person (patch)
Incorrect characteristic of a person?
no problem edit it.

path: http://localhost:8080/person/update/{id}

    example: (adamo id = 1)
incomplete data or data to be modified
 
    {
        "name":"Adamo",
        "descriptive_name":"first man",
        "surname":"",
        "nickname":"",
        "age_at_death":"930",
        "first_time_appears_here_the_Bible":"genesi 5:1-5"
     }
 
select path

    http://localhost:8080/person/update/1
body json where to put the data you want to change
body json:

    {
        "name":"Adamo",
        "descriptive_name":"first man",
        "surname":"",
        "nickname":"first man old",
        "age_at_death":"930",
        "first_time_appears_here_the_Bible":"genesi 10:1-5"
    }

### List person
(get)
get all list
paht: http://localhost:8080/person/list

### Get single person
path: http://localhost:8080/person/view/{id}

example: get adamo that as id 1
our path will be: http://localhost:8080/person/single/1

### Delete single person, but save the ID (put)
path: http://localhost:8080/person/upload/{id}

example: (delete adamo id = 1)
path: http://localhost:8080/person/upload/1

body json:
the body to be inserted is the same as that of the creation of the person.
    
    {
        "name":"wario",
        "descriptive_name":"old man",
        "surname":"w",
        "nickname":"rossi",
        "age_at_death":"2000",
        "first_time_appears_here_the_Bible":"genesi 11:1-5"
    }

### Delete single person and his ID
(method not recommended. The id creation strategy is self incremental.
use of use the above method (put) is recommended.)

path:  http://localhost:8080/person/delete/{id}

we put the id of the person we want to delete from the db.
For example, Eva has the id 2. The path will be:
http://localhost:8080/person/delete/2


## technology stack

<p align="left">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40" />
    <img src= "https://www.vectorlogo.zone/logos/mariadb/mariadb-icon.svg" alt="mariadb" width="40" height="40"/>
    <img src= "https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/>
    <img src= "https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40" />
    
</p>
