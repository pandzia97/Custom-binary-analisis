# Custom-binary-analisis

A program to load a txt file containing a string information about objects represented by 8 consecutive bits (4: id, 3: message, 1: control).

The output file contains:

1. Number of all objects - quantity;
2. Number of all objects containing fails (message=="000", fail control bit (id: even = 0, uneven = 1)) - failSum;
3. All error-free object stored in the form and order in which they occurred in the input file - stringBuilder.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Program mający na celu wczytanie pliku txt, w którym znajduje się ciąg zawierający informację na temat obiektów reprezentowanych przez 8 kolejnych bitów (4 id, 3 message, 1 control). 

Plik wyjściowy zawiera:

1. Liczba wczytanych obiektów - quantity;
2. Ilość obiektów zawierających błędy (message=="000", błedy bit kontrolny (id: parzyste = 0, nieparzyste = 1)) - failSum;
3. Wszystkie obiekty niezawierające błedów zapisane w formie oraz kolejności w jakim wystąpiły w pliku wejściowym - stringBuilder.
