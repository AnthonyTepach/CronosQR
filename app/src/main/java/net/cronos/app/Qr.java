package net.cronos.app;

public class Qr {

    private String ObtieneQRBinario(String Cadeniux, int inicio, int fin) {
        char myCharcero = (char) 14;
        char myCharuno = (char) 15;
        Cadeniux = Cadeniux.replace(myCharcero, '0');
        Cadeniux = Cadeniux.replace(myCharuno, '1');
        Cadeniux = Cadeniux.substring(inicio, fin);
        return Cadeniux;
    }


    private int decimal(String bin) {
        int num = Integer.parseInt(bin, 2);
        System.out.println(num);
        return num;
    }

    private String binario(int decimal) {
        String data = Integer.toBinaryString(decimal);
        System.out.println(data);
        return data;
    }

    public int getFolio(String text){
        String folioB=ObtieneQRBinario(text,0,30);
        return decimal(folioB);
    }

    public int getTipo(String text) {//solo los ultimos 4
        String tip=ObtieneQRBinario(text,79,84);
        return decimal(tip);
    }
}
