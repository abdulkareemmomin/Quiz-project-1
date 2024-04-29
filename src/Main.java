public class Main {
    public static void main(String[] args) {

//        System.out.println("hello");

        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();

    }
}