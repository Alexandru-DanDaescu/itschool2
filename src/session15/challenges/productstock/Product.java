package session15.challenges.productstock;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private String id;


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Product product = (Product) obj;
        return Objects.equals(getId(),product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }



}
