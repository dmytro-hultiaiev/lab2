public class DroneControlSystem {

    public int x=0,y=0,s=0,b=100;

    public void go(int a,int bb){

        if(a==1){x=x+10;System.out.println("left");}
        else if(a==2){x=x-10;System.out.println("right");}
        else if(a==3){y=y+10;System.out.println("up");}
        else if(a==4){y=y-10;System.out.println("down");}

        if(bb>80){s=100;}
        else{s=50;}

        if(b<20){System.out.println("LOW");}

        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
    }

    public void a1(){System.out.println("start");}
    public void a2(){System.out.println("start");}
}
