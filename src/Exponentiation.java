class Exponentiation {
    void exp(int x, int y) {
        if (y % 2 == 0) {
            while (y > 1) {
                x *= x;
                y /= 2;
            }
            System.out.println(x);
        } else {
            int y1 = y - (y % 2);
            int x1 = x;
            while (y1 > 1) {
                x1 *= x1;
                y1 /= 2;
            }
            x1 *= x;
            System.out.println(x1);
        }
    }

    int expRec(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 1) {
            return x * expRec(x, y - 1);
        } else {
            int x1 = expRec(x, y / 2);
            return x1 * x1;
        }
    }
}
