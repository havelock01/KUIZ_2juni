/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class Register implements eliminate{
    String nik;
    String nama;
    public double scoreTulisan;
    public double scoreCoding;
    public double scoreInterview;

    public Register(String nik, String nama, double scoreTulisan, double scoreCoding, double scoreInterview) {
        this.nik = nik;
        this.nama = nama;
        this.scoreTulisan = scoreTulisan;
        this.scoreCoding = scoreCoding;
        this.scoreInterview = scoreInterview;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getScoreTulisan() {
        return scoreTulisan;
    }

    public void setScoreTulisan(double scoreTulisan) {
        this.scoreTulisan = scoreTulisan;
    }

    public double getScoreCoding() {
        return scoreCoding;
    }

    public void setScoreCoding(double scoreCoding) {
        this.scoreCoding = scoreCoding;
    }

    public double getScoreInterview() {
        return scoreInterview;
    }

    public void setScoreInterview(double scoreInterview) {
        this.scoreInterview = scoreInterview;
    }

    @Override
    public double eliminateTulisan() {
        return 0;
    }

    @Override
    public double eliminateCoding() {
        return 0;
    }

    @Override
    public double eliminateInterview() {
        return 0;
    }
    
    
}
