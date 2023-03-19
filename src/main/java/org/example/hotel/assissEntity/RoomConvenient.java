
package org.example.hotel.assissEntity;
        import lombok.Getter;
        import lombok.Setter;
        import lombok.ToString;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "roomConvenient")
public class RoomConvenient{

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
