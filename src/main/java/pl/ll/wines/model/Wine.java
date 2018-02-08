package pl.ll.wines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by arabk on 07.02.2018.
 */
@Entity
@Table(name="wine")
public class Wine {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String colour;
    String sweetness;
    String producer;
    String region;
    String variety;
    int vintage;
    double price;
    String description;
    int alcohol;
    String image;

    public Wine() {
    }

    public Wine(Long id, String name, String colour, String sweetness, String producer, String region, String variety, int vintage, double price, String description, int alcohol, String image) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.sweetness = sweetness;
        this.producer = producer;
        this.region = region;
        this.variety = variety;
        this.vintage = vintage;
        this.price = price;
        this.description = description;
        this.alcohol = alcohol;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    @Override
    public String toString() {
        return "Wine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", sweetness='" + sweetness + '\'' +
                ", producer='" + producer + '\'' +
                ", region='" + region + '\'' +
                ", variety='" + variety + '\'' +
                ", vintage=" + vintage +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", alcohol=" + alcohol +
                ", image='" + image + '\'' +
                '}';
    }
}
