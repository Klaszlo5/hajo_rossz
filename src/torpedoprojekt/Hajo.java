package torpedoprojekt;

public class Hajo {


    public static void main(String[] args) {
        private int[] poz;
    
    Hajo(int[] poz){
        this.poz=poz;
    }
    
    public String talalt(int poz){
        int i = 0, N=this.poz.length;
        while (i<N && !(poz[i]==poz)) {
        i++;
        }
        return i < N ? "nem talált";
    }
    }

}
