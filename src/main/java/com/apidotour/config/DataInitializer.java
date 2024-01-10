package com.apidotour.config;

import com.apidotour.model.Destino;
import com.apidotour.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private DestinoService destinoService;

    @Value("${dados.iniciais.inseridos}")
    private boolean dadosIniciaisInseridos;

    @Override
    public void run(String... args) throws Exception {
        if (!dadosIniciaisInseridos) {
           
            inicializarDados();

         
            System.setProperty("dados.iniciais.inseridos", "true");
        }
    }

    private void inicializarDados() {
        adicionarDestinoSeNaoExistir("Fernando de Noronha", "Fernando de Noronha, paraíso tropical no Atlântico, encanta com praias deslumbrantes, águas cristalinas e vida marinha única. Destino preservado e exclusivo, ideal para amantes da natureza.", "Brasil", 3000.0, "https://th.bing.com/th/id/OIP.8xXpo17vRbI0NpVdgyYoOAHaE7?w=280&h=187&c=7&r=0&o=5&pid=1.7");
        adicionarDestinoSeNaoExistir("Machu Picchu", "Machu Picchu, joia arqueológica nos Andes, fascina com suas ruínas incas impressionantes, cenário montanhoso espetacular e aura mística. Destino icônico para os amantes da história e da natureza.", "Peru", 2500.0, "https://th.bing.com/th/id/OIP.3_GSVJMltaYlWrN3bzcVEgHaE9?w=276&h=185&c=7&r=0&o=5&pid=1.7");
        adicionarDestinoSeNaoExistir("MonteVerde", "Monte Verde, em Costa Rica, é uma reserva nublada única. Rodeada por florestas tropicais, oferece biodiversidade excepcional, trilhas emocionantes e uma experiência imersiva na natureza.", "Costa Rica", 3500.0, "https://th.bing.com/th/id/OIP.267dnXnFxCK0zCoNgg-ZdgHaE8?w=302&h=201&c=7&r=0&o=5&pid=1.7");
        adicionarDestinoSeNaoExistir("Patagônia", "Patagônia, vasta região compartilhada por Chile e Argentina, deslumbra com sua beleza selvagem. Glaciares imponentes, lagos cristalinos e montanhas majestosas definem.", "Argentina", 1900.0, "https://th.bing.com/th/id/OIP.tSQdIMKk4oLLhDjAe3N03gHaE8?w=278&h=185&c=7&r=0&o=5&pid=1.7");
        
    }

    private void adicionarDestinoSeNaoExistir(String nome, String descricao, String local, Double preco, String imgUrl) {
        List<Destino> destinosExistente = destinoService.getDestinosByDestino(nome);

        if (destinosExistente.isEmpty()) {
            Destino destino = new Destino();
            destino.setDestino(nome);
            destino.setDescricao(descricao);
            destino.setLocal(local);
            destino.setPreco(preco);
            destino.setImgUrl(imgUrl);

            destinoService.saveDestino(destino);
        }
    }
}
