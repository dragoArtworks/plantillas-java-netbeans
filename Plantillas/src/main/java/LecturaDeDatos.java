import javax.swing.JOptionPane;

public class LecturaDeDatos {

    public static void main(String[] args) {

    }

    //leer datos enteros
    public int leerDatoTipoEntero(String mensaje) {
        int valor = 0;
        try {
            valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            if (valor < 1) {
                JOptionPane.showMessageDialog(null, "dato no valido");
                return 0;
            } else {
                return valor;
            }
        } catch (Exception errorIngreso) {
            JOptionPane.showMessageDialog(null, "Dato no valido");
            errorIngreso.printStackTrace();
            return 0;
        }
    }

    //metodo para leer un double
    public double leerUnDouble(String mensaje) {
        double valor = 0;
        valor = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return (valor);
    }
    //metodo para leer un booleano

    public boolean leerDatoTipoBooleano(String mensaje) {
        boolean valor = false;
        valor = Boolean.parseBoolean(JOptionPane.showInputDialog(mensaje));
        return (valor);
    }

    //metodo para leer una cadena
    public String leerDatoTipoCadena(String mensaje) {
        String valor = "";
        valor = JOptionPane.showInputDialog(mensaje);
        return valor;
    }

}
