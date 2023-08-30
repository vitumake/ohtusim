package series2;

public class task3 {
    public static void main(String[] args) {
        
        int[] ageDist = {21, 21, 22, 23, 25, 24, 22, 23, 28, 24, 22, 23, 21};
        int ageNum = 1000;
        int[] genAges = new int[ageNum];
        
        for(int i=0; i<ageNum; i++) {
            genAges[i] = ageDist[(int)(Math.random()*ageDist.length-1)];
            System.out.print(genAges[i] + " ");
        }
    }
}
