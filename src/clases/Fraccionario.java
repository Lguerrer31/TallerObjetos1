/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author coste
 */
public class Fraccionario {
    
    private int numerador;
    private int denominador;
    
    public Fraccionario(int numerador, int denominador) throws DenominadorCeroException{
        
        this.numerador = numerador;
        this.denominador = denominador;
        if(denominador == 0){
            throw new DenominadorCeroException();
        }   
    }

    public Fraccionario(int mix, int num, int den) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccionario Suma(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = (f2.numerador * this.denominador) + (this.numerador * f2.denominador);
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }
    
    public Fraccionario Resta(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador - f2.numerador * this.denominador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }
    
    public Fraccionario Multiplicacion(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }
    
    public Fraccionario Divison(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        num = this.numerador * f2.denominador;
        den = this.denominador * f2.numerador;
        f = new Fraccionario(num, den);
        return f;
    }
    
    public Fraccionario Mixto(Fraccionario f3){
        int mix, num, den;
        Fraccionario f;
        mix = f3.numerador / f3.denominador;
        den = f3.denominador;
        num = mix - 1;
        f = new Fraccionario(mix, num, den);
        return f;
    }
    
}
