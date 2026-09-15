package Lab3BatagdahDasgal;
public class PseudorandomGenerator {
public static void main(String[] args) {
    int a = 12;
    int b = 5;
    int n = 100;
    int cur = 92;
    System.out.println("Үүссэн санамсаргүй 5 тоо:");
    for (int i = 1; i <= 5; i++) {
        cur = (a * cur + b) % n;
        System.out.println(i + "-р тоо: " + cur);
    }
}
}

