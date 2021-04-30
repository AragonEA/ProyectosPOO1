# Ejercicio Compilador

Codificar una clase Compilador, la cual recibirá una cadena de caracteres que comienza con el caracter C y finaliza con el caracter F (cualquier otra cadena no es válida).

Entre dichos caracteres, la cadena sólo podrá tener las letras N,S,E,O (norte-sur-este-oeste). Cualquier otro caracter no es válido.

Si la cadena es válida, generar un objeto de la clase ProgramaObjeto; a partir de tal objeto se debe poder llamar a un método Compilar. 
Dicho método devuelve un Punto en el plano, donde sus coordenadas dependen de la cadena que se pasó a la clase Compilador en primer lugar.

Por ejemplo: Si se recibe la cadena CSSSNNEEF, entonces se debe devolver un punto con las coordenadas (2,-1) puesto que se movió: 3 unidades hacia el Sur, 2 hacia el Norte, y dos hacia el Este. Y si se recibe la cadena CSSSAF, no sería una cadena válida.
