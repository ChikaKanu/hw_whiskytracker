package com.codeclan.example.whiskytracker.repository.DistilleryRepository;

import com.codeclan.example.whiskytracker.models.Distillery;
import com.codeclan.example.whiskytracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Whisky> findWhiskiesFromParticularDistilleryOfSpecificAge(String name, int age) {
        List<Whisky> result = null;
        try {
            Session session = entityManager.unwrap(Session.class);
            Criteria cr = session.createCriteria(Distillery.class);
            cr.createAlias("distillery", "distilleryAlias");
            cr.createAlias("whisky", "whiskyAlias");
            cr.add(Restrictions.eq("distilleryAlias.name", name));
            cr.add(Restrictions.eq("whiskyAlias.age", age));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return result;
        }
    }
}
