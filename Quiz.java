import java.util.Scanner;
public class Quiz {
    // Create an array to store questions and answers
    String[][] quizData = {
            {"What is the yoruba word for a young person?", "Omode"},
            {"Ọjọ́ Ìbí is synonymous to?", "Birthday"},
            {"What is the direct translation of 'question' in Yoruba language?", "Ibeere"},
            {"Ife means what in English language?", "Love"},
            {"How do you greet people during a festival in Yoruba language?", "E ku odun"},
            {"What do you say when you find someone busy at work?", "E kuse"},
            {"What is the meaning of 'Ìdílé' in English ", "Family"},
            {"'Ọjọ́ Ìbí' happens only once in a year for everyone. True or false?", "True"},
            {"What is the meaning of 'appearance' in Yoruba?", "Irisi"},
            {"'Ìsẹ́lẹ̀' means what in English?", "Event"},
            {"Translate the following sentence to English...'Mo ń rìn lọ sí ilé ẹ̀kọ́' ", "I am walking to school"},
            {"'Mo fẹ́ sọ ọrọ̀'", "I want to talk."}
    };





    // Initialize a Scanner for user input
    Scanner scanner = new Scanner(System.in);
    // Initialize a variable to store the user's score
    int score = 0;
    public void quizFunction() {
        for (int i = 0; i < quizData.length; i++) {
            // Display the question
            System.out.println(quizData[i][0]);
            // Get the user's answer
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            // Check if the user's answer is correct
            if (userAnswer.equalsIgnoreCase(quizData[i][1])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + quizData[i][1] + "\n");
            }
        }
        // Display the final score
        System.out.println("Quiz completed! Your score: " + score + "/" + quizData.length);
    }
}


 
