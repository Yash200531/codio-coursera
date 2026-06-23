# Problem Solving 

When tackling a problems in CS always do these five steps:
- 1 Read/Listen
- 2 Think of Examples
- 3 Brute Force
- 4 Optimize
- 5 Test

We will employ these fives steps with the following prompt below:

## Prompt: 
Create a function that, given a sorted array of n strings, will return the location of a given element.


### Read/Listen

- This step pays close attention to the problem we are trying to solve.
- What is our goal? What are we looking for? What do we want to happen?
What do we start with? What information is given? What can we extract from what we are given?

#### _Example: We are given a sorted array of strings, and we want to return the index for the search target._


### Think of Examples

This step pictures how our code works. It helps us visualize what we are about to do. Think of special cases and normal examples.

- Normal case: search for `"cat"` given the following:
```
["bat", "cat", "dog", "eagle", "fish"]
```

- Special cases: search for "cat" given an empty array or:

```
["ape", "donkey", "monkey", "raccoon", "snake"]
```

### Brute Force

This step thinks of the easiest or most straightforward way to obtain the solution. Let’s start by using a linear search, since this is the easiest and most straightforward way of searching an array.

**Visit ~ [ProblemSolvingBF.java](ProblemSolvingBF.java)**




