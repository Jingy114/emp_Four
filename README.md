# Lab_03 - Emp

## Team Four 
Roster: Fang Min Chen, Kaitlin Ho, Jing Yi Feng
Duckies: Cat, Biscuit, Apple
		
## Tests Performed

Data collected: 

* Total time (in milliseconds) taken for binary and linear search to search for every single element in an array of length n as n varies. The times for each are printed, binary and linear respectively, for each array of length n. 

* Minimum Length for the run time of binary search to be less than that of linear search by trial. This is done with a for loop increasing the length of the array until the previous statement has been found.

* Time taken for binary and linear search to search for an int that is not an element of the given array. Tested with varying lengths and and with three unpresent int values. 

## Results

Testing Total Time to Search Every Element in a Given Array: 
Array Length / Binary Time / Linear Time:
* 1000 / 0 / 8
* 10000 / 8 / 59
* 100000 / 8 / 4350
* 500000 / 50 / 259486
* 1000000 / 258 / 1674678

Testing For Minimum Length of Array for Binary Search to be more Efficient:
* Trial 1: 63
* Trial 2: 2
* Trial 3: 69
* Trial 4: 11
* Trial 5: 13
* Trial 6: 15


Testing Search Times for Values NOT in the Given array:
Array Length /// Trial 1 /// Trial 2 /// Trial 3:
* 10 /// 9 / 5 /// 1 / 2 /// 2 / 2
* 1000 /// 11 / 62 /// 5 / 63 /// 7 / 54
* 10000 /// 5 / 885 /// 5 / 752 /// 8 / 759 
* 100000 /// 6 / 8702 /// 8 / 11910 /// 17 / 9904

## Conclusions

The data we took showed us that for any long array, binary search doesn't fail to take less time on AVERAGE (compared to linear search) to search for any element within the array. The same goes for searching for any int not in the array. 

The lengths we collected for when binary search started to be faster were varying, so we do not have a definitive array length for when linear search is a less efficient option. That said, the test never seems to continue increasing (beyond 70); at some point, binary search will be more efficient. So in corroboration with our other test results, we can say that the longer the array, the faster binary search is in comparison to linear search in general. This difference also becomes more apparent the longer the array.
