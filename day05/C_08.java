package day05;

public class C_08 {
    public static void main(String[] args) {


        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String s="   Java ogrenmek123 Cok guzel@      ";
        s=s.replaceAll("\\d", "").replace("@", "").replace("C", "c").trim();
        System.out.println(s);















    }
}
