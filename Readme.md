# Decision Making in Sports Using Evolutionary Algorithms


# Motivation

In any sport, the selection of players for a team is fundamental for its subsequent performance.
Factors influencing the selection include the rules of the particular game, the restrictions
associated with the game as well the environment in which the game is played. All of this makes
the process of selection of a team very complex as it is affected by multiple variables and in
many cases marked by a great deal of subjectivity.

# Abstract

The objective of this study was to select the playing 11 players optimally for an Indian Premier
League (IPL) cricket team from the squad of an IPL franchise. It was considered as a
Multi-Objective Optimization Problem (MOOP) with objectives as maximising the batting,
bowling and fielding performance of the team. The teams were formed subject to the restrictions
of the game. The sample was composed of twenty players belonging to the IPL franchise
Mumbai Indians. Three different multi-objective evolutionary algorithms viz. NSGA-II, GDE3
and SMPSO were used to construct the teams. To assess the quality of the teams formed by all
the three algorithms, these were compared with the official selected teams for the year 2019.
Further to account for the variations in the environmental conditions of the game, the formed
teams were evaluated based on their performance in different stadiums. According to the results,
it was found that the NSGA-II algorithm outperformed all the other algorithms.
This report starts with a review of similar research conducted in the Kanpur Genetic Algorithms
Laboratory. Following which the difference between the mathematical formulation of the
5previous study and the present study has been discussed. A small introduction to the different
algorithms used has been included. Finally, we conclude with the results and the conclusions.

# Results 

## GDE3
<img src="https://i.ibb.co/CVmmdM9/gde3-final.png" alt="gde3-final" border="0">

## SMPSO
<img src="https://i.ibb.co/PmkSCxx/smpso-final.png" alt="smpso-final" border="0">

## NSGAII
<img src="https://i.ibb.co/FV7jR18/nsga-final.png" alt="nsga-final" border="0">

## Comparison
<img src="https://i.ibb.co/stX9kL6/FIGURE.jpg" alt="FIGURE" border="0">

## Stadium Data Analysis
<img src="https://i.ibb.co/DCK69Rh/Comparison-of-Player-Selection-Frequencies.png" alt="Comparison-of-Player-Selection-Frequencies" border="0">
```
project
│   README.md
│     
│
└───src/main/java
│   │   App.java - Main App Entry Point    
│   │   DataReader.java - Reads the Input Data file and makes static variables
│   │   DataWriter.java - Prints the Solution
│   │   Node.java - Solution Model
│   │   Player.java - Player Model
│   │   PlayerSelection.java - Contains Fitness Functions and Constraints

```
