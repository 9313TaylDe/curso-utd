package desafiosutd;

public class MegaSena {
    public static void main(String[] args) {
        int[] sorte = new int[6];

        sorte[0] = (int) Math.round(Math.random()*59+1);
        sorte[1] = (int) Math.round(Math.random()*59+1);
        sorte[2] = (int) Math.round(Math.random()*59+1);
        sorte[3] = (int) Math.round(Math.random()*59+1);
        sorte[4] = (int) Math.round(Math.random()*59+1);
        sorte[5] = (int) Math.round(Math.random()*59+1);

        System.out.format("\n    SORTEIO DA MEGA SENA   \n %d - %d- %d - %d - %d - %d\n", sorte[0], sorte[1], sorte[2], sorte[3], sorte[4], sorte[5]);
    }

}
