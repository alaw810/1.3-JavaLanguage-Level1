## 📄 Description – Exercise Statement

This Java exercise consists of building a console-based quiz game focused on matching countries with their capitals.

- You are given a text file (`countries.txt`) that contains lines with country–capital pairs, separated by a space.
- The program reads this file and stores the data in a `HashMap<String, String>`.
- The user is asked to enter their name to begin the quiz.
- The game randomly selects **10 countries** from the map and asks the user to enter the capital of each one.
- Each correct answer earns **1 point**.
- After answering all 10 questions, the program:
    - Displays the user's final score.
    - Appends the user's name and score to a file called `leaderboard.txt`.

This exercise focuses on:
- File reading and writing
- Collections
- Random selection
- Basic user input with `Scanner`
- Control flow and logic for interactive CLI applications

---

## 💻 Technologies Used

- Java 21
- IntelliJ IDEA (or any Java IDE)
- Git & GitHub (optional, for version control)

---

## 📋 Requirements

- Java SDK 21 or higher
- An IDE like IntelliJ IDEA or Eclipse
- Git installed (optional)

---

## 🛠️ Installation

1. Clone the repository (if available):

   ```bash
   git clone https://github.com/alaw810/1.3-JavaLanguage-Level1.git

2. Open the project in IntelliJ IDEA:

   File → Open → Select the project folder

3. Set the correct Java SDK:

   File → Project Structure → SDKs → Java 21+

---

## ▶️ Execution

1. Run the `Main` class from `ex3` package.

2. The console will prompt:

   - A welcome message

   - A request for the user's name

   - 10 country–capital questions

3. After the quiz, your name and score will be added to `leaderboard.txt`


--- 

## 🌐 Deployment
This is a Java console-based educational exercise and doesn't require production deployment.
If desired, you can compile and run it manually:

    javac *.java
    java Main

Or export it as a `.jar` file using IntelliJ IDEA.

---

## 🤝 Contributions
This is a learning exercise intended for individual academic practice.
However, pull requests with enhancements or improvements are welcome!

1. Fork the repo

2. Create a new branch (`git checkout -b feature/your-feature`)

3. Commit and push your changes

4. Open a Pull Request