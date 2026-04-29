import java.util.Scanner;
 class StudentGradeCalculator 
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade calculator");
             System.out.print("Enter the number of grades: ");
        int numGrades = sc.nextInt();

            if (numGrades <= 0) {
            System.out.println("Number of grades must be greater than 0.");
            return;
        }

         double[] g = new double[numGrades];
        double sum = 0;

            for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            g[i] = sc.nextDouble();
   
            if(g[i] < 0 || g[i] > 100) {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                i--;
                continue;
            }

            sum += g[i];
        }

        // Calculate average
        double avg= sum / numGrades;

        // Display result
        System.out.printf("The average grade is: %.2f%n", avg);
    }
}
