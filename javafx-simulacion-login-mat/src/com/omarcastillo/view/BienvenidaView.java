/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.omarcastillo.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author informatica
 */
public class BienvenidaView extends VBox {
    private static BienvenidaView instanciaBienvenidaView;
    private ImageView imgLogoLogin;
    private Button btnCerrarVentanaSesion;
    private final String RUTA_ESTILIOS = "/com/omarcastillo/styles/";
    

    public BienvenidaView() {
        this.getStylesheets().add(RUTA_ESTILIOS + "LoginStyles.css");
        this.setPadding( new Insets(15) );
        
        this.setBorder(new Border( 
                new BorderStroke( Color.LAVENDERBLUSH, //Color del borde
                            BorderStrokeStyle.SOLID, //estilo de linea
                            new CornerRadii(20),//Pixeles de redondeado
                            new BorderWidths(7))//Ancho del Borde
        ));
        
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
        if (instanciaBienvenidaView == null) {
            instanciaBienvenidaView = new BienvenidaView();
        }
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }

}
