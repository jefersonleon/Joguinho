package br.ulbra.control;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Jogo {
    public int numero;
    
    public Jogo(){
        JOptionPane.showMessageDialog(null, "Que comecem os jogos!!!");
    }
    
    public void jogar(int numero){
        int numSorte = (int)(Math.random()*3);
        if(numero == numSorte){
            JOptionPane.showMessageDialog(null, "você acertou!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Você errou!! o numero sorteado é: "+numSorte);
        }
    }
}
