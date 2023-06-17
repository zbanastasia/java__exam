module com.example.java_exam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_exam to javafx.fxml;
    exports com.example.java_exam;
}