module io.dbc.github.billsontrack {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens io.dbc.github.billsontrack to javafx.fxml;
    exports io.dbc.github.billsontrack;
}