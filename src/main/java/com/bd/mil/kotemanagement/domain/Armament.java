package com.bd.mil.kotemanagement.domain;

import com.bd.mil.kotemanagement.domain.enumeration.WeaponType;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "armament")
public class Armament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "weapon_no", unique = true)
    private Long weaponNo;

    @NotNull
    @Column(name = "butt_no")
    private Long buttNo;

    @Column(name = "weapon_name")
    private String weaponName;

    @Column(name = "weapon_type")
    @Enumerated(EnumType.STRING)
    private WeaponType weaponType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getButtNo() {
        return buttNo;
    }

    public void setButtNo(Long buttNo) {
        this.buttNo = buttNo;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
