public class Employee {
    // Attributes
    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nationality;
    private Allowance allowance;
    private Vacation vacation;

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public Allowance getAllowance() { return allowance; }
    public void setAllowance(Allowance allowance) { this.allowance = allowance; }

    public Vacation getVacation() { return vacation; }
    public void setVacation(Vacation vacation) { this.vacation = vacation; }
}
