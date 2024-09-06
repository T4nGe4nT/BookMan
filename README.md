# BookMan
Made for CTAC

# Book API Instructions

This guide explains how to interact with the Book API using Postman.

## 1. Get All Books (GET Request)
- **Method**: `GET`
- **URL**: `http://localhost:8080/api/books`

### Steps:
1. Open Postman and create a new `GET` request.
2. Enter the URL: `http://localhost:8080/api/books`.
3. Click **Send**.
4. The API will return a list of all books in JSON format.

## 2. Add a New Book (POST Request)
- **Method**: `POST`
- **URL**: `http://localhost:8080/api/books`
- **Body Type**: `JSON`

### Body Example:
```json
{
  "title": "New Book",
  "author": "Jane Doe",
  "publicationYear": 2023,
  "price": 19.99
}
