/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.misc;

/**
 *
 * @author Administrador
 */
public interface Callback<T> {
    
    void onSuccess(T result);
    // void onFailure(String result);
    
}
