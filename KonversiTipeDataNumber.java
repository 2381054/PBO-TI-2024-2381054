public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // Widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        // Narrowing
        int tipeDataInterger = -129;
        byte tipeDataByte2 = (byte) tipeDataInterger;
        System.out.println(tipeDataByte2);
        String firstName, lastName;
        firstName = "Arthur";
        lastName = "Erickson";

        System.out.printf("%s %s", firstName, lastName);


    }
}