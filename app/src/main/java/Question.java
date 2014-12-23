import java.util.ArrayList;

/**
 * Created by Kaiman on 12/22/14.
 */
public class Question {
    Question(String question, String option1, String option2,
                String option3, String option4, String answer, String category) {
        _qString = question;
        _op1 = option1;
        _op2 = option2;
        _op3 = option3;
        _op4 = option4;
        _ans = answer;
        _category = category;
    }
    public String getQString() {
        return _qString;
    }
    public String getCategory() {
        return _category;
    }
    public boolean isCorrectAnswer(String chosenAnswer) {
        return chosenAnswer.equals(_ans);
    }



    /** The core data Structure for the Question Object. */
    private ArrayList<String> _question;

    /** Represents the actual question. */
    private String _qString;
    /** Represents the first multiple choice answer.*/
    private String _op1;
    /** Represents the second multiple choice answer.*/
    private String _op2;
    /** Represents the third multiple choice answer.*/
    private String _op3;
    /** Represents the fourth multiple choice answer.*/
    private String _op4;
    /** Represents the answer. */
    private String _ans;
    /** Represents the category that the question belongs to. */
    private String _category;
}
