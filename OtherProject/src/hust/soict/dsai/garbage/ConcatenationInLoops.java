package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] args) {
        Random r = new Random(123);
        long start;

        // Test String concatenation with '+'
        start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }
        System.out.println("String '+' operator time: " + (System.currentTimeMillis() - start) + " ms");

        // Test StringBuilder concatenation
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - start) + " ms");

        // Test StringBuffer concatenation
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 65536; i++) {
            stringBuffer.append(r.nextInt(2));
        }
        s = stringBuffer.toString();
        System.out.println("StringBuffer time: " + (System.currentTimeMillis() - start) + " ms");
    }
}