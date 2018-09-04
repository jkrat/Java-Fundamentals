public class Pythag {
    public double calculateHypotenuse(int legA, int legB) {
        int radicand = (legA * legA) + (legB * legB);
        double legC = Math.sqrt(radicand);
        return legC;
    }
}