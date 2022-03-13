package gt.edu.umg.progra3.parcial1;

import java.lang.reflect.Array;
import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {

        this.values = values;
    }

    public List<T> ordenar(){
        Collections.sort(values,null);
        return values;
    }

    public List<T> ordenarInversa(){
        Collections.sort(values,Collections.reverseOrder());
        return values;
    }

}
