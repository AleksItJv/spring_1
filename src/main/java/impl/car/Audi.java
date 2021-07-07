package impl.car;

import interfaces.Audiosystem;
import interfaces.Car;
import interfaces.Engine;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Audi implements Car {

    @Value("1001")
    private Long Id;
    @Value("unknown")
    private String color;
    @Value("2012")
    private Integer year;
    @Value("1")
    private Integer version;
    private Engine engine;
    private Audiosystem audiosystem;

    public Audi() {
    }

    public Audi(Integer year, Integer version, Engine engine) {
        this.year = year;
        this.version = version;
        this.engine = engine;
    }

    public Audi(Engine engine, Audiosystem audiosystem) {
        this.engine = engine;
        this.audiosystem = audiosystem;
    }

    public Audi(Long id, String color, Integer year, Integer version, Engine engine) {
        Id = id;
        this.color = color;
        this.year = year;
        this.version = version;
        this.engine = engine;

    }

    @Override
    public void move() {
        System.out.println("Mark: " + this.getClass().getName());

    }

    public String initDefaultAudi() {
        if (getId() == null) {
            setId(101L);
        }
        if (getColor() == null) {
            setColor("unknown");
        }
        return "Audi init method";
    }

    @Override
    public String toString() {
        return "Audi{" +
                "Id=" + Id +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", version=" + version +
                ", engine=" + engine +
                ", audiosystem=" + audiosystem +
                '}';
    }
}
