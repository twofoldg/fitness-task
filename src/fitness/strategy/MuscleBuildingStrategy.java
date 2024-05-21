package fitness.strategy;

public class MuscleBuildingStrategy implements TrainingPlanStrategy {
    @Override
    public void execute() {
        System.out.println("Executing muscle building training plan");
    }
}