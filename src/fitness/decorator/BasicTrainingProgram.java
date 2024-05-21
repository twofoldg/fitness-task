package fitness.decorator;

public class BasicTrainingProgram implements TrainingProgram {
    @Override
    public String getDescription() {
        return "Basic Training Program";
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
}
