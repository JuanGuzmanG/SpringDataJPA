package jparelations.springdatajpa.unidirectional.OneToMany;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "uni-Deparment-one_to-many")
@Table(name = "uni-Deparment-one_to-many")
public class Deparment {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long Id;

    @OneToMany
    @JoinColumn(name = "deparment_id")
    private List<Employee> employees;
}
