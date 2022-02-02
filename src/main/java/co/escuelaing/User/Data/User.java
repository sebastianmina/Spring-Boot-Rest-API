package co.escuelaing.User.Data;

public class User {

    private String id;
    private String name;
    private String email;
    private String lastName;
    private String createdAt;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String name(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String email(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String lastName(){
        return lastName;
    }

    public void setLastname(String lastName){
        this.lastName = lastName;
    }

    public String createdAt(){
        return createdAt;
    }

    public void setCreatedAt(String createdAtString){
        this.createdAt = createdAtString;
    }
}
