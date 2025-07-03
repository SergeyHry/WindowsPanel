
module ChattAppJavaFX{
    requires javafx.controls;
    requires javafx.fxml;

	requires com.github.oshi;
	requires javafx.graphics;
    opens WindowsNew to javafx.fxml;
}