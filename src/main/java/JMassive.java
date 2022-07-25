public class JMassive {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        // создание массивов
        // в java массивы неизменяемой длинны
        int[] arrayInt = new int[3]; // сколько элементов будет в массиве
        // заполнение массивов
        arrayInt[0] = 150;
        arrayInt[1] = 200;
        arrayInt[2] = 300;


        //еще способ
        int[] arrayIntSec = {150, 200, 300};

        String[] arrayText = new String[3];
        arrayText[0] = "awdqawd";
        arrayText[1] = "ggg";
        arrayText[2] = "kkkk";

        // используется если нужен индекс позиции
        for (int i = 0; i < arrayText.length; i++){
            System.out.println(i + " item" + arrayText[i]);
        }
        // если индекс позиции не важен
        for(String value: arrayText){
            System.out.println("item = " + value);
        }
    }
}
