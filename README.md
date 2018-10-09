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
* **don't commit any locan changes** from [application.yml](https://github.com/bobocode-labs/gojohnny-rest-api/blob/master/src/main/resources/application.yml)
* if you are running project for first time (using empty database), you should **chage flyway configuration**:
```
  flyway:
    baseline-on-migrate: true
```
