# ¿Se obtienen los resultados esperados?

`Con synchronized`: Sí se obtienen los resultados esperados. Al aumentarlos a un número grande, el resultado es exacto 2 000 000 porque fuerza a los hilos a modificar la variable de una en una.

`Sin synchronized`: No se obtiene el resultado esperado. El total final es menor y cambia en cada ejecución.