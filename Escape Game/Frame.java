import javax.swing.*;

//Window for game
public class Frame extends escapeGame(){

    public Frame(){
        Panel gamePanel = new Panel();
        this.add(gamePanel());
        this.setTitle("Escape The AI");
        this.setDefaultCloseOperation(JFRAME.EXIT_ON_CLOSE); //Exits the application when user clicks on close button
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); //sets location of window relative to specified component (null)
    }

}