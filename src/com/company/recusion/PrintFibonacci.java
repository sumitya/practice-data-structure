package com.company.recusion;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class PrintFibonacci {

    static int fib(int n) {
        if (n <= 1)  return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void
    main(String args[]) throws IOException {
        long N = 1000000000;

        BufferedWriter f_writer
                = new BufferedWriter(new FileWriter(
                "C:\\Users\\sumit\\Downloads\\misc\\tmp.txt"));

        // Step 2: Write text(content) to file

        for (int i = 0; i < N; i++) {
            //System.out.print(fib(i) + " ");
            f_writer.write(fib(i));
        }
        f_writer.close();
    }
}
