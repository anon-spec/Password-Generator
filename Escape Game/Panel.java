import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.swing.*;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;


public class panel extends JPanel implements ActionListener{

    //size of window
    static final int SCREEN_WIDTH = 1000;
    static final int SCREEN_HEIGHT = 1000; 

    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_HEIGHT * SCREEN_WIDTH) / UNIT_SIZE;
    static final int DELAY = 50; //Delay of when game starts
    //size of characters and walls
    static final int CHARACTER = UNIT_SIZE * UNIT_SIZE; 
    static final int WALLS = UNIT_SIZE * UNIT_SIZE;

    int coinsCounter;
    int coinX;
    int coinY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
   
    panel(){
        random = new Random;
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
        startGame();
    }
    public panel(){

    }
    public void startGame(){
        coin();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void component(Graphics g){
        super.component(g);
    }

    public void draw(Graphics g){
        
    }

    public void coin(){

    }

    public void move(){

    }

    public void checkCoin(){

    }
    public void collision(Graphics g){

    }

    public void gameOver(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent ae){

    }
    
    public class myKeyAdapter extends keyAdapter{
        @Override
        public void keypPressed(KeyEvent k){

        }
    }
}
