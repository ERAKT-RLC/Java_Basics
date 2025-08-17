public class Student {
    private String studentId;
    private String name;
    private String email;
    private String password;
    private String courseId;
    private String feeStatus;

    //Constructors
    public Student(String studentId, String name ,String email, String password, String courseId, String feeStatus) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.courseId = courseId;
        this.feeStatus = feeStatus;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
    }

    @Override
    public String toString(){
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", courseId='" + courseId + '\'' +
                ", feeStatus='" + feeStatus + '\'' +
                '}';
    }

}
