import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args){
        ArrayList<Zwierze> zw=new ArrayList<>();
        zw.add(new Pies("azor"));
        zw.add(new Kot("Burek"));
        for (Zwierze z: zw)
            System.out.println(z.getImie()+"głos"+z.getGlos());
    }
}
