package Project1;

    public class FirstApp {

        public static void main(String[] args){

            byte a;
            short b;
            int c;
            long d;
            float e;
            double f;
            char g;
            boolean h;
            a = 100;
            b = 32700;
            c = -2147000000;
            d = 900000L;
            e = 12.23f;
            f = -123.123;
            g = 's';
            h = true;
            System.out.println(calculate(2, 2,4,2 ));
            System.out.println(task10and20(15,6));
            isPositiveOrNegative(40);
            System.out.println(isNegative(-30));
            hello("Игорь");
            hello("Миша");
            //year(1456);

        }

        public static int calculate(int a, int b, int c, int d){
            return a * (b + (c / d));
        }
        public static boolean task10and20(int ab, int cd){
            int f = (ab + cd);
            if((10 <= f) && (f <=20)){
                return true;
            }else {
                return false;
            }
        }
        public static void isPositiveOrNegative(int a){
            if(a >= 0){
                System.out.println("Число " + a + " положительное.");
            }else{
                System.out.println("Число " + a + " отрицательное.");
            }
        }
        public static boolean isNegative(int a){
            if(a < 0){
                return true;
            }else{
                return false;
            }
        }
        public static void hello(String name){
            System.out.println("Привет " + name);
        }
      /*  public static void year(int x) {
            if (x % 100 == 0 && x % 400 == 0) {
                System.out.println("Год високосный, количество дней в году: 366");
            } else if (x % 4 == 0 && x % 100 > 0) {
                System.out.println("Год високосный, количество дней в году: 366");
            }
            else if (x % 100 == 0) {
                System.out.println("Год не високосный, количество дней в году: 365");
            }
            else {
                System.out.println("Год не високосный, количество дней в году: 365");
            }
        } */

    }
