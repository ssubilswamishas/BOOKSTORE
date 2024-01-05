1. Retrieve all books with filters for searching
Endpoint: GET /api/books
Example: http://localhost:8080/api/books
2. Add a new book to the inventory
Endpoint: POST /api/books
Example: http://localhost:8080/api/books
Request Body: JSON representation of the book
3. Retrieve details for a specific book by ISBN
Endpoint: GET /api/books/{isbn}
Example: http://localhost:8080/api/books/{isbn}
4. Update details of a book by ISBN
Endpoint: PUT /api/books/{isbn}
Example: http://localhost:8080/api/books/{isbn}
Request Body: JSON representation of the updated book
5. Remove a book from the inventory by ISBN
Endpoint: DELETE /api/books/{isbn}
Example: http://localhost:8080/api/books/{isbn}
6. Submit a review for a book
Endpoint: POST /api/books/{isbn}/reviews
Example: http://localhost:8080/api/books/{isbn}/reviews
Request Body: Text of the review
7. Retrieve details for a specific author
Endpoint: GET /api/authors/{authorId}
Example: http://localhost:8080/api/authors/{authorId}