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

## Solved tasks

As of today (07.03.2021) I have solved all tasks regarding the compulsory task.
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