# Advanced Programming - Laboratory 3

## Tasks

COMPULSORY
```text
Create an object-oriented model of the problem. You should have at least the following classes City, Hotel, Museum, Church, Restaurant. The natural ordering of their objects is given by their names.
Create the interfaces Visitable, Payable, Classifiable. The classes above must implement these interfaces accordingly.
The City class will contain a List of locations.
Each location will contain a Map representing the times required to go from this location to others.
Create all the objects given in the example.
```
OPTIONAL
```text
In the City class, create a method to display the locations that are visitable and are not payable, sorted by their opening hour.
Create default methods in the interface Visitable, with the opening hour 09:30 and the closing hour 20:00.
Create a static method getVisitingDuration,in the interface Visitable, that returns a Duration object, representing how long a location is opened during a day.
Create the class TravelPlan. An instance of this class will contain a city and the preferences regarding the visiting order.
Implement an efficient agorithm to determine the shortest path between two given locations, conforming to the preferences.
```

## Solved tasks

As of today (07.03.2021) I have solved all tasks regarding the compulsory task.
As of 12.03, I have also solved the optional tasks.
## Build and run

To compile and run my project I have typed the following commands in the terminal:
```bash
javac -classpath . *.java Main.java
java compulsory.Main
```

## Output

The output for the compulsory part is:
```bash
The distance map is:
Hotel->Museum A=10
Hotel->Museum B=50
Museum A->Church A=20
Museum A->Museum B=20
Museum A->Church B=10
Museum B->Church A=20
Museum B->Museum A=20
Church A->Restaurant=10
Church A->Church B=30
Church B->Church A=10
Church B->Restaurant=20


```
The output for the optional part is:
```bash
The name of the location is: Church A and it opens at 10:12:13

The name of the location is: Church B and it opens at 23:59:59

The name of the location is: Restaurant and it opens at 23:59:59

0:21
City: Chicago has the following locations: [The Location is called: Church A, The Location is called: Church B, The Location is called: Hotel, The Location is called: Museum A, The Loc
ation is called: Museum B, The Location is called: Restaurant]

[The Location is called: Church A, The Location is called: Museum B]
30
```