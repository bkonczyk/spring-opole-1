package pl.sda.start.vehicle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Vehicle {

    @Id
    private Long id;
    private String make;
    private Integer year;
}
