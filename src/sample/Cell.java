package sample;

import javafx.scene.control.Button;

public class Cell extends Button {
    Button button;
    private boolean isBomb;
    private boolean isOpen;
    private boolean isFlag;

    public Button getButton() {
        return button;
    }

    public Cell(Button button,boolean isBomb) {
        this.button = button;
        this.isBomb = isBomb;
        this.isOpen = false;
        this.isFlag = false;
    }

    public void rightClick(){

    }

    public void leftClick(){

    }
}
