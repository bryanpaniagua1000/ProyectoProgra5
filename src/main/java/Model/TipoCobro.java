/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bryan e Isaac
 */
public enum TipoCobro {
    Contado,
    Credito{
        public String toString(){
            return "Crédito";
        }
    };
}
