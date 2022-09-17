package org.example.data.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "member")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "member_id", nullable = false)
//    private Long memberId;

    //@Id
//    @memberId
//    @GeneratedValue
//    @Column(name = "member_id", nullable = false)
//    private Long memberId;

    //@memberId
    //@GeneratedValue(strategy = GenerationType.AUTO);
    //Long memberId;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId", nullable = false)
    private Long memberId;

    String companyName;
    Integer companySize;
    String primaryContact;
    String city;
    String state;
    Integer netZeroTimeLine;
    Integer numCreditsDesired;
    //ArrayList<String> preferredOffsets = new ArrayList<String>();
    Double budget;
    Integer carbonCreditId;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

//    public Long getMemberId() {
//        return memberId;
//    }
//
//    public void setMemberId(Long memberId) {
//        this.memberId = memberId;
//    }

//    public ArrayList<String> getPreferredOffsets() {
//        return preferredOffsets;
//    }
//
//    public void setPreferredOffsets(ArrayList<String> preferredOffsets) {
//        this.preferredOffsets = preferredOffsets;
//    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Integer companySize) {
        this.companySize = companySize;
    }

    public String getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getNetZeroTimeLine() {
        return netZeroTimeLine;
    }

    public void setNetZeroTimeLine(Integer netZeroTimeLine) {
        this.netZeroTimeLine = netZeroTimeLine;
    }

    public Integer getNumCreditsDesired() {
        return numCreditsDesired;
    }

    public void setNumCreditsDesired(Integer numCreditsDesired) {
        this.numCreditsDesired = numCreditsDesired;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Integer getCarbonCreditId() {
        return carbonCreditId;
    }

    public void setCarbonCreditId(Integer carbonCreditId) {
        this.carbonCreditId = carbonCreditId;
    }

}
