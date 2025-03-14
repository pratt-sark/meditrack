# 🏥 MediTrack - Healthcare Management System   

MediTrack is a **Spring Boot-based Healthcare Management System** that allows users to manage patient records efficiently.  
It provides **CRUD (Create, Read, Update, Delete) functionalities** for handling patient data.  

---

## **Technologies Used**  
- **Java 23**  
- **Spring Boot 3.2.5**  
- **Spring Data JPA** (for database interaction)  
- **H2 Database** (for development, can be switched to MySQL)  
- **Maven** (build tool)  

---

### **Access H2 Database Console (If Using H2)**  
```
http://localhost:8080/h2-console
```
- **JDBC URL:** `jdbc:h2:mem:meditrackdb`  
- **Username:** `pratyay`  
- **Password:** *1234567*  

---

## **📌 Available API Endpoints**
### **1️⃣ Patient Management**
| HTTP Method | Endpoint | Description |
|------------|-----------|-------------------------|
| `GET` | `/patients` | Get all patients |
| `POST` | `/patients` | Add a new patient |
| `GET` | `/patients/{id}` | Get a patient by ID |
| `PUT` | `/patients/{id}` | Update a patient by ID |
| `DELETE` | `/patients/{id}` | Delete a patient by ID |

### **2️⃣ Example JSON for POST/PUT Requests**  
```json
{
  "name": "John Doe",
  "disease": "Flu",
  "age": 30
}

```

### **3️⃣ Restart the application:**  
```sh
Ctrl + C
mvn spring-boot:run

```
