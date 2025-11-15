module org.example.interstellarbattleship {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.interstellarbattleship to javafx.fxml;
    exports org.example.interstellarbattleship;
}