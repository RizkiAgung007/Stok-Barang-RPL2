/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_4ia09;

import com.mycompany.ujian_rpl2_4ia09.controllers.BarangController;
import com.mycompany.ujian_rpl2_4ia09.services.BarangService;
import com.mycompany.ujian_rpl2_4ia09.views.BarangView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author LENOVO
 */
@SpringBootApplication
public class SpringBootApp implements ApplicationRunner{
    @Autowired
    private BarangService barangService;
    
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false"); // Disable headless mode
        
        // Start the Spring Application and get the application context
        ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);
        
        // Instantiate the view and inject the controller manually
        BarangController controller = context.getBean(BarangController.class);
        BarangView barangView = new BarangView(controller);
        barangView.setVisible(true);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
