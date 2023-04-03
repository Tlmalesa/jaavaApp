/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut.soap;

import jakarta.xml.ws.Endpoint;

/**
 *
 * @author Admin
 */
public class RunProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endpoint.publish("http://localhost:8081/MyCircleService", new CircleService());
        Endpoint.publish("http://localhost:8082/MyCynlinderServices", new CynlinderServices());
    }

}
