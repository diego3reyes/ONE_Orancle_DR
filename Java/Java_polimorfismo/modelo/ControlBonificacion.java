package Java.Java_polimorfismo.modelo;

public class ControlBonificacion {
    
    private double suma;

    public double registraSalario(Funcionario funcionario){
        this.suma += funcionario.getBonificacion();
        System.out.println("Calculo actual: "+ this.suma);
        return this.suma;
    }
}
