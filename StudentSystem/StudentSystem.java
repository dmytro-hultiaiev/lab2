import java.util.*;

public class StudentSystem{

    public ArrayList list=new ArrayList();

    public void add(String n,int m){
        String s=n+"-"+m;
        list.add(s);
    }

    public void show(){

        for(int i=0;i<list.size();i++){

            String q=list.get(i).toString();

            if(q.contains("100")){
                System.out.println("excellent "+q);
            }
            else{
                if(q.contains("90")){
                    System.out.println("good "+q);
                }
                else{
                    System.out.println(q);
                }
            }

        }

    }

    public void x(){
        System.out.println("students");
    }
    public void y(){
        System.out.println("students");
    }

}
