
# Для компиляции программы из корнейвой директории проекта введите следующую команду
    # (версия OpenJDK не ниже 1.8)
javac -d ./target/ src/java/edu/school21/printer/*/*.java


# Для упаковки программы в jar введите следующую команду
jar cmvf src/manifest.txt ./target/images-to-chars-printer.jar -C target/ edu -C src/ resources

# Следующей командой скопируйте папку resources из src в target
 cp -r src/resources target/.

# Для запуска программы введите следующую команду с двумя аргументами
    # Первый аргумент char белого пикселя, второй агрумент char черного пикселя
# java -jar target/images-to-chars-printer.jar

# Пример запуска:
java -jar target/images-to-chars-printer.jar . o