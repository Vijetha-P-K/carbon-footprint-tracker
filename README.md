# 🌱 Carbon Footprint Tracker

A full-stack web application to calculate, track, and reduce users’ carbon footprint through surveys, goals, gamification, and an eco-marketplace.

---

## 📌 Project Overview

The Carbon Footprint Tracker helps users:

- Measure daily carbon emissions  
- Track historical carbon data  
- Set reduction goals  
- Earn badges  
- View leaderboard rankings  
- Contribute to eco-friendly initiatives (marketplace)

This project is built as part of an academic full-stack development milestone.

---

## 🧩 Features Implemented

- ✅ User Management  
  - User Registration  
  - User Login (JWT based)

- ✅ Carbon Survey  
  - Transport mode  
  - Diet type  
  - Energy usage  
  - Frequency tracking

- ✅ Carbon History  
  - Daily carbon logs  
  - View historical emissions per user

- ✅ Goal Management  
  - Set carbon reduction goals  
  - Track progress percentage  
  - Auto status update (IN_PROGRESS / COMPLETED)

- ✅ Gamification  
  - Badges for milestones  
  - Leaderboard based on badge count

- ✅ Eco Marketplace  
  - Create eco-friendly items  
  - Perform transactions  
  - Track user contributions

- ✅ Single Page Dashboard  
  - All features integrated in one HTML dashboard  
  - API-based interaction with backend

---

## 🛠️ Tech Stack

**Backend**
- Java  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- JWT Authentication

**Frontend**
- HTML  
- CSS  
- JavaScript (Fetch API)

**Tools**
- Spring Tool Suite (STS)  
- VS Code  
- Postman  
- MySQL Workbench  
- GitHub

---

## 📂 Project Structure

```
carbon-footprint-tracker/
│
├── carbon-backend/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── entity/
│   ├── security/
│   └── CarbonBackendApplication.java
│
├── carbon-frontend/
│   └── dashboard.html
│
└── README.md
```

---

## ▶️ How to Run the Project

### Backend
- Open `carbon-backend` in STS  
- Configure MySQL database  
- Run `CarbonBackendApplication.java`  
- Server runs on http://localhost:8080

### Frontend
- Open `dashboard.html` in browser  
- Ensure backend is running  
- Use dashboard to interact with APIs

---

## 🔗 API Examples

- POST /api/users/register  
- POST /api/users/login  
- POST /api/survey/{userId}  
- GET /api/carbon/history/{userId}  
- POST /api/goals  
- GET /api/leaderboard  
- POST /api/marketplace  
- POST /api/transactions

---

## 📊 Project Status

- ✔ All milestones completed  
- ✔ Backend fully functional  
- ✔ Frontend dashboard integrated  
- ✔ Public GitHub repository

---

## 🎓 Academic Declaration

This project is developed for educational purposes as part of coursework and learning milestones.

---

## 👤 Author

Vijetha P K
