/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp;

import com.codename1.ui.Button;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;


/**
 *
 * @author ASUS
 */
public class Commentaire extends Form{
Form current;
    public Commentaire(Form previous) {
        current=this; //Back 
        add(new Label("Commentaire"));
        setTitle(" --Commentaire-- ");
        setLayout(BoxLayout.y());
        
    Button BUTAdd = new Button("Add Commentaire");
    Button BUTShow = new Button("Show Commentaire");
    //Button BUTCam = new Button("Camera ");
   // BUTAdd.addActionListener((evt) -> new AddVoyage(current).show());
    //BUTCam.addActionListener((evt) -> new Camera().show());
  //  BUTShow.addActionListener((evt) -> new ShowVoyage(current).show());
        addAll(BUTAdd,BUTShow);
    
    getToolbar().addMaterialCommandToLeftBar("",FontImage.MATERIAL_ARROW_BACK, (evt) -> {
        previous.showBack();
        });}
    }