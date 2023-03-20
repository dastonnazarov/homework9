
package org.example.hotel.assissEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.hotel.dtoEntity.Room;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "roomConvenient")
public class RoomConvenient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private Room room;

    @Column(name = "basses")
    private String basses;

    @Column(name = "sauna")
    private String sauna;

    @Column(name = "karaoke")
    private String karaoke;

    @Column(name = "smallBar")
    private String smallBar;

    @Column(name = "airConditioner")
    private String airConditioner;

    @Column(name = "tv")
    private String tv;


}
