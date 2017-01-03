# zup-marsrover
This project is a Java implementation of the Zup's developer test. It was
build in Eclipse IDE Mars.1 Release (4.5.1) with JRE 1.8.0.

## Introduction

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau,
which is curiously rectangular, must be navigated by the rovers so that their on-board
cameras can get a complete view of the surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y co-ordinates
and a letter representing one of the four cardinal compass points. The plateau is divided
up into a grid to simplify navigation. Na example position might be 0, 0, N, which
means the rover is in the bottom left corner and facing North.

## Problem

In order to control a rover, NASA sends a simple string of letters. The possible letters
are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively,
without moving from its current spot. 'M' means move forward one grid point, and
maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

## Input

The first line of input is the upper-right coordinates of the plateau, the lower-left
coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed.
Each rover has two lines of input. The first line gives the rover's position, and the
second line is a series of instructions telling the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding
to the x and y co-ordinates and the rover's orientation. Each rover will be finished
sequentially, which means that the second rover won't start to move until the first one
has finished moving.

## Output

The output for each rover should be its final co-ordinates and heading.

## Test input and output

Test Input:

5 5  
1 2 N  
LMLMLMLMM  
3 3 E  
MMRMMRMRRM

Expected Output:

1 3 N  
5 1 E

## Usage

The application expects at least 3 arguments:

* The up-right coordinates of the environment;
* One rover initial coordinates (Inital X Inital Y Heading direction);
* One rover instructions (Only  'M', 'L' and 'R' characters are accepted).

For each additional rover it is required to inform also its initial coordinates
and instructions. If the number of arguments is different of (x-1) / 2 = 0, so
there are insufficient number of arguments and the application will exit with
code equals 1. If everything its ok, the application will exit with code equals
0.

If you are using the Eclipse IDE you can configure the arguments by following:

```
Project > Properties > Run/Debug Settings
```

You can select the Main class and click on New or Edit button to manage the arguments
in the new window that will open.
