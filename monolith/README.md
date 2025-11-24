
# Complete Monolith Documentation + Architecture + Instructions

## 📘 Overview
This monolith implements **Customer**, **Product**, and **Order** domains using Spring Boot 3, JPA, and H2.
It is cleanly structured so each domain can easily be extracted into a microservice.

---

# 🏗️ Architecture

```
+---------------------------+
|        Shop Monolith      |
+---------------------------+
|  Customer Module          |
|  Product Module           |
|  Order Module             |
+---------------------------+
        | uses JPA
        v
+---------------------------+
|        H2 Database        |
+---------------------------+
```

Modules communicate via service calls internally and share one DB (H2).  
When migrated to microservices, each becomes its own service + DB.

---

# 🛠️ Run the Monolith

```
cd monolith
mvn clean package
java -jar target/shop-monolith-0.0.1-SNAPSHOT.jar
```

Runs on **http://localhost:8080**

---

# 🔥 Test Endpoints

### Create Customer
```
POST /customers
{"name":"Alice","email":"alice@example.com"}
```

### Create Product
```
POST /products
{"name":"Laptop","price":1499}
```

### Create Order
```
POST /orders
{"customerId":1,"productId":1,"quantity":2}
```

---

# 📦 Migration Path to Microservices

1. Move each domain folder into its own Spring Boot starter project.  
2. Give each service its own **database**.  
3. Replace internal calls with **REST** or **Kafka events**.  
4. Add API Gateway in front (Spring Cloud Gateway).  
5. Deploy via Docker/Kubernetes.

---
