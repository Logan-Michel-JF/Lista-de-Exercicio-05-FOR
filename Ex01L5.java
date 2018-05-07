import javax.swing.JOptionPane;

public class Ex01L5{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número Para a Tabuada: "));

        for(int i = 0; i < 11; i++){
            System.out.println(numero + " x " + i + " = " + (i * numero));
        }
    }
}