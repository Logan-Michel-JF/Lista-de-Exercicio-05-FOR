import javax.swing.JOptionPane;

public class Ex04L5{

    public static void main(String[] args){

        for(int i = 0; i < 21; i++){
            for(int j = 0; j < 21; j++){

                if (i == 0){
                    System.out.print(" * ");
                }else if (i == 20 || j == 0 || j == 20 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                

            } 
            System.out.print("\n");
        }
    }
}