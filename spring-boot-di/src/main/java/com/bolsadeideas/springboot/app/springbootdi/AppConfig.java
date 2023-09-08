package com.bolsadeideas.springboot.app.springbootdi;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.app.springbootdi.models.domain.ItemFactura;
import com.bolsadeideas.springboot.app.springbootdi.models.domain.Producto;
import com.bolsadeideas.springboot.app.springbootdi.models.service.IServicio;
import com.bolsadeideas.springboot.app.springbootdi.models.service.MiServicio;
import com.bolsadeideas.springboot.app.springbootdi.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){

        return new MiServicio();
    }

    @Primary
    @Bean("MiServicioComplejo")
    public IServicio registrarMiServicioComplejo(){

        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){

        Producto producto1 = new Producto("Camara Sony", 250);
        Producto producto2 = new Producto("Bicicleta Yamaha", 960);
        Producto producto3 = new Producto("PC Gamer", 1460);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 3);
        ItemFactura linea3 = new ItemFactura(producto3, 2);

        return Arrays.asList(linea1, linea2, linea3);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){

        Producto producto1 = new Producto("Monitor LG", 400);
        Producto producto2 = new Producto("Mac Pro", 20000);
        Producto producto3 = new Producto("Impresora", 160);
        Producto producto4 = new Producto("Silla", 460);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 3);
        ItemFactura linea3 = new ItemFactura(producto3, 2);
        ItemFactura linea4 = new ItemFactura(producto4, 4);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
    
}
