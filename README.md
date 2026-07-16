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

API Examples

Below are example requests for the basic arithmetic APIs. Replace 127.0.0.1:8080 with your server/port if different.

- Add API

  Request:
  ```bash
  curl "http://127.0.0.1:8080/api/calculator/add?a=10&b=5"
  ```
  Example response (200 OK):
  ```json
  {
    "result": 15
  }
  ```

- Subtract API

  Request:
  ```bash
  curl "http://127.0.0.1:8080/api/calculator/subtract?a=10&b=5"
  ```
  Example response (200 OK):
  ```json
  {
    "result": 5
  }
  ```

- Multiply API

  Request:
  ```bash
  curl "http://127.0.0.1:8080/api/calculator/multiply?a=10&b=5"
  ```
  Example response (200 OK):
  ```json
  {
    "result": 50
  }
  ```

- Divide API

  Request:
  ```bash
  curl "http://127.0.0.1:8080/api/calculator/divide?a=10&b=5"
  ```
  Example response (200 OK):
  ```json
  {
    "result": 2
  }
  ```

Notes:
- Parameters a and b are required numeric values.
- Validation and proper error responses are provided (HTTP 400 for invalid input).
