📏💻 Convertidor de Bytes – Interfaz Gráfica en Java

Este proyecto implementa una aplicación en Java Swing que permite convertir entre diferentes unidades de almacenamiento digital (Bytes, Kilobytes, Megabytes, Gigabytes y Terabytes).

La interfaz gráfica es sencilla e intuitiva: el usuario introduce una cantidad, selecciona la unidad de origen y la unidad de destino, y obtiene el resultado de la conversión.

🧠 Cómo Funciona

La aplicación convierte cualquier valor a bytes como unidad base, y a partir de ahí realiza la conversión a la unidad deseada.

El flujo del cálculo es:

Se lee el valor ingresado en el campo de texto.

Se identifica la unidad de origen seleccionada (Bytes, KB, MB, GB, TB).

Se convierte el valor ingresado a bytes.

Se convierte el resultado en bytes a la unidad de destino.

Se muestra el resultado con hasta 12 decimales en la interfaz.

También incluye validaciones:

Si no se ingresa un valor, muestra un mensaje de error.

Si el valor ingresado no es numérico, alerta al usuario.

Si las unidades de origen y destino son iguales, pide que se elijan diferentes.

📂 Características

Conversión entre Bytes, Kilobytes, Megabytes, Gigabytes y Terabytes.

Interfaz gráfica construida con Java Swing.

Mensajes de error y advertencias amigables.

Resultados con precisión de hasta 12 decimales.

▶️ Uso

Para ejecutar el programa:

Compila el código:

javac Interfeis.java


Ejecuta la aplicación:

java Interfeis

⚙️ Requisitos

Java JDK 8 o superior.

Un entorno de desarrollo o compilador de Java (NetBeans, IntelliJ, Eclipse o línea de comandos).

💾 Instalación

Clona el repositorio:

git clone git@github.com:TU_USUARIO/Convertidor-Bytes.git
cd Convertidor-Bytes


Compila y ejecuta el archivo Interfeis.java.