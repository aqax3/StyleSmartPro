package com.StyleSmartPro.StyleSmartPro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DelovniCas extends Cas {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="frizer_id_delovniCas")
    private Frizer delovniCasFrizerja;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FS_id_delovniCas")
    private FrizerskiSalon delovnikFS;
}