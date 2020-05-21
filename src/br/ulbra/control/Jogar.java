package br.ulbra.control;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Jogar {

    public static void main(String[] args) {
        int num, c, numSorte, chances;
        boolean achou;//flag (bandeira)
        c = 1;
        achou = false;
        chances = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidades \nde chances que deseja:"));
        numSorte = (int) (Math.random() * 5);
        while (c <= chances && !(achou)) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero "
                    + "da sorte:"));
            if (num == numSorte) {
                achou = true;
                JOptionPane.showMessageDialog(null, "Acertou miserável!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Você errou, ainda possui "
                        + (chances - c));
                c++;
            }
        }
        if (c == (chances + 1)) {
            JOptionPane.showMessageDialog(null, "You Lose!!");
        } else {
            JOptionPane.showMessageDialog(null, "You Win!!");
        }

    }
}
