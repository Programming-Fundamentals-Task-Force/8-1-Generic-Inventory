# Assignment 8-1: Generic Inventory

Name:

ID:

## Background

In Java, `List<T>` is an **interface** that represents an ordered collection of elements. A common implementation of `List<T>` is `ArrayList<T>`, which stores elements in a resizable array.

Similarly, `Set<T>` is an interface that represents a collection of unique elements (i.e., it does not allow duplicates). A commonly used implementation of `Set<T>` is `HashSet<T>`, which provides fast lookups and ensures uniqueness but does **not** maintain any specific order of elements.

All of these classes and interfaces implement `Collection<T>` either directly or indirectly, and therefore implement all `Collection<T>` methods.

In summary:

- `ArrayList<T>` is a generic collection that implements `List<T>` interface, and stores an *ordered* collection of *any* elements of type `T`.
- `HashSet<T>` is a generic collection that implements `Set<T>` interface, and stores an *unordered* collection of *unique* elements of type `T`.

You may have to use all of these interfaces and classes in this problem.

## Problem Overview

You will create a generic inventory system that stores unique elements while providing a way to retrieve them as a list.

Your goal is to design a **generic class** `Inventory<T>` that:

- Stores elements in a `HashSet<T>` to prevent duplicates.
- Provides a method to return all stored elements as an `ArrayList<T>` for convenient access.

Additionally, you will implement a **generic method** in a separate class to count elements in a collection.

## Setup and Environment

- **WARNING:** Do not modify the `.github` or `gradle-tests` directories. These directories are essential for the automated grading process, and any changes may result in incorrect grading.

The Maven project has already been created for you. The package name is com.lab, and the project name (and directory) is lab81. Use mvn compile to build the project and java -cp target/classes com.lab.App or mvn exec:java "-Dexec.mainClass=com.lab.App" to run it.

## Requirements and Specifications

- Class: `Inventory<T>` (generic class)
  - Stores elements internally in a `HashSet<T>`.
  - Implements the following *public* methods:
    - `void add(T item)`: Adds an item to the inventory. If the item already exists, do nothing.
    - `boolean contains(T item)`: Returns `true` if the item exists in the inventory, otherwise `false`.
    - `List<T> getAll()`: Returns all stored items as an `ArrayList<T>` (converted from `HashSet<T>`).

- Class: `DataProcessor` (Utility Class)
  - Implements the generic method:
    - `public static <T> int countItems(Collection<T> collection)`
      - Accepts any `Collection<T>` as an argument.
      - Returns the total number of elements in the collection.

## Examples and Usage

Executing `main()` should produce the following output:

```
[Data Structures, Java Programming]
Total unique items: 2
```

## Additional Notes

- Order is not guaranteed in `getAll()` since `HashSet<T>` does not maintain order.
- Make sure `Inventory<T>` prevents duplicate entries by leveraging `HashSet<T>`.
- Use Java Generics correctly so that the classes work with different data types.
- Consider edge cases such as:
  - Adding duplicate elements.
  - Calling `getAll()` when the inventory is empty.
- Learn more about `Collection<T>` interface: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collections.html