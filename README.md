# ScreensaverPreventer
Here's a clean and professional `README.md` file for your `ScreensaverPreventer` Java program:

---

# 🖱️ ScreensaverPreventer

A simple Java utility that prevents your system from going idle or triggering the screensaver by slightly moving the mouse cursor at regular intervals.

## ✅ Features

* Moves the mouse cursor by a single pixel every 5 seconds.
* Automatically moves it back to its original position after a short delay.
* Runs in the background using a daemon thread.
* Lightweight and minimal — no GUI or external dependencies.

## 🧾 How It Works

The program uses the `java.awt.Robot` class to simulate mouse movement. Every 5 seconds, it:

1. Retrieves the current mouse position.
2. Moves the mouse by 1 pixel in both X and Y directions.
3. Waits 100ms.
4. Returns the mouse to its original position.

This slight movement is enough to prevent:

* Screensavers from activating
* The system from being marked as "idle"

## 🛠️ Requirements

* **Java 8** or higher
* Works on **Windows**, **macOS**, and **Linux** (with GUI access)

## 🚀 Usage

### 1. Compile

```bash
javac ScreensaverPreventer.java
```

### 2. Run

```bash
java ScreensaverPreventer
```

The application runs in the background. To stop it, use:

* `Ctrl + C` in terminal, or
* Stop the process from your task manager

## 📁 Code Structure

```java
private static final int INTERVAL_MS = 5000; // Interval between mouse movements
private static final int MOVE_DISTANCE = 1;  // Distance to move mouse

Robot robot = new Robot();
Timer timer = new Timer(true); // Daemon thread
```

* `Robot` is responsible for moving the mouse.
* `Timer` schedules the periodic task to keep the system active.

## ⚠️ Notes

* This tool does not simulate keyboard activity or prevent locking due to security policies.
* Running on some Linux distros might require access to the X server (GUI session).
* Silent error handling is used to avoid interrupting the background process.

## 🧹 To-Do (Optional Enhancements)

* Add tray icon to enable/disable from system tray
* Configurable interval and movement via CLI args or config file
* Cross-platform packaging with JavaFX or jpackage

## 📝 License

This project is open source and free to use. No warranty is provided. Use responsibly.

---

Let me know if you want a version that includes command-line arguments or a way to run it as a service!

