package fitness.strategy;

public class EnduranceStrategy implements TrainingPlanStrategy {
    @Override
    public void execute() {
        System.out.println("Executing endurance training plan");
    }
}