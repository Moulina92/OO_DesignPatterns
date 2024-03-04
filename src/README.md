# Design Patterns

## Creational Patterns

### BUILDER


## Behavioral Patterns

### STRATEGY

Definition
```
Defines a family of algorithms, encapsulates each one,and make them interchangable. 
Strategy lets the algorithm vary independently from client that use it.
```
Points to remember
```
1. Identify the aspects of your application hat vary and separate them from what stays the same.
2. Program to interface not an implementation. Really means program to supertype.
3. Favor composition (HAS-A) over inheritance(IS-A)
```
Representation of the idea

### OBSERVER

Definition
```
Defines a one-to-many dependency between objects so that when one object changes state, all of its 
dependents are notified and updated automatically.
```