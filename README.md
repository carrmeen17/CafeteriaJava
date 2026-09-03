Cafetería Java
Descripción

Cafetería Java es una aplicación desarrollada en Java para gestionar productos y tickets de una cafetería.

El proyecto permite:

Crear clientes y camareros.
Crear diferentes tipos de productos.
Gestionar productos como comidas y bebidas.
Añadir productos a un ticket.
Mostrar la información de los productos.
Calcular el total de un ticket.
Aplicar descuentos a los productos.
Mostrar el ticket completo con la información del cliente, camarero y productos.

El proyecto utiliza herencia, interfaces, ArrayList, encapsulamiento y polimorfismo.

Requisitos

Para compilar y ejecutar el proyecto es necesario tener instalado:

Java JDK 25.
Junit 5.

Compilación y ejecución
Desde IntelliJ IDEA
Abrir el proyecto en IntelliJ IDEA.
Comprobar que el proyecto utiliza un JDK compatible.
Abrir la clase Main.java.
Ejecutar el método main pulsando el botón de PLAY situado junto al método.

Al ejecutar el programa se crean diferentes elementos de la cafetería:

Un cliente.
Un camarero.
Un producto.
Una bebida.
Una comida.
Un ticket.

Posteriormente, los productos se añaden al ticket y se muestra su información.

También se aplica un descuento a uno de los productos y se calcula:

El total sin descuento.
Los descuentos aplicados.
El precio final de los productos con descuento.
El total con descuento.

Un ejemplo de salida sería:

Producto: Café. Precio: 1.2. Categoría: bebida. Tamaño: doble
Producto: Tarta. Precio: 3.5. Categoría: comida. Es caliente: Frío
Producto: Cubierto. Precio: 1.2. Categoría: suplemento
-------------------------------
--- CAFETERÍA JAVA ---
Cliente: Mario
Camarero: Roberto - 1234

Productos:
1- Café - 1.2€.
2- Tarta - 3.5€.
3- Cubierto - 1.2€.

Total sin descuento: 5.9€.

Descuento aplicado al Café: 10%
Precio final del Café: 1.08€

Total con descuento: 5.78€.
Documentación

El proyecto incluye documentación generada mediante Javadoc.

La documentación HTML se encuentra en la carpeta:

/docs/

Para generar nuevamente la documentación desde la terminal:

javadoc -d docs src/*.java

El archivo principal de la documentación será:

docs/index.html

Autora: Carmen

Licencia: MIT