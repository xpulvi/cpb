# cpb
catalogue people bible

this project is open surce

### Description
It serves to help people who are beginning to read the Bible,
to take notes on characters and their events, and events described in the Bible.

And like a more structured notepad.

this project is open surce


## Api

## Person
### create Person
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
| "work": | "x", |
| "age_at_death": | "x", |
| "first_time_appears_here_the_Bible”: | “x” |

#### example:

    {
        "name":"Adamo",
        "descriptib_name":"first man",
        "surname":"",
        "nickname":"",
        "work":"",
        "age_at_death":"930",
        "first_time_appears_here_the_Bible":"genesi 5:1-5"
    }

### fix Person (patch)
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
        "work":"",
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

### List Person
(get)
get all list
paht: http://localhost:8080/person/list

### Get single Person
path: http://localhost:8080/person/view/{id}

example: get adamo that as id 1
our path will be: http://localhost:8080/person/single/1

### Delete single Person, but save the ID (put)
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
        "work":"idraulico",
        "age_at_death":"2000",
        "first_time_appears_here_the_Bible":"genesi 11:1-5"
    }

### Delete single Person and his ID
(method not recommended. The id creation strategy is self incremental.
use of use the above method (put) is recommended.)

path:  http://localhost:8080/person/delete/{id}

we put the id of the person we want to delete from the db.
For example, Eva has the id 2. The path will be:
http://localhost:8080/person/delete/2

## Relatives
### create Relatives

post
paht: 

    http://localhost:8080/relatives/insert

example:
body json:

    {
      "personId":"2",
      "namePerson":"eva",
      "relationship":"spouses",
      "idRelative":"1",
      "relativeName":"Adamo"
    }

### List Relatives

get
paht:

    http://localhost:8080/relatives/list

## City
### create person
post
path:

     http://localhost:8080/person/insert

body json:

     {
         "name":"rome",
         "create_date":"1200",
         "destroi_date":"2000",
         "fondatore_city":"mirco",
         "nait":"dreik",
         "pawns_of_nait":"saly",
         "name_now":"roma"
     }

### fix City (patch)

path

     http://localhost:8080/city/update/{name city}

body json:

     {
         "name":"napoli",
         "create_date":"12",
         "destroi_date":"3000",
         "fondatore_city":"luigi",
         "nait":"dreik",
         "pawns_of_nait":"saly",
         "name_now":"bnap"
     }

### List City
get all list

     http://localhost:8080/city/list

get view City

     http://localhost:8080/city/view/{id}

### Delete single City

path:

     http://localhost:8080/city/delite/{id}
body json:

     {
         "name":"domodosola",
         "create_date":"33000",
         "destroi_date":"3311",
         "fondatore_city":"waluigi",
         "nait":"elena",
         "pawns_of_nait":"dreik",
         "name_now":"domodosola"
     }
