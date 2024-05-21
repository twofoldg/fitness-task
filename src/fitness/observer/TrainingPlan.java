package fitness.observer;

import java.util.ArrayList;
import java.util.List;

public class TrainingPlan implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private String plan;

    public void setPlan(String plan) {
        this.plan = plan;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("New training plan: " + plan);
        }
    }
}
