module com.javafx.sample_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javafx.sample_project to javafx.fxml;
    exports com.javafx.sample_project;
}
