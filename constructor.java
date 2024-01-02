class MyMainEmployee{
    private int id;
    private String name;

//  public MyMainEmployee() {
//      id = 45;
//      name = "Your-Name-Here";
//  }
    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }
    public String getName() { return name; }
    public void setName(String n) { this.name = n; }
    public void setId(int i) { this.id = i; }
    public int getId() { return id; }
}

public class constructor {
    public static void main(String[] args) {
        MyMainEmployee abhi = new MyMainEmployee("WithAbhinav",12);
        //abhi.setName("WithAbhinav");
        //abhi.setId(34);
        System.out.println(abhi.getId());
        System.out.println(abhi.getName());
    }    
}
