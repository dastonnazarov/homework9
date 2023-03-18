package org.example.hotel.dtoEntity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "comfort")
public class Comfort {

    private String basses;
    private String sauna;
    private String karaoke;
    private String smallBar;
    private String airConditioner;
    private String tv;




}
