package ru.gb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {
    private static final int WIN_HEIGHT = 230;
    private static final int WIN_WIDTH = 350;

    JButton buttonStart = new JButton("Start new game");

    SettingsWindow(GameWindow gameWindow){
        setLocationRelativeTo(gameWindow);
        setSize(WIN_WIDTH,WIN_HEIGHT);
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(0, 3,3, 3);
                setVisible(false);
            }
        });
        add(buttonStart);

    }
}
