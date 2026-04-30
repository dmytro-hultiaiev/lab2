public class ShopManager {

    public int money=0;
    public int items=0;

    public void doIt(int a){

        if(a==1){
            money=money+100;
            items=items-1;
        }

        if(a==2){
            money=money+200;
            items=items-1;
        }

        if(a==3){
            money=money+300;
            items=items-1;
        }

        if(items<5){
            System.out.println("buy more");
        }

        System.out.println(money);
        System.out.println(items);

    }

    public void t1(){
        System.out.println("report");
    }

    public void t2(){
        System.out.println("report");
    }

    public void useless(){
        int x=0;
        x++;
    }

}
