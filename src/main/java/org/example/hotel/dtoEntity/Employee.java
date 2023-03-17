package org.example.hotel.dtoEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.hotel.enums.EmployeeStatus;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @Column(name = "status")
    private EmployeeStatus status;

}
