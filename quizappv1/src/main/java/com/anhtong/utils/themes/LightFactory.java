/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhtong.utils.themes;

import com.anhtong.quizappv1.App;

/**
 *
 * @author Administrator
 */
public class LightFactory extends ThemeAbstractFactory {

    @Override
    public String getStyleSheet() {
        return App.class.getResource("light.css").toExternalForm();
    }
    
}
