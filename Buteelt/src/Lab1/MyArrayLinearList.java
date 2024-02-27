package Lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyArrayLinearList<T extends Comparable<T>> extends ArrayList<T> {

    public MyArrayLinearList() {

    }

    public T max() {
        T m = this.get(0);

        for (int i = 1; i < this.size(); i++) {
            if (m.compareTo(this.get(i)) < 0) {
                m = this.get(i);
            }
        }
        return m;
    }

    public void sort() {
        this.sort(null);
    }

    public T min() {
        T m = this.get(0);

        for (int i = 1; i < this.size(); i++) {
            if (m.compareTo(this.get(i)) > 0) {
                m = this.get(i);
            }
        }
        return m;
    }

    public int sum() {
        int s = 0;
        for (int i = 0; i < this.size(); i++) {
            s += (int) this.get(i);
        }
        return s;
    }

    public double average() {
        return 1.0 * sum() / size();
    }

    public static void main(String args[]) {
        MyArrayLinearList<Integer> x = new MyArrayLinearList<>();
        x.add(0, 4);
        x.add(1, 3);
        x.add(2, 2);
        x.add(3, 1);
        int cmd, too, idx;

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add\n2.Remove\n3.Print\n-1.end");
        System.out.println("Command ?");
        cmd = sc.nextInt();

        while (cmd != -1) {
            switch (cmd) {
                case 1: // add
                    System.out.println("index ?");
                    idx = sc.nextInt();

                    System.out.println("Num ?");
                    too = sc.nextInt();

                    x.add(idx, too);
                    break;

                case 2: // remove
                    System.out.println("index ?");
                    idx = sc.nextInt();
                    x.remove(idx);
                    break;

                case 3: // print
                    System.out.println("List: " + x);
                    break;
            }
            System.out.println("Command ?");
            cmd = sc.nextInt();
        }
        System.out.println("Max: " + x.max());
        System.out.println("Min: " + x.min());
        System.out.println("Sum: " + x.sum());
        System.out.println("Average: " + x.average());

        x.sort();
        System.out.println("Sorted List: " + x);

        sc.close();
    }
}
