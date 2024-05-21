package fitness.decorator;

public class CardioTraining extends TrainingProgramDecorator {
    public CardioTraining(TrainingProgram program) {
        super(program);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cardio Training";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15.0;
    }
}