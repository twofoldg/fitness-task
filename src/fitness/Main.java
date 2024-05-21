package fitness;

import fitness.decorator.BasicTrainingProgram;
import fitness.decorator.CardioTraining;
import fitness.decorator.StrengthTraining;
import fitness.decorator.TrainingProgram;
import fitness.observer.Trainee;
import fitness.singleton.Gym;
import fitness.strategy.MuscleBuildingStrategy;
import fitness.strategy.TrainingPlanStrategy;
import fitness.strategy.WeightLossStrategy;

public class Main {
    public static void main(String[] args) {
        // Singleton instance of Gym
        Gym gym = Gym.getInstance();

        // Observer pattern setup
        Trainee traineeOne = new Trainee("Vasko");
        Trainee traineeTwo = new Trainee("Jabata");
        gym.addTrainee(traineeOne);
        gym.addTrainee(traineeTwo);

        // Strategy pattern setup
        TrainingPlanStrategy weightLoss = new WeightLossStrategy();
        TrainingPlanStrategy muscleBuilding = new MuscleBuildingStrategy();

        // Choosing a training plan
        weightLoss.execute();
        gym.setTrainingPlan("Weight Loss");

        // Decorator pattern setup
        TrainingProgram basicProgram = new BasicTrainingProgram();
        TrainingProgram cardioProgram = new CardioTraining(basicProgram);

        // Formatted console output for clarity and presentation
        System.out.println("------------------------------------------");
        System.out.println("Vasko's Training Program: " + cardioProgram.getDescription());
        System.out.println("Total Price: $" + cardioProgram.getPrice());
        System.out.println("------------------------------------------");

        // Change plan and notify trainees
        muscleBuilding.execute();
        gym.setTrainingPlan("Muscle Building");
        TrainingProgram fullProgram = new StrengthTraining(cardioProgram);

        System.out.println("------------------------------------------");
        System.out.println("Jabata's Training Program: " + fullProgram.getDescription());
        System.out.println("Total Price: $" + fullProgram.getPrice());
        System.out.println("------------------------------------------");
    }
}
