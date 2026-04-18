# 🚀 Student Management System (CRUD)

A simple full-stack web application built using **Node.js, Express, and MySQL** that performs basic CRUD (Create, Read, Update, Delete) operations.

---

## 📌 Overview

This project demonstrates how to build a complete CRUD application with:

* Backend: Node.js + Express
* Database: MySQL
* Frontend: EJS Templates

It allows users to manage student records efficiently.

---

## 🎯 Features

* ➕ Add new student
* 📖 View all students
* ✏️ Update student details
* ❌ Delete student

---

## 🛠️ Tech Stack

* Node.js
* Express.js
* MySQL
* MySQL Workbench
* EJS (Templating Engine)

---

## ⚙️ Installation & Setup

### 1. Clone Repository

```bash
git clone https://github.com/Okashanadeem/SMIU-Prep-Sessions-By-Okasha-Nadeem/
cd student-crud-node
```

### 2. Install Dependencies

```bash
npm install
```

### 3. Setup Database

Open MySQL Workbench and run:

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    age INT
);
```

---

### 4. Configure Database Connection

Edit `db.js`:

```js
const db = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "YOUR_PASSWORD",
  database: "student_db"
});
```

---

### 5. Run Application

```bash
node app.js
```

Open in browser:

```
http://localhost:3000
```

---

## 📂 Project Structure

```
student-crud-node/
│
├── app.js
├── db.js
├── package.json
│
├── views/
│   ├── index.ejs
│   ├── create.ejs
│   └── edit.ejs
```

---

## ⚠️ Common Issues

### ❌ Access Denied Error

* Ensure correct MySQL password in `db.js`

### ❌ MySQL Not Connecting

* Make sure MySQL server is running
* Check port (3306 or 3307)

---

## 🚀 Future Improvements

* Add Bootstrap UI
* Add input validation
* Implement authentication (login system)
* Convert to REST API + React frontend

---

## 📚 Learning Outcomes

* Understanding CRUD operations
* Connecting Node.js with MySQL
* Building a full-stack web application
* Handling routes and database queries

---

## 🙌 Acknowledgment

This project was created as part of a learning exercise to understand full-stack development fundamentals.

---

## 📌 Author

**Okasha Nadeem**

* GitHub: https://github.com/Okashanadeem
* LinkedIn: https://www.linkedin.com/in/okasha-nadeem/

---

## 📄 License

This project is for educational purposes only.
