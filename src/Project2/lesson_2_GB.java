package Project2;

public class lesson_2_GB {

    public static void main(String[] args) {

        int[] adw = {1, 0, 1, 0, 1, 1, 0, 0, 1,};
        for (int i = 0; i < adw.length; i++){
            if (adw[i] == 1){
                adw[i] = 0;
            }else {
                adw[i] = 1;
            }
            System.out.print(adw[i]);
        }
        System.out.println();

        int[] aws = new int[8];
        for (int i = 0,x = 0;i < aws.length; i++ , x += 3 ) {
            aws[i] = x;
            System.out.print(aws[i]);
        }
        System.out.println();

        int[] ase = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < ase.length; i++){
            if(ase[i] < 6){
                ase[i] *= 2;
            }
            System.out.print(ase[i]);
        }
        System.out.println();
        int[][] asq = new int[6][6];
        for (int i = 0;i < asq.length; i++){
            for (int y = 0; y < asq[i].length;y++){
                if (i == y){
                    asq[i][y] = 1;
                }
                System.out.print(asq[i][y]);
            }
            System.out.println();
        }
        int[] wsa = {23, 45, 67, 78, 2, 124, 93, 34, 99, 94, };
        int max = wsa[0];
        int min = wsa[0];
        for (int i = 1; i < wsa.length; i++ ){
            if (wsa[i] > max ){
                max = wsa[i];
            }else if(wsa[i] < min){
                min = wsa[i];
            }
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
        int[] arr = {1, 2, 3, 3, 2, 1,};
        System.out.println(scoreLeftRight(arr));

    }
    public static boolean scoreLeftRight (int[] arr) {
        int sda[] = arr;
        boolean result = false;
        int left = 0;
        for (int q = 0; q < sda.length; q++) {
            int right = 0;
            left += sda[q];
            for (int f = sda.length - 1; f != q; f--) {
                right += sda[f];
            }
            if (right == left) {
                result = true;
                break;
            }
            result = false;
        }
        return  result;

    }

}
