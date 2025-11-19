class Logic {
    void CountDigits(int num) {
        int iCount = 0;

        if (num == 0) {
            iCount = 1;
        } else {

            if (num < 0) {
                num = -num;
            }

            while (num != 0) {
                num = num / 10;
                iCount++;
            }
        }

        System.out.println("Number of digits = " + iCount);
    }
}

class program_5 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.CountDigits(12345);
    }
}
