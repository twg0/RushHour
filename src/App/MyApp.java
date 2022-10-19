package App;

import Model.FxFBoard;
import Model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class MyApp {
    public static void main(String args[]) {

        // 부모 프레임 생성
        JFrame frame = new JFrame("MyApp");
        // 부모 프레임 크기 설정
        frame.setSize(500, 500);
        // 부모 프레임 화면 가운데 배치
        frame.setLocationRelativeTo(null);
        // 부모 프레임을 닫았을 때 메모리에서 제거
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 부모 레이아웃 설정
        frame.getContentPane().setLayout(null);
        // 부모 프레임 보이게 설정
        frame.setVisible(true);

        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JPanel grid_panel = new JPanel();
        grid_panel.setLayout(new GridLayout(2, 2, 0, 0)); //테이블 형식 - 행, 열, 가로 여백, 세로 여백
        grid_panel.add(btn2);
        grid_panel.add(btn3);
        grid_panel.add(btn4);
        grid_panel.add(btn5);
        grid_panel.setBounds(0, 30, 500, 100);

        frame.setContentPane(grid_panel);

        int[][] board = FxFBoard.getGameBoard();
        for(int i = 0; i < 5;i++)
        {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }
}
