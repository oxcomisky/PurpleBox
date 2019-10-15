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
public interface InterfacePromoCode {
    
    /**
     *
     * @return
     */
    public int getCode();

    /**
     *
     * @param code
     */
    public void setCode(int code);
    
    /**
     *
     * @return
     */
    public double getPercentOff();

    /**
     *
     * @param percentOff
     */
    public void setPercentOff(double percentOff);

    /**
     *
     * @return
     */
    public int getCodeType();

    /**
     *
     * @param codeType
     */
    public void setCodeType(int codeType);
	
}