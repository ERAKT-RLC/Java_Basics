public class Fee {
    private String feeId;
    private String studentId;
    private double amount;
    private String status;
    private String transactionId;

    public Fee(String feeId, String studentId, double amount, String status, String transactionId) {
        this.feeId = feeId;
        this.studentId = studentId;
        this.amount = amount;
        this.status = status;
        this.transactionId = transactionId;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    @Override
    public String toString() {
        return "Fee{" +
                "feeId='" + feeId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
