

/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University.

Cool IT Help. (2020). How to setup JavaFx Environment in Visual Studio code? [Video]. Youtube. https://youtu.be/H67COH9F718.

JavaFX Tutorial - JavaFX Introduction. Java2s.com. (2022). Retrieved 15 October 2022, from http://www.java2s.com/Tutorials/Java/JavaFX/index.htm.

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: Comprehensive Version (12th ed.). Pearson Education, Inc.

Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved. */

/* Imports */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ZuckEnhancedFutureValueApp extends Application { /* Begin ZuckFutureValue App, extending JavaFX Application. */
    /* These are the attributes of the application. */
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea txtResults = new TextArea("The future value is " + calculateResults());
    private Label lblMonthlyPayment = new Label("Monthly Payment: ");
    private Label lblInterestRate = new Label("Interest Rate: ");
    private Label lblYears = new Label("Years: ");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblFutureValueDate = new Label("Calculation as of " +getDate());
    private Integer[] interestYears = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
    private ComboBox<Integer> cbYears = new ComboBox<>();
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    /* This overrides the start method. */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Zuck Future Value App"); /* Title set. */

        /* This creates the pane and adds all my attributes to it. */
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.add(txtMonthlyPayment, 1, 0);
        pane.add(txtInterestRate, 1, 1);
        pane.add(txtResults, 0, 6, 2, 1);
        pane.add(lblMonthlyPayment, 0, 0);
        pane.add(lblInterestRate, 0, 1);
        pane.add(lblYears, 0, 3);
        pane.add(cbYears, 1, 3);
        pane.add(lblFutureValueDate,0 ,5);

        ObservableList<Integer> years = FXCollections.observableArrayList(interestYears);
        cbYears.getItems().addAll(years);
        
        /* This sets the InterestRateFormat to Red, assigns it to the pane, and positions it. */
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        /* This creates a container for the buttons, adds them to the pane, and controls the buttons. */
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());

        /* This creates the scene, adds the pane to the scene, the scene to the stage, and then shows the stage. */
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    } /* End override of the Start method. */

    private void clearFormFields(){
        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        txtResults.setText("");
        lblFutureValueDate.setText("");
        cbYears.setValue(null);
    }

    private String getDate(){
        SimpleDateFormat simpleDate = new SimpleDateFormat("MM/dd/yyyy");
        Date today = new Date();
        String outputDate = String.format(simpleDate.format(today));
        return outputDate;
    }

    private double calculateResults(){
        Double monthlyPayment = Double.valueOf(txtMonthlyPayment.getText());
        Double interestRate = Double.valueOf(txtInterestRate.getText());
        int years = cbYears.getValue();
        return FinanceCalculator.calculateFutureValue(monthlyPayment, interestRate, years);
    }

    /* This is the main method that runs the application. */
    public static void main(String[] args) {
        launch(args); /* This launches the arguments in the main method. */
    } /* End main method. */
} /* End ZuckFutureValueApp. */