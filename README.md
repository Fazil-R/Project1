# Project 1: String Date/Time
CS 2334: Programming Stuctures and Abstraction Fall 2020

This project involves being able to accurately uses [LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) class from Java API, parsing Strings from a file reader. The program takes in input from Date/Time methods. After that it finds the [Hamming Distance](https://en.wikipedia.org/wiki/Hamming_distance) between all Station ID's(4 letter code) read from the file given, Mesonet.txt. The output from Driver should be in the format below.

```
Current Date/Time: 10/07/2020 08:12 PM

The Hamming distance between Norman and NEWK is 3; between Normanand WEBR is 4.
For NEWK: Number of stations with Hamming Distance 3: 20.
For WEBR: Number of stations with Hamming Distance 4: 90.
```

## DateTimeOne

DateTimeOne uses LocalDateTime and DateTimeFormatter methods in order to read the current time.

* `getValueOfSecond()`: returns the value of the seconds from current time.

* `sleepForThreeSec()`: makes the program sleep for three seconds, catches InterruptedException if needed.

## Driver

The Driver connects all three files and runs them. The code is provided by the TA's, so no student work needed. The Driver initializes a DateTimeOne object and gets the time. If the seconds of the current time is greater than 30 than the program sleeps for 3 seconds.

The Driver than initializes two HammingDist objects and finds the Hamming Distance of a pair of cities.

## HammingDist

Hamming Distance finds the [Hamming Distance](https://en.wikipedia.org/wiki/Hamming_distance) between all the Station ID's in Mesonent.
 * `HammingDist(String, String)`: The constructer assigns the STID from Mesonet to an ArrayList. It uses the classes methods to find the distance between the paramater and Norman STID. The Hamming Distance between the parameter and Norman STID is then used to find all STIDs with that Distance.
 
* `NormanDist(String)`: Returns the Hamming Distance between NRMN and paramater

* `Distance(String, ArrayList, int)`: Returns the amount of STIDs with the Hamming Distance of the parameter int from the ArrayList

* `readFile()`: Returns an ArrayList of STIDs read from Mesonet.txt

* `toString()`: Overrides the toString from String type.
Returns a  String in the format required for the projects completion.
