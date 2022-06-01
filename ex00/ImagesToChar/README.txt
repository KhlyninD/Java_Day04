
# Для компиляции программы из корнейвой директории проекта введите следующую команду
    # (версия OpenJDK не ниже 1.8)
javac -d ./target/ src/java/edu/school21/printer/*/*.java

# Для запуска прогрммы введите следующую команду с трямя аргументами
    # Первый аргумент char белого пикселя, второй агрумент char черного пикселя
    # третий аргумен путь до bmp изображения
# java -cp ./target edu.school21.printer.app.Main

# Пример запуска:
 java -cp ./target edu.school21.printer.app.Main . 0 $PWD/../../../resources/it.bmp