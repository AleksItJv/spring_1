package impl.engine;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V4 {

    private int cylinder;

    public V4() {
    }

    public V4(int cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "V4{" +
                "cylinder=" + cylinder +
                '}';
    }
}
