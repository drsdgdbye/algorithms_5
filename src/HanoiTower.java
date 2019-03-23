import java.util.Stack;

class HanoiTower {
    int hanoi(int n) {
        int from = n;
        int buffer;
        int to;
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            buffer = hanoi(n - 1);
            to = hanoi(1);
            to += buffer;
            return to;
        }
    }
}
