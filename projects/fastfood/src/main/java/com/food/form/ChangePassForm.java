package com.food.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Hue on 11/4/2016.
 */
public class ChangePassForm {

    @NotBlank
    @Length(min = 6, max = 50)
    private String passwordOld;

    @NotBlank
    @Length(min = 6, max = 50)
    private String passwordNew;

    @NotBlank
    @Length(min = 6, max = 50)
    private String passwordRepeat;

    public String getPasswordOld() {
        return passwordOld;
    }

    public void setPasswordOld(String passwordOld) {
        this.passwordOld = passwordOld;
    }

    public String getPasswordNew() {
        return passwordNew;
    }

    public void setPasswordNew(String passwordNew) {
        this.passwordNew = passwordNew;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }
}
