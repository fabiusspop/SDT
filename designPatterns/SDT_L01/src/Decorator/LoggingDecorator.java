package Decorator;

import Factory.MyList;

public class LoggingDecorator implements MyList {
    private final MyList decoratedList;

    public LoggingDecorator(MyList decoratedList) {
        this.decoratedList = decoratedList;
    }

    @Override
    public void add(int value){
    System.out.println("Value " + value + " was successfully added.");
    decoratedList.add(value);
    }

    @Override
    public int get(int index)
    {
    return decoratedList.get(index);
    }

    public static void main(String[] args)
    {
        LoggingDecorator loggedList = new LoggingDecorator(MyList.getList(ListType.Array));
        loggedList.add(5);
    }
}
