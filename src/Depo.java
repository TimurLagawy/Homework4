import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Depo {
   private List<Train> trains;

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public void printAllTrains(){
        for (int i = 0; i < trains.size() ; i++) {
            System.out.println(trains.get(i));
        }
    }

    public static void  main (String[] args){
        Train train1=new Train("Minsk", "B4");
        Train train2=new Train("Minsk", "B5");
        Train train3=new Train("Minsk", "B0");
        Train train4=new Train("Minsk", "B2");
        Train train5=new Train("Minsk", "B1");

        List<Train> trains= new ArrayList<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        Depo depo = new Depo();

        Collections.sort(trains);

        depo.setTrains(trains);


        depo.printAllTrains();
    }
}
