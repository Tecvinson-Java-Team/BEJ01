import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages the incomes and expenses for a specific month.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class MonthlyManager {
    @JsonProperty("incomeByCategory")
    private Map<String, Double> incomeByCategory;
    @JsonProperty("expenseByCategory")
    private Map<String, Double> expenseByCategory;

    // Default constructor required for deserialization.
    public MonthlyManager() {
        this.incomeByCategory = new HashMap<>();
        this.expenseByCategory = new HashMap<>();
    }

    // Adds an income to the specified category.
    public void addIncome(Income income) {
        incomeByCategory.put(income.getCategory(), incomeByCategory.getOrDefault(income.getCategory(), 0.0) + income.getAmount());
    }

    // Adds an expense to the specified category.
    public void addExpense(Expense expense) {
        expenseByCategory.put(expense.getCategory(), expenseByCategory.getOrDefault(expense.getCategory(), 0.0) + expense.getAmount());
    }

    // Modifies an existing income category.
    public void modifyIncome(String category, double amount) {
        if (incomeByCategory.containsKey(category)) {
            incomeByCategory.put(category, amount);
        } else {
            System.out.println("Income category not found.");
        }
    }

    // Modifies an existing expense category.
    public void modifyExpense(String category, double amount) {
        if (expenseByCategory.containsKey(category)) {
            expenseByCategory.put(category, amount);
        } else {
            System.out.println("Expense category not found.");
        }
    }

    // Deletes an income category.
    public void deleteIncome(String category) {
        if (incomeByCategory.containsKey(category)) {
            incomeByCategory.remove(category);
        } else {
            System.out.println("Income category not found.");
        }
    }

    // Deletes an expense category.
    public void deleteExpense(String category) {
        if (expenseByCategory.containsKey(category)) {
            expenseByCategory.remove(category);
        } else {
            System.out.println("Expense category not found.");
        }
    }

    // Returns the total income by category.
    public Map<String, Double> getTotalIncomeByCategory() {
        return new HashMap<>(incomeByCategory);
    }

    // Returns the total expense by category.
    public Map<String, Double> getTotalExpenseByCategory() {
        return new HashMap<>(expenseByCategory);
    }

    // Calculates and returns the net balance (income - expenses).
    @JsonIgnore
    public double getNetBalance() {
        double totalIncome = 0.0;
        for (double amount : incomeByCategory.values()) {
            totalIncome += amount;
        }

        double totalExpenses = 0.0;
        for (double amount : expenseByCategory.values()) {
            totalExpenses += amount;
        }

        return totalIncome - totalExpenses;
    }
}
