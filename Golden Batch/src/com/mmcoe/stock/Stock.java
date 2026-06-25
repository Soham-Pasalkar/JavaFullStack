package com.mmcoe.stock;
interface Holder{
    void viewQuote();
}
interface Broker extends Holder{
    void getQuote();
}
interface Exchange extends Broker{
    void setQuote();
}


class Stock implements Exchange{
    public void viewQuote(){
        System.out.println("Viewing stock quote...");
    }
    public void getQuote(){
        System.out.println("Getting stock quote...");
    }
    public void setQuote(){
        System.out.println("Setting stock quote...");
    }


    public static void main(String[] args)
    {
        Stock ril = new Stock();

        Holder h = ril;
        h.viewQuote();

        Broker b = ril;
        b.viewQuote();
        b.getQuote();

        Exchange e = ril;
        e.viewQuote();  
        e.getQuote();
        e.setQuote();
    }
}