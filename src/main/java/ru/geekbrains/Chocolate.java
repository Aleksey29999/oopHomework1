package ru.geekbrains;

public class Chocolate extends Product {
    private int volume; // объем
    private double cacao; // количество какао в шоколаде

    public int getVolume() {
        return volume;
    }

    public double cacao() {
        return cacao;
    }

    public Chocolate(String name, double price, int volume, double cacao) {
        super(name, price);
        this.volume = volume;
        this.cacao = cacao;
    }
//
//        public void sample1(int a, int b){
//
//        }
//        public void sample1(int csssssssssssss, int dsssssssssssssssss, int d){
//
//        }
//        public void sample1(int a, long b){
//
//        }


    @Override
    public String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d, процент какао: %f", brand, name, price, volume, cacao);
    }
}


