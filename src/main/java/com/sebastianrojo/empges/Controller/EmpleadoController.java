package com.sebastianrojo.empges.Controller;

import java.util.Map;

import javax.validation.Valid;

import com.sebastianrojo.empges.Model.Entity.Empleado;
import com.sebastianrojo.empges.Model.Service.EmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * EmpleadoController
 */

@Controller
@SessionAttributes("empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/")
    public String home() {
        return "redirect:listar";
    }

    @GetMapping("/listar")
    public String listar(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Pageable pageRequest = PageRequest.of(page, 4);
        Page<Empleado> empleados = empleadoService.findAll(pageRequest);
        model.addAttribute("titulo", "Listado de empleados");
        model.addAttribute("empleados", empleados);
        return "listar";
    }

    @RequestMapping(value = "/form")
    public String crear(Map<String, Object> model) {        
        Empleado empleado = new Empleado();
        model.put("empleado", empleado);
        model.put("titulo", "Formulario de empleado");
        return "form";
    }
   
    @PostMapping("/form")
    public String guardar(@Valid Empleado empleado, BindingResult result, Model model, SessionStatus status) {
        if(result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de empleado");
            return "form";
        }
        empleadoService.save(empleado);
        status.setComplete();
        return "redirect:listar";
    }

    @GetMapping("/form/{numEmp}")
    public String modificar(@PathVariable(value = "numEmp") Integer numEmp, Map<String, Object> model) {
        Empleado empleado = null;
        if(numEmp > 0) {
            empleado = empleadoService.findById(numEmp);
        } else {
            return "redirect:/listar";
        }
        model.put("empleado", empleado);
        model.put("titulo", "Modificar empleado");
        return "form";
    }

    @GetMapping("/eliminar/{numEmp}")
    public String eliminar(@PathVariable(value = "numEmp") Integer numEmp) {
        if(numEmp > 0) {
            empleadoService.deleteById(numEmp);
        }
        return "redirect:/listar";
    }

}