/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purplebox;

/**
 *
 * @author Jon Comisky, Jason Bendickson
 */
public class PromoCode implements InterfacePromoCode{

    /**
     *
     */
    public int code;

    /**
     *
     */
    public int codeType;

    /**
     * Constructs a Generic PromoCode Object
     */
    public PromoCode(){
    }

    /**
     * Constructs a PromoCode Object
     * @param code
     * @param codeType
     */
    public PromoCode(int code, int codeType) {
        this.code = code;
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
    public int getCodeType() {
        return codeType;
    }

    @Override
    public void setCodeType(int codeType) {
        this.codeType = codeType;
    }
    
    
    
}
