package traning17_interface;

public class CD implements RetailItem,  Displayable{

    double Price;
    String Title, Artist;


    public CD (double price, String title, String artist){

        this.Price=price;
        this.Title=title;
        this.Artist=artist;
    }

    public CD (){

    }


    public double getitemPrice (){


        return  Price;
    }



    public void display(){
        System.out.println("store ="+storename+
                "Title = "+ Title+"pric="+Price+
                "Artist="+Artist);
    }



}
