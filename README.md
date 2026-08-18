============================================================================

### COMANDOS DE COMPILACIÓN Y EJECUCIÓN - EDITOR DE FILTROS DE IMÁGENES

============================================================================

javac -d bin src/*.java

------------------------------------------------------------------------
#### 2. Comandos de ejecución para generar cada imagen filtrada
------------------------------------------------------------------------

java -cp bin Main data/input.png data/grayscale.png grises

java -cp bin Main data/input.png data/negative.png negativo

java -cp bin Main data/input.png data/oneChannelRed.png rojo

java -cp bin Main data/input.png data/oneChannelGreen.png verde

java -cp bin Main data/input.png data/oneChannelBlue.png azul

java -cp bin Main data/input.png data/brightness.png brillo

java -cp bin Main data/input.png data/brightness_custom.png brillo 60

java -cp bin Main data/input.png data/darkness.png brillo -100

java -cp bin Main data/input.png data/BlackandWhite.png umbral

java -cp bin Main data/input.png data/BlackandWhite_custom.png umbral 200

java -cp bin Main data/input.png data/mirroredHorizontal.png espejo

java -cp bin Main data/input.png data/rotate90.png rotar
