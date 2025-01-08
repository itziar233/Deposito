package cuentas;

public class Main {

    public static void main(String[] args) {
        // Crear una cuenta
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Ejecutar operaciones
        operativa_cuenta(cuenta1, 2300);
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        // Mostrar saldo actual
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

        // Retirar dinero
        try {
            cuenta1.retirar(cantidad);
            System.out.println("Se retiró " + cantidad + " euros.");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        // Ingresar dinero
        try {
            System.out.println("Ingreso en cuenta...");
            cuenta1.ingresar(695);  // Cantidad fija para el ejemplo
            System.out.println("Se ingresó 695 euros.");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }

        // Mostrar saldo final
        System.out.println("Saldo final: " + cuenta1.getSaldo());
    }
}
