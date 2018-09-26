## Rest Login Controller
### Components:
- Spring boot
- JPA
- H2 in memory database

### Notes
The structure of the code is rather simple. Upon initialisation, an event listener populates the H2 in memory database with 5 users. Each user is described by a simple data class with an id, username and password.
Credentials are received and unwrapped using 2 extension functions.
After comparison, an HTTPStatus object is returned.

### Useage
The application runs on port 8080. 

* Visiting "(url):8080/login.html" will provide an example front-end login form. Loging in will alter the title to either 200 or 401 depending on the response.
* Alternatively, create a POST request with two body form fields (with content type application/x-www-form-urlencoded), first being the username and second being the password.  The request must target the /login endpoint, and will respond with either 200 if the credentials were accepted, or 401 in any other case.
