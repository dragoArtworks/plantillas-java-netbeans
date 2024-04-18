
import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        int seleccion = 0;
        do {
            try {
                seleccion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Bienvenido rey/na, elije una de las siguientes opciones:\n"
                        + "1.Agregar documento\n"
                        + "2.imprimir\n"
                        + "3.Ver cola de impresion\n"
                        + "5.Salir\n",
                        "Menu", JOptionPane.PLAIN_MESSAGE));

                switch (seleccion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "opcion 1");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "opcion 2");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "opcion 3");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "opcion 4");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "finalizando programa");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "parametro no valido");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite un parametro valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (seleccion != 5);
    }
}
