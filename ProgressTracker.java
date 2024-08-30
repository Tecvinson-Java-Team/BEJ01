import java.util.HashSet;
import java.util.Set;
public class ProgressTracker {
    private static Set<Integer> learntWords;
    private int userScore;
    private Set<Integer> answeredQuestions;
    public ProgressTracker() {
        learntWords = new HashSet<>();
        userScore = 0;
        answeredQuestions = new HashSet<>();
    }
    public void updateScore(boolean isCorrect) {
        if (isCorrect) {
            userScore++;
        }
    }
    // Mark a word as learnt
    public void markWordLearnt(int vocabularyIndex) {
        learntWords.add(vocabularyIndex);
    }
    // Mark a question as answered
    public void markQuestionAnswered(int questionIndex) {
        answeredQuestions.add(questionIndex);
    }
    public boolean isWordLearnt(int vocabularyIndex) {
        return learntWords.contains(vocabularyIndex);
    }
    public boolean isQuestionAnswered(int questionIndex) {
        return answeredQuestions.contains(questionIndex);
    }
    public int getTotalLearntWords() {
        return learntWords.size();
    }
    public int getUserScore() {
        return userScore;
    }
    // Get the total number of answered questions
    public int getTotalAnsweredQuestions() {
        return answeredQuestions.size();
    }


}