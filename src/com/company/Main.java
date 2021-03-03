package com.company;

public class Main {

    public static void main(String[] args) {
        creatObject("Kyrgyzstan");
        System.out.println("------------------------");
        creatObject("Kazakhstan");
        System.out.println("------------------------");
        creatObject("Russia");








    }

    public static String creatObject(String className){
        switch (className){
            case "Kyrgyzstan":
                Kyrgyzstan kyrgyzstan = new Kyrgyzstan("Central Asia", 6523529, "Kyrgyzstan", "Besh-Barmak");
                kyrgyzstan.print();
                break;
            case "Kazakhstan":
                Kazakhstan kazakhstan = new Kazakhstan("Asia", 18877128, "Kazakhstan", "Nur-Sultan");
                kazakhstan.print();
                break;
            case "Russia":
                Russia russia = new Russia("Eurasia", 146810000,"Russia","RUB");
              russia.print();
                break;


        }return className;

    }
}
