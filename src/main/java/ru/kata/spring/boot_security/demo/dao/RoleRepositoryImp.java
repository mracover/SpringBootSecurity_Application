package ru.kata.spring.boot_security.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleRepositoryImp implements RoleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("select a from Role a", Role.class).getResultList();
    }

    @Override
    public List<Role> findByIdRoles(List<Long> id) {
        return entityManager.createQuery("select a from Role a where a.id in :id", Role.class)
                .setParameter("id", id).getResultList();
    }
}
