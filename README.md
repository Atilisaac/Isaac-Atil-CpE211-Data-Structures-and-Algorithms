# Lab 2 – Linear Search in Real Applications

**Course:** CpE 211 – Data Structures and Algorithms
**Student:** Isaac Isaiah D. Atil
**Laboratory:** Lab 2 – Linear Search in Real Applications
**Programming Language:** Java

## 1. Lab Description

This laboratory implements **Linear Search** using an unsorted `String[]` array.

The program is called `LibraryFinder`. It searches a list of book or subject titles one by one from the beginning of the array.

The program provides two required methods:

* `findFirst(String[] items, String target)` – finds and returns the index of the first matching title.
* `countMatches(String[] items, String target)` – counts all matching titles, including duplicates.

The program also prints every inspected index so the search can be traced.

---

## 2. Data Structure

The program uses an **unsorted String array**:

```java
String[] books = {"C", "Java", "DSA", "Java", "SQL"};
```

The array does not need to be sorted because Linear Search checks each element one by one.

---

## 3. Required Methods

### `findFirst()`

The method starts at index `0` and checks each element.

If the target is found, it immediately returns the index.

If the entire array is searched without finding the target, it returns `-1`.

Example:

```text
findFirst("Java")
→ 1
```

### `countMatches()`

The method also starts at index `0`, but it continues searching after finding a match.

Every time the target is found, `count` increases by `1`.

Example:

```text
countMatches("Java")
→ 2
```

There are two `"Java"` values in the array.

---

## 4. Test Evidence

Array used:

```text
[C, Java, DSA, Java, SQL]
```

| Test | Input / Action           | Expected | Actual | Status |
| ---- | ------------------------ | -------: | -----: | ------ |
| 1    | `findFirst("Java")`      |        1 |      1 | PASS   |
| 2    | `countMatches("Java")`   |        2 |      2 | PASS   |
| 3    | `findFirst("Python")`    |       -1 |     -1 | PASS   |
| 4    | `countMatches("Python")` |        0 |      0 | PASS   |
| 5    | `findFirst("SQL")`       |        4 |      4 | PASS   |
| 6    | `countMatches("SQL")`    |        1 |      1 | PASS   |
| 7    | `findFirst("C")`         |        0 |      0 | PASS   |
| 8    | `countMatches("C")`      |        1 |      1 | PASS   |

### Test Cases Covered

* **First position:** `"C"`
* **Last position:** `"SQL"`
* **Missing target:** `"Python"`
* **Duplicate target:** `"Java"`

All eight test cases produced the expected results.

---

## 5. Manual Trace

### Trace A – `findFirst("Java")`

Array:

```text
Index:  0       1       2       3       4
Value:  C      Java     DSA    Java     SQL
```

| Comparison | Index | Current Value | Result    |
| ---------- | ----: | ------------- | --------- |
| 1          |     0 | `C`           | Not equal |
| 2          |     1 | `Java`        | Match     |

The method stops immediately after finding the first `"Java"`.

```text
Comparisons: 2
Result: 1
```

### Trace B – `findFirst("Python")`

| Comparison | Index | Current Value | Result    |
| ---------- | ----: | ------------- | --------- |
| 1          |     0 | `C`           | Not equal |
| 2          |     1 | `Java`        | Not equal |
| 3          |     2 | `DSA`         | Not equal |
| 4          |     3 | `Java`        | Not equal |
| 5          |     4 | `SQL`         | Not equal |

The entire array was inspected and `"Python"` was not found.

```text
Comparisons: 5
Result: -1
```

---

## 6. Time Complexity

### `findFirst()`

* **Best case:** `O(1)` – target is at index `0`.
* **Worst case:** `O(n)` – target is at the last index or is not found.

### `countMatches()`

* **Best case:** `O(n)`
* **Worst case:** `O(n)`

`countMatches()` must inspect every element because there may be additional matches later in the array.

---

## 7. String Comparison

The program uses:

```java
items[i].equals(target)
```

instead of:

```java
items[i] == target
```

`.equals()` compares the **actual String contents**, while `==` compares whether the two String references refer to the same object.

---

## 8. Successful Run

The program was compiled and executed successfully using:

```powershell
javac LibraryFinder.java
java LibraryFinder
```

The console output showed all eight test cases producing the expected results.

**Successful-run screenshot:**
*Add the uploaded console screenshot here.*

---

## 9. Agentic-AI Workflow

This laboratory followed the guided Agentic-AI workflow:

### PLAN

The algorithm, data structure, pseudocode, variables, complexity, and test cases were planned before implementation.

### ASK

The Linear Search algorithm was explained before writing the implementation. The differences between `findFirst()` and `countMatches()`, `.equals()`, `-1`, `i`, `count`, and complexity were discussed.

### BUILD

`LibraryFinder.java` was implemented with the two required methods and test cases.

### INSPECT

The implementation was checked against the Lab 2 requirements and the program was independently compiled and executed.

Detailed AI interaction and verification are recorded in:

**`AGENT_LOG.md`**

---

## 10. AI Use and Verification

OpenCode was used as an AI learning and development assistant.

The AI was used to help plan the algorithm, explain the concepts, develop the Java implementation, and inspect the completed project.

The implementation was independently verified by compiling and running:

```powershell
javac LibraryFinder.java
java LibraryFinder
```

The actual console results were compared with the expected results, and all eight test cases passed.

---

## 11. Viva Question

**Why does Linear Search work on unsorted data, and when should it be avoided?**

Linear Search works on unsorted data because it does not require the elements to be arranged in any particular order. It simply checks each element one by one until it finds the target or reaches the end.

It should be avoided when searching large datasets frequently, especially when the data can be sorted or when a faster search structure is available. Linear Search has `O(n)` worst-case time complexity, so it can become inefficient as the amount of data increases.
