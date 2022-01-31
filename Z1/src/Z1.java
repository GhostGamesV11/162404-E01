public class Z1 {
    public static void main(String args[]){
//        Integer [] integers = new Integer[1,2,3,4];


    }
    static class ArrayUtil {
        public static <extends Comparable<T>> void jestParlindromem(T[] tab){
        int pocz = 0;
        int koniec = tab.length;
        int zmienna = 0;

        for (int i = 0; i < koniec; i++){
            for (int j = koniec; j>= pocz; j--){
                if (tab[i] != tab[j]){
                    zmienna = 1;
                    break;
                }
        zmienna --;

            }
        }
        if (zmienna == 1){
            System.out.println("To nie jest palindrom");
            }
        else {
            System.out.println("To jest palindorm");
        }

        }
    }

}

