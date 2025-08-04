package notifyme.observable;

import notifyme.observer.StockObserver;

import java.util.List;

public interface StockObervable {

    public void add(int newUnits);

    public void notifyObservers();
}
