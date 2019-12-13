package be.ehb.demoproductderdejaarsexamen.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    String naamProd;
    @NotBlank
    String omschrijvingProd;

    @NotNull
    @NotBlank
    @Size(min = 4, max = 20, message = "{post_error}")
    private String username;


    private String email;

    @NotNull
    @DecimalMin(value = "0.50",message = "moet groter zijn dan 0.5")
    private BigDecimal prijs;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaamProd() {
        return naamProd;
    }

    public void setNaamProd(String naamProd) {
        this.naamProd = naamProd;
    }

    public String getOmschrijvingProd() {
        return omschrijvingProd;
    }

    public void setOmschrijvingProd(String omschrijvingProd) {
        this.omschrijvingProd = omschrijvingProd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }
}

