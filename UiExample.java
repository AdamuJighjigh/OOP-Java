import javax.swing.*;

public class Example {

    JFrame window = new JFrame(title:"Example App");

    JPanel myPanel = new JPanel();

    JTextField emailField = new JTextField("Enter your email");

    JButton myButton = new JButton("Click here");


    void drawUi() {
        myPanel.add(emailField);
        myPanel.add(myButton);
        window.add(myPanel);

        window.setSize(300, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(windowConstants.EXIT);
        {

            publec static void main (string[]args){
            UiExample uiExample = new UiExample();
            uiExample.drawUi();
        }
        }
    }