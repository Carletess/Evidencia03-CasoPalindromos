# Actividad en clase: Caso Palíndromos - Pruebas Unitarias

 **Integrantes:**  
- Carlos Pradenas
- Francisco Barrozo
- Diego Labrin

---

## Paso 1: Leer y entender el contexto problema

### Discusión y Conclusión:

- **¿Qué hace el método?**
  El método `esPalindromo` verifica si una cadena de texto dada es un palíndromo, es decir, si se lee igual de izquierda a derecha y de derecha a izquierda.

- **¿Cómo lo hace?**
  Divide la cadena en un array de caracteres, invierte ese array y luego lo une nuevamente en una cadena. Luego, compara la cadena original con la cadena invertida.

- **¿Cómo lo uso?**
  Llama a la función `esPalindromo` pasando como argumento la cadena que deseas verificar.

## Paso 2: Entender el método JavaScript

### 2.1 Explicación individual y grupal

### 2.2 Construir versión Java equivalente

Código Java equivalente:
```java
public static boolean esPalindromo(String cadena) {
        StringBuilder palabra_invertida = new StringBuilder();

        // Divide la cadena en un arreglo de caracteres
        char[] caracteres = cadena.toCharArray();

        // Invierte el arreglo de caracteres
        for (int i = caracteres.length - 1; i >= 0; i--) {
            palabra_invertida.append(caracteres[i]);
        }
        String palabra = palabra_invertida.toString();

        // Comparar la cadena original con la cadena invertida
        return cadena.equals(palabra);
```

### 2.3 Discutir resultados entre el grupo y con el profesor

## Paso 3: Diseñar y ejecutar pruebas unitarias

### 3.1 Diseñar un plan de pruebas

Para diseñar un plan de pruebas, en el caso de la verificación de palíndromos, podríamos incluir los siguientes tipos de pruebas:

1. **Caso de prueba con un palíndromo corto:**
  - Input: "radar"
  - Output esperado: True

2. **Caso de prueba con una cadena no palíndroma:**
  - Input: "hello"
  - Output esperado: False

3. **Caso de prueba con una cadena vacía:**
  - Input: ""
  - Output esperado: True (ya que una cadena vacía se considera un palíndromo)

4. **Caso de prueba con una cadena que contiene espacios:**
  - Input: "Anita lava la tina"
  - Output esperado: True

5. **Caso de prueba con un número entero:**
  - Input: "12321"
  - Output esperado: True

6. **Caso de prueba con un solo carácter:**
- Input: "h"
- Output esperado: True

### 3.2 Diseñar casos de prueba unitaria

A partir del plan de pruebas, podemos diseñar los casos de prueba unitaria utilizando la librería Java para test unitarios JUnit. 

### 3.3 Implementar pruebas unitarias en Java usando JUnit

En grupo se escribe y ejecuta pruebas unitarias en Java utilizando el framework JUnit.

## Paso 4: Mejorar el método y diseñar nuevas pruebas

### 4.1 Discutir casos de prueba adicionales
 A partir de las pruebas unitarias, todos los casos pasaron las pruebas excepto el cuarto caso:
4. **Caso de prueba con una cadena que contiene espacios:**
- Input: "Anita lava la tina"
- Output esperado: True

### 4.2 Construir versión mejorada del método

A partir de los casos de prueba se mejoró el código:

```java
    public static boolean esPalindromoMejorado(String cadena) {
        // Eliminar caracteres especiales y convertir a minúsculas
        String cadenaLimpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Crear una cadena invertida
        StringBuilder palabraInvertida = new StringBuilder(cadenaLimpia).reverse();

        // Comparar la cadena original con la cadena invertida
        return cadenaLimpia.equals(palabraInvertida.toString());
        }
```
Se tomó en cuenta la validación de carácteres especiales y insensibilización a mayúsculas.  
A demás, se usó el método `reverse()` intergrado en java en vez de invertir la cadena manualmente

### 4.3 Diseñar nuevas pruebas unitarias

Los grupos deben crear nuevas pruebas unitarias que cubran los casos de prueba adicionales y verificar sus resultados teóricos con los resultados empíricos.

## Paso 5: Discutir experiencia y resultados

Con base en nuestros resultados en esta actividad, 
que proporciona una oportunidad práctica para que los estudiantes trabajen en el proceso de desarrollo de software, 
desde la comprensión del código existente hasta la mejora y la prueba. 
Además, la importancia de las pruebas unitarias es bastante util para fortalecer el código de errores que suelen pasar desapercibidos si no se toman en cuenta estas pruebas.