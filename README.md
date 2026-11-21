# U3-ejercicio4
# 🎓 Registro de Alumnos y Promedios Académicos

Ejercicio de **Programación Orientada a Objetos en Java** que modela el registro de calificaciones de un estudiante aplicando el principio de **encapsulamiento**. Las notas individuales están ocultas dentro de la clase y solo pueden cargarse mediante un método que valida que cada calificación esté en el rango válido (0 a 10). El promedio se calcula internamente a partir de los datos protegidos y se devuelve al exterior como resultado.

## 🎯 Objetivo

Implementar una clase que impida alterar libremente las notas de un estudiante, permitiendo únicamente su consulta controlada y el cálculo automatizado del promedio general.

## ✨ Características

- Atributos privados: `legajo`, `nombre` y un arreglo `double[]` de notas.
- `agregarNota(double nota)`: valida que la nota esté entre 0 y 10 antes de almacenarla.
- `calcularPromedio()`: procesa internamente las notas ocultas y devuelve el promedio.
- `getNotas()` devuelve una **copia** del arreglo, de modo que no se pueden modificar las notas reales desde afuera.
- Capacidad máxima de notas controlada mediante un contador interno.
- Manejo del caso sin notas cargadas (promedio 0.0) para evitar división por cero.

## 📚 Conceptos aplicados

Encapsulamiento · Modificadores de acceso · Arreglos · Validación de datos · Copia defensiva · Constructores · Métodos privados y públicos

![U3 ejercicio4](U3%20ejercicio4.png)
