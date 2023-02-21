import javax.swing.*;

//gunmen-6504
public class Arrays {
    public static void main(String[] args) throws Exception {

        int[] array = new int[10];

        for (int i = 0; i < 10; ++i) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input " + i + "th number: "));
        }
        for (int i = 0; i < 10; ++i) {
            System.out.println(array[i]);
        }

    }
}