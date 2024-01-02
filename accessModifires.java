class MyEmployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }


    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class accessModifires {
     public static void main(String[] args) {
         MyEmployee abhi = new MyEmployee();
       //  abhi.id = 45;
       // abhi.name = "WithAbhinav";  -->Throws an error due to private access modifier.
       abhi.setName("WithAbhinav");
       System.out.println(abhi.getName());
       abhi.setId(45);
       System.out.println(abhi.getId());
     }
}
