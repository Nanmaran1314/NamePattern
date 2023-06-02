package namepattern;

import java.util.Scanner;

public class input {
    static final char a = 'a', b = 'b', c = 'c', d = 'd', e = 'e', f = 'f', g = 'g', h = 'h', i = 'i', k = 'k', j = 'j',
            l = 'l', m = 'm', n = 'n', o = 'o', p = 'p', q = 'q', r = 'r', s = 's', t = 't', u = 'u', v = 'v', w = 'w',
            x = 'x', y = 'y', z = 'z';
    String name;
    char ch[];

    input() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        name = name.toLowerCase();
        ch = new char[name.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = name.charAt(i);
        }
    }

}
