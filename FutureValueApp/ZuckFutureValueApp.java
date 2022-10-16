package FutureValueApp;

import java.util.*;
import javafx.*;

public class ZuckFutureValueApp extends Application {
    private TextField text1;
    private TextField text2;
    private TextArea area1;
    private Label lblMonthlyPayment = new Label("Monthly Payment: ");
    private Label lblInterestRate = new Label("Interest Rate: ");
    private Label lblYears = new Label("Years: ");
    private Label lblClear = new Label("Clear");
    private Label lblCalculate = new Label("Calculate");
    private ComboBox int combo;
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Zuck Future Value App");

        GridPane pane = new GridPane(Pos.CENTER, 11.5, 12.5, 13.5, 14.5, 5.5, 5.5)
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        Scene scene = new Scene(text1, text2, area1, pane)
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
