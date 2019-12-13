package be.ehb.demoproductderdejaarsexamen.Controller;

import be.ehb.demoproductderdejaarsexamen.Model.Product;
import be.ehb.demoproductderdejaarsexamen.Model.Productdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class NewController {

    @Autowired
    Productdao dao;

    @RequestMapping(value = {"/new"},method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "new";
    }


    @RequestMapping(value = {"/new"},method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute(name="nieuweProduct") @Valid Product nieuweProduct, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "new";
        dao.save(nieuweProduct);
        return "redirect:/index";
    }}
