//Program to check the given number is even or odd.

class Logic {
    void CheckEvenOdd(int iNo) {
        int iCnt = 0;

        if (iNo % 2 == 0) {
            System.out.println(iNo + "is even");
        } else {
            System.out.println(iNo + "is odd");
        }

    }
}

class program_2 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.CheckEvenOdd(15);
    }
}
