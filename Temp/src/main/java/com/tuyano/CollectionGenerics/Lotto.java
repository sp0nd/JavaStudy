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
    String name;
    String tel;
    Buyer(String Name,String Tel){
        LinkedHashMap<String,String> buyer = new LinkedHashMap<String,String>();
        name=Name;
        tel=Tel;
        buyer.put(name,tel);
    }
    private void IdPwd(){}
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
