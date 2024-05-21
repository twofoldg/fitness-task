package fitness.singleton;

import fitness.observer.Trainee;
import fitness.observer.TrainingPlan;

import java.util.ArrayList;
import java.util.List;

//The gym class is used to manage trainees and training plans.
public class Gym {
    private static Gym instance;
    private final TrainingPlan trainingPlan;
    private final List<Trainee> trainees;

    private Gym() {
        this.trainingPlan = new TrainingPlan();
        this.trainees = new ArrayList<>();
    }

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        return instance;
    }

    public void addTrainee(Trainee trainee) {
        trainees.add(trainee);
        trainingPlan.registerObserver(trainee);
    }

    public void removeTrainee(Trainee trainee) {
        trainees.remove(trainee);
        trainingPlan.removeObserver(trainee);
    }

    public void setTrainingPlan(String plan) {
        trainingPlan.setPlan(plan);
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }
}
