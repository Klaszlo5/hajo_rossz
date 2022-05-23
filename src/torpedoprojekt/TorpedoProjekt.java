package torpedoprojekt;

public class TorpedoProjekt {

    public static int hajok;
    public static int gephajo;

    public static void main(String[] args) {
        System.out.println("Teszt");
        assert 3==5;
        
        new torpedoTeszt().tesztLovesTalalt(4);
    }
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo(new int[]{2,3,4});
        String talal = hajo.talalat(poz);
        assert talal.equals("talált") : "nem jó a találat ellenőrzése";
        assert talal.equals("nemtalalt") : "j";
        return "";
    }
    
    public static void harc(){
        jatekoslep();
        gepvalaszol();
        System.out.println("A te hajod: " + TorpedoProjekt.hajok + " áll, a gép hajói: " + TorpedoProjekt.gephajo + "doboz-ban állnak");
    }
    
    public static void jatekoslep(){
        int x = -1, y = -1;
        Scanner sca = new Scanner(System.in);
        System.out.print("Előre vagy hátra: ");
            uod = sca.nextInt();
        System.out.print("Jobbra vagy ballra: ");
            lor = sca.nextInt();
    }
    
    public static void jatekveg(){
        if(TorpedoProjekt.hajok > 0 && TorpedoProjekt.gephajo < 0)
            System.out.println("Nyertél!");
        else
            System.out.println("ezt a játszmát elvesztetted");
        System.out.println();
   }
}
