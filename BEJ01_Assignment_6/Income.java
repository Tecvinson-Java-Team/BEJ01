import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Income {
    private String month;
    private String category;
    private double amount;

    // Default constructor
    public Income() { }

    // Constructor with parameters
    public Income(String month, String category, double amount) {
        this.month = month;
        this.category = category;
        this.amount = amount;
    }

    // Getters
    public String getMonth() {
        return month;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}
