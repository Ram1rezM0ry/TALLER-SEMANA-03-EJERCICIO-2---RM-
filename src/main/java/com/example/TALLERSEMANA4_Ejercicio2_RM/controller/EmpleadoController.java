
package com.example.TALLERSEMANA4_Ejercicio2_RM.controller;

import com.example.TALLERSEMANA4_Ejercicio2_RM.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {

    @GetMapping("/formulario_empleado")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado()); // Enviar un nuevo objeto Empleado al formulario
        return "formulario_empleado";
    }

    @PostMapping("/resultado_empleado")
    public String calcularSueldo(@ModelAttribute Empleado empleado, Model model) {
        empleado.calcularSueldoTotal(); // Calcular el sueldo total del empleado
        model.addAttribute("empleado", empleado); // Enviar el objeto Empleado con los cálculos a la vista
        return "resultado_empleado";
    }
}