import java.util.Arrays;
import java.util.Objects;

public class Procesor {
    public void process(int i, int e){
        System.out.println("Process 2 intigera, " + i + e);
    }
       public void process(int[] ints){
            System.out.println("DOdaj integer list" + Arrays.toString(ints));

    }
    public void process(Objects[] obj){
        System.out.println("Dodaj integer listu " + Arrays.toString(obj));
    }
}
