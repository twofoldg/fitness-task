package fitness.observer;

public class Trainee implements Observer {
    private final String name;

    public Trainee(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}
