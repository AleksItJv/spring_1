package impl.engine;


import interfaces.Engine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V8 implements Engine {

    private int cylinder;

    public V8() {
    }

    public V8(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "V8{" +
                "cylinder=" + cylinder +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Working V8");
    }
}
