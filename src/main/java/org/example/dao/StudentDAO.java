package org.example.dao;

import org.example.dto.StudentDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements StudentInterface {

    @Override
    public String AddStudent(StudentDTO studentDTO) throws Exception {
        Connection connection = DbConnect.getConnection();
        PreparedStatement ps1 = connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?);");
        ps1.setString(1, studentDTO.getStudentid());
        ps1.setString(2, studentDTO.getFname());
        ps1.setString(3, studentDTO.getLname());
        ps1.setString(4, studentDTO.getDob());

        ps1.executeUpdate();//executeUpdate for dml

        return "Record Added Successfully";
    }

    @Override
    public List<StudentDTO> GetAllStudents() throws Exception {
        Connection connection = DbConnect.getConnection();
        PreparedStatement ps1 = connection.prepareStatement("SELECT * FROM STUDENT;");
        ResultSet rs1 = ps1.executeQuery();//for dql statement
        List<StudentDTO> listOfStudents = new ArrayList<>();
        while (rs1.next()){
            listOfStudents.add(new StudentDTO(rs1.getString(1),
                    rs1.getString(2),
                    rs1.getString(3),
                    rs1.getString(4)));
        }
        return listOfStudents;
    }

    @Override
    public String DeleteStudent(StudentDTO studentDTO) throws Exception {
        Connection connection = DbConnect.getConnection();
        PreparedStatement ps1 = connection.prepareStatement("DELETE FROM student WHERE studentid=?;");
        ps1.setString(1,studentDTO.getStudentid());
        ps1.executeUpdate();//dml command
        return "Student Deleted.";
    }
}
