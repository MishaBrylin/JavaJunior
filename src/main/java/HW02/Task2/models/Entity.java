package HW02.Task2.models;


import HW02.Task2.Column;

import java.util.UUID;

@HW02.Task2.Entity
public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;

}
