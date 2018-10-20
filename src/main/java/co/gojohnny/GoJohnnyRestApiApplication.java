package co.gojohnny;

import org.hibernate.Session;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.sql.Statement;

@SpringBootApplication
public class GoJohnnyRestApiApplication implements InitializingBean {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        SpringApplication.run(GoJohnnyRestApiApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.unwrap(Session.class).doWork(connection -> {
            Statement geoDbExtension = connection.createStatement();
            geoDbExtension.execute("CREATE ALIAS InitGeoDB for \"geodb.GeoDB.InitGeoDB\";\n" +
                    "CALL InitGeoDB();");
        });
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
