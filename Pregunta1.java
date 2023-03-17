package ExamenRecu;

public class Pregunta1 {
    int puntosPregunta(char ru, char rc) {
        if (ru == rc) {
            return 2;
        } else {
            return 0;
        }
    }

    int puntosCuestionario(char[] respuestas, char[] claves){
        int totalPuntos = 0;
        for (int i = 0; i < respuestas.length; i++) {
            totalPuntos += puntosPregunta(respuestas[i], claves[i]);
        }

        return totalPuntos;
    }
}
