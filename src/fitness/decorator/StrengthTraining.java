package fitness.decorator;

public class StrengthTraining extends TrainingProgramDecorator {
    public StrengthTraining(TrainingProgram program) {
        super(program);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Strength Training";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 25.0;
    }
}