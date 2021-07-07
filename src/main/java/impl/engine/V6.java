package impl.engine;

import interfaces.Engine;
import lombok.Data;

@Data
public class V6 implements Engine {

    private String model = "V6";

    public void work() {
        System.out.println("work engine");
    }

    @Override
    public String toString() {
        return "V6{" +
                "model='" + model + '\'' +
                '}';
    }
}
