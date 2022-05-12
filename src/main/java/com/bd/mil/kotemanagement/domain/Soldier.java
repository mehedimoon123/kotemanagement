package com.bd.mil.kotemanagement.domain;

import com.bd.mil.kotemanagement.domain.enumeration.Appointment;

import javax.persistence.*;

@Entity
@Table(name = "soldier")
public class Soldier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "soldier_no")
    private String soldierNo;

    @Column(name = "soldier_name")
    private String soldierName;

    @Column(name = "unit_name")
    private String unitName;

    @Column(name = "company")
    private String company;

    @Column(name = "appointment")
    @Enumerated(EnumType.STRING)
    private Appointment appointment;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "weapon_no")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "armament", referencedColumnName = "weapon_no")
    private Armament armament;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoldierNo() {
        return soldierNo;
    }

    public void setSoldierNo(String soldierNo) {
        this.soldierNo = soldierNo;
    }

    public String getSoldierName() {
        return soldierName;
    }

    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Armament getArmament() {
        return armament;
    }

    public void setArmament(Armament armament) {
        this.armament = armament;
    }
}
