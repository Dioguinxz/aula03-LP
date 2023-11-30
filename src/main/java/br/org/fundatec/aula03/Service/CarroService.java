package br.org.fundatec.aula03.Service;


import br.org.fundatec.aula03.Model.Carro;
import br.org.fundatec.aula03.Repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {
private final CarroRepository carroRepository;
    private List<Carro> carros = new ArrayList<>();

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listAllCarros() {
        return carroRepository.findAll();
    }

    public void saveCarro(Carro carro) {
        carroRepository.save(carro);
    }

    public void deleteCarro(String placa) {
        carroRepository.deleteById(placa);

    }


    public void editCarro(String codigoPlaca, Carro carro) {
        carroRepository.findById(codigoPlaca)
                .orElseThrow(() -> new RuntimeException("Carro com placa " + codigoPlaca + " não existe!"));
        carro.setPlaca(codigoPlaca);
        carroRepository.save(carro);
    }
}


