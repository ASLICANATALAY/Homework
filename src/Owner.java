import java.util.Date;

public class Owner {
    private String name;
    private int phoneNo;
    private Date date;

    public Owner(String name, int phoneNo){
        this.name=name;
        this.phoneNo=phoneNo;

        date=new Date(System.currentTimeMillis());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString(){
        return "Owner name: " + name + " date: " + date;
    }
}
