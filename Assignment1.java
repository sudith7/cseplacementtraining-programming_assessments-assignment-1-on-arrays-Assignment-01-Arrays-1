class Assignment1 {
    public static int[] findLeapYears(int year) {
        int[] leapYears = new int[15]; // Array to store 15 leap years
        int count = 0; // To keep track of how many leap years we've found
        int currentYear = year;

        while (count < 15) {
            // Leap year logic based on the hint provided
            if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
                leapYears[count] = currentYear;
                count++;
            }
            currentYear++; // Move to the next year to check
        }

        return leapYears;
    }

    public static void main(String[] args) {
        int year = 2000;
        int[] leapYears;
        leapYears = findLeapYears(year);
        
        // Printing the results
        for (int index = 0; index < leapYears.length; index++) {
            System.out.println(leapYears[index]);
        }
    }
}