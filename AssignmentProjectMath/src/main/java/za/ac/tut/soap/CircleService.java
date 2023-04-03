/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Admin
 */
@WebService(name = "CircleService")
@SOAPBinding(style = Style.RPC)
public class CircleService {

    @WebMethod(operationName = "getAreaOfCircle", action = "action", exclude = false)
    @WebResult(partName = "radius")
    public double areaOfCircle(@WebParam(partName = "radius") double radius) {
        return Math.PI * radius;
    }

    public int diameterOfCircle(int num1, int num2) {
        return num1 * num2;
    }

    public int circumferenceOfCircle(int num1, int num2) {
        return num1 * num2;
    }

    @WebMethod(operationName = "getperimeterOfCircle", action = "action", exclude = false)
    @WebResult(partName = "radius")
    public double perimeterOfCircle(@WebParam(partName = "radius") double radius) {
        return 2 * (Math.PI * radius);
    }
}
