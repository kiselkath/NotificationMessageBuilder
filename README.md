# 📝 Assignment: **📢 Notification Message Builder**

## 🧩 Problem Background

You're building a backend feature for a **notification service** — the system responsible for generating dynamic messages like:

* Email alerts
* SMS notifications
* Push messages

These messages often include:

* The recipient's name
* A timestamp
* The action that triggered the message (e.g., payment, login)
* Dynamic status updates

These messages need to be constructed **efficiently** (since the system sends thousands per second) and **safely** if accessed across threads.

> ✨ This is a real-world situation where `StringBuilder` and `StringBuffer` shine!

---

## 🧠 Algorithmic Thinking Prompt

> Before you code, ask yourself:

* Are we creating and modifying strings many times? (Yes!)
* Will the message be accessed from multiple threads? (Maybe — let’s use both `StringBuilder` and `StringBuffer` to explore the difference.)
* What’s faster: String concatenation or mutable buffers?

Answer: Building messages using `StringBuilder` is much more performant in single-threaded systems, and `StringBuffer` is safer in concurrent ones.

---

## 🎯 Tasks

You'll implement two methods:

1. `buildNotificationSingleThreaded(...)` → using `StringBuilder`
2. `buildNotificationThreadSafe(...)` → using `StringBuffer`

---

## 🛠️ Tasks To Do : Use the [Starter Code](https://github.com/FW-Zalando-Java-Backend-Engineer/Notification-Message-Builder/blob/main/NotificationBuilder.java)

You're going to write two methods to build user notifications using:
- `StringBuilder` (for performance)
- `StringBuffer` (for thread safety)

Each method should return a formatted notification string with the recipient's name, the event, and a timestamp.

---

### ✅ Task 1: `buildNotificationSingleThreaded(String recipient, String event)`

Use `StringBuilder` to create a fast, non-thread-safe notification message.

**Steps:**
1. **Create a `StringBuilder` instance.**  
   Use `new StringBuilder()` to start building your message.

2. **Append the greeting.**  
   Add `"Hi <recipient>, "` to the message using `.append()`.

3. **Append the event info.**  
   Add something like `"your <event> was successful. "`.

4. **Generate a timestamp.**  
   Use `LocalDateTime.now()` and format it using `DateTimeFormatter`.

5. **Append the timestamp.**  
   Add `"Timestamp: <datetime>. "` to the message.

6. **Return the result.**  
   Use `.toString()` to convert the builder into a `String`.

---

### ✅ Task 2: `buildNotificationThreadSafe(String recipient, String event)`

Use `StringBuffer` to create a thread-safe notification message.

**Steps:**
1. **Create a `StringBuffer` instance.**  
   Use `new StringBuffer()` to begin safely building the message.

2. **Append the greeting.**  
   Add `"Hello <recipient>, "` to the buffer.

3. **Append the event statement.**  
   Add `"this is to inform you that your <event> has been completed. "`.

4. **Create a timestamp string.**  
   Use Java time API again with a more human-readable format like `"EEE MMM dd yyyy HH:mm:ss"`.

5. **Append the timestamp.**  
   Add `"Generated at: <timestamp>. "` to the buffer.

6. **Return the result.**  
   Call `.toString()` to return the full message.

---

🧪 **Bonus Tip for Review**
- Compare the structure and performance of both methods.
- Discuss where each should be used: `StringBuilder` in single-threaded tasks, `StringBuffer` in multi-threaded environments.

---

## 🧪 Sample Output

```text
Hi Sarah, your login was successful. Timestamp: 2025-05-13 16:15:43.
Hello Alex, this is to inform you that your payment has been completed. Generated at: Tue May 13 2025 16:16:03.
```

---

## ✅ What Students Practice

| Concept                       | What You Practice              |
| ----------------------------- | ------------------------------ |
| `StringBuilder.append()`      | Efficient string construction  |
| `StringBuffer.append()`       | Thread-safe message building   |
| `LocalDateTime` & `Formatter` | Realistic dynamic content      |
| Returnable message patterns   | Used in email, SMS, logs, etc. |

---

## 📚 Student Instructions

1. Implement both methods.
2. Try running both from a `main()` method with different values.
3. Write the JUnit Test calsses.

---
# 📢 Построитель Уведомлений (Notification Message Builder)

## 🧩 Контекст задачи

Ты разрабатываешь серверный функционал для **системы уведомлений**, которая генерирует динамические сообщения, такие как:

- Уведомления по электронной почте
- SMS-сообщения
- Push-уведомления

Эти сообщения обычно содержат:

- Имя получателя
- Метку времени
- Событие, которое вызвало уведомление (например: `платёж`, `вход в систему`)
- Текущий статус

Так как система отправляет **тысячи уведомлений в секунду**, сообщения должны создаваться **эффективно** и **безопасно при многопоточном доступе**.

> ✨ Это реальный случай, где `StringBuilder` и `StringBuffer` проявляют свою эффективность!

---

## 🎯 Цель

Реализовать два метода:

1. `buildNotificationSingleThreaded(String recipient, String event)`  
   → Использует `StringBuilder` для высокой производительности в **однопоточной среде**

2. `buildNotificationThreadSafe(String recipient, String event)`  
   → Использует `StringBuffer` для **безопасности в многопоточной среде**

---
