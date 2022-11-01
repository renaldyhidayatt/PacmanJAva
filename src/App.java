
import java.awt.EventQueue;

import javax.swing.JFrame;

public class App extends JFrame {

    public App() {

        initUI();

    }

    private void initUI() {
        add(new Board());

        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            App ex = new App();
            ex.setVisible(true);

            String filepath = "pacmanMusic.wav";
            Board musicObject = new Board();
            musicObject.playMusic(filepath);

        });

    }

}
