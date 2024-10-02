
    import javax.imageio.ImageIO;
    import javax.swing.*;
    import java.awt.image.BufferedImage;
    import java.io.File;
    import java.io.IOException;

    class Titanic extends JFrame {

        public static void main(String[] args) {
            new Titanic();
        }

        public Titanic() {




            this.setTitle("Titanic Passengers Data");
            this.setLayout(null);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
            this.add(new ManageScreen(0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT));
            this.setVisible(true);

        }



    }

