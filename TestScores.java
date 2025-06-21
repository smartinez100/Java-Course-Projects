import java.util.InputMismatchException;

public class TestScores {
    int[] scores;
    int sum = 0;
    double average;
    public TestScores(int[] scores_) {
        try{
            for (int score : scores_) {
                if(!(score >= 0) || !(score <= 100)) {
                    throw new IllegalArgumentException("Score must be between 0 and 100.");
                }
            }
            this.scores = scores_;
            this.average = averageScore(this.scores);
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage()); 
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        
    }
    public double averageScore(int[] scores) {
        for(int num  : scores){
            sum += num;
        }
        return (double) sum / scores.length;
    }
    public double getAverage() {
        return average;
    }
}
