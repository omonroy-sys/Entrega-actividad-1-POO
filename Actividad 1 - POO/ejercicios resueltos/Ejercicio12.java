public class Salario {
    public static void main(String[] args) {

        int horas = 48;
        double pagoHora = 5000;

        double salarioBruto = horas * pagoHora;
        double retencion = salarioBruto * 0.125;
        double salarioNeto = salarioBruto - retencion;

        System.out.println("Salario bruto semanal: $" + salarioBruto);
        System.out.println("Retencion en la fuente: $" + retencion);
        System.out.println("Salario neto del trabajador: $" + salarioNeto);
    }
}