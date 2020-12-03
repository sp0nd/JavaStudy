package com.tuyano.CollectionGenerics;
import java.text.CollationElementIterator;
import java.util.*;
class LottoNumberDrawer{ //Hashset
    HashSet<Integer> LottoNumber = new HashSet<Integer>();

    LottoNumberDrawer(){
        for(int i=1;i<46;i++)
            LottoNumber.add(i);
    }

    List autoSelect(){
        List numberDraw = new ArrayList(LottoNumber);
        List auto = new ArrayList(6);
        Collections.shuffle(numberDraw);
        for(int i=0;i<6;i++){
            auto.add(numberDraw.get(i));
        }
        return auto;
    }
    void Print(List l){
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
    }
}
class Buyer{ //LinkedHashMap
    LinkedHashMap<String,String> buyer = new LinkedHashMap<String,String>();
    Scanner scan = new Scanner(System.in);
    String name;
    String tel;
    Buyer(String Name,String Tel){
        name=Name;
        tel=Tel;
        buyer.put(name,tel);
    }
    boolean login(LinkedHashMap<String,String> IdPwd){
        while(true){
            System.out.println("Please enter your ID");
            String id = scan.next();
            if(id==null) {
                System.out.println("The ID is invalid or does not exist.");
                continue;
            }
            System.out.println("Please enter a password number.");
            String pwd=scan.next();
            if(pwd==buyer.get(id)) {
                System.out.println("Login complete");
                return true;
            }
            else
                System.out.println("Please re-enter the login failure ID and password.");
            if(id.equals("exit")||pwd.equals("exit")) {
                break;
            }
        }
        return false;
    }
    void buyerInfo(){
        if(login()==true)
    }
}
class seller{
    public LottoNumberDrawer Lotto;
    public Buyer buyer ;

}
public class Lotto {
    public static void main(String[] args) {
        LottoNumberDrawer Lotto =new LottoNumberDrawer();
        Lotto.Print(Lotto.autoSelect());

    }
}
