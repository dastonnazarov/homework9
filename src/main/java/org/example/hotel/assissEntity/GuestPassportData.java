package org.example.hotel.assissEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "guestPassportData")
public class GuestPassportData {

    @Column(name = "guest_id")
    private Integer guest_id;

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
