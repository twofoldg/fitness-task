package fitness.strategy;

public class WeightLossStrategy implements TrainingPlanStrategy {
    @Override
    public void execute() {
        System.out.println("Executing weight loss training plan");
    }
}