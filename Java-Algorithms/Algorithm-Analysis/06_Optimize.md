# Optimize

The fourth steo is optimize, In other words pay attention to how to make your code better.


## Prompt
Create a function given a sorted array of `n` strings, that will return the location of a given element.

## Linear vs. Binary Search

The two approaches for searching for an element that we have covered are linear (or sequential) search and binary (or half-interval) search. Let’s go over the differences.

 **How they start:**

- Linear : from the beginning of our array
- Binary : from the middle of our array

 **Best case:**

- Linear : the first element is what we are looking for
- Binary : the middle element is what we are looking for

**Worst case:**
- Linear : last element of the array
-  : the value is the first or last element of the array
-----


> we know on average that a binary search is more efficient than a linear search. As such, let’s optimize and update our search method to use a binary search algorithm.

**Visit ~ [ProblemSolvingOP.java](ProblemSolvingOP.java)**




