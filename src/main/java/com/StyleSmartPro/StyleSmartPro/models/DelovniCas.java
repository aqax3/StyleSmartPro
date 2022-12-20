package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
public class DelovniCas{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Long id;

    private Calendar datum;
    private int dolzinaIzvajanja;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="frizer_id_delovniCas")
    private Frizer delovniCasFrizerja;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FS_id_delovniCas")
    private FrizerskiSalon delovnikFS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDatum() {
        return datum;
    }

    public void setDatum(Calendar datum) {
        this.datum = datum;
    }

    public int getDolzinaIzvajanja() {
        return dolzinaIzvajanja;
    }

    public void setDolzinaIzvajanja(int dolzinaIzvajanja) {
        this.dolzinaIzvajanja = dolzinaIzvajanja;
    }
    public Frizer getDelovniCasFrizerja() {
        return delovniCasFrizerja;
    }

    public void setDelovniCasFrizerja(Frizer delovniCasFrizerja) {
        this.delovniCasFrizerja = delovniCasFrizerja;
    }

    public FrizerskiSalon getDelovnikFS() {
        return delovnikFS;
    }

    public void setDelovnikFS(FrizerskiSalon delovnikFS) {
        this.delovnikFS = delovnikFS;
    }

    @Override
    public String toString() {
        return "DelovniCas{" +
                "id=" + id +
                ", datum=" + datum +
                ", dolzinaIzvajanja=" + dolzinaIzvajanja +
                ", delovniCasFrizerja=" + delovniCasFrizerja +
                ", delovnikFS=" + delovnikFS +
                '}';
    }
}