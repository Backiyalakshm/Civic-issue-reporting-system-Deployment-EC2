# 🏛️ Civic Governance System

## 🌟 Overview

The Civic Governance System is a full-stack smart city platform designed to improve communication between citizens and local government authorities.

The system enables citizens to report civic issues, monitor public assets, track complaint resolutions, provide feedback, and access public dashboards. Government officers and administrators can efficiently manage complaints, monitor assets, and improve public service delivery.

---

## 🚀 Key Features

### 🔐 User Authentication & Authorization
- Secure Registration & Login
- JWT-based Authentication
- Role-Based Access Control (RBAC)
- BCrypt Password Encryption

### 📝 Complaint Management
- Submit civic complaints
- Track complaint status
- View complaint history
- Complaint assignment to officers
- Complaint resolution workflow

### 🏗️ Public Asset Monitoring
- Monitor public infrastructure assets
- Asset maintenance tracking
- Asset status management
- Maintenance history records

### 👨‍💼 Officer Management
- Assign complaints to officers
- Track officer performance
- Manage civic operations efficiently

### 📊 Analytics Dashboard
- Real-time civic statistics
- Complaint analytics
- Asset monitoring reports
- Public governance insights

### ⭐ Citizen Feedback System
- Submit service feedback
- Rate complaint resolutions
- Improve public service quality

### 📱 Responsive User Interface
- Mobile-friendly design
- Tablet compatibility
- Desktop support
- Modern user experience

### 🌐 Public Dashboard
- Publicly accessible statistics
- Transparency in governance
- Real-time civic information

### 🐳 Dockerized Deployment
- Containerized backend
- Containerized frontend
- Docker Compose support
- Easy deployment and scaling

---

## 👥 User Roles

### 🧑 Citizen
- Register and login
- Submit complaints
- Track complaint progress
- Submit feedback

### 👮 Officer
- View assigned complaints
- Update complaint status
- Manage issue resolutions

### 👨‍💻 Administrator
- Full system access
- Manage users
- Manage assets
- Monitor system analytics

---

## 🏗️ System Architecture

```text
┌─────────────────────────┐
│     React Frontend      │
└──────────┬──────────────┘
           │ REST APIs
           ▼
┌─────────────────────────┐
│ Spring Boot Backend API │
└──────────┬──────────────┘
           │
           ▼
┌─────────────────────────┐
│     MySQL Database      │
└─────────────────────────┘
```

---

## 🛠️ Technology Stack

### 🎨 Frontend
- ⚛️ React.js
- ⚡ Vite
- 🎨 Tailwind CSS
- 🌐 React Router DOM
- 📊 Chart.js
- 🔗 Axios

### ⚙️ Backend
- ☕ Java 17
- 🍃 Spring Boot
- 🔒 Spring Security
- 🎫 JWT Authentication
- 📦 Maven

### 🗄️ Database
- 🐬 MySQL

### 🚀 DevOps
- 🐳 Docker
- 📦 Docker Compose
- 🌿 Git
- 🐙 GitHub

---

## 📂 Project Structure

```text
Civic-Governance-System/
│
├── backend/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── entity/
│   ├── dto/
│   ├── security/
│   └── config/
│
├── frontend/
│   ├── components/
│   ├── pages/
│   ├── services/
│   ├── utils/
│   └── assets/
│
├── docker-compose.yml
└── README.md
```

---

## 📌 Core Modules

| 🚀 Module | 📖 Description |
|------------|---------------|
| 🔐 Authentication | Secure login & registration |
| 📝 Complaint Management | Report and track civic issues |
| 🏗️ Asset Monitoring | Public asset management |
| 👮 Officer Management | Complaint assignment |
| 📊 Analytics Dashboard | Civic insights and reports |
| ⭐ Feedback System | Citizen satisfaction tracking |
| 🌐 Public Dashboard | Public transparency portal |
| 🐳 Docker Deployment | Containerized infrastructure |

---

## 🚀 Getting Started

### 📋 Prerequisites

- Java 17+
- Maven 3.6+
- Node.js 16+
- MySQL 8+
- Docker (Optional)

---

## ⚙️ Backend Setup

### Clone Repository

```bash
git clone https://github.com/your-username/civic-governance-system.git
```

### Navigate to Backend

```bash
cd backend
```

### Configure Database

Create database:

```sql
CREATE DATABASE civic_system;
```

Update:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/civic_system
spring.datasource.username=root
spring.datasource.password=your_password
```

### Run Backend

```bash
mvn clean install
mvn spring-boot:run
```

Backend URL:

```text
http://localhost:8080
```

---

## 🎨 Frontend Setup

### Navigate to Frontend

```bash
cd frontend
```

### Install Dependencies

```bash
npm install
```

### Run Application

```bash
npm run dev
```

Frontend URL:

```text
http://localhost:5173
```

---

## 🐳 Docker Deployment

### Start Entire Application

```bash
docker-compose up -d
```

### Stop Containers

```bash
docker-compose down
```

### View Running Containers

```bash
docker ps
```

---

## 🔗 Important API Endpoints

### 🔐 Authentication

```http
POST /api/auth/register
POST /api/auth/login
```

### 📝 Complaints

```http
GET    /api/complaints/all
POST   /api/complaints/create
PUT    /api/complaints/{id}/status
GET    /api/complaints/{id}
```

### 🏗️ Assets

```http
GET    /api/assets/all
POST   /api/assets/create
PUT    /api/assets/{id}/status
```

### ⭐ Feedback

```http
POST   /api/feedback/submit
GET    /api/feedback/all
```

### 📊 Public Dashboard

```http
GET /api/public/dashboard
```

---

## 📸 Screenshots

### 🏠 Dashboard
![Dashboard](screenshots/dashboard.png)

### 📝 Complaint Management
![Complaints](screenshots/complaints.png)

### 🏗️ Asset Monitoring
![Assets](screenshots/assets.png)

### 📊 Analytics Dashboard
![Analytics](screenshots/analytics.png)

---

## 🎯 Learning Outcomes

This project helped me gain practical experience in:

- ☕ Java Development
- 🍃 Spring Boot Framework
- 🔒 Spring Security
- 🎫 JWT Authentication
- ⚛️ React Development
- 🎨 Tailwind CSS
- 🗄️ MySQL Database Design
- 🌐 REST API Development
- 🐳 Docker Containerization
- 🚀 Full Stack Deployment
- 🌿 Git & GitHub Collaboration

---

## 🌟 Future Enhancements

- 🔔 Real-Time Notifications
- 📍 GIS Map Integration
- 🤖 AI-Based Issue Prioritization
- 📱 Mobile Application
- 📧 Email Notifications
- 📈 Advanced Analytics
- 🌍 Multi-Language Support

---

## 👩‍💻 Author

### Backiyalakshmi M

💻 Java Full Stack Developer  
☕ Spring Boot Developer  
⚛️ React Developer  
🐳 Docker Enthusiast  
🚀 Passionate Software Engineer

---

## ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.

---

## 📜 License

This project is developed for educational, academic, and portfolio purposes.

---

### 🏛️ "Empowering Citizens. Improving Governance. Building Smarter Communities."
