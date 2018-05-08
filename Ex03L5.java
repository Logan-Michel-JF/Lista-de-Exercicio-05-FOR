import javax.swing.JOptionPane;

public class Ex03L5{

    public static void main(String[] args){
        
        for(int i = 0; i < 21; i++){
            for(int j = 0; j < 21; j++){

                System.out.print(" * ");
                if (j == 20){
                    System.out.print("\n");
                }
            }
        }
    }
}