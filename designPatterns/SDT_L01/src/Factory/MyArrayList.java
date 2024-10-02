package Factory;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList implements MyList{

    private List<Integer> list = new ArrayList<>();

    @Override
    public void add(int value)
    {
    list.add(value);
    }

    @Override
    public int get(int index)
    {
    return list.get(index);
    }
}
