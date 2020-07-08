package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    public ImageView needle;

    @FXML
    public Slider slider; // Controls needle movement for testing

    /*
    This website helped me with the slider control:
    https://docs.oracle.com/javafx/2/ui_controls/slider.htm
    The change in the angle of the needle corresponds to change in slider
    The slider can go from 0-254, and the needle goes from -127-127 degrees
     */
    public void slide() {
        slider.valueProperty().addListener(new ChangeListener<Number>() {

            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                needle.setRotate(-127.0 + t1.doubleValue()); // the rotation value is being set from -127 - 127 (full needle rotation)
            }
        });
    }
}