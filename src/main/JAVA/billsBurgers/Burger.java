package main.JAVA.billsBurgers;

public class Burger {
    public String breadrolltype;
    public String meat;
    public int price;
    public String ingredient1;
    public int priceingredient1;
    public String ingredient2;
    public int priceingredient2;
    public String ingredient3;
    public int priceingredient3;
    public String ingredient4;
    public int priceingredient4;

    public Burger(String breadrolltype, String meat, int price) {
        this.breadrolltype = breadrolltype;
        this.meat = meat;
        this.price = price;
    }

    public void addingredient1 (String ingredient1, int priceingredient1) {
        this.ingredient1 = ingredient1;
        this.priceingredient1 = priceingredient1;
    }

    public void addingredient2 (String ingredient2, int priceingredient2) {
        this.ingredient2 = ingredient2;
        this.priceingredient2 = priceingredient2;
    }

    public void addingredient3 (String ingredient3, int priceingredient3) {
        this.ingredient3 = ingredient3;
        this.priceingredient3=priceingredient3;
    }

    public void addingredient4 (String ingredient4, int priceingredient4) {
        this.ingredient4 = ingredient4;
        this.priceingredient4 = priceingredient4;
    }

    public int pretulfinal() {
        if(priceingredient1!=0) {
            price = this.price+priceingredient1;
        }
        if(priceingredient2!=0) {
            price = this.price+priceingredient2;
        }
        if(priceingredient3!=0) {
            price = this.price+priceingredient3;
        }
        if(priceingredient4!=0) {
            price = this.price+priceingredient4;
        }
        return price;
    }

}


/* // The purpose of the application is to help a company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
// Bills store.
// The basic hamburger should have the following items.
// bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger. Each one of these items gets charged an additional
// price so you need some way to track how many items got added and to calculate the price (for the base
// burger and all the additions).
// This burger has a base price and the additions are all separately priced.
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price.
// print the final price for the burger. */