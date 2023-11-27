# cpb
catalogue people bible 

## api

## api person
### cerate person
post
phat: http://localhost:8080/person

body jeson:

| "name": | "x", |
| --- | --- |
| "descriptib_name": | "x", |
| "surname": | "x", |
| "nikename": | "x", |
| "age_at_death": | "x", |
| "first_time_appears_here_the_Bible”: | “x” |

#### exempol:

{
    "name":"Adamo",
    "descriptib_name":"first man",
    "surname":"",
    "nikename":"",
    "age_at_death":"930",
    "first_time_appears_here_the_Bible":"genesi 5:1-5"

}

### list person
(get)
get all list
paht: http://localhost:8080/person/list

### get singol person
path: http://localhost:8080/person/singlr_person/1

exempol: get adamo.
adam to id 1
our path will be: http://localhost:8080/person/singlr_person/1

### delate sigle person. save id (put)

path: http://localhost:8080/person/upload/{id}

exempol: (delate adamo id = 1)
path: http://localhost:8080/person/upload/1

body jeson:
the body to be inserted is the same as that of the creation of the person.
    
{
    "name":"wario",
    "descriptib_name":"old man",
    "surname":"w",
    "nikename":"rossi",
    "age_at_death":"2000",
    "first_time_appears_here_the_Bible":"genesi 11:1-5"

}

### delete singol pers on data base and yowr id
(method not recommended. the id creation strategy is self incremental.
use of use the above method (put) is recommended.)

path: http://localhost:8080/person/delite_single_person/1

we put the id of the person we want to delete from the db.
For example eva who at id 2 will be:
http://localhost:8080/person/delite_single_person/2


