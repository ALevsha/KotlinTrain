public class JavaChoose {
    public static void main(String[] args) {
        System.out.println("Hellow form Java");
        /*
        Типы данных
         */

        // в java примитивные типы не поддерживают null
        Integer v2 = 10;
        int value = 5;
        double sum = 10.5;
        final String text = "Hello Java";
        //final - аналог val. Значит, что переменную можно инициализировать только 1 раз

        v2 = null;
        value = 10;

        if(v2 > 5) // v2 = null -> будет ошибка
            System.out.println(">5");

        switch (value){
            // без break продолжится выполнение кода следующего case
            case 1:{

                break;
            }
            case 5:{

                break;
            }
            default:{


            }

        }
    }
}
