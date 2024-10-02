package Factory;

import java.util.LinkedList;
import java.util.List;

// andrei1danielescu@gmail.com
public class MyLinkedList implements MyList{

    private List<Integer>  list = new LinkedList<>();

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
