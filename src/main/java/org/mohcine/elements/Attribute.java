package org.mohcine.elements;

public class Attribute {
    private String nom;
    private String type;
    private String visibility;

    public Attribute() {
    }

    public Attribute(String nom, String type, String visibility) {
        this.nom = nom;
        this.type = type;
        this.visibility = visibility;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
