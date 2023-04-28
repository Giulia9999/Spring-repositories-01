package com.example.springrepositories01;

import jakarta.persistence.*;

@Entity
@Table(name = "programmingLanguages" )
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column
    private int firstAppearance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage(String name, int firstAppearance, String inventor) {
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public ProgrammingLanguage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(int firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
