public class Vacation {
    private int vacationDays;       // Total vacation days allowed
    private int usedVacationDays;   // Vacation days already used

    // Calculate remaining vacation days
    public int getRemainingVacationDays() {
        return vacationDays - usedVacationDays;
    }

    // Getter method for vacationDays
    public int getVacationDays() {
        return vacationDays;
    }

    // Setter method for vacationDays
    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    // Getter method for usedVacationDays
    public int getUsedVacationDays() {
        return usedVacationDays;
    }

    // Setter method for usedVacationDays
    public void setUsedVacationDays(int usedVacationDays) {
        this.usedVacationDays = usedVacationDays;
    }
}
