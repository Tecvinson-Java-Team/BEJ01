import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class HouseholdManager {
    @JsonProperty("monthlyData")
    private Map<String, MonthlyManager> monthlyData;

    // Default constructor
    public HouseholdManager() {
        this.monthlyData = new HashMap<>();
    }

    // Method to get MonthlyManager for a specific month
    public MonthlyManager getMonthlyManager(String month) {
        return monthlyData.get(month);
    }

    // Method to add household data for a specific month
    public void addHousehold(String month, MonthlyManager monthlyManager) {
        this.monthlyData.put(month, monthlyManager);
    }

    // Method to modify income for a specific month
    public void modifyIncome(String month, String category, double amount) {
        MonthlyManager manager = monthlyData.get(month);
        if (manager != null) {
            manager.modifyIncome(category, amount);
        }
    }

    // Method to modify expense for a specific month
    public void modifyExpense(String month, String category, double amount) {
        MonthlyManager manager = monthlyData.get(month);
        if (manager != null) {
            manager.modifyExpense(category, amount);
        }
    }

    // Method to delete income for a specific month
    public void deleteIncome(String month, String category) {
        MonthlyManager manager = monthlyData.get(month);
        if (manager != null) {
            manager.deleteIncome(category);
        }
    }

    // Method to delete expense for a specific month
    public void deleteExpense(String month, String category) {
        MonthlyManager manager = monthlyData.get(month);
        if (manager != null) {
            manager.deleteExpense(category);
        }
    }

    // Getter for monthly data
    public Map<String, MonthlyManager> getMonthlyData() {
        return monthlyData;
    }

    // Setter for monthly data
    public void setMonthlyData(Map<String, MonthlyManager> monthlyData) {
        this.monthlyData = monthlyData;
    }
}
