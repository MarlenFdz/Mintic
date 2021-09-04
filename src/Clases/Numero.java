/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mafer
 */
public class Numero {
    private Integer numero1;
    private Integer numero2;
    private Integer numero3;
    private Integer numero4;

    public Numero() {
    }

    public Numero(Integer numero1, Integer numero2, Integer numero3, Integer numero4) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;
    }
    
    public Integer Sumar(){
        return numero1 + numero2 + numero3 + numero4;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public Integer getNumero3() {
        return numero3;
    }

    public void setNumero3(Integer numero3) {
        this.numero3 = numero3;
    }

    public Integer getNumero4() {
        return numero4;
    }

    public void setNumero4(Integer numero4) {
        this.numero4 = numero4;
    }
    
    

    
}
