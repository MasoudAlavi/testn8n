# Calculator API

Simple Spring Boot calculator service.

Run:
```bash
mvn spring-boot:run
```

APIs:

GET /api/calculator/add?a=10&b=5
GET /api/calculator/subtract?a=10&b=5
GET /api/calculator/multiply?a=10&b=5
GET /api/calculator/divide?a=10&b=5
GET /api/calculator/power?a=2&b=3  # returns a raised to the power b

Notes:
- Parameters a and b are required numeric values.
- Validation and proper error responses are provided (HTTP 400 for invalid input).
