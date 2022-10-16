import java.net.URLClassLoader;
import java.util.*;
import javafx.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ZuckFutureValueApp extends Application {
    private TextField text1;
    private TextField text2;
    private TextArea area1;
    private Label lblMonthlyPayment = new Label("Monthly Payment: ");
    private Label lblInterestRate = new Label("Interest Rate: ");
    private Label lblYears = new Label("Years: ");
    private Label lblClear = new Label("Clear");
    private Label lblCalculate = new Label("Calculate");
    private ComboBox<int> combo;
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Zuck Future Value App");

        GridPane pane = new GridPane();
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15,0,15,30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);
        pane.add(actionBtnContainer, 1, 4);

        Scene scene = new Scene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
        
    }
