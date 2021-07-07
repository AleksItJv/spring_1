package impl.car;

import interfaces.Car;
import interfaces.Engine;

public class BMW implements Car {

    private Long Id;
    private String color;
    private Integer year;
    private Integer version;
    private Engine engine;

    public BMW() {
    }

    public BMW(Long id, String color, Integer year, Integer version, Engine engine) {
        Id = id;
        this.color = color;
        this.year = year;
        this.version = version;
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName());

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "Id=" + Id +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", version=" + version +
                ", engine=" + engine +
                '}';
    }
}
