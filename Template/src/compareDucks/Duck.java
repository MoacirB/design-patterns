package compareDucks;

public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck duck){
        Duck otherDuck = duck;

        if(this.weight < otherDuck.weight)return -1;
        else if(this.weight == otherDuck.weight)return 0;
        else return 1;
    }

    public String toString(){
        return name +" "+ weight;
    }
}
