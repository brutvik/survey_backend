package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import javax.persistence.Table;

@Entity

// @Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
    public String firstname;
    public String lastname;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String number;
    public String email;
    public String date;
    public String likes;
    public String interest;
    public String recommendation;

     public String getEmail() {
        return email;
  }
   public String getFirstName() {
    return firstname;
  }
  public String getLastName() {
    return lastname;
  }
  public String getaddress() {
    return address;
  }
  public String getcity() {
    return city;
  }
  public String getstate() {
    return state;
  }
  public String getzip() {
    return zip;
  }
  public String getphonenumber() {
    return number;
  }
  public String getdate() {
    return date;
  }
  public String getLikesAboutUniveristy() {
    return likes;
  }
  public String getWhatInterestedInUniversity() {
    return interest;
  }
  public String getHowLikelyTheyWouldRecommend() {
    return recommendation;
  }
public void setEmail(String email) {
    this.email = email;
  }
  public void setFirstName(String firstname) {
    this.firstname = firstname;
  }
  public void setLastName(String lastname) {
    this.lastname= lastname;
  }
  public void setAddress(String Address) {
    this.address = Address;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public void setState(String state) {
    this.state = state;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }
  public void setNumber(String Number) {
    this.number = Number;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public void setLikes(String Likes) {
    this.likes = Likes;
  }
  public void setInterest(String interest) {
    this.interest = interest;
  }
  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }
    // getters and setters
}

