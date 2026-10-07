package H3;

public class task1 {
    public double average(int[] salary) {
        int sum = 0;
        int min = salary[0];
        int max = salary[0];


        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }

            if (salary[i] > max) {
                max = salary[i];
            }
        }


        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != min && salary[i] != max) {
                sum = sum + salary[i];
            }
        }

        return (double) sum / (salary.length - 2);
    }
}