package sample.Repository;

import org.hibernate.Session;
import sample.Data.Database;
import sample.Models.Product;

public class HibernateProductRepository {

    public boolean create(Product product) {
        Session session = Database.SESSION.openSession();

        session.beginTransaction();

        boolean result = session.save(product) != null;

        session.getTransaction().commit();

        session.close();

        return result;
    }
}
