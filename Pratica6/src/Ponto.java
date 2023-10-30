public class Ponto {

    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float calculoDistancia(Ponto p1, Ponto p2){

        int x = p2.getX() - p1.getX();
        int y = p2.getY() - p1.getY();

        double potX = Math.pow(x, 2);
        double potY = Math.pow(y, 2);

        double soma = potX + potY;

        return (float) Math.sqrt(soma);
    }
}
