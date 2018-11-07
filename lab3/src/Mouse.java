import java.util.LinkedList;

public class Mouse {
    String assignedFood; // Things like "Celery", or "Tofu", or "Bird feed"
    double gramsPerMeal; // how many grams of the assigned food the mouse should eat per meal
    int numOfTreadmillWorkouts; // how many treatmill workouts the mouse should do per day
    double lengthOfWorkouts; // how many minutes each treadmill workout should last
    LinkedList<WeightExperiment> weightExperiments; // a list of weight experiments
}
