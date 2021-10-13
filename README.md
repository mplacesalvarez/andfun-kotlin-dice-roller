## Utilizar strings.xml según idiomas
Para añadir un idioma a la aplicación primero hay que crear un fichero strings.xml en el que incluiremos la etiqueta resources, y dentro de ella una etiqueta por cada texto a traducir.

Commit= https://github.com/mplacesalvarez/andfun-kotlin-dice-roller/tree/c5d1bfd4ca4b102af70f7c0b8ede93fd4065b7c9

## Cambiar strings en el layout
Si queremos cambiar el idioma de nuestra app tendremos que añadir al fichero activity_main.xml los strings.xml, añadiendo en android:text su ruta. Ahora podemos cambiar el idioma de la app segun los strings.xml que tengamos.

Commit= https://github.com/mplacesalvarez/andfun-kotlin-dice-roller/tree/0b253ca2d7bf93b3d511528c9bc88fc80ef52bf1

## Cambiar las imágenes en drawable
Para cambiar una imagen metemos la imagen que queramos en el directorio drawable y en el fichero MainActivity.kt ponemos su ruta.

Commit= https://github.com/mplacesalvarez/andfun-kotlin-dice-roller/tree/fbbbf28ac6740174e52e1a5f2f0ddb07e7a91099

## Cambiar la función random por algo similar
Para realizar la labor de la función random() cree una lista con números del uno al seis, utilicé shuffled() para ordenar de forma aleatoria la lista y last() para que tomara el último número de la lista.

Commit= https://github.com/mplacesalvarez/andfun-kotlin-dice-roller/tree/6484175996759507139ffa7f9a5dd57ae5509ea1

## Modificar el botón para usar material.io y que tenga asociado un icono
Para añadir un icono al botón deberemos cambiar su estilo por un Material buttons, para hacerlo primero hay que implementar la libreria de Material Components en dependencies del build.gradle y luego elegir un style del Material. Ahora meteremos en la carpeta drawable el icono que queremos insertar en el botón y dentro del activity_main.xml app:icon la ruta del icono.

Commit= https://github.com/mplacesalvarez/andfun-kotlin-dice-roller/tree/43ebda0d8910e29979c439eb47325c942ef9ef7f
