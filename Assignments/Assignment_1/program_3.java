//Find the factorial of a given number using a for loop.

class Logic {
    void Factorial(int iNo) {
        int iCnt = 0;
        int fact = 1;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            fact = fact * iCnt;
        }
        System.out.println("Factorial of" + iNo + "=" + fact);
    }
}

class program_3 {
    public static void main(String[] args) {
        Logic obj = new Logic();
        obj.Factorial(5);
    }
}
