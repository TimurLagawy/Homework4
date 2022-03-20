public class Train  implements Comparable<Train> {
    private String startPoint;
    private String name;
    public Train(String startPoint, String name) {
        this.startPoint = startPoint;
        this.name=name;
         }
    public String getStartPoint() {
        return startPoint;
    }
    public String getName() {
        return name;
    }
    public void setStartPoint(String startPoint) {
        this.startPoint=startPoint;

    }


    @Override
    public int compareTo(Train o) {
        return this.name.compareTo(o.name);

    }
}
