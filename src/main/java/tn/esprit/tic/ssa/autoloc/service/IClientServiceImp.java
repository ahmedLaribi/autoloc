package tn.esprit.tic.ssa.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ssa.autoloc.Repository.ClientRepository;
import tn.esprit.tic.ssa.autoloc.entities.Client;

import java.util.List;

@Service
@AllArgsConstructor
public class IClientServiceImp implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> consulterClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client consulterClientById(Long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void supprimerClientById(Long idClient) {
        clientRepository.deleteById(idClient);
    }
}
