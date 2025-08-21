package org.example.dao;

import org.example.dto.StudentDTO;

import java.util.List;

public interface StudentInterface extends deleteStudentInterface,
        addStudentInterface,
        listStudentsInterface {}

interface deleteStudentInterface {
    public String DeleteStudent(StudentDTO studentDTO) throws Exception;
}
interface addStudentInterface {
    public String AddStudent(StudentDTO studentDTO) throws Exception;
}
interface listStudentsInterface {
    public List<StudentDTO> GetAllStudents() throws Exception;
}