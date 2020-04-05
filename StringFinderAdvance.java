public class StringFinderAdvance {

    public String stringFinder (String str) {

        char arr[] = str.toCharArray (); // преобразовываем строку в новый массив символов, так будет удобнее - имхо
        String result = ""; // храним итоговый результат
        int repetitionCounter = 0; // счетчик повторений символов в массиве
        int defaultCounter = 1; // дефолтный счетчик для символов не имеющих повторений в массиве

        for (int i = 0; i < arr.length; i++) { // цикл для проверки каждого элемента в массиве на предмет совпадений

            if (!result.contains (Character.toString (arr[i]))){ // проверка был ли данный символ уже подсчитан или нет

                result += arr[i]; // добавляем к результату символ, который мы еще не подсчитывали

                    for (int j = i; j < arr.length; j++) { // собственно цикл для подсчета кол-ва повторений конкретного элемента
                        if (arr[i] == arr[j]) { // если находим повторение, то
                            repetitionCounter++; // инкриментим repetitionCounter
                            defaultCounter = repetitionCounter; // изменяем дефолтое значение каунтера эл в массиве
                        }
                    } // а если нет повторений эл в массиве, то оставляем дефолнтое значение счетчика элементов == 1

                    result += defaultCounter; // добавляем к результату кол-во повторений эл. в массиве
                    repetitionCounter = 0; // обнуляем значение счетчика повторений
                    defaultCounter = 1; // возвращаем дефолтное значение счетчика эл == 1
                }
            } return result; // возвращаем результат
    }

    public static void main(String[] args) {

        StringFinderAdvance stringFinder = new StringFinderAdvance (); // создаем инстанс класса StringFinderAdvance

        System.out.println (stringFinder.stringFinder ("ddkdllollld")); // проверяем рез-тат работы метода stringFinder
    }
}
