package org.mohcine.elements;

import java.util.List;
import java.util.Map;

public class Method {
    private String visibility;
    private String name;
    private String typeRetour;
    private Map<String, String> args;
    private String content;

    public Method() {
    }

    public Method(String visibility, String name, String typeRetour, Map<String, String> args, String content) {
        this.visibility = visibility;
        this.name = name;
        this.typeRetour = typeRetour;
        this.args = args;
        this.content = content;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getName() {
        return name;
    }

    public String getTypeRetour() {
        return typeRetour;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public String getContent() {
        return content;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeRetour(String typeRetour) {
        this.typeRetour = typeRetour;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

