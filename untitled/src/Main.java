import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };
        String msg = "";

        for (int i = 0; i < arr.length; i++){
            if( i < 3){
                msg = msg.concat("pos "+(i+1)+": "+arr[i]+";\n");
            }
        }

        JOptionPane.showMessageDialog(null, msg);
    }
}