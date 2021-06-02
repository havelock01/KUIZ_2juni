/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting;

import register.Register;
import register.eliminate;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class HitungWeb extends Register implements eliminate{
    
    public HitungWeb(String nik, String nama, double scoreTulisan, double scoreCoding, double scoreInterview) {
        super(nik, nama, scoreTulisan, scoreCoding, scoreInterview);
    }
    
    @Override
    public double eliminateTulisan() {
        return this.scoreTulisan * 0.4;
    }

    @Override
    public double eliminateCoding() {
        return this.scoreCoding * 0.35;
    }

    @Override
    public double eliminateInterview() {
        return this.scoreInterview * 0.25;
    }
}
