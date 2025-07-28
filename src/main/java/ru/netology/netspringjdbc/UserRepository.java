package ru.netology.netspringjdbc;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public List<String> getProductName(String name) {
        return em
                .createQuery("select o.productName from Orders o where o.customers.name =: name")
                .setParameter("name", name)
                .getResultList();
    }

//    private final JdbcTemplate jdbcTemplate;
//    private final String sql = read("request.sql");

//    public UserRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    private static String read(String scriptFileName) {
//        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
//             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
//            return bufferedReader.lines().collect(Collectors.joining("\n"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public List<String> getProductName(String name) {
//        return jdbcTemplate.query(
//                sql,
//                new Object[]{name},
//                (rs, rowNum) -> rs.getString("product_name")
//        );
//    }
}
