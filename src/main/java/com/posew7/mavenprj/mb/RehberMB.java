package com.posew7.mavenprj.mb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "rehberMB")
@SessionScoped
public class RehberMB implements Serializable {

    public RehberMB() {
    }

}
