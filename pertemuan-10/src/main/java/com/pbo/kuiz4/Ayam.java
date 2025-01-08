package com.pbo.kuiz4;

// Class Ayam (subclass Aves)
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }
}
