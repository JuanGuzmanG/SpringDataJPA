package jparelations.springdatajpa.unidirectional.OneToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni-Employee-one_to_one")
@Table(name = "uni-Employee-one_to_one")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(targetEntity = ParkingSpot.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "parking_spot_id")
    private ParkingSpot parkingSpot;
}
