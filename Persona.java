package ExamenRecu;

/**
 * Persona
 */

public abstract class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo = 'H';
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    String calcularIMC() {
        double IMC = peso / Math.pow(altura, 2);
        String resultPeso = "";

        if (IMC > 18.25 || IMC <= 24.9) {
            resultPeso = "peso ideal";
        } else if (IMC > 25 || IMC <= 29.9) {
            resultPeso = "sobrepeso";
        } else if (IMC >= 30) {
            resultPeso = "obesidad";
        }

        return resultPeso;

    }

    boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    abstract boolean comprobarSexo(char sexo);

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + "]";
    }

    public static void main(String[] args) {

    }
}
