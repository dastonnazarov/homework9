package org.example.hotel.assissEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.hotel.dtoEntity.Guest;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "guestPassportData")
public class GuestPassportData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private Guest guest;

    @Column(name = "pNumber")
    private String pNumber;

    @Column(name = "dateOfIssue")
    private String dateOfIssue;

    @Column(name = "dateOfExpiry")
    private String dateOfExpiry;

    @Column(name = "givenByWhom")
    private String givenByWhom;

    @Column(name = "givenByWhere")
    private String givenByWhere;




}
