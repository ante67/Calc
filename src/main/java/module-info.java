module cz.amware.calc {
    requires javafx.controls;
    requires javafx.fxml;

    opens cz.amware.calc to javafx.fxml;
    exports cz.amware.calc;
}