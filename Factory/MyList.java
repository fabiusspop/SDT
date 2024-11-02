package L01.Factory;

public interface MyList {
    void add(int value);
    int get(int index);

    enum ListType {
      Array, LinkedList, SyncList
    }

    static MyList getList(ListType type)
    {
    switch (type) {
        case Array: return new MyArrayList();
        case LinkedList: return new MyLinkedList();
        case SyncList: return new MySynchronizedList();
        default: throw new IllegalArgumentException("Type not good, try again.");
    }
    }

    public static void main(String[] args){

        MyList arrayList = MyList.getList(MyList.ListType.Array);
        arrayList.add(1);
        System.out.println(arrayList.get(0));

    }

    
}
