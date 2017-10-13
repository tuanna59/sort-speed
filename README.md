# Sort Speed

## Description:
### This program requires you to write three text oriented console input/output programs.  These three programs do the following things:
1.	Read in a text file that contains words, punctuation and many other things (e.g. numbers).  This first program reads in this file and writes out a file of words, one per line, where only whole words formed of just alphabetic characters (no internal blanks, dashes, or other special characters) from the input are written to an output file and the number of words is written to the console (each word in the output file must be unique.)
2.	The second program reads and sorts a specified file (created by the first program) into memory after the user specifies the name of the file and the number of words.  The program sorts this unsorted data five times using five different sorting algorithms: bubble, selection, insertion, merge, and one other sort of your choice that must be faster than O(n2).  (You should read in the unsorted data into memory just before each sort.  Be sure that you do not include this reading time as part of the sorting time.)   The intent of the fifth sort is that it should be faster than the other four and the performance of this sort will be used as your result for the speed competition.  Each of the five actual sorting process (not including the time to read in the data or the time to write out the results) will be timed and the amount of time spent on each of the five sorting algorithms will be displayed to the console.  After each sort, the resulting sorted array will be written to an output file generated by adding the name of the sort to the specified input file name before the “.” extension at the end of the input file name.
3.	The third program reads in the five input files and verifies that each is the same by comparing each to the other and also verifies that the results are indeed sorted.  The results are displayed to the console.
### The objectives of this assignment are to:
1.	Explore the implementation of sorting algorithms.
2.	Experiment with sorting performance by finding a sort algorithm that out-performs, if possible, your merge sort implementation.
3.	Further develop your skills producing Java applications.

## Program Requirements:
### Implement three stand alone applications, designed to work together.  
•	The original input file consists of text with blanks, commas, end of lines, and other lexical objects.  The first program must be able to read this file and write out a file of unique words, one per line, where each word is formed of just alphabetic characters in lower case.

•	The first program must ask the user to specify a file name for input and a file name for output and the user-supplied file names must be used for reading in the input and writing out the file of unique words.  After writing out the file, the program displays to the console the number of unique words written to the file.

•	Your first program must be able to properly process the provided “jargon.dict” file.

•	All three programs shall display all error messages under program control.  It is not acceptable for the program to have any exception generate automatic exception handling error messages.

•	The user shall specify the name of the input file for the second (sorting speed) program.  The five output files will have names based in the input file name.  For example, if the input file is “InputData.txt”, the sorted output file names must be of the following form: “InputData Bubble.txt”, “InputData Insertion.txt” , “InputData Selection.txt”, etc.

•	The user shall specify all of the five input file names for the third program as well as the name of a resulting output file.

•	The third program verifies that all five of the input files are the same and produces an output file of the sorted words using the following method:

o	Find the length of the longest word in the data set.

o	Given this longest word, the program will output as many columns as can fit into 80 columns with two blanks between the columns as if each word were as long as the longest word (shorter words will have extra blanks inserted to make them the right length).  The first row of output contain the first n words while the second row contains the next n words, and so forth until all words have been displayed.  The first letter of all words must align with the first letter for the other words in that column.  The following example would be produced if the longest word in the input data were just five characters in length.
XXXXX  XXX    XXXXX  ………… XXXXX
XXX    XXXXX  XX     ………… XXX
XXXX   XXX    XXXX   ………… XXXX
.
.
. 

•	The amount of time required to sort by means of each of the five sorting algorithms must be determined using the System class method “nanoTime()” and must be displayed to tenths of a millisecond.  The display of the sorting times must be made to the console.