

import java.io.*;

import java.util.Scanner;

public class Reader {
    public Double[] getCurr(String filename, String path) {
        Double k[] = new Double[3];
        try {
            File file = new File(path, filename);

            if (file.exists()) {
                Scanner scanner = new Scanner(file);
                String nextLine = scanner.nextLine();
                Scanner num = new Scanner(nextLine);
                k[0] = num.nextDouble();
                k[1] = num.nextDouble();
                k[2] = num.nextDouble();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return k;
    }
}
