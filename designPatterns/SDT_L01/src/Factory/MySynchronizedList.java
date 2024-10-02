package Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySynchronizedList implements MyList{

public List<Integer> list = Collections.synchronizedList(new ArrayList<>());

@Override
public synchronized void add(int value){
list.add(value);
}

@Override
public synchronized int get(int index){
return list.get(index);
}

}
