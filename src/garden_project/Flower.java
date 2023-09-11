package garden_project;

public class Flower extends Plant{

    private static int FLOWER_GROW_PER_SEASON = 2;

    public Flower (String name, int height, int age){
        super(name,height,age);
    }


    public void doSummer() {
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() + " is not grown in summer, but flourish - " + getHeight());
    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.println(getName() + " is cut to zero in Autumn " + getHeight());
    }

    public int getGrowPerSeason(){
        return FLOWER_GROW_PER_SEASON;
    }














}
