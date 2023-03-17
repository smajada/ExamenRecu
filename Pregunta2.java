package ExamenRecu;

// Se dice que una colección de números naturales, de longitud par, es pseudodominó cuando
// cada par de números acaba con el mismo número con que empieza el siguiente par. Se
// entenderán los distintos pares como los números de las posiciones (0,1), (2,3),
// (4,5), ...
// A estos efectos se consideran pseudodominós las colecciones sin pares o las que solo
// contienen un par.
// EJEMPLOS:
// esPseudoDomino([]) --> true
// esPseudoDomino([6,3]) --> true
// esPseudoDomino([6,3,3,4,4,5,5,6,6,7]) --> true
// esPseudoDomino([6,3,3,4,5,6,6,7]) --> false
// Escribe la función de nombre esPseudoDomino que recibe un array de números naturales y
// decide si dicha colección es o no es pseudodominó; utilízala en un programa principal.

public class Pregunta2 {
   boolean esPseudoDomino(int[] nums) {
      boolean isTrue = true;
      for (int i = 0; i < nums.length; i++) {
         if ((i % 2 == 0) && (i + 1 == i)) {
            isTrue = true;
         } else {
            isTrue = false;
         }
      }

      return isTrue;
   }
}
