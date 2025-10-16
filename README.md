# RestAssuredTest01 🚀

A sample **REST Assured** project for practicing API automation testing using **Java, Maven, and TestNG**.

---

## 🧩 Project Overview

This project demonstrates how to perform REST API automation testing using the **REST Assured** library in Java.  
It includes reusable utilities, payload handling, and test cases for validating API responses.

---

## 🗂️ Project Structure

```
RestAssuredTest01
│
├── src
│   ├── main
│   │   └── java
│   │       └── RestAssuredTest01.RestAssuredTest01
│   │           └── App.java                # Main application entry (if required)
│   │
│   └── test
│       └── java
│           ├── files
│           │   ├── payload.java            # Contains request body data
│           │   └── ReUsableMethods.java    # Common reusable methods
│           │
│           └── RestAssuredTest01.RestAssuredTest01
│               ├── Basics.java             # Basic REST Assured test cases
│               └── complexJsonParse.java   # JSON parsing and validation logic
│
├── pom.xml                                # Maven dependencies and build configuration
├── target                                 # Compiled classes and test reports
└── README.md                              # Project documentation
```

---

## ⚙️ Prerequisites

Make sure you have the following installed:

- **Java JDK 8 or later**
- **Maven 3.6+**
- **IDE**: Eclipse / IntelliJ IDEA / VS Code

---

## 🧱 Dependencies

All dependencies are managed through **Maven** in the `pom.xml`.  
Key libraries include:

- `Rest Assured`
- `TestNG`
- `JSON Path`
- `Hamcrest`
- `Jackson / Gson` (for JSON parsing)

---

## ▶️ How to Run the Tests

1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/RestAssuredTest01.git
   ```

2. Navigate to the project directory:
   ```bash
   cd RestAssuredTest01
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the TestNG tests:
   ```bash
   mvn test
   ```

---

## 📜 Example Test Flow

- **Basics.java** – Contains sample API requests using REST Assured methods (`GET`, `POST`, etc.)
- **complexJsonParse.java** – Demonstrates extracting and validating data from JSON responses.
- **payload.java** – Provides static methods to create payloads for API requests.
- **ReUsableMethods.java** – Contains helper methods like JSON extraction, request building, etc.

---

## 🧠 Learning Objectives

✔️ Understand REST Assured syntax  
✔️ Build modular test frameworks using Java  
✔️ Parse complex JSON responses  
✔️ Implement reusable test utilities  

---

## 📦 Future Enhancements

- Add test reporting with **Extent Reports** or **Allure**
- Add data-driven testing support
- Integrate CI/CD (Jenkins / GitHub Actions)

---

## 🤝 Contributing

Pull requests are welcome!  
For major changes, please open an issue first to discuss what you’d like to change.

---
