# Session 1 (Part 1): Introduction to GitHub for C Programming

## 1. Introduction

### What is Git?

Git is a **version control system** that helps you track changes in your code over time. Think of it as a "save point" system for your projects, where you can:
- Save different versions of your code
- Go back to previous versions if something breaks
- Keep a history of all changes you make

### What is GitHub?

GitHub is a **website** where you can store your Git projects online. It's like a cloud storage service specifically designed for code. When you upload your code to GitHub:
- Your code is safely backed up online
- You can access it from any computer
- You can share it with others (if you want to)
- You have a portfolio of your programming projects

### Why Do Programmers Use GitHub?

Programmers use GitHub for several important reasons:
- **Backup**: Your code is safe even if your computer crashes
- **Portfolio**: Shows what projects you've worked on
- **Version History**: You can see how your project evolved over time
- **Accessibility**: Access your code from any computer with internet
- **Learning**: You can look at other people's code to learn

### Difference Between Git and GitHub

| Git | GitHub |
|-----|--------|
| A program installed on your computer | A website (github.com) |
| Works offline on your local machine | Works online over the internet |
| Tracks changes in your code | Stores your Git projects in the cloud |
| Created in 2005 by Linus Torvalds | Created in 2008 as a hosting service |

**Simple analogy**: Git is like Microsoft Word (the program), and GitHub is like Google Drive (where you store your documents online).

---

## 2. Installing Git on Windows

### Step 1: Download Git

1. Open your web browser
2. Go to **https://git-scm.com**
3. Click on the **Download** button
4. The download for Windows should start automatically

### Step 2: Run the Installer

1. Find the downloaded file (usually in your Downloads folder)
2. Double-click the file to run the installer
3. When Windows asks "Do you want to allow this app to make changes?", click **Yes**

### Step 3: Installation Settings

During installation, you'll see many options. **Use all the default settings** by clicking **Next** through all the screens. The default settings work perfectly for beginners.

### Step 4: Verify Installation

After installation is complete:

1. Open **Command Prompt** (search for "cmd" in Windows search)
2. Type the following command and press Enter:

```bash
git --version
```

3. You should see something like: `git version 2.43.0`

If you see a version number, Git is successfully installed!

### Step 5: One-Time Configuration

You need to tell Git who you are. In Command Prompt, type these two commands (replace with your actual name and email):

```bash
git config --global user.name "Your Name"
git config --global user.email "youremail@example.com"
```

**Example**:
```bash
git config --global user.name "Ali Ahmed"
git config --global user.email "ali.ahmed@example.com"
```

You only need to do this **once** after installing Git.

---

## 3. Creating a GitHub Account

### Step 1: Sign Up

1. Go to **https://github.com**
2. Click on **Sign up** in the top-right corner
3. Enter your email address and click **Continue**
4. Create a strong password and click **Continue**
5. Choose a username (this will be visible to everyone)
6. Complete the verification puzzle
7. Click **Create account**

### Step 2: Verify Your Email

1. GitHub will send you an email
2. Open your email inbox
3. Find the email from GitHub
4. Click on the verification link
5. Your account is now verified!

### Step 3: Log In

1. Go to **https://github.com**
2. Click **Sign in**
3. Enter your username/email and password

---

## 4. Creating a GitHub Repository

### What is a Repository?

A **repository** (or "repo") is like a project folder on GitHub. It contains all your code files and tracks their history.

### Step 1: Create New Repository

1. After logging into GitHub, click the **+** icon in the top-right corner
2. Select **New repository**

### Step 2: Set Up Your Repository

Fill in the following information:

- **Repository name**: Choose a meaningful name (example: `my-first-c-project`)
- **Description** (optional): A short description of your project
- **Visibility**: Select **Public** (anyone can see it, good for portfolios)
- **Important**: Do NOT check "Add a README file"
- **Important**: Do NOT add .gitignore or license yet

### Step 3: Create Repository

1. Click the green **Create repository** button
2. You'll see a page with instructions (we'll use these later)
3. Keep this page open, we'll need it in a few steps

---

## 5. Creating a Local Project

### Step 1: Create a Project Folder

1. Open **File Explorer**
2. Go to a location where you want to keep your projects (example: `C:\Users\YourName\Documents`)
3. Right-click and select **New > Folder**
4. Name it `my-first-c-project` (or whatever you named your GitHub repository)

### Step 2: Open Command Prompt in Your Folder

1. Open the folder you just created
2. Click on the **address bar** at the top (where it shows the folder path)
3. Type `cmd` and press **Enter**
4. Command Prompt will open in your project folder

### Step 3: Initialize Git

In the Command Prompt, type:

```bash
git init
```

This command creates a hidden `.git` folder that will track all your changes. You should see a message like:
```
Initialized empty Git repository in C:/Users/YourName/Documents/my-first-c-project/.git/
```

### Step 4: Create a Simple C File

Let's create a basic C program:

1. Open **Notepad**
2. Type the following code:

```c
#include <stdio.h>

int main() {
    printf("Hello, GitHub!\n");
    return 0;
}
```

3. Click **File > Save As**
4. Navigate to your project folder
5. Change "Save as type" to **All Files**
6. Name the file: `main.c`
7. Click **Save**

---

## 6. Connecting Local Project to GitHub

Now we need to connect your local folder to your GitHub repository.

### Step 1: Get Your Repository URL

1. Go back to your GitHub repository page (in your web browser)
2. Look for the **HTTPS** URL (it looks like: `https://github.com/yourusername/my-first-c-project.git`)
3. Click the copy button next to it

### Step 2: Add Remote Origin

In Command Prompt (in your project folder), type:

```bash
git remote add origin https://github.com/yourusername/my-first-c-project.git
```

Replace the URL with your actual repository URL.

**What does this do?** This tells Git that your online GitHub repository is the "origin" (the main place) where you'll store your code.

### Step 3: Verify Remote Connection

To check if the connection worked, type:

```bash
git remote -v
```

You should see your repository URL listed twice (for fetch and push).

---

## 7. Adding, Committing, and Pushing Code

Now let's upload your code to GitHub! There are four important commands you need to learn.

### Step 1: Check Status

```bash
git status
```

**What it does**: Shows you which files have changed and which are ready to be saved.

You should see `main.c` listed in red as an "untracked file".

### Step 2: Add Files

```bash
git add .
```

**What it does**: Prepares all your files to be saved. The dot (`.`) means "add all files in this folder".

After running this command, if you run `git status` again, you'll see `main.c` in green, meaning it's ready to be committed.

### Step 3: Commit Changes

```bash
git commit -m "Add main.c file"
```

**What it does**: Saves a snapshot of your code with a message describing what you changed. The message goes inside the quotes.

Think of a commit as clicking "Save" in a document, but with a note about what you changed.

### Step 4: Push to GitHub

```bash
git push -u origin main
```

**What it does**: Uploads your committed code to GitHub.

**Note**: The first time you push, you might be asked to log in to GitHub. A browser window might open, or you'll enter your credentials in the terminal.

After pushing, refresh your GitHub repository page in your browser. You should see your `main.c` file there!

### Summary of Commands

```bash
git status          # Check what files have changed
git add .          # Prepare all files to be saved
git commit -m "Your message here"   # Save with a description
git push           # Upload to GitHub
```

---

## 8. Cloning an Existing Repository

### What is Cloning?

**Cloning** means downloading an entire repository from GitHub to your computer. It's different from `git init`.

### When to Use Clone vs Init

- Use `git init`: When starting a **new** project on your computer
- Use `git clone`: When downloading an **existing** project from GitHub

### How to Clone

If you want to download a repository (for example, from another computer or to start fresh):

```bash
git clone https://github.com/yourusername/repository-name.git
```

This will:
1. Create a new folder with the repository name
2. Download all the files
3. Automatically connect to the GitHub repository

**Example scenario**: You're at a different computer and want to continue working on your project. Instead of creating everything from scratch, you just clone it.

---

## 9. Daily GitHub Workflow (Solo)

Here's the simple workflow you should follow **every time** you work on your project:

### Starting Your Work Session

1. Open Command Prompt in your project folder
2. Make sure you have the latest code (not needed for solo work unless you work on multiple computers)

### While You're Working

1. Write your code in your C files
2. Test your code to make sure it works
3. When you've completed a meaningful change (fixed a bug, added a feature), it's time to save

### Saving Your Work

After making changes, follow these steps:

```bash
git status                              # See what changed
git add .                              # Add all changes
git commit -m "Describe what you did"  # Save with message
```

**Example commit messages**:
- `"Add addition function"`
- `"Fix bug in loop"`
- `"Complete exercise 3"`

### Ending Your Work Session

Before you close your computer:

```bash
git push
```

This uploads all your commits to GitHub, backing up your work.

### Complete Daily Workflow

```bash
# While working:
# (write code, test code)

git status
git add .
git commit -m "Meaningful message about what you changed"

# Repeat the above as needed

# At the end of your session:
git push
```

---

## 10. Common Beginner Mistakes

### Mistake 1: Forgetting to Add Files

**Problem**: Running `git commit` without running `git add` first.

**Result**: Nothing gets committed because you didn't prepare the files.

**Solution**: Always run `git add .` before `git commit`.

### Mistake 2: Poor Commit Messages

**Bad examples**:
- `"update"`
- `"changes"`
- `"asdf"`
- `"commit"`

**Good examples**:
- `"Add function to calculate average"`
- `"Fix division by zero error"`
- `"Complete homework assignment 2"`

**Why it matters**: Later, when you look at your history, you want to understand what you did.

### Mistake 3: Not Pushing Code

**Problem**: Committing changes but forgetting to push them to GitHub.

**Result**: Your code is only saved on your local computer, not backed up online.

**Solution**: Always run `git push` at the end of your work session.

### Mistake 4: Editing Code Directly on GitHub

**Problem**: Making changes to your code by editing files directly on the GitHub website.

**Result**: Your local files and GitHub files become out of sync, causing confusion.

**Solution**: Always edit your code on your computer, then push the changes.

### Mistake 5: Unclear Repository Names

**Problem**: Naming repositories `"project1"`, `"test"`, or `"code"`.

**Better names**: `"calculator-program"`, `"student-grade-tracker"`, `"c-programming-homework"`

---

## 11. Best Practices

### Write Clear Commit Messages

Your commit messages should answer: "What did this commit do?"

**Template**: Start with a verb in present tense:
- `"Add [feature]"`
- `"Fix [bug]"`
- `"Update [component]"`
- `"Remove [unused code]"`

### Commit Frequently

Don't wait until the end of the day to commit. Commit whenever you:
- Complete a small task
- Fix a bug
- Add a new function
- Finish an exercise

**Think of it like this**: It's better to have 10 small commits than 1 large commit at the end of the day.

### Push at the End of Each Session

Always push your code before:
- Closing your laptop
- Going home
- Switching to a different task

This ensures your work is backed up online.

### Keep Your Repository Organized

As you add more files:
- Use clear, descriptive file names
- Keep related files together
- Delete files you no longer need (then commit the deletion)

### Test Before You Commit

Before committing:
1. Compile your code
2. Run your program
3. Make sure it works correctly

Don't commit broken code if you can avoid it!

---

## Conclusion

Congratulations! You now know the basics of using GitHub to manage your C programming projects. You've learned:

- What Git and GitHub are and why they're important
- How to install Git on Windows
- How to create a GitHub repository
- How to connect your local code to GitHub
- The essential Git commands: `status`, `add`, `commit`, and `push`
- A simple daily workflow for managing your code

Remember, the key to mastering GitHub is **practice**. Use these commands every time you work on your programming assignments, and they'll quickly become second nature.

### Key Commands to Remember

```bash
git status                    # Check what changed
git add .                    # Prepare files
git commit -m "message"      # Save with description
git push                     # Upload to GitHub
```

---

