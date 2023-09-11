package garden_project;

public class Garden {
    /*
    Sodovod lyubitel.
    Virashivaem derevya i cveti. kajdiy iz etix vidov on budet imet sleduyushie xaraktiristiki:
    name,height,age. Kajdiy iz nix virastayet na raznuyu visotu za sezon, prichyom eto visota odinakovaya dlya vsex
    derevev i vsex cvetov.
    Kajdiy god nachinayetsa cesnoy i sostayit iz 4 vremyon goda, vo vremya kotorix povedenya derevyev i cvetov mojet
    otlechasa.
    Cveti:
    sezon nachinayetsa vesnoy i oni rastut
    letom oni ne rastut, a cvetut
    osenyu ix srezayut
    zimoy ne rastut

    Derevya:
    god nachinaetsa vesnoi i oni rastut
    letom derevya rastut
    osenyu derevya ne rastut
    zimoy derevya ne rastut

    V klasse Garden sozdat metod growPlants v kotorom doljen bit otrajon proces rosta neskolkix rosteniy i v techenya
    neskolkix let .Chto proisxodit zimoy,letom,vesnoy ,osenyu v kajdiy sezon i kakogo oni rosta vi vozrosta v konce

    naprimer:
    Pine tree has grown in Spring - 100
    Pine tree has grown in Sommer - 115
    Pine tree has not grown in Autumn - 115
    Pine tree has not grown in Winter - 115

    Tulip has grown in spring - 24
    ----------
    pine tre has heigt 250 and is 5 years old

    Algoritm reshenya
    1. sozdat roditelskiy klass Plant
    2. sozdat dochernie klassi Flower and Tree
    3.sozdat v etix klasax metodi, xaraktererizuyushie povedenie cvetov i derevev
    v sootvestvuyushiy period (leto, vesna, osen, zima)
    doSpring()
    doSummer()
    doWinter()
    doAutumn()

    v roditelskom klasse doljni bit polya
    name, height, age

    v dochernix glassax mojet bit pole flower_grow_per_season = 2
    tree_grow_per_season = 5

    4. metod growPlants doljen proizvodit deystviya nad massivom obektov tipo Plant

     */

    public static void growPlants(Plant[]plants, int years) {
        System.out.println("Growing plants for " + years + " years");

        for (int i = 0; i < years; i ++) {

            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }

        }

        for (Plant plant :plants) {
            System.out.println(plant.getName() + " has height: " + plant.getHeight() + " and is "
                    + plant.getAge() + " years old");

        }
    }

    public static void main(String[] args) {

        Plant tree = new Tree("Pine tree", 100, 1);
        Plant flower = new Flower("Tulip", 0,1);
        Plant flower1 = new Flower("Rose", 20,1);

        Plant[] plants = {flower,flower1,tree};
        int years = 2;

        growPlants(plants,years);
    }
}
