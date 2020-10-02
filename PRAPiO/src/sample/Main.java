package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage bassicWindow) throws Exception{
        Parent parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        bassicWindow.getIcons().add(new Image("icon.png"));
        bassicWindow.setTitle("Program Realizujący Algorytm Podziału i Ograniczeń");
        bassicWindow.setScene(new Scene(parent, 815, 610));
        bassicWindow.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

