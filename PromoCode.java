/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

/**
 *
 * @author Jon Comisky, 
 */
public class PromoCode implements InterfacePromoCode{
    public int code;
    public double percentOff;
    public int codeType;

    
    public PromoCode(){
    }

    public PromoCode(int code, double percentOff, int codeType) {
        this.code = code;
        this.percentOff = percentOff;
        this.codeType = codeType;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public double getPercentOff() {
        return percentOff;
    }

    @Override
    public void setPercentOff(double percentOff) {
        this.percentOff = percentOff;
    }

    @Override
    public int getCodeType() {
        return codeType;
    }

    @Override
    public void setCodeType(int codeType) {
        this.codeType = codeType;
    }
    
    
    
}
