# ITCS231-Project1

## ArrayReshape2d

```
java -jar ./target/ArrayReshape2d.jar [row] [column]
```
Where  
- row is number of row of 2d array that you want to reshape. (Optional)  
- column is number of column of 2d array that you want to reshape. (Optional)  

When run ArrayReshape2d, It will try to reshape input array every permuation that posible.
For example, array that has shape (4, 2) will transform to (8, 1), (4, 2), (2, 4), (1, 8).

## BinarySearch

```
java -jar ./target/BinarySearch.jar
```
This will randomly create list with size 50 and randomly pick one number in the list and search for it.

## SelectionSort

```
java -jar ./target/SelectionSort.jar
```
This will randomly create list with size 50 and sort it.


## Compiling

```
javac ./src/*.java 
jar cfe ./target\ArrayReshape2d.jar src.ArrayReshape2d ./src/ArrayReshape2d.class 
jar cfe ./target\BinarySearch.jar src.BinarySearch ./src/BinarySearch.class ./src/SelectionSort.class
jar cfe ./target\SelectionSort.jar src.SelectionSort ./src/SelectionSort.class
```
This is not necessary but if you want to verified that current jar file and code are the same. Use these commands.

## Algorithm Analysis

Please read report [`summarize.pdf`](https://github.com/ACitronella/ITCS231-Project1/blob/main/summarize.pdf).

## Latex of report

[Overleaf](https://www.overleaf.com/read/wmktdktjndnv  )


## Colaborators

- Aj. Akara Supratak  
- Rujiphart Charatvaraphan 6388012  

## Honorable mention document

- https://stackoverflow.com/questions/4597866/java-creating-jar-file
- https://docs.oracle.com/javase/tutorial/deployment/jar/build.html
- https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html

## This repo

- https://github.com/ACitronella/ITCS231-Project1



