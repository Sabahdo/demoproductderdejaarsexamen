package be.ehb.demoproductderdejaarsexamen.Controller;

import be.ehb.demoproductderdejaarsexamen.Exceptions.ResourceNotFoundException;
import be.ehb.demoproductderdejaarsexamen.Model.Productdao;

import be.ehb.demoproductderdejaarsexamen.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class DetailsController {

    @Autowired
    Productdao repo;


    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)

        public String showDetailsForID(ModelMap map, @PathVariable(value = "id") int id){

        Optional<Product> optional = repo.findById(id);

            map.addAttribute("product", optional.get());

            return "details";

    }

}