import java.util.HashMap;
import java.util.Scanner;
public class StartPage{

    static Quiz quiz = new Quiz();

    private static HashMap<String, String> userInfo = new HashMap<>();
    private static HashMap<String, String> studentInfo = new HashMap<>();
    private  static  Scanner scanner = new Scanner(System.in);
    public static void login() {


        Learning learning = new Learning();
        ProgressTracker tracker = new ProgressTracker();


       User user = new User();
        System.out.print("Enter username: ");
        user.setUsername(scanner.nextLine());
        System.out.print("Enter password: ");
        user.setPassword(scanner.nextLine());
        while (true) {
             if (userInfo.containsKey(user.getUsername()) && userInfo.get(user.getUsername()).equals(user.getPassword())) {
                System.out.println("Login successful!");

                while (true) {
                    System.out.println("1. Take Lessons");
                    System.out.println("2. Quiz");
                    System.out.println("3. Track progress");
                    System.out.println("4. Exit");

                    int choice2 = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice2) {
                        case 1:

                            System.out.println("Alufabeti ede yoruba(Alphabets in Yoruba language) : A B D E Ẹ F G GB H I J K L M N O Ọ P R S Ṣ T U W Y\n" +
                                    " \n" +
                                    "Fawẹli ede yoruba(Vowels in yorba language): A, E, Ẹ́, Í, O, Ọ, U\n" +
                                    " \n" +
                                    "Konsonanti ede yoruba( Consonants in yoruba language): B, D, F, G, GB, H, J, K, L, M, N, P, R, S, Ṣ, T, W, Y");
                            System.out.println("Press enter to continue to the lesson");
                            scanner.nextLine();
                            for (int i = 0; i < learning.getTotalVocabularyList(); i++) {;
                                Vocabulary vocabulary = learning.getVocabulary(i);
                                System.out.println(vocabulary.getYorubaWord());
                                System.out.println(vocabulary.getEnglishMeaning());
                                System.out.println(vocabulary.getYorubaSentence());
                                System.out.println(vocabulary.getEnglishSentence());

                                tracker.markWordLearnt(i);
                                System.out.println("Press enter to continue to the next word");
                                scanner.nextLine();
                            }
                            System.out.println("Lesson 1 completed");
                            System.out.println("do you want to continue to the next lesson? (Y/N)");
                            String y = scanner.nextLine();

                            if (y.toLowerCase().contains("y")) {
                                for (int i = 0; i < learning.getTotalVocabularyList2(); i++) {
                                    ;
                                    Vocabulary vocabulary = learning.getVocabulary2(i);
                                    System.out.println(vocabulary.getYorubaWord());
                                    System.out.println(vocabulary.getEnglishMeaning());
                                    System.out.println(vocabulary.getYorubaSentence());
                                    System.out.println(vocabulary.getEnglishSentence());

                                    tracker.markWordLearnt(i);
                                    System.out.println("Press enter to continue to the next word");
                                    scanner.nextLine();
                                }
                            }
                            else break;



                            System.out.println("Learning completed");
                            break;
                        case 2:
                            quiz.quizFunction();

                            break;
                        case 3:
                            System.out.println("Progress report on your child's performance");
                            System.out.println("Total number of Yoruba words learnt: " + tracker.getTotalLearntWords());
                            System.out.println("Score for quiz taken: " + quiz.score);

                            break;

                        case 4:
                            return;
                    }
                }



            }
            else {
                System.out.println("Invalid username or password. Please enter details again");
                login();
            }
        }

    }
    public static void createAccount() {
        User user = new User();
        System.out.print("Enter new username: ");
        user.setUsername(scanner.nextLine());

        if (userInfo.containsKey(user.getUsername())) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }
        System.out.print("Enter new password: ");
        user.setPassword(scanner.nextLine());

        userInfo.put(user.getUsername(), user.getPassword());
        registerStudent();
        System.out.println("Account successfully created!");

    }

    public static void registerStudent() {
        User user = new User();
        System.out.println("Enter firstname and lastname: ");
        user.setName(scanner.nextLine());
        System.out.println("Guardian email");
        user.setEmail(scanner.nextLine());
        studentInfo.put(user.getName(), user.getEmail());

    }
    public static String userInfoToFileFormat() {
        StringBuilder sb = new StringBuilder();
        for (String username : userInfo.keySet()) {
            sb.append(username).append(":").append(userInfo.get(username)).append("\n");
        }
        return sb.toString();
    }

    // Method to return studentInfo in a formatted string
    public static String studentInfoToFileFormat() {
        StringBuilder sb = new StringBuilder();
        for (String name : studentInfo.keySet()) {
            sb.append(name).append(":").append(studentInfo.get(name)).append("\n");
        }
        return sb.toString();
    }

    // Method to read userInfo from a formatted string
    public static void userInfoFromFileFormat(String data) {
        String[] lines = data.split("\n");
        for (String line : lines) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                userInfo.put(parts[0], parts[1]);
            }
        }
    }

    // Method to read studentInfo from a formatted string
    public static void studentInfoFromFileFormat(String data) {
        String[] lines = data.split("\n");
        for (String line : lines) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                studentInfo.put(parts[0], parts[1]);
            }
        }
    }
}




