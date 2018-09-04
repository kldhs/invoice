package com.inv;

import com.inv.controller.HomePageController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

    public static Parent homepage;
    public static HomePageController homePageController;

    static {
        try {
            FXMLLoader homepageLoader = new FXMLLoader(Main.class.getResource("/homepage.fxml"));
            homepage = homepageLoader.load();
            homePageController = homepageLoader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(homepage, 1500, 800));
        homePageController.init();
        primaryStage.show();
    }

}