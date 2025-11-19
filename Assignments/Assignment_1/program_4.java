// Program to Reverse a number.

class Logic {
    void ReverseNumber(int iNo) {
        int iRev = 0;
        int iDigit = 0;

        while (iNo != 0) {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        System.out.println("Reversed Number : " + iRev);
    }
}

class program_4s {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.ReverseNumber(1234);
    }
}
