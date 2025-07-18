| Resources  | HTTP Verb | Resource URL                                           | Use Case                                    |
| ---------- | --------- | ------------------------------------------------------ | ------------------------------------------- |
| visitors   | GET       | /zoos/:zooId/visitors                                  | get all visitors of a specific zoo          |
|            | POST      | /zoos/:zooId/visitors                                  | create a new visitor in a specific zoo      |
|            | PUT       | /zoos/:zooId/visitors/:visitorId                       | update a specific visitor's details         |
|            | DELETE    | /zoos/:zooId/visitors/:visitorId                       | delete a specific visitor                   |
| tickets    | GET       | /zoos/:zooId/tickets                                   | get all tickets of a specific zoo           |
|            | POST      | /zoos/:zooId/tickets                                   | create a new ticket in a specific zoo       |
|            | PUT       | /zoos/:zooId/tickets/:ticketId                         | update a specific ticket's details          |
|            | DELETE    | /zoos/:zooId/tickets/:ticketId                         | delete a specific ticket                    |
| shops      | GET       | /zoos/:zooId/shops                                     | get all shops of a specific zoo             |
|            | POST      | /zoos/:zooId/shops                                     | create a new shop in a specific zoo         |
|            | PUT       | /zoos/:zooId/shops/:shopId                             | update a specific shop's details            |
|            | DELETE    | /zoos/:zooId/shops/:shopId                             | delete a specific shop                      |
| enclosures | GET       | /zoos/:zooId/enclosures                                | get all enclosures of a specific zoo        |
|            | POST      | /zoos/:zooId/enclosures                                | create a new enclosure in a specific zoo    |
|            | PUT       | /zoos/:zooId/enclosures/:enclosureId                   | update a specific enclosure's details       |
|            | DELETE    | /zoos/:zooId/enclosures/:enclosureId                   | delete a specific enclosure                 |
| animals    | GET       | /zoos/:zooId/enclosures/:enclosureId/animals           | get all animals of a specific enclosure     |
|            | POST      | /zoos/:zooId/enclosures/:enclosureId/animals           | create a new animal in a specific enclosure |
|            | PUT       | /zoos/:zooId/enclosures/:enclosureId/animals/:animalId | update a specific animal's details          |
|            | DELETE    | /zoos/:zooId/enclosures/:enclosureId/animals/:animalId | delete a specific animal                    |
| hospitals  | GET       | /zoos/:zooId/hospitals                                 | get all hospitals of a specific zoo         |
|            | POST      | /zoos/:zooId/hospitals                                 | create a new hospital in a specific zoo     |
|            | PUT       | /zoos/:zooId/hospitals/:hospitalId                     | update a specific hospital's details        |
|            | DELETE    | /zoos/:zooId/hospitals/:hospitalId                     | delete a specific hospital                  |
| tasks      | GET       | /zoos/:zooId/visitors/:visitorId/tasks                 | get all tasks of a specific visitor         |
|            | POST      | /zoos/:zooId/visitors/:visitorId/tasks                 | create a new task for a specific visitor    |
|            | PUT       | /zoos/:zooId/visitors/:visitorId/tasks/:taskId         | update a specific task's details            |
|            | DELETE    | /zoos/:zooId/visitors/:visitorId/tasks/:taskId         | delete a specific task                      |
| items      | GET       | /zoos/:zooId/shops/:shopId/items                       | get all items of a specific shop            |
|            | POST      | /zoos/:zooId/shops/:shopId/items                       | create a new item in a specific shop        |
|            | PUT       | /zoos/:zooId/shops/:shopId/items/:itemId               | update a specific item's details            |
|            | DELETE    | /zoos/:zooId/shops/:shopId/items/:itemId               | delete a specific item                      |