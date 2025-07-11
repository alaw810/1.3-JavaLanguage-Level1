# 🧠 Java Collections Practice – Level 1

This project contains a series of beginner-to-intermediate Java exercises designed to practice working with **collections**, **iterators**, and **file I/O**, while following clean code and backend-friendly principles such as modularity, separation of concerns, and basic input/output handling.

Each exercise is structured in its own Java package (`ex1`, `ex2`, `ex3`) and builds upon core Java concepts related to backend development.

---

## 📦 Structure

```
📁 src/
└── 📁 ex1/       # ArrayList, HashSet, and iteration
└── 📁 ex2/       # ListIterator and reverse operations
└── 📁 ex3/       # HashMap, file reading/writing, user interaction
```

---

## 🧪 Exercises Overview

### ✅ Exercise 1 – `Month` Collection Manipulation
- Create a class `Month` and store 11 month names in an `ArrayList` (excluding August).
- Insert August in the correct position and print the list before and after.
- Convert the list into a `HashSet` and ensure no duplicates.
- Iterate over the collection using a `for` loop and an `Iterator`.

### ✅ Exercise 2 – Reverse List with `ListIterator`
- Create a `List<Integer>` with elements.
- Using a `ListIterator`, traverse it in reverse order and insert the elements into a second list.
- Print both lists to demonstrate order manipulation.

### ✅ Exercise 3 – Country–Capital Quiz Game
- Load country–capital pairs from a `countries.txt` file into a `HashMap`.
- Prompt the user for their name and launch a 10-question quiz selecting countries at random.
- For each question, check if the capital input is correct and keep score.
- Display the final score and save the result in `leaderboard.txt`.

---

## 💻 Technologies Used

- Java 21
- IntelliJ IDEA (or any Java IDE)
- Git & GitHub (for version control)

---

## 🛠️ How to Run

1. Clone or download the repository:

   ```bash
   git clone https://github.com/alaw810/1.3-JavaLanguage-Level1
   ```

2. Open the project in IntelliJ IDEA (or another IDE)

3. Ensure Java 21+ is selected as SDK

4. Navigate to each exercise's `Main` class and run it individually

---

## 🧠 Learning Objectives

* Use of common Java collections (`ArrayList`, `HashSet`, `HashMap`, `List`)
* Understanding of `Iterator` and `ListIterator` behavior
* Basic file I/O with `BufferedReader` and `BufferedWriter`
* User input via `Scanner`
* Collection manipulation (insertion, iteration, order)
* Good coding practices for backend logic separation and readability

---

## 🤝 Contributions

This is a personal learning project, but you're welcome to contribute!

1. Fork the repo
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit and push your changes
4. Open a Pull Request
