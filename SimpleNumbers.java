

import java.util.Arrays;

public class Main {

    public static void simpleNumbers(int[] originalMass) {

        int resultMassCounter = 1;

        for (int i = 0; i < originalMass.length; i++) {
            if (resultMassCounter > 15) {
                break;
            } else if (originalMass[i] == 2 || originalMass[i] == 3 || originalMass[i] == 5 || originalMass[i] == 7) {
                System.out.print(Arrays.toString(new int[]{originalMass[i]}));
                resultMassCounter++;
                continue;
            } else if (originalMass[i] > 1 && originalMass[i] % 2 > 0 && originalMass[i] % 3 > 0 && originalMass[i] % 5 > 0 && originalMass[i] % 7 > 0) {
                System.out.print(Arrays.toString(new int[]{originalMass[i]}));
                resultMassCounter++;
            }
        }
    }

    public static void main(String[] args) {

        int[] originalMass = {1, 3, 5, 6, 7, 8, 23, 11, 78, 65, 89, 2, 45, 67, 89, 12, 23, 45, 45, 10, 34, 3, 3, 2, 2, 2, 2, 2, 1, 11, 11, 11};

        simpleNumbers(originalMass);


    }
}
