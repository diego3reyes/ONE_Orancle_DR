package Java.Java_polimorfismo.modelo;

public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();
    private static int total = 0;

    public Cuenta(int agencia, int numero) {
        if (agencia <= 0 || numero <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
            this.numero = 1;
        } else {
            this.agencia = agencia;
            this.numero = numero;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
    }

    // no retorna respuesta
    public abstract void depositar(double valor); 

    // Retorna repuesta
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("No estan permitidos valores negativos!");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
}
