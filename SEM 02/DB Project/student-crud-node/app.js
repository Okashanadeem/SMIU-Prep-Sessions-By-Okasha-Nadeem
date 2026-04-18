const express = require("express");
const bodyParser = require("body-parser");
const db = require("./db");

const app = express();

app.set("view engine", "ejs");
app.use(bodyParser.urlencoded({ extended: true }));

// READ
app.get("/", (req, res) => {
  db.query("SELECT * FROM students", (err, result) => {
    res.render("index", { students: result });
  });
});

// CREATE FORM
app.get("/create", (req, res) => {
  res.render("create");
});

// INSERT
app.post("/create", (req, res) => {
  const { name, email, age } = req.body;
  db.query(
    "INSERT INTO students (name, email, age) VALUES (?, ?, ?)",
    [name, email, age],
    () => res.redirect("/")
  );
});

// EDIT FORM
app.get("/edit/:id", (req, res) => {
  db.query("SELECT * FROM students WHERE id = ?", [req.params.id], (err, result) => {
    res.render("edit", { student: result[0] });
  });
});

// UPDATE
app.post("/update/:id", (req, res) => {
  const { name, email, age } = req.body;
  db.query(
    "UPDATE students SET name=?, email=?, age=? WHERE id=?",
    [name, email, age, req.params.id],
    () => res.redirect("/")
  );
});

// DELETE
app.get("/delete/:id", (req, res) => {
  db.query("DELETE FROM students WHERE id=?", [req.params.id], () => {
    res.redirect("/");
  });
});

app.listen(3000, () => {
  console.log("Server running on http://localhost:3000");
});