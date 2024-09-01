public class TipeDataArray {
    public static void main(String[] args) {
        // Array kumpulan sebuah data yang memiliki tipe yang sama

        // one dimension
        int[] arrayInterger = new int[3];
        arrayInterger[0] = 20;
        arrayInterger[1] = 40;
        arrayInterger[2] = 50;

        int[] arrayInterger2 = new int []{20, 40, 50};
        arrayInterger2[1] = 60;
       // System.out.println(arrayInterger2);

        // multi dimension
        int[][] arrayInterger3 = new int [][] {{20, 40, 50}, {90,100,120}, {70,30,190}};
        // System.out.println(arrayInterger3)[0][2] + arrayInterger3[1][2];
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = 20;
        arrayOfObject[1] = "Arthur Erickson";
        arrayOfObject[2] = 20L;
        System.out.println(arrayOfObject[1]);


    }
}
