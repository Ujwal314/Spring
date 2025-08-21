package org.example.controller;

import org.example.dao.DbConnect;
import org.example.dao.StudentDAO;
import org.example.dao.StudentInterface;
import org.example.dto.StudentDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        try{
//            Connection connection = DbConnect.getConnection();
//            System.out.println("Connection successful.");
            StudentInterface studentObj1 = new StudentDAO();
//This is example of IoC
//            ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
//            StudentInterface studentObj1 = (StudentInterface) context.getBean("studentObj1");

//Java Container
//            ApplicationContext context = new AnnotationConfigApplicationContext(JavaContainer.class);
//            StudentInterface studentObj1 = (StudentInterface) context.getBean(StudentDAO.class);
//            System.out.println(studentObj1.AddStudent(new StudentDTO("3002", "Guddu", "Bhayya", "2019-10-12")));


//            List<StudentDTO> listOfStudents = studentObj.GetAllStudents();
//            listOfStudents.forEach(System.out::println);

            System.out.println(studentObj1.DeleteStudent(new StudentDTO("3001","","","")));
            System.out.println(studentObj1.DeleteStudent(new StudentDTO("3002","","","")));


        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
