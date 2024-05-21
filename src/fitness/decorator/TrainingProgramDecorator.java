package fitness.decorator;

public abstract class TrainingProgramDecorator implements TrainingProgram {
    protected TrainingProgram decoratedProgram;

    protected TrainingProgramDecorator(TrainingProgram program) {
        this.decoratedProgram = program;
    }

    @Override
    public String getDescription() {
        return decoratedProgram.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedProgram.getPrice();
    }
}
