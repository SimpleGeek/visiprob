module com.simplegeek.visiprob {
    requires javafx.controls;
	requires javafx.fxml;
    exports com.simplegeek.visiprob;
    exports com.simplegeek.visiprob.controllers;
    opens com.simplegeek.visiprob.controllers;
}