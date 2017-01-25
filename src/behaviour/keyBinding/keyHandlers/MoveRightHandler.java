package behaviour.keyBinding.keyHandlers;

import behaviour.keyBinding.KeyHandler;
import behaviour.keyBinding.KeyMap;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import logs.LogsManager;

public class MoveRightHandler extends KeyHandler {

    public MoveRightHandler(KeyMap keyMap) {
        super.pressed = false;
        super.keyMap = keyMap;
    }

    public MoveRightHandler() {
        super.pressed = false;
    }

    @Override
    public void execute() {
        Platform.runLater(() -> {
            Node node = super.keyMap.getNode();
            node.setTranslateX(node.getTranslateX() + 1);
            LogsManager.getInstance().info("PLAYER MOVED TO THE RIGHT");
        });
    }
}
