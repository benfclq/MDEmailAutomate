/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mdemailautomate;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JFileChooser;

/**
 * FXML Controller class
 *
 * @author Ben
 */
public class MainWindowController implements Initializable {

    @FXML
    private TextArea myTextArea;
    @FXML
    private Button myButton;
    @FXML //  fx:id="myOuterAnchor"
    private AnchorPane myOuterAnchor;
    
    
    @FXML //  fx:id="myList"
    private ListView<String> myList; // Value injected by FXMLLoader
    ObservableList<String> names = FXCollections.observableArrayList(
          "Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        myTextArea.setText("hello 123 world hello 123 world hello 123 world hello 123 world hello 123 world hello 123 world ");

        myList.setItems(names);
        myOuterAnchor.addEventFilter(Event.ANY, new EventHandler<Event>()
        {

            @Override
            public void handle(Event t) {
                System.out.println(t.getEventType().getName());
            }
            
        }
        );
        
    }
    @FXML
    private void handleBen(MouseEvent event) {
        
            FileChooser fileChooser = new FileChooser();
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            //stage.close();
            fileChooser.showOpenDialog(stage);
            names.clear();
            names.add("blahbkah");

        }

}
