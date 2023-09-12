
package gondolat_olvaso;

import java.util.Scanner;


public class Gondolat_olvaso {
    static Scanner scr = new Scanner(System.in);
    static String[] pakli = new String[22];
    static String[] lehet = new String[7];
    public static void main(String[] args) {
        int oszlop=0;

        Kirak();
        for (int kor=0;kor<3;kor++){
        oszlop = Melyik();
        String[] tarto=new String[22];
        tarto=toltes(tarto,pakli);
        lapvalaszto(oszlop,kor);
        Kever(oszlop,pakli,tarto);
        kiiras(pakli);
        }
        EzVolt();
    }

    private static void Kirak() {
        
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int i=1;
        for (String szin:szinek){
            for (int o=0;i<22 && o<ertekek.length;o++){
                pakli[i++]=szin+"_"+ertekek[o];
            }
        }
        kiiras(pakli);
        }
    

    private static int Melyik() {
        int oszlop=1;
        boolean jo;
        do{
            System.out.print(("oszlop(1-3): "));
            oszlop = scr.nextInt();
            jo = oszlop>=1 && oszlop <=3;
        } while (!jo);
        return oszlop;
    }

    private static void EzVolt() {
        System.out.println(lehet[0] + " Ez a szam volt a megoldas");
    }

    private static void Kever(int oszlop,String[] pakli,String[] tarto) {
        switch(oszlop){
            case(1): 
                kiiras(tarto);
                for (int i = 1; i < 8; i++) {
                pakli[i] = tarto[20-(i-1)*3];
                pakli[i+7] = tarto[19-(i-1)*3];
                pakli[i+14] = tarto[21-(i-1)*3];
                //kiiras(pakli);
                //System.out.println("hiba");
                }
                kiiras(tarto);
                break;
        case(2): 
                for (int i = 1; i < 8; i++) {
                pakli[i] = tarto[19-(i-1)*3];
                pakli[i+7] = tarto[20-(i-1)*3];
                pakli[i+14] = tarto[21-(i-1)*3];
                }
                break;
        case (3):
                for (int i = 1; i < 8; i++) {
                pakli[i] = tarto[21-(i-1)*3];
                pakli[i+7] = tarto[20-(i-1)*3];
                pakli[i+14] = tarto[19-(i-1)*3];
                }
                break;
            }
            
        }
        private static void kiiras(String[] paklik){
            int x=1;
            for (int y=0; y<7; y++){
                for (int i=0;i<3;i++){
                    System.out.printf("%-8s",paklik[x]);
                 x++;
                }
                System.out.println(x);
            }
            System.out.println("-----------");
        }    

    private static String[] toltes(String[] tarto, String[] pakli) {
        int x=0;
        while (x!=pakli.length){
            tarto[x]=pakli[x];
            x++;
        }
        return tarto;
    }

    private static void lapvalaszto(int oszlop,int kor) {
        switch(oszlop){
            case(1):
                if (kor==0){
                    int i=1;
                    int x=0;
                    while (i<22){
                        if (i%3==1){
                            lehet[x]=pakli[i];
                            x++;
                        }
                        i++;
                    }
                }
                else{
                    String[] atmeneti=new String[7];
                    int i=1;
                    int x=0;
                    while (i<22){
                        if (i%3==1){
                            int kereses=0;
                            while (kereses<lehet.length){
                                if (lehet[kereses]==pakli[i]){
                                    atmeneti[x]=pakli[i];
                                }
                                kereses++;
                            }
                            x++;
                        }
                        i++;
                    }
                }
                break;
            case(2):
                if (kor==0){
                    int i=1;
                    int x=0;
                    while (i<22){
                        if (i%3==2){
                            lehet[x]=pakli[i];
                            x++;
                        }
                        i++;
                    }
                }
                else{
                    String[] atmeneti=new String[7];
                    int i=1;
                    int x=0;
                    while (i<22){
                        if (i%3==2){
                            int kereses=0;
                            while (kereses<lehet.length){
                                if (lehet[kereses]==pakli[i]){
                                    atmeneti[x]=pakli[i];
                                }
                                kereses++;
                            }
                            x++;
                        }
                        i++;
                    }
                }
                break;
            case(3):
                if (kor==0){
                    int i=1;
                    int x=0;
                    while (i<22){
                        if (i%3==0){
                            lehet[x]=pakli[i];
                            x++;
                        }
                        i++;
                    }
                }
                else{
                    String[] atmeneti=new String[7];
                    int i=1;
                    int x=0;
                    while (i<22){
                        if (i%3==0){
                            int kereses=0;
                            while (kereses<lehet.length){
                                if (lehet[kereses]==pakli[i]){
                                    atmeneti[x]=pakli[i];
                                }
                                kereses++;
                            }
                            x++;
                        }
                        i++;
                    }
                }
                break;
        }
    }
}
    

