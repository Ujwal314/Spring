package org.example.hibernate;

import org.example.dao.StudentInterface;
import org.example.dto.StudentDTO;

import org.example.ent.StudentEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDAOH {

    Configuration configuration = null;
    Session session = null;

    public StudentDAOH() {
        configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        session = configuration.buildSessionFactory().openSession();
    }

    public String AddStudent(StudentDTO studentDTO) throws Exception {
        return "";
    }

    public String DeleteStudent(StudentDTO studentDTO) throws Exception {
        return "";
    }

    public List<StudentEntity> GetAllStudents() throws Exception {
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from StudentEntity");
        List<StudentEntity> listOfStudents = (List<StudentEntity>) query.list();
        transaction.commit();
        return listOfStudents;
    }
}
