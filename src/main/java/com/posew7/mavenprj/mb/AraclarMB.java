package com.posew7.mavenprj.mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "araclarMB")
@RequestScoped
public class AraclarMB {

    private int celsius;
    private int kelvin;
    private int fahrenheit;
    private double turkLirasi;
    private double euro;
    private double dolar;
    private double sterlin;
    private double turkLirasiAlis;
    private double euroAlis;
    private double dolarAlis;
    private double sterlinAlis;
    private double turkLirasiSatis;
    private double euroSatis;
    private double dolarSatis;
    private double sterlinSatis;

    public AraclarMB() {
    }

    public double getTurkLirasi() {
        return turkLirasi;
    }

    public void setTurkLirasi(double turkLirasi) {
        this.turkLirasi = turkLirasi;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getSterlin() {
        return sterlin;
    }

    public void setSterlin(double sterlin) {
        this.sterlin = sterlin;
    }

    public double getTurkLirasiAlis() {
        return turkLirasiAlis;
    }

    public void setTurkLirasiAlis(double turkLirasiAlis) {
        this.turkLirasiAlis = turkLirasiAlis;
    }

    public double getEuroAlis() {
        return euroAlis;
    }

    public void setEuroAlis(double euroAlis) {
        this.euroAlis = euroAlis;
    }

    public double getDolarAlis() {
        return dolarAlis;
    }

    public void setDolarAlis(double dolarAlis) {
        this.dolarAlis = dolarAlis;
    }

    public double getSterlinAlis() {
        return sterlinAlis;
    }

    public void setSterlinAlis(double sterlinAlis) {
        this.sterlinAlis = sterlinAlis;
    }

    public double getTurkLirasiSatis() {
        return turkLirasiSatis;
    }

    public void setTurkLirasiSatis(double turkLirasiSatis) {
        this.turkLirasiSatis = turkLirasiSatis;
    }

    public double getEuroSatis() {
        return euroSatis;
    }

    public void setEuroSatis(double euroSatis) {
        this.euroSatis = euroSatis;
    }

    public double getDolarSatis() {
        return dolarSatis;
    }

    public void setDolarSatis(double dolarSatis) {
        this.dolarSatis = dolarSatis;
    }

    public double getSterlinSatis() {
        return sterlinSatis;
    }

    public void setSterlinSatis(double sterlinSatis) {
        this.sterlinSatis = sterlinSatis;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getKelvin() {
        return kelvin;
    }

    public void setKelvin(int kelvin) {
        this.kelvin = kelvin;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public String celsiusCevir() {

        setCelsius(celsius);

        kelvin = celsius + 273;
        fahrenheit = ((180 * celsius) + 3200) / 100;
        getKelvin();
        getFahrenheit();

        return "";
    }

    public String kelvinCevir() {

        setKelvin(kelvin);

        celsius = kelvin - 273;
        fahrenheit = (180 * kelvin) - 45940;
        fahrenheit = fahrenheit / 100;

        getCelsius();
        getFahrenheit();

        return "";
    }

    public String fahrenheitCevir() {

        setFahrenheit(fahrenheit);

        celsius = ((10 * fahrenheit) - 320) / 18;
        kelvin = ((100 * fahrenheit) + 45940) / 180;

        return "";
    }

    public String turkLirasiCevir() {

        setTurkLirasi(turkLirasi);

        dolarAlis = turkLirasi * 4.8412;
        dolarSatis = turkLirasi * 4.8434;
        euroAlis = turkLirasi * 5.6510;
        euroSatis = turkLirasi * 5.6668;
        sterlinAlis = turkLirasi * 6.3420;
        sterlinSatis = turkLirasi * 6.3833;

        return "";
    }

    public String euroCevir() {

        setEuro(euro);

        return "";
    }

    public String dolarCevir() {

        setDolar(dolar);

        return "";
    }

    public String sterlinCevir() {

        setSterlin(sterlin);

        return "";
    }

}
