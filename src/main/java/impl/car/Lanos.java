package impl.car;

import interfaces.Car;

public class Lanos implements Car {

    private Long Id;
    private String color;
    private Integer year;
    private Integer version;

    Lanos() {
    }

    public Lanos(Long id, String color, Integer year, Integer version) {
        Id = id;
        this.color = color;
        this.year = year;
        this.version = version;
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName());
    }

}
