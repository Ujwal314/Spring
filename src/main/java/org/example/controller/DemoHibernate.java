package org.example.controller;

import org.example.dao.StudentDAO;
import org.example.dao.StudentInterface;
import org.example.ent.StudentEntity;
import org.example.hibernate.StudentDAOH;

import java.util.ArrayList;
import java.util.*;

public class DemoHibernate {
    public static void main(String[] args) {
        try{
            System.out.println("Hibernate");
            StudentDAOH studentObject1 = new StudentDAOH();
            List< StudentEntity > studentEntityList = studentObject1.GetAllStudents();
            studentEntityList.forEach(System.out::println);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
