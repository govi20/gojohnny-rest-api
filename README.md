### Database
If you want to run this application and **connect it to the local database**, you need to **change configuration** in the [application.yml](https://github.com/bobocode-labs/gojohnny-rest-api/blob/master/src/main/resources/application.yml) file.
* change active profile to `dev`. See the following code snippet
```
spring:
  profiles:
    active: 'dev'
```
* check database properties for `dev` profile
```
spring:
  profiles: 'dev'
  datasource:
    url: 'jdbc:postgresql://localhost:5432/gojohnny_db'
    username: 'postgres'
    password: 'postgres'
```
* **don't commit any local changes** from [application.yml](https://github.com/bobocode-labs/gojohnny-rest-api/blob/master/src/main/resources/application.yml)
* if you are running project for first time (using empty database), you should **change flyway configuration**:
```
  flyway:
    baseline-on-migrate: true
```
* If you are creating flyway migration scripts, you should use next naming convention:
   `V{TICKET_NUMBER}_{SCRIPT_NUMBER}_DATE__Name_of_script.sql`
   
   **Pay attention to double underscores before name!**
   
   For example, we have ticket 25, and previous script number is 5, so we create:
   V25_6_2018.10.25__Make_something.sql