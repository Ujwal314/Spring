package org.example.ent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

//referring to the table
@Entity
@Table(name = "student")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    int studentid;
    @Column
    String fname;
    String lname;
    Date dob;
}
