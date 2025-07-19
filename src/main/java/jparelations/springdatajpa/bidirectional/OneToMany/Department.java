package jparelations.springdatajpa.bidirectional.OneToMany;


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
@Entity(name = "bi-Deparment-one_to-many")
@Table(name = "bi-Deparment-one_to-many")
public class Deparment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToMany(mappedBy = "deparment")
    private List<Employee> employees;
}
