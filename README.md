Actividad en clase: Caso Palíndromos - Pruebas Unitarias

Paso 1.1:  
¿Qué hace el método? : el método verifica si una palabra es
un palindromo

¿Cómo lo hace? : primero crea una cadena vacía llamada resultado,
luego llena esta variable primero llamando la cadena, posteriormente
ocupando el método split que logra dividir los caracteres en un arreglo,
luego ocupa el método reverse para invertir el arreglo, y usa el método join para unirlo
nuevamente. Finalmente compara la cadena con el resultado retornando un booleano.

¿Cómo lo uso? : para usarlo se debe asignar la palabra que se quiere comparar a una constante.

Ejemplo:

const palindromo1 = "oso";

console.log(esPalindromo(palindromo1));

Paso 2:  
En el main

Paso 3.2:
Probaremos una palabra normal que sea palíndromo
una palabra que no sea palíndromo,
un frase palíndromo,
una palabra con numeros,
un texto vacío,
un texto con solo espacio

Paso 3.4: 
