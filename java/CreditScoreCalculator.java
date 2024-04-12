class CreditScoreCalculator {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    // Constructor to initialize the fields
    public CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory) {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    // Getter method for creditHistory
    public int getCreditHistory() {
        return creditHistory;
    }

    // Setter method for creditHistory
    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    // Getter method for creditUtilization
    public double getCreditUtilization() {
        return creditUtilization;
    }

    // Setter method for creditUtilization
    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    // Getter method for paymentHistory
    public boolean hasGoodPaymentHistory() {
        return paymentHistory;
    }

    // Setter method for paymentHistory
    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    // Method to calculate the credit score based on provided information
    public int calculateCreditScore() {
        int creditScore;
        if (paymentHistory) {
            creditScore = (creditHistory * 15) + (int) (creditUtilization * 30) + 55;
        } else {
            creditScore = (creditHistory * 15) + (int) (creditUtilization * 30) + 35;
        }
        return creditScore;
    }
}

