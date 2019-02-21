package thepreviousone.cryptopass.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import thepreviousone.cryptopass.PasswordMaker;

import java.io.ByteArrayInputStream;

public class Gui extends Application {

    public static void run(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 600.0, 150);
        Label secretLbl = new Label("Secret :");
        Label userLbl = new Label("User :");
        Label urlLbl = new Label("  URL :");
        TextField secretKey = new TextField();
        TextField username = new TextField();
        TextField url = new TextField();
        TextField password = new TextField();
        Button btn = new Button("Generate");

        secretLbl.setFont(Font.font("Serif", FontWeight.BOLD, 14.0));
        userLbl.setFont(Font.font("Serif", FontWeight.BOLD, 14.0));
        urlLbl.setFont(Font.font("Serif", FontWeight.BOLD, 14.0));
        password.setFont(Font.font("Serif", FontWeight.BOLD, 16.0));
        password.setEditable(false);

        secretKey.setFont(Font.font("Serif", FontWeight.NORMAL, 16.0));
        secretKey.setPromptText("Secret Key");
        username.setFont(Font.font("Serif", FontWeight.NORMAL, 16.0));
        username.setPromptText("Username");
        url.setFont(Font.font("Serif", FontWeight.NORMAL, 16.0));
        url.setPromptText("Site");
        btn.setFont(Font.font("Serif", FontWeight.NORMAL, 16.0));

        root.setPadding(new Insets(15.0));
        root.setVgap(10);
        root.add(secretLbl, 0, 0, 2, 1);
        root.add(secretKey, 2, 0, 4, 1);
        root.add(userLbl,0, 1);
        root.add(username, 1, 1, 2, 1);
        root.add(urlLbl, 3, 1);
        root.add(url, 4, 1, 1, 1);
        root.add(btn, 5, 1);
        root.add(password, 0, 2, 6, 1);
        root.requestFocus();

        btn.setOnAction(actionEvent -> {
            String secret = secretKey.getCharacters().toString();
            String  userSalt = username.getCharacters().toString();
            String  urlSalt = url.getCharacters().toString();
            password.setText(PasswordMaker.make(secret, userSalt, urlSalt));
        });

        stage.getIcons().add(new Image(new ByteArrayInputStream(Icon.decodeImage(new Icon().get()))));
        stage.setTitle("CryptoPass");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

}
